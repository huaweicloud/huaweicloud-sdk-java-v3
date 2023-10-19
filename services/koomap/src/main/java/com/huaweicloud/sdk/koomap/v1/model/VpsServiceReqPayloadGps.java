package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpsServiceReqPayloadGps
 */
public class VpsServiceReqPayloadGps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private Double longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private Double latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accuracy")

    private Float accuracy;

    public VpsServiceReqPayloadGps withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 经度。
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public VpsServiceReqPayloadGps withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 纬度。
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public VpsServiceReqPayloadGps withAccuracy(Float accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 误差值。
     * @return accuracy
     */
    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
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
        VpsServiceReqPayloadGps that = (VpsServiceReqPayloadGps) obj;
        return Objects.equals(this.longitude, that.longitude) && Objects.equals(this.latitude, that.latitude)
            && Objects.equals(this.accuracy, that.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude, accuracy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayloadGps {\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
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
