package com.example.aiops.automation.api;

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
@RequestMapping("/api/automation/workflows")
@Validated
public class WorkflowController {

  private final List<Map<String, Object>> inMemoryWorkflows = new ArrayList<>();

  @GetMapping
  public List<Map<String, Object>> listWorkflows() {
    return inMemoryWorkflows;
  }

  @PostMapping
  public ResponseEntity<Map<String, Object>> createWorkflow(@RequestBody Map<String, Object> workflow) {
    inMemoryWorkflows.add(workflow);
    return ResponseEntity.status(HttpStatus.CREATED).body(workflow);
  }
}