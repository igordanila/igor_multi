package web;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.*;
import services.depart;

import java.util.Iterator;

/*
import javax.management.Query;
import javax.persistence.EntityManager;
import java.util.Iterator;
import java.util.List;
*/
@Controller
public class TestController {

        prom_rep  prom_reposit = new prom_rep();

//

    @RequestMapping("/av")
    public @ResponseBody String getAverageSalary() {

//        prom_rep  prom_reposit = new prom_rep();
        prom_reposit.ttt();




  /*
        Iterable<Employee> allEmployee = employeeRepository.findAll();

        Iterator<Employee> employeeIterator = allEmployee.iterator();
        while (employeeIterator.hasNext()) {
            Employee currentDepartment = employeeIterator.next();
            System.out.println(currentDepartment.getId());
            System.out.println(currentDepartment.getFname());
            System.out.println(currentDepartment.getLname());
            System.out.println(currentDepartment.getSalary());
            System.out.println("departament = "+currentDepartment.getDepart());

        }

*/



        return "igor";
    }
}
