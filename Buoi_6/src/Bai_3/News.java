package Bai_3;

import java.util.Arrays;

public class News implements INew {
    private int id;
    private String title;
    private String publishDate;
    private String author, content;
    private float averageRate = 0;
    private int[] rateList = new int[3];
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public float getAverageRate() {
        return averageRate;
    }
    @Override
    public void Display() {
        System.out.println("Title: "+title);
        System.out.println("Publish date: "+publishDate);
        System.out.println("Author: "+author);
        System.out.println("Content: "+content);
        System.out.println("Average rate: "+averageRate);
    }

    public int[] getRateList(){
        return rateList;
    }

    public void setRateList(int a, int b, int c) {
        rateList[0] = a;
        rateList[1] = b;
        rateList[2] = c;
    }

    public void Calculate() {
        averageRate = (float)((rateList[0] + rateList[1] + rateList[2]) / 3);
    }
    @Override
    public String toString() {
        return "News [author=" + author + ", averageRate=" + averageRate + ", content=" + content + ", id=" + id
                + ", publishDate=" + publishDate + ", rateList=" + Arrays.toString(rateList) + ", title=" + title + "]";
    }    
}
