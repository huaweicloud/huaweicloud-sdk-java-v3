package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * IAM用户最后登录时间。
 */
public class UserLastLogin {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_login_at")

    private OffsetDateTime lastLoginAt;

    public UserLastLogin withLastLoginAt(OffsetDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
        return this;
    }

    /**
     * IAM用户最后登录时间。若不存在则表示从未登录过。
     * @return lastLoginAt
     */
    public OffsetDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(OffsetDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserLastLogin that = (UserLastLogin) obj;
        return Objects.equals(this.lastLoginAt, that.lastLoginAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastLoginAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserLastLogin {\n");
        sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
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
