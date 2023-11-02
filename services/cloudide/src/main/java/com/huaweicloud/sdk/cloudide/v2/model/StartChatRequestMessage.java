package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * start chat request message
 */
public class StartChatRequestMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public StartChatRequestMessage withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * user type
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public StartChatRequestMessage withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * user id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartChatRequestMessage that = (StartChatRequestMessage) obj;
        return Objects.equals(this.userType, that.userType) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userType, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartChatRequestMessage {\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
