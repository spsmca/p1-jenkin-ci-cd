package demo.sb.jenkin.cicd.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkin")
public class ConfigClientController {
   
    //http://localhost:9191/jenkin/cicd/msg
    @GetMapping("/cicd/msg")
    public String getMsg() {
    	System.out.println("getMsg()...");
        return "Hello" ;
    } 
    
}
