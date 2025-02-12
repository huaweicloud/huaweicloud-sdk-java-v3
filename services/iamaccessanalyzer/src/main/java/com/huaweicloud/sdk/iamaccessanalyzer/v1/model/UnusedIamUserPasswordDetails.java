package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 未使用的用户密码详情。
 */
public class UnusedIamUserPasswordDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_accessed")

    private OffsetDateTime lastAccessed;

    public UnusedIamUserPasswordDetails withLastAccessed(OffsetDateTime lastAccessed) {
        this.lastAccessed = lastAccessed;
        return this;
    }

    /**
     * 用户密码的最后访问时间。
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
        UnusedIamUserPasswordDetails that = (UnusedIamUserPasswordDetails) obj;
        return Objects.equals(this.lastAccessed, that.lastAccessed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastAccessed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedIamUserPasswordDetails {\n");
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
