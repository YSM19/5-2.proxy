package hello.proxy.app.v3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderControllerV3 {

    private final OrderServiceV3 orderservice;

    public OrderControllerV3(OrderServiceV3 orderService) {
        this.orderservice = orderService;
    }

    @GetMapping("/v3/request")
    public String request(String itemId) {
        orderservice.orderItem(itemId);
        return "Ok";
    }

    @GetMapping("/v3/no-log")
    public String noLog() {
        return "Ok";
    }

}
