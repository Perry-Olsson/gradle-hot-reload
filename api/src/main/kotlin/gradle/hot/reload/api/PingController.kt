package gradle.hot.reload.api

import gradle.hot.reload.lib.SayHello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping(): String {
        return SayHello().hello()
    }
}
