package com.affinityapps.tourguide;

public class Attraction {

    private int guideImage;
    private String guideText;
    private String testString1;
    private String testString2;

//    public Attraction(int guideImage, String guideText) {
//        this.guideImage = guideImage;
//        this.guideText = guideText;
//    }


    public Attraction(String guideText, String testString1, String testString2) {
        this.guideText = guideText;
        this.testString1 = testString1;
        this.testString2 = testString2;
    }

    public int getGuideImage() {
        return guideImage;
    }

    public String getGuideText() {
        return guideText;
    }

    public String getTestString1() {
        return testString1;
    }

    public String getTestString2() {
        return testString2;
    }
}
