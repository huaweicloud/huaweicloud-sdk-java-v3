package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 预测刺点的参数信息。
 */
public class SpurPredictParaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private Double longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private Double latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Double height;

    public SpurPredictParaInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SpurPredictParaInfo withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 像控点经度。要求为WGS84地理坐标系。
     * minimum: -1E+7
     * maximum: 1E+7
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public SpurPredictParaInfo withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 像控点纬度。要求为WGS84地理坐标系。
     * minimum: -1E+7
     * maximum: 1E+7
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public SpurPredictParaInfo withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * 像控点高度。要求为WGS84地理坐标系。
     * minimum: -1E+7
     * maximum: 1E+7
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpurPredictParaInfo that = (SpurPredictParaInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.latitude, that.latitude) && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, longitude, latitude, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpurPredictParaInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
