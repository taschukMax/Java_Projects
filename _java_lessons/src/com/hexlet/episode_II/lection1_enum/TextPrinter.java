package com.hexlet.episode_II.lection1_enum;

public class TextPrinter {
    private static void show(String text, EStyle style) {
        /*switch (style) {
            case DOLLAR_STYLE:
                System.out.println(style.getStyleString() + text + style.getStyleString());
                break;
            case A_STYLE:
                System.out.println(style.getStyleString() + text + style.getStyleString());
                break;
            default:
                System.out.println(text);
        }   */
        System.out.println(style.getStyleString() + text + style.getStyleString());
    }

    public static void main(String[] args) {
        System.out.println("Supported styles: ");
        for (EStyle eStyle : EStyle.values()) {
            System.out.println("- " + eStyle.toString());
        }

    }
}
