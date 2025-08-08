package com.example.aiops.dcim.api;

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
@RequestMapping("/api/dcim/assets")
@Validated
public class AssetController {

  private final List<Map<String, Object>> inMemoryAssets = new ArrayList<>();

  @GetMapping
  public List<Map<String, Object>> listAssets() {
    return inMemoryAssets;
  }

  @PostMapping
  public ResponseEntity<Map<String, Object>> createAsset(@RequestBody Map<String, Object> asset) {
    inMemoryAssets.add(asset);
    return ResponseEntity.status(HttpStatus.CREATED).body(asset);
  }
}