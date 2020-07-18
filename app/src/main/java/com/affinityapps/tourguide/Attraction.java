package com.affinityapps.tourguide;

public class Attraction {

    private int guideImage;
    private int guideText;
    private int guideDescription;

    public Attraction(int guideImage, int guideText, int guideDescription) {
        this.guideImage = guideImage;
        this.guideText = guideText;
        this.guideDescription = guideDescription;
    }


    public int getGuideImage() {
        return guideImage;
    }

    public int getGuideText() {
        return guideText;
    }

    public int getGuideDescription() {return guideDescription; }
}
