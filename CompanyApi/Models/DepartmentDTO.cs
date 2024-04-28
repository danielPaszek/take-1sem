using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;

namespace CompanyApi.Models
{
    public class DepartmentDTO
    {
        public int DepartmentId { get; set; }

        public string? Name { get; set; }
    }
}
