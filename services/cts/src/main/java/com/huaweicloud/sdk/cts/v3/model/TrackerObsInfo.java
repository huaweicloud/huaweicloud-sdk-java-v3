package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 转储桶信息。 */
public class TrackerObsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_prefix_name")

    private String filePrefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_obs_created")

    private Boolean isObsCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_lifecycle")

    private Integer bucketLifecycle;

    public TrackerObsInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /** 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * 
     * @return bucketName */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public TrackerObsInfo withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    /** 标识需要存储于OBS的日志文件前缀，0-9，a-z，A-Z，'-'，'.'，'_'长度为0～64字符。
     * 
     * @return filePrefixName */
    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }

    public TrackerObsInfo withIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
        return this;
    }

    /** 是否支持新建OBS桶。 值为“true”时，表示新创建OBS桶存储事件文件； 值为“false”时，选择已存在的OBS桶存储事件文件。
     * 
     * @return isObsCreated */
    public Boolean getIsObsCreated() {
        return isObsCreated;
    }

    public void setIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
    }

    public TrackerObsInfo withBucketLifecycle(Integer bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
        return this;
    }

    /** 标识配置桶内对象存储周期。 当\"tracker_type\"参数值为\"data\"时该参数值有效。 minimum: 0 maximum: 5000
     * 
     * @return bucketLifecycle */
    public Integer getBucketLifecycle() {
        return bucketLifecycle;
    }

    public void setBucketLifecycle(Integer bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackerObsInfo trackerObsInfo = (TrackerObsInfo) o;
        return Objects.equals(this.bucketName, trackerObsInfo.bucketName)
            && Objects.equals(this.filePrefixName, trackerObsInfo.filePrefixName)
            && Objects.equals(this.isObsCreated, trackerObsInfo.isObsCreated)
            && Objects.equals(this.bucketLifecycle, trackerObsInfo.bucketLifecycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, filePrefixName, isObsCreated, bucketLifecycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackerObsInfo {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
        sb.append("    isObsCreated: ").append(toIndentedString(isObsCreated)).append("\n");
        sb.append("    bucketLifecycle: ").append(toIndentedString(bucketLifecycle)).append("\n");
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
