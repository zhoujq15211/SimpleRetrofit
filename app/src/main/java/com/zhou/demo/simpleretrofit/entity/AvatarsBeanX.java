package com.zhou.demo.simpleretrofit.entity;

public class AvatarsBeanX {
    /**
     * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
     * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
     * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp
     */

    private String small;
    private String large;
    private String medium;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "AvatarsBeanX{" +
                "small='" + small + '\'' +
                ", large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}
