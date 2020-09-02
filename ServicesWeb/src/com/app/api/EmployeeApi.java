package com.app.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.app.beans.Employee;
import com.app.service.EmployeeServiceImpl;

@Path("/employee")
public class EmployeeApi {

	private EmployeeServiceImpl ese;

	@GET
	@Path("/say")
	public String hello() {
		// TODO Auto-generated method stub
		return "Welcome sir How Can i Help YOu";
	}

	@GET
	@Path("/{id}/{name}/{technology}/{experiance}")
	public String saveEmployee(@PathParam(value = "id") int id, @PathParam(value = "name") String name,
			@PathParam(value = "technology") String technology, @PathParam(value = "experiance") double experiance) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setTechnology(technology);
		emp.setExperiance(experiance);
		int a = 0;
		ese = new EmployeeServiceImpl();
		a = ese.saveEmployee(emp);
		if (a > 0) {
            return "added"+emp.toString();
		}
		return "failed";
	}
}
