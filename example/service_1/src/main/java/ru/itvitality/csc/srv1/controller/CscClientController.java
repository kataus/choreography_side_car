package ru.itvitality.csc.srv1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itvitality.csc.api.AdapterRequest;
import ru.itvitality.csc.api.StatusResponse;

@RestController
public class CscClientController {

    @PostMapping("/invoke")
    public StatusResponse invoke( AdapterRequest request ){
        // Примеры срабатывания
        return StatusResponse.success();
    }
}
