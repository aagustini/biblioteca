package br.pucrs.fds.biblio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  public DemoController() {
    System.out.println("\n\n Controller foi inicializado\n\n");
  }

  @GetMapping("")
  public String hello(){
    return "Bem vindo a biblio 1.0";
  }


}
