package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObsBucket
 */
public class ObsBucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized")

    private Boolean isAuthorized;

    public ObsBucket withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS的bucket名称
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ObsBucket withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * OBS的bucket所在region
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ObsBucket withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间，格式如：2020/07/16 15:11:55 GMT+08:00
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public ObsBucket withIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    /**
     * 鉴权
     * @return isAuthorized
     */
    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsBucket that = (ObsBucket) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.location, that.location)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.isAuthorized, that.isAuthorized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, location, creationDate, isAuthorized);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsBucket {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
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
