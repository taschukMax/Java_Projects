package lesson17;

import java.io.Serializable;

public class PageProperties implements Serializable {
    private int fontSize;
    private String font;
    private String fontColor;
    private String text;

    public PageProperties() {
    }

    public PageProperties(int fontSize, String font, String fontColor, String text) {
        this.fontSize = fontSize;
        this.font = font;
        this.fontColor = fontColor;
        this.text = text;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFont() {
        return font;
    }

    public String getFontColor() {
        return fontColor;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "PageProperties{" +
                "fontSize=" + fontSize +
                ", font='" + font + '\'' +
                ", fontColor='" + fontColor + '\'' +
                '}';
    }
}
