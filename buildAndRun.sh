#!/bin/sh
mvn clean package && docker build -t com.mas.app/jakarta-ee .
docker rm -f jakarta-ee || true && docker run -d -p 8080:8080 -p 4848:4848 --name jakarta-ee com.mas.app/jakarta-ee 
