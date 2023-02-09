package com.develhope.ex1.First.API01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/")
    public String getName() {
        return "Daniele";
    }

    @PostMapping("/")
    public String postName(){
        StringBuilder str = new StringBuilder();
        str.append ( "eleinaD" );
        return  str.toString ();
    }


}



