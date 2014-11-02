package com.apress.springrecipes.board.service;

import com.apress.springrecipes.board.domain.Message;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public interface MessageBoardService {
    public List<Message> listMessages();

    public void postMessage(Message message);

    public void deleteMessage(Message message);

    public Message findMessageById(Long messageId);
}
