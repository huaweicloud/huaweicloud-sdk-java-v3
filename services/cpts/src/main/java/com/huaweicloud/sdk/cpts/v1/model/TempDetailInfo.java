package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** TempDetailInfo */
public class TempDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_quoted")

    private Boolean isQuoted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_type")

    private Integer tempType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public TempDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** description
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TempDetailInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /** id minimum: 0 maximum: 2147483647
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TempDetailInfo withIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
        return this;
    }

    /** is_quoted
     * 
     * @return isQuoted */
    public Boolean getIsQuoted() {
        return isQuoted;
    }

    public void setIsQuoted(Boolean isQuoted) {
        this.isQuoted = isQuoted;
    }

    public TempDetailInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TempDetailInfo withTempType(Integer tempType) {
        this.tempType = tempType;
        return this;
    }

    /** temp_type minimum: 0 maximum: 2147483647
     * 
     * @return tempType */
    public Integer getTempType() {
        return tempType;
    }

    public void setTempType(Integer tempType) {
        this.tempType = tempType;
    }

    public TempDetailInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** update_time
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TempDetailInfo tempDetailInfo = (TempDetailInfo) o;
        return Objects.equals(this.description, tempDetailInfo.description)
            && Objects.equals(this.id, tempDetailInfo.id) && Objects.equals(this.isQuoted, tempDetailInfo.isQuoted)
            && Objects.equals(this.name, tempDetailInfo.name) && Objects.equals(this.tempType, tempDetailInfo.tempType)
            && Objects.equals(this.updateTime, tempDetailInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, isQuoted, name, tempType, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TempDetailInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isQuoted: ").append(toIndentedString(isQuoted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tempType: ").append(toIndentedString(tempType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
