package com.affinityapps.tourguide;

public class Attraction {

    private int guideImage;
    private String guideText;
    private String guideDescription;

    public Attraction(int guideImage, String guideText, String guideDescription) {
        this.guideImage = guideImage;
        this.guideText = guideText;
        this.guideDescription = guideDescription;
    }


    public int getGuideImage() {
        return guideImage;
    }

    public String getGuideText() {
        return guideText;
    }

    public String getGuideDescription() {return guideDescription; }
}
