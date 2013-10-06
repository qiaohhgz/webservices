package com.jim;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: Jim_qiao
 * Date: 8/29/13
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class House {
    private String name;

    public House() {
    }

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
