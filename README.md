# APP demo-cloud-processor
## Custom_Processor_Deploy_Server

mvn clean package

mvn install

app register --type processor --name convertToCelsius --uri maven://demo.celsius.converter:celsius-converter-processor:0.0.1-SNAPSHOT

stream create --name convertToCelsiusStream --definition "http  --port=9090 | convertToCelsius | log" --deploy

http post --target http://localhost:9090 --data 200

stream destroy --name convertToCelsiusStream

app unregister --name convertToCelsius --type processor
