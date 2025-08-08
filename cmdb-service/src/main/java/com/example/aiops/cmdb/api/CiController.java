package com.example.aiops.cmdb.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cmdb/cis")
@Validated
public class CiController {

  private final List<Map<String, Object>> inMemoryCis = new ArrayList<>();

  @GetMapping
  public List<Map<String, Object>> listConfigurationItems() {
    return inMemoryCis;
  }

  @PostMapping
  public ResponseEntity<Map<String, Object>> createConfigurationItem(@RequestBody Map<String, Object> ci) {
    inMemoryCis.add(ci);
    return ResponseEntity.status(HttpStatus.CREATED).body(ci);
  }
}