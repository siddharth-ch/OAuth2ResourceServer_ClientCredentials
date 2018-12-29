package com.sid.moviedb.eureka;

import java.util.UUID;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("#oauth.hasScope('API')")
public class CustomRestController {

    @GetMapping
    @PreAuthorize("hasAuthority('API_READ')")
    public String readFoo() {
	return "read foo " + UUID.randomUUID().toString();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('API_WRITE')")
    public String writeFoo() {
	return "write foo " + UUID.randomUUID().toString();
    }
}
