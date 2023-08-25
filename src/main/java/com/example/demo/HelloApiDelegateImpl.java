package com.example.demo;

import com.example.demo.api.HelloApiDelegate;
import com.example.demo.model.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloApiDelegateImpl implements HelloApiDelegate {

    @Override
    public ResponseEntity<HelloResponse> hello(){
        HelloResponse hello = new HelloResponse();
        hello.setText("Hola Mundo");
        return ResponseEntity.ok(hello);
    }
}
