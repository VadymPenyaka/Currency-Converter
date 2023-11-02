package penyaka.currency.converter.mapper;

import javax.annotation.processing.Generated;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.model.EmployeeDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-02T03:19:08+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee employeeDtoToEmployee(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.id( employeeDTO.getId() );
        employee.firstName( employeeDTO.getFirstName() );
        employee.lastName( employeeDTO.getLastName() );
        employee.phone( employeeDTO.getPhone() );
        employee.login( employeeDTO.getLogin() );
        employee.password( employeeDTO.getPassword() );

        return employee.build();
    }

    @Override
    public EmployeeDTO employeeToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO.EmployeeDTOBuilder employeeDTO = EmployeeDTO.builder();

        employeeDTO.id( employee.getId() );
        employeeDTO.firstName( employee.getFirstName() );
        employeeDTO.lastName( employee.getLastName() );
        employeeDTO.phone( employee.getPhone() );
        employeeDTO.login( employee.getLogin() );
        employeeDTO.password( employee.getPassword() );

        return employeeDTO.build();
    }
}
