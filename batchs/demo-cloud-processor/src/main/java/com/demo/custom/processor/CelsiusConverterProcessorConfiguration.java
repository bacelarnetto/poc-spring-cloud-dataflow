package com.demo.custom.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@EnableBinding(Processor.class)
public class CelsiusConverterProcessorConfiguration {

    @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public int convertToCelsius(String payload) {
        int fahrenheitTemperature = Integer.parseInt(payload);
        System.out.println("Got the input as "+fahrenheitTemperature);
        return (fahrenheitTemperature-32)*5/9;
    }
}