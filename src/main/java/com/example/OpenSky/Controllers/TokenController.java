package com.example.OpenSky.Controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

import com.example.OpenSky.Classes.Token;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TokenController {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.readTree(new File("../../credentials.json"));
    String clientId = rootNode.get("clientId").asText();
    String clientPass = rootNode.get("clientSecret").asText();

    public TokenController() throws IOException {
    }

    @PostMapping("/refreshToken")
    public Token getToken(@RequestBody String clientId,@RequestBody String clientPass,@RequestBody String granttype) {

        return new Token();
    }

    @GetMapping("/display")
    public String display(){
        String externalAPI = rootNode.get("endpoint").asText();
        return externalAPI;
    }



}