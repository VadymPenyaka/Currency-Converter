package penyaka.currency.converter.service;

import penyaka.currency.converter.model.EmployeeDTO;
import penyaka.currency.converter.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return null;
    }

    @Override
    public Optional<EmployeeDTO> getEmployeeByID(UUID id) {
        return null;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
//        return employeeRepository.save(employee);
        return null;
    }

    @Override
    public Optional<EmployeeDTO> updateEmployeeByID(UUID id, EmployeeDTO employee) {
        return null;
    }

    @Override
    public void deleteEmployeeById(UUID id) {

    }
}
