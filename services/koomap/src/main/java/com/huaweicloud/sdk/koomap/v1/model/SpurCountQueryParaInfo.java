package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取像控点已刺点张数的参数信息
 */
public class SpurCountQueryParaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

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

    public SpurCountQueryParaInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SpurCountQueryParaInfo withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 像控点经度。要求为WGS84地理坐标系。
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public SpurCountQueryParaInfo withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 像控点纬度。要求为WGS84地理坐标系。
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public SpurCountQueryParaInfo withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 像控点高度。要求为WGS84地理坐标系。
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public SpurCountQueryParaInfo withAccuracy(String accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 像控点精度。范围：(0, 100)。
     * @return accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpurCountQueryParaInfo that = (SpurCountQueryParaInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.latitude, that.latitude) && Objects.equals(this.height, that.height)
            && Objects.equals(this.accuracy, that.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, longitude, latitude, height, accuracy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpurCountQueryParaInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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
