package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 未使用密钥分析详细结果。
 */
public class UnusedIamUserAccessKeyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_accessed")

    private OffsetDateTime lastAccessed;

    public UnusedIamUserAccessKeyDetails withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 用户访问密钥唯一标识符（ID）。
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public UnusedIamUserAccessKeyDetails withLastAccessed(OffsetDateTime lastAccessed) {
        this.lastAccessed = lastAccessed;
        return this;
    }

    /**
     * 用户访问密钥的最后访问时间。
     * @return lastAccessed
     */
    public OffsetDateTime getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(OffsetDateTime lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedIamUserAccessKeyDetails that = (UnusedIamUserAccessKeyDetails) obj;
        return Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.lastAccessed, that.lastAccessed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, lastAccessed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedIamUserAccessKeyDetails {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
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
