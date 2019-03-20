package com.zhou.demo.simpleretrofit.entity;

import java.util.List;

public class SubjectsBean {
    /**
     * rating : {"max":10,"average":9.2,"stars":"50","min":0}
     * genres : ["剧情","历史","爱情"]
     * title : 乱世佳人
     * casts : [{"alt":"https://movie.douban.com/celebrity/1010506/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p3151.webp"},"name":"费雯·丽","id":"1010506"},{"alt":"https://movie.douban.com/celebrity/1006997/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5289.webp"},"name":"克拉克·盖博","id":"1006997"},{"alt":"https://movie.douban.com/celebrity/1010604/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4239.webp"},"name":"奥利维娅·德哈维兰","id":"1010604"}]
     * collect_count : 495824
     * original_title : Gone with the Wind
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1032275/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11303.webp"},"name":"维克多·弗莱明","id":"1032275"},{"alt":"https://movie.douban.com/celebrity/1010711/","avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p19067.webp"},"name":"乔治·库克","id":"1010711"},{"alt":"https://movie.douban.com/celebrity/1012588/","avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p54831.webp"},"name":"山姆·伍德","id":"1012588"}]
     * year : 1939
     * images : {"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp"}
     * alt : https://movie.douban.com/subject/1300267/
     * id : 1300267
     */

    private RatingBean rating;
    private String title;
    private int collect_count;
    private String original_title;
    private String subtype;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<DirectorsBean> directors;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    @Override
    public String toString() {
        return "SubjectsBean{" +
                "rating=" + rating +
                ", title='" + title + '\'' +
                ", collect_count=" + collect_count +
                ", original_title='" + original_title + '\'' +
                ", subtype='" + subtype + '\'' +
                ", year='" + year + '\'' +
                ", images=" + images +
                ", alt='" + alt + '\'' +
                ", id='" + id + '\'' +
                ", genres=" + genres +
                ", casts=" + casts +
                ", directors=" + directors +
                '}';
    }
}
