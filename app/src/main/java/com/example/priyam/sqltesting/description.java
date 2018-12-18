package com.example.priyam.sqltesting;

public class description {

    private  String title  ,descr;

public description(String title,String descr){


    this.setTitle(title);
    this.setDescr(descr);
 //   this.setLink(link);
}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
/*
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }*/
}
