package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 未绑定MFA分析详细结果。
 */
public class IamBpMfaUnconfiguredDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_created_at")

    private OffsetDateTime userCreatedAt;

    public IamBpMfaUnconfiguredDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户的唯一标识符（ID）。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public IamBpMfaUnconfiguredDetails withUserCreatedAt(OffsetDateTime userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
        return this;
    }

    /**
     * 用户的创建时间。
     * @return userCreatedAt
     */
    public OffsetDateTime getUserCreatedAt() {
        return userCreatedAt;
    }

    public void setUserCreatedAt(OffsetDateTime userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IamBpMfaUnconfiguredDetails that = (IamBpMfaUnconfiguredDetails) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userCreatedAt, that.userCreatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userCreatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamBpMfaUnconfiguredDetails {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userCreatedAt: ").append(toIndentedString(userCreatedAt)).append("\n");
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
