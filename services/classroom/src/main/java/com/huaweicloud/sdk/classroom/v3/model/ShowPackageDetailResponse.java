package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPackageDetailResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_cnt")

    private Integer exerciseCnt;

    public ShowPackageDetailResponse withId(String id) {
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

    public ShowPackageDetailResponse withName(String name) {
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

    public ShowPackageDetailResponse withTagName(String tagName) {
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

    public ShowPackageDetailResponse withSchool(String school) {
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

    public ShowPackageDetailResponse withTeacherName(String teacherName) {
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

    public ShowPackageDetailResponse withOrderCount(Integer orderCount) {
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

    public ShowPackageDetailResponse withImageUrl(String imageUrl) {
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

    public ShowPackageDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 习题库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPackageDetailResponse withExerciseCnt(Integer exerciseCnt) {
        this.exerciseCnt = exerciseCnt;
        return this;
    }

    /**
     * 习题库里的习题数量
     * @return exerciseCnt
     */
    public Integer getExerciseCnt() {
        return exerciseCnt;
    }

    public void setExerciseCnt(Integer exerciseCnt) {
        this.exerciseCnt = exerciseCnt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPackageDetailResponse showPackageDetailResponse = (ShowPackageDetailResponse) o;
        return Objects.equals(this.id, showPackageDetailResponse.id)
            && Objects.equals(this.name, showPackageDetailResponse.name)
            && Objects.equals(this.tagName, showPackageDetailResponse.tagName)
            && Objects.equals(this.school, showPackageDetailResponse.school)
            && Objects.equals(this.teacherName, showPackageDetailResponse.teacherName)
            && Objects.equals(this.orderCount, showPackageDetailResponse.orderCount)
            && Objects.equals(this.imageUrl, showPackageDetailResponse.imageUrl)
            && Objects.equals(this.description, showPackageDetailResponse.description)
            && Objects.equals(this.exerciseCnt, showPackageDetailResponse.exerciseCnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tagName, school, teacherName, orderCount, imageUrl, description, exerciseCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPackageDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    school: ").append(toIndentedString(school)).append("\n");
        sb.append("    teacherName: ").append(toIndentedString(teacherName)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    exerciseCnt: ").append(toIndentedString(exerciseCnt)).append("\n");
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
