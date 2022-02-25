package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListProjectVersionsV4ResponseBodyIterations */
public class ListProjectVersionsV4ResponseBodyIterations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private Long updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    public ListProjectVersionsV4ResponseBodyIterations withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 迭代描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListProjectVersionsV4ResponseBodyIterations withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 迭代结束时间
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListProjectVersionsV4ResponseBodyIterations withId(Integer id) {
        this.id = id;
        return this;
    }

    /** 迭代id
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListProjectVersionsV4ResponseBodyIterations withName(String name) {
        this.name = name;
        return this;
    }

    /** 迭代标题
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProjectVersionsV4ResponseBodyIterations withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /** 迭代开始时间
     * 
     * @return beginTime */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListProjectVersionsV4ResponseBodyIterations withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 迭代状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListProjectVersionsV4ResponseBodyIterations withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /** 迭代更新时间，长整型时间戳
     * 
     * @return updatedTime */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ListProjectVersionsV4ResponseBodyIterations withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /** 迭代是否已经删除，false, 未删除， true已经删除
     * 
     * @return deleted */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectVersionsV4ResponseBodyIterations listProjectVersionsV4ResponseBodyIterations =
            (ListProjectVersionsV4ResponseBodyIterations) o;
        return Objects.equals(this.description, listProjectVersionsV4ResponseBodyIterations.description)
            && Objects.equals(this.endTime, listProjectVersionsV4ResponseBodyIterations.endTime)
            && Objects.equals(this.id, listProjectVersionsV4ResponseBodyIterations.id)
            && Objects.equals(this.name, listProjectVersionsV4ResponseBodyIterations.name)
            && Objects.equals(this.beginTime, listProjectVersionsV4ResponseBodyIterations.beginTime)
            && Objects.equals(this.status, listProjectVersionsV4ResponseBodyIterations.status)
            && Objects.equals(this.updatedTime, listProjectVersionsV4ResponseBodyIterations.updatedTime)
            && Objects.equals(this.deleted, listProjectVersionsV4ResponseBodyIterations.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, endTime, id, name, beginTime, status, updatedTime, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectVersionsV4ResponseBodyIterations {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
