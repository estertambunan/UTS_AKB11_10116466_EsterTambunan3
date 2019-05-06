package com.kosan.estertambunan.Presenter;

public class datanote {
    String text;
    String comment;
    String date;

    public datanote(String text, String comment, String date)
    {
        this.text = text;
        this.comment = comment;
        this.date = date;
    }

    public String getText()
    {
        return text;
    }

    public String getComment()
    {
        return comment;
    }

    public String getDate()
    {
        return date;
    }
}
