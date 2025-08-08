# cloud
# application.properties

AIOps Platform (Spring Boot, Maven)

Modules:
- eureka-server (port 8761)
- cmdb-service (port 8081)
- dcim-service (port 8082)
- automation-service (port 8083)
- observability-service (port 8084)

Quickstart:
1. Build all modules:
   mvn -q -DskipTests package
2. Start Eureka:
   mvn -pl eureka-server -am spring-boot:run
3. Start services (in separate terminals):
   mvn -pl cmdb-service spring-boot:run
   mvn -pl dcim-service spring-boot:run
   mvn -pl automation-service spring-boot:run
   mvn -pl observability-service spring-boot:run

Endpoints:
- CMDB: GET/POST http://localhost:8081/api/cmdb/cis
- DCIM: GET/POST http://localhost:8082/api/dcim/assets
- Automation: GET/POST http://localhost:8083/api/automation/workflows
- Observability: GET http://localhost:8084/api/observability/metrics
- Actuator: http://localhost:{port}/actuator
- Eureka UI: http://localhost:8761
