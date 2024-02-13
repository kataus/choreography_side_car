package ru.itvitality.csc.sidecar.service;

import ru.itvitality.csc.api.message.TMessage;

public interface ProcessorService {
    void callService( TMessage message );
}
