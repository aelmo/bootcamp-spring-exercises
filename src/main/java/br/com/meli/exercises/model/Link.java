package br.com.meli.exercises.model;

public class Link {
    private int id;
    private String url;
    private static int counter = 0;
    private int counterMetrics = 0;

    public void  incrementCounterMetrics(){
        this.counterMetrics++;
    }

    public int getCounterMetrics() {
        return this.counterMetrics;
    }

    public void setCounterMetrics(int counterMetrics) {
        this.counterMetrics = counterMetrics;
    }

    public Link(String url){
        this.url = url;
        this.id = counter+1;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
