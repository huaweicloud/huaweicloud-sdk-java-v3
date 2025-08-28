package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PolicyUser
 */
public class PolicyUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_at")

    private OffsetDateTime attachedAt;

    public PolicyUser withUserId(String userId) {
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

    public PolicyUser withAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    /**
     * 身份策略的附加时间。
     * @return attachedAt
     */
    public OffsetDateTime getAttachedAt() {
        return attachedAt;
    }

    public void setAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyUser that = (PolicyUser) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.attachedAt, that.attachedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, attachedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyUser {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    attachedAt: ").append(toIndentedString(attachedAt)).append("\n");
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
