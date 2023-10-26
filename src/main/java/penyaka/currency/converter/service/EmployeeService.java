package penyaka.currency.converter.service;

import penyaka.currency.converter.model.EmployeeDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees ();

    Optional<EmployeeDTO> getEmployeeByID (UUID id);

    EmployeeDTO createEmployee (EmployeeDTO employee);

    Optional<EmployeeDTO> updateEmployeeByID (UUID id, EmployeeDTO employee);

    void deleteEmployeeById (UUID id);

}
