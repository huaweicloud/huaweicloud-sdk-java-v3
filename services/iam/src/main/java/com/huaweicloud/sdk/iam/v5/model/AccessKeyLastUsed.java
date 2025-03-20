package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 访问密钥的最后使用时间。
 */
public class AccessKeyLastUsed {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_used_at")

    private OffsetDateTime lastUsedAt;

    public AccessKeyLastUsed withLastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    /**
     * 访问密钥的最后使用时间。若不存在则表示从未使用过。
     * @return lastUsedAt
     */
    public OffsetDateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessKeyLastUsed that = (AccessKeyLastUsed) obj;
        return Objects.equals(this.lastUsedAt, that.lastUsedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUsedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessKeyLastUsed {\n");
        sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
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
