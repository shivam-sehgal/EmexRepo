package com.example.user.emex;

/**
 * Created by user on 4/14/2017.
 */

public class Row2Data {
    private int imgId;
    private String title;

    /**
     * @return id of image
     */
    public int getImgButton() {
        return imgId;
    }

    /**
     * @param imgButton takes imagebutton id
     */
    public void setImgButton(final int imgButton) {
        this.imgId = imgButton;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title takes the title
     */
    public void setTitle(final String title) {
        this.title = title;
    }


}
