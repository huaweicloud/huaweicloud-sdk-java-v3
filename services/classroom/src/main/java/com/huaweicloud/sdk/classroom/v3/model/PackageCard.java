package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 习题库简单信息返回体，用于列表返回
 */
public class PackageCard {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "school")

    private String school;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "teacher_name")

    private String teacherName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_count")

    private Integer orderCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    public PackageCard withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 习题库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PackageCard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 习题库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageCard withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public PackageCard withSchool(String school) {
        this.school = school;
        return this;
    }

    /**
     * 学习名称
     * @return school
     */
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public PackageCard withTeacherName(String teacherName) {
        this.teacherName = teacherName;
        return this;
    }

    /**
     * 教师名称
     * @return teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public PackageCard withOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * 租户习题库编号
     * @return orderCount
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public PackageCard withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 背景图url
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageCard packageCard = (PackageCard) o;
        return Objects.equals(this.id, packageCard.id) && Objects.equals(this.name, packageCard.name)
            && Objects.equals(this.tagName, packageCard.tagName) && Objects.equals(this.school, packageCard.school)
            && Objects.equals(this.teacherName, packageCard.teacherName)
            && Objects.equals(this.orderCount, packageCard.orderCount)
            && Objects.equals(this.imageUrl, packageCard.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tagName, school, teacherName, orderCount, imageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageCard {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    school: ").append(toIndentedString(school)).append("\n");
        sb.append("    teacherName: ").append(toIndentedString(teacherName)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
