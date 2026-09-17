package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建设备数据推送MQTT
 */
public class DeviceInfluxDB2PushInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    public DeviceInfluxDB2PushInfo withOrganization(String organization) {
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

    public DeviceInfluxDB2PushInfo withBucket(String bucket) {
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

    public DeviceInfluxDB2PushInfo withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 数据格式转换类型
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceInfluxDB2PushInfo that = (DeviceInfluxDB2PushInfo) obj;
        return Objects.equals(this.organization, that.organization) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, bucket, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceInfluxDB2PushInfo {\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
