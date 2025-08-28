package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 创建的永久访问密钥。
 */
public class AccessKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_access_key")

    private String secretAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AccessKeyStatus status;

    public AccessKey withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AccessKey withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 创建的永久访问密钥ID，即AK。
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public AccessKey withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 访问密钥创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AccessKey withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * 创建的SK。
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public AccessKey withStatus(AccessKeyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AccessKeyStatus getStatus() {
        return status;
    }

    public void setStatus(AccessKeyStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessKey that = (AccessKey) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.secretAccessKey, that.secretAccessKey) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accessKeyId, createdAt, secretAccessKey, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessKey {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
