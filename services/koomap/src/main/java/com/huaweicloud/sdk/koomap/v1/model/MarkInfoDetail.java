package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 像控点详细信息。
 */
public class MarkInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private String longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private String latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accuracy")

    private String accuracy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileName")

    private String fileName;

    public MarkInfoDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 像控点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MarkInfoDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 像控点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarkInfoDetail withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 像控点经度。
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public MarkInfoDetail withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 像控点纬度。
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public MarkInfoDetail withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 像控点高度。
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public MarkInfoDetail withAccuracy(String accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 像控点精度。
     * @return accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public MarkInfoDetail withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 所属生产资料别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public MarkInfoDetail withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 所属生产资料描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MarkInfoDetail withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 生产资料文件名。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarkInfoDetail that = (MarkInfoDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.longitude, that.longitude) && Objects.equals(this.latitude, that.latitude)
            && Objects.equals(this.height, that.height) && Objects.equals(this.accuracy, that.accuracy)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, longitude, latitude, height, accuracy, alias, desc, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkInfoDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
