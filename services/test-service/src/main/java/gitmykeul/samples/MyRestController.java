package gitmykeul.samples;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class MyRestController {

    public MyRestController() {
    }

    @PreAuthorize("hasPermission('test', 'test')")
    @GetMapping("/myRest")
    public String getString() {
        return "output";
    }
}