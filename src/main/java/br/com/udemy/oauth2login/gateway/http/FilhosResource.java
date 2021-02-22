package br.com.udemy.oauth2login.gateway.http;

import br.com.udemy.oauth2login.gateway.json.FilhosJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api")
public class FilhosResource {

    @GetMapping("filhos")
    public List<FilhosJson> getFilhos() {
        List<FilhosJson> list = new ArrayList<>();
        list.add(FilhosJson.builder().uuid(UUID.randomUUID().toString()).name("Filho 1").build());
        list.add(FilhosJson.builder().uuid(UUID.randomUUID().toString()).name("Filho 2").build());
        return list;
    }
}