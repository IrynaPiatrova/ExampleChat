package com.courses.progect.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Irina Petrova on 24.05.2017.
 */

public class Chat {
    /**
     * name - name of the room (chat)
     * chatters - Map to store Chatter objects
     * messages -  Linked list to store Message object
     */
    private String name;
    private Map chatters = new HashMap();
    private List messages = new LinkedList();

    public Chat() {
    }

    /**
     * This constructor takes a name to create a new ChatRoom
     * @param name
     */
    public Chat(String name) {
        this.name = name;
    }

    /**
     * Returns name of the room
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * Set room name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * adds a Chat object to list of chatters
     * @return void
     */
    public void addChatter(Message message) {
        chatters.put(this.getName(), message);
    }

    /**
     * returns a Chat object from chatters list.
     * @param chatName
     * @return com.courses.progect.classes.Chat
     */
    public Chat getChat(String chatName) {
        return (Chat) chatters.get(chatName);
    }

    /**
     * Add Message object from messages Map
     * @param message
     */
    public void addMessage(Message message) {
        messages.add(message);
    }

    /**
     * @return java.util.Map chatters
     */
    public Map getChatters() {
        return chatters;
    }

    /**
     * @return java.util.List messages
     */
    public List getMessages() {
        return messages;
    }
}
