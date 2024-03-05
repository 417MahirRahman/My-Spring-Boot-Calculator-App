package com.SpringBoot.First_Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Calculator_API {
        @GetMapping("/home")
        public String home(){
            return "Help Me !!!";
        }

        @GetMapping("/Sum")
        public int Sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
            return (num1 + num2);
        }

        @GetMapping("/Sub")
        public int Sub(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
            return (num1 - num2);
        }

        @GetMapping("/Mul")
        public int Mul(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
            return (num1 * num2);
        }

        @GetMapping("/Div")
        public double Div(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
            return (double) num1/num2;
        }

}
