package com.apress.springrecipes.board.web;

import com.apress.springrecipes.board.domain.Message;
import com.apress.springrecipes.board.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
@Controller
@RequestMapping("/messageList*")
public class MessageListController {
    private MessageBoardService messageBoardService;

    @Autowired
    public MessageListController(MessageBoardService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String generateList(Model model) {
        List<Message> messages = java.util.Collections.emptyList();
        messages = messageBoardService.listMessages();
        model.addAttribute("messages", messages);
        return "messageList";
    }
}
