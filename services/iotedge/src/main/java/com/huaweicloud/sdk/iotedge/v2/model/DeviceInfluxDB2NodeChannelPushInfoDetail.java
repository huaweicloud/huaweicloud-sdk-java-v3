package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建设备数据推送InfluxDB2
 */
public class DeviceInfluxDB2NodeChannelPushInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    public DeviceInfluxDB2NodeChannelPushInfoDetail withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * 一组用户的工作空间，一组用户下可以创建多个bucket
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public DeviceInfluxDB2NodeChannelPushInfoDetail withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 数据存储的地方，结合了数据库和存储周期的概念
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceInfluxDB2NodeChannelPushInfoDetail that = (DeviceInfluxDB2NodeChannelPushInfoDetail) obj;
        return Objects.equals(this.organization, that.organization) && Objects.equals(this.bucket, that.bucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, bucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceInfluxDB2NodeChannelPushInfoDetail {\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
