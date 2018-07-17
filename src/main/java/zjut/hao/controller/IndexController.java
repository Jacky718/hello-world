package zjut.hao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @RequestMapping(value = "index", produces = "text/plain;charset=UTF-8")
    public String index(){
        return "hello, spring boot!" + name + ":" + author;
    }
}
