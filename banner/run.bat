curl -d "" -H "content-type:application/json" http://localhost:8081/actuator/shutdown
start /B java -jar -Dserver.port=8081 target/banner-1.0.jar > dev.log
exit 0
