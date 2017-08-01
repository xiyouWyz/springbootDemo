package com.xiaoyou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

   /* @Value("${cupSize}")
    private  String cupSize;
    @Value("${age}")
    private int age;
    @Value("${content}")
    private  String content;*/

    @Autowired
    private  GirlProperties girlProperties;

    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id")Integer id){
        return "id = "+id ;
    }

  /*  @RequestMapping(value = "/say1",method = RequestMethod.GET)*/
    @GetMapping(value = "/say")
    public String say1(@RequestParam(value = "id",required = false,defaultValue = "0")Integer id){
        return "id = "+id ;
    }
}
