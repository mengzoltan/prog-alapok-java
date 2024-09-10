package com.training360.classstructuremethods;

public class Note {

    private String name;
    private String topic;
    private String text;

    /*
    Ez egy többsoros
    megjegyzés
     */
    public Note(String name) {
        System.out.println("Creating Note with name: " + name);
        // Beallitja a name erteket
        // dfgfd
        this.name = name;
    }

    public Note(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * A fv visszaad egy String-et ami
     * a következő formában jeleníti meg a Note adatait:
     * name + ": (" + topic + ") " + text;
     *
     * @param prefix ami egy String
     * @return
     */
    public String getNoteText(String prefix) {
        prefix = "*" + prefix + "*";
        int x = prefix.length();
        if (x < 10 ) {
            prefix = "";
        }
        return prefix +" " + name + ": (" + topic + ") " + text;
    }
}
