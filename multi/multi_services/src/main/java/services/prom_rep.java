package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;

//@Controller
@Service
public class prom_rep {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartsRepository departsRepository;


    public void ttt(){



        System.out.println("1234567890");



    String test_fname[] = employeeRepository.getTest_fname();


        for(    int k = 0;  k<test_fname.length;k++)
            System.out.println(test_fname[k]);




}


}
