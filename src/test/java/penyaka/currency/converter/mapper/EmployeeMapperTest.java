package penyaka.currency.converter.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.model.EmployeeDTO;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EmployeeMapperImpl.class})
class EmployeeMapperTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void employeeDtoToEmployeeTest() {
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build();

        Employee employee = employeeMapper.employeeDtoToEmployee(employeeDTO);

        assertThat(employee.getFirstName()).isEqualTo(employeeDTO.getFirstName());
        assertThat(employee.getId()).isEqualTo(employeeDTO.getId());
    }

    @Test
    void employeeToEmployeeDtoTest() {
        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build();

        EmployeeDTO employeeDTO = employeeMapper.employeeToEmployeeDto(employee);

        assertThat(employee.getFirstName()).isEqualTo(employeeDTO.getFirstName());
        assertThat(employee.getId()).isEqualTo(employeeDTO.getId());
    }
}