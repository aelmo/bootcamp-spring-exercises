package br.com.meli.exercises.dtos;

public class LinkIdResponse {
    private int linkId;

    public LinkIdResponse(int linkId) {
        this.linkId = linkId;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }
}
