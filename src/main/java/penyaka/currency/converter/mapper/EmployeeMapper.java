package penyaka.currency.converter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.model.EmployeeDTO;

@Mapper
public interface EmployeeMapper {
    Employee employeeDtoToEmployee (EmployeeDTO employeeDTO);
    EmployeeDTO employeeToEmployeeDto (Employee employee);
}
