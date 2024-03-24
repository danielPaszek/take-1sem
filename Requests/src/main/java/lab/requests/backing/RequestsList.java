package lab.requests.backing;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.jsp.tagext.ValidationMessage;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Size;
import lab.requests.data.RequestRepository;
import lab.requests.entities.Request;
import jakarta.faces.component.html.HtmlDataTable;

import java.time.LocalDate;
import java.util.List;

@RequestScoped
@Named
public class RequestsList {
    @Inject
    private RequestRepository requestRepository;

    @Size(min = 3, max = 60, message = "{request.size}")
    private String newRequest;

    private HtmlDataTable requestsDataTable;

    @Transactional
    public String addRequest()
    {
        Request request = new Request();
        request.setRequestText(newRequest);
        request.setRequestDate(LocalDate.now());
        requestRepository.create(request);
        setNewRequest("");
        return "requestsList?faces-redirect=true";
    }

    @Transactional
    public String deleteRequest() {
        Request req = (Request) getRequestsDataTable().getRowData();
        requestRepository.remove(req);
        return "requestsList?faces-redirect=true";
    }


    public List<Request> getAllRequests()
    {
        return requestRepository.findAll();
    }

    public RequestRepository getRequestRepository() {
        return requestRepository;
    }

    public void setRequestRepository(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public String getNewRequest() {
        return newRequest;
    }

    public void setNewRequest(String newRequest) {
        this.newRequest = newRequest;
    }

    public HtmlDataTable getRequestsDataTable() {
        return requestsDataTable;
    }

    public void setRequestsDataTable(HtmlDataTable requestsDataTable) {
        this.requestsDataTable = requestsDataTable;
    }
}
