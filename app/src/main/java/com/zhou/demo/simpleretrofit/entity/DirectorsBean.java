package com.zhou.demo.simpleretrofit.entity;

public class DirectorsBean {
    /**
     * alt : https://movie.douban.com/celebrity/1032275/
     * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp"}
     * name : 维克多·弗莱明
     * id : 1032275
     */

    private String alt;
    private AvatarsBeanX avatars;
    private String name;
    private String id;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public AvatarsBeanX getAvatars() {
        return avatars;
    }

    public void setAvatars(AvatarsBeanX avatars) {
        this.avatars = avatars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DirectorsBean{" +
                "alt='" + alt + '\'' +
                ", avatars=" + avatars +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
