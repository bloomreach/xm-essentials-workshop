package org.example;

import java.util.Map;
import java.util.function.BiConsumer;

import org.onehippo.cms7.essentials.sdk.api.install.Instruction;
import org.onehippo.cms7.essentials.sdk.api.service.JcrService;

import javax.jcr.Session;

/**
 * ExampleInstruction
 */
public class ExampleInstruction implements Instruction {

    @javax.inject.Inject
    private JcrService jcrService;

    @Override
    public Status execute(Map<String, Object> parameters) {
        return Status.SUCCESS;
    }

    @Override
    public void populateChangeMessages(final BiConsumer<Type, String> changeMessageQueue) {
        Session session = jcrService.createSession();
        String userID = session.getUserID();
        changeMessageQueue.accept(Type.EXECUTE, "Example instruction change message " + userID);
    }
}
