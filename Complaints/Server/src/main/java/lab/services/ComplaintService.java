package lab.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lab.data.ComplaintRepository;
import lab.dto.ComplaintDTO;
import lab.entities.Complaint;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import java.util.List;
import java.lang.reflect.Type;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ComplaintService {

    @Inject
    private ComplaintRepository repository;

    @Inject
    private ModelMapperProducer modelMapperProducer;

    @Transactional
    public void create(ComplaintDTO dto) {
        ModelMapper mapper = modelMapperProducer.getModelMapper();
        repository.create(mapper.map(dto, Complaint.class));
    }
    @Transactional
    public void edit(ComplaintDTO dto) {
        ModelMapper mapper = modelMapperProducer.getModelMapper();
        repository.edit(mapper.map(dto, Complaint.class));
    }

    @Transactional
    public void remove(ComplaintDTO dto) {
        ModelMapper mapper = modelMapperProducer.getModelMapper();
        repository.remove(mapper.map(dto, Complaint.class));
    }
    @Transactional
    public ComplaintDTO find(Object id) {
        Complaint complaint = repository.find(id);
        ModelMapper mapper = modelMapperProducer.getModelMapper();
        return mapper.map(complaint, ComplaintDTO.class);
    }

    @Transactional
    public List<ComplaintDTO> findAll(String status) {
        ModelMapper mapper = modelMapperProducer.getModelMapper();
        List<Complaint> entityList = repository.findAll(status);
        Type listType =
                new TypeToken<List<ComplaintDTO>>() {}.getType();
        List<ComplaintDTO> dtoList =
                mapper.map(entityList, listType);
        return dtoList;
    }


}
