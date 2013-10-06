package com.jim;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: Jim_qiao
 * Date: 8/28/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class PersonBean {
    private String name;
    private House house;
    private TreeMap<String, House> treeMap;
    private int[] budget;

    public int[] getBudget() {
        return budget;
    }

    public void setBudget(int[] budget) {
        this.budget = budget;
    }

    public TreeMap<String, House> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(TreeMap<String, House> treeMap) {
        this.treeMap = treeMap;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
