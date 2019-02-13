package lv.citadele.orbital

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/hello")
    fun hello() = "Hello from orbit!"
}