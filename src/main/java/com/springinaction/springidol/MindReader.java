package com.springinaction.springidol;

/* Обладатель таланта - чтец мыслей
* */
public interface MindReader {

    // чтение мыслей
    void interceptThoughts(String thoughts);

    // сообщение прочитанных мыслей публике
    String getThoughts();
}