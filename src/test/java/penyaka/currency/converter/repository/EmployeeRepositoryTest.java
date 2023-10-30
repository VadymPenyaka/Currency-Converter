package penyaka.currency.converter.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import penyaka.currency.converter.entity.Employee;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
class EmployeeRepositoryTest {
    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void saveEmployeeTest () {
        Employee savedEmployee = employeeRepository.save(Employee.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build());

        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isNotNull();
    }

}