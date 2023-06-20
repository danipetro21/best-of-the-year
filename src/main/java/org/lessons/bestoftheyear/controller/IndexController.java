package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller //dice a spring che è un controller
@RequestMapping("/") // a quale rotta rispondono i metodi di questo controller
public class IndexController {

/*    @GetMapping
    @ResponseBody
    public String home(){
        return """
                
                <html>
                    <head>
                        <title> Hello </title>
                    </head>
                    
                    <body>
                        <h1>Hello world</h1>
                    </body>
                </html>
                
                """;
    }*/

    @GetMapping()
    public String template(Model model){
        model.addAttribute("title", "Daniele Petrollo");
        return "index"; //ritorno del template
    }



}
