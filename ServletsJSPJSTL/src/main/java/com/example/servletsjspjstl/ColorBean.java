package com.example.servletsjspjstl;

public class ColorBean {
    private String foregroundColor;
    private String backgroundColor;

    private Boolean tableBorder;

    public String getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Boolean getTableBorder() {
        return tableBorder;
    }

    public void setTableBorder(Boolean tableBorder) {
        this.tableBorder = tableBorder;
    }
}
