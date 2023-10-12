package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckBucketRequest
 */
public class CheckBucketRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_location")

    private String bucketLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_trace_files_encryption")

    private Boolean isSupportTraceFilesEncryption;

    public CheckBucketRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CheckBucketRequest withBucketLocation(String bucketLocation) {
        this.bucketLocation = bucketLocation;
        return this;
    }

    /**
     * 标识OBS桶位置。
     * @return bucketLocation
     */
    public String getBucketLocation() {
        return bucketLocation;
    }

    public void setBucketLocation(String bucketLocation) {
        this.bucketLocation = bucketLocation;
    }

    public CheckBucketRequest withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    /**
     * 事件文件转储加密所采用的秘钥id，is_support_trace_files_encryption\"参数值为“是”时，此参数为必选项。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public CheckBucketRequest withIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
        return this;
    }

    /**
     * 事件文件转储加密功能开关。 该参数必须与kms_id参数同时使用。
     * @return isSupportTraceFilesEncryption
     */
    public Boolean getIsSupportTraceFilesEncryption() {
        return isSupportTraceFilesEncryption;
    }

    public void setIsSupportTraceFilesEncryption(Boolean isSupportTraceFilesEncryption) {
        this.isSupportTraceFilesEncryption = isSupportTraceFilesEncryption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckBucketRequest that = (CheckBucketRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.bucketLocation, that.bucketLocation) && Objects.equals(this.kmsId, that.kmsId)
            && Objects.equals(this.isSupportTraceFilesEncryption, that.isSupportTraceFilesEncryption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, bucketLocation, kmsId, isSupportTraceFilesEncryption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckBucketRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketLocation: ").append(toIndentedString(bucketLocation)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    isSupportTraceFilesEncryption: ")
            .append(toIndentedString(isSupportTraceFilesEncryption))
            .append("\n");
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
