package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	//�z�L @RequestMapping ���w�q/�|�Q�����즹hello()��k
  @RequestMapping("/hello")
  public String hello(){
      return "�V���@�ɻ��nSpring Boot �ܰ����{�ѧA!";
  }

}
