package ru.kafka.producer.service;


import ru.kafka.producer.model.StringValue;

public interface DataSender {
    void send(StringValue value);
}
