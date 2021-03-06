package spring.boot.test.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.test.springboottest.vo.TestRespVO;

/**
 * @Auther: admin
 * @Date: 2018/11/28 11:03
 * @Description:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
public TestRespVO test(){

    return new TestRespVO(" test hello world！");
}

    @RequestMapping("/")
    public TestRespVO index(){

        return new TestRespVO("index hello world！");
    }
    @RequestMapping("/user")
    public TestRespVO user(){

        return new TestRespVO("user test");
    }

    @RequestMapping("/company")
    public TestRespVO company(){

        return new TestRespVO("company test");
    }

    @RequestMapping("/user/list")
    public TestRespVO userList(){

        return new TestRespVO("user userList");
    }

    @RequestMapping("/user/list/del")
    public TestRespVO del(){

        return new TestRespVO("user userList del");

    }

    @RequestMapping("/user/list/update")
    public TestRespVO update(){
//ceshi
        return new TestRespVO("user update");
    }
}
