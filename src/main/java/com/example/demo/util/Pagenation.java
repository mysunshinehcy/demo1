package com.example.demo.util;

public class Pagenation {

    private int startPage;

    private int startIndex;

    private int pageSize = 10;

    public Pagenation(int startPage) {
        System.out.println("startPage =" + startPage);
        this.startIndex = (startPage - 1) * pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }



    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startPage) {
        this.startIndex = (startPage - 1) * pageSize;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }
}
