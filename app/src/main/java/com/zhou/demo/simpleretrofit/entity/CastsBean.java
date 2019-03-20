package com.zhou.demo.simpleretrofit.entity;

public class CastsBean {
    /**
     * alt : https://movie.douban.com/celebrity/1010506/
     * avatars : {"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp"}
     * name : 费雯·丽
     * id : 1010506
     */

    private String alt;
    private AvatarsBean avatars;
    private String name;
    private String id;

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public AvatarsBean getAvatars() {
        return avatars;
    }

    public void setAvatars(AvatarsBean avatars) {
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

    public static class AvatarsBean {
        /**
         * small : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
         * large : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
         * medium : http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp
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
    }

    @Override
    public String toString() {
        return "CastsBean{" +
                "alt='" + alt + '\'' +
                ", avatars=" + avatars +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
