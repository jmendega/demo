package com.myfirstspringboot;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import com.myfirstspringboot.controllers.HelloController;

@SpringBootTest
public class HelloControllerUnitTests {
  @Test
  public void testSayHello() throws Exception {
    HelloController controller = new HelloController();
    Model model = new BindingAwareModelMap();
    String result = controller.sayHello("World", model);
    assertEquals("World", model.asMap().get("user"));
    assertEquals("hello", result);
  }
}
