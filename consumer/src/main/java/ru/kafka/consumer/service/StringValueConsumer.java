package ru.kafka.consumer.service;

import ru.kafka.consumer.model.StringValue;

import java.util.List;

public interface StringValueConsumer {

    void accept(List<StringValue> value);
}
