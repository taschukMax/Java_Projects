package com.hexlet.episode_II.lection1_enum;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public enum  EStyle {
    DOLLAR_STYLE("$"),
    A_STYLE("@"),
    B_STYLE("#"),
    DEFAULT_STYLE("");

    private final String styleString;

    EStyle(String styleString) {
        this.styleString = styleString;
    }

    public String getStyleString() {
        return styleString;
    }
}
