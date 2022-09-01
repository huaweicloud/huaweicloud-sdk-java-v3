package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * BatchImportCloudPhoneDataRequestBodyRestoreInfos
 */
public class BatchImportCloudPhoneDataRequestBodyRestoreInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    @JacksonXmlProperty(localName = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_path")

    @JacksonXmlProperty(localName = "object_path")

    private String objectPath;

    public BatchImportCloudPhoneDataRequestBodyRestoreInfos withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机ID
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public BatchImportCloudPhoneDataRequestBodyRestoreInfos withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 存储云手机数据的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BatchImportCloudPhoneDataRequestBodyRestoreInfos withObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }

    /**
     * 数据存储的OBS路径名。bucket_name与object_path长度累加要超过128。 合法的OBS对象key，最大长度1024字符
     * @return objectPath
     */
    public String getObjectPath() {
        return objectPath;
    }

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchImportCloudPhoneDataRequestBodyRestoreInfos batchImportCloudPhoneDataRequestBodyRestoreInfos =
            (BatchImportCloudPhoneDataRequestBodyRestoreInfos) o;
        return Objects.equals(this.phoneId, batchImportCloudPhoneDataRequestBodyRestoreInfos.phoneId)
            && Objects.equals(this.bucketName, batchImportCloudPhoneDataRequestBodyRestoreInfos.bucketName)
            && Objects.equals(this.objectPath, batchImportCloudPhoneDataRequestBodyRestoreInfos.objectPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId, bucketName, objectPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportCloudPhoneDataRequestBodyRestoreInfos {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectPath: ").append(toIndentedString(objectPath)).append("\n");
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
