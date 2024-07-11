package com.shelltechsolutions.springsecurity.resources;

import jakarta.annotation.security.RolesAllowed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(TodoResource.class);

    public static final List<Todo> TODOS_LIST =
            List.of(new Todo("shelltechsolutions1", "Learn AWS"),
                    new Todo("llc", "Learn spring security"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    @PreAuthorize("#username == authentication.name")
    //@PostAuthorize("returnObject.username == 'shelltechsolutions'")
    @RolesAllowed({"USER", "ADMIN"})
    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        return TODOS_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Create {} for {}", todo, username);
    }
}

record Todo(String username, String description) {
}
