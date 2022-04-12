package com.formacion.nttdata.crud.dao;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.formacion.nttdata.crud.dto.Employee;
import com.formacion.nttdata.util.MyBatisUtil;
@Repository
public class EmployeeMapper {
    public void saveEmployee(Employee employee) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.insert("insertEmployee", employee);
        session.commit();
        session.close();
    }
    public void updateEmployee(Employee employee) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.update("updateEmployee", employee);
        session.commit();
        session.close();
    }
    public void deleteEmployee(int employeeId) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.delete("deleteEmployee", employeeId);
        session.commit();
        session.close();
    }
    public List<Employee> getAllEmployees() {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Employee> employeesList = session.selectList("getAllEmployees");
        session.commit();
        session.close();
        return employeesList;
    }
    public Employee findById(int employeeId) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Employee employee = (Employee) session.selectOne("findById", employeeId);
        session.commit();
        session.close();
		return employee;
	}
    
    public boolean comprobarFormulario(Employee employee) {
    	int i = 0;
    	if (employee.getFullname().length()==0) {
    		i++;
    	}
    	if (employee.getCountry().length()==0) {
    		i++;
    	}
    	if (employee.getEmail().length()==0) {
    		i++;
    	}
    	
    	if(i > 0) {
    		
    		return true;
    		
    	}else {
    		
    		return false;
    	}
    	
    }
    
    public Employee almacenarFormulario(Employee employee) {

    	if (employee.getFullname()==null || employee.getFullname().length()==0) {
    		employee .setFullname("No puede estar vacio");
    	}
    	if (employee.getCountry()==null || employee.getCountry().length()==1) {
    		employee.setCountry("No puede estar vacio");
    	}
    	if (employee.getEmail()==null || employee.getEmail().length()==0) {
    		employee .setEmail("No puede estar vacio");

    	}
    		return employee;
    }
    
    public Employee catFecha(Employee employee) {
    	
    	Date date = new Date();
    	Locale locale = new Locale("es", "ES");
    	
    	DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

    	employee.setLastdate(formattedDate);
    	
    	return employee;
    }
    

}