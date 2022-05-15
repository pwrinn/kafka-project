package wrinn.kafkaproject.model;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import wrinn.kafkaproject.producer.ProducerService;

@RestController
@AllArgsConstructor
@RequestMapping("/kafka")
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/publish")
    public void publish(@RequestParam String topic, @RequestParam String payload) {
        producerService.send(topic, payload);
    }
}
