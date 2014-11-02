package com.apress.springrecipes.board.service;

import com.apress.springrecipes.board.domain.Message;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SERGE on 02.11.2014.
 */
public class MessageBoardServiceImpl implements MessageBoardService {
    private Map<Long, Message> messages = new LinkedHashMap<>();

    @Override
    public List<Message> listMessages() {
        return new ArrayList<Message>(messages.values());
    }

    @Override
    public synchronized void postMessage(Message message) {
        message.setId(System.currentTimeMillis());
        messages.put(message.getId(), message);
    }

    @Override
    public synchronized void deleteMessage(Message message) {
        messages.remove(message.getId());
    }

    @Override
    public Message findMessageById(Long messageId) {
        return messages.get(messageId);
    }
}
