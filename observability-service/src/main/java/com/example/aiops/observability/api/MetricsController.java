package com.example.aiops.observability.api;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/observability")
public class MetricsController {

  @GetMapping("/metrics")
  public Map<String, Object> getMetrics() {
    Map<String, Object> result = new HashMap<>();
    result.put("status", "ok");
    result.put("timestamp", System.currentTimeMillis());
    return result;
  }
}