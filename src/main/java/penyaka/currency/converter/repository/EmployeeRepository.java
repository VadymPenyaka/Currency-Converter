package penyaka.currency.converter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import penyaka.currency.converter.entity.Employee;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

}
