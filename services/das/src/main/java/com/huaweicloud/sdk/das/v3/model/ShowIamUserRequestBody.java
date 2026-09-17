package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取IAM用户信息请求体
 */
public class ShowIamUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private String userIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    public ShowIamUserRequestBody withUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }

    /**
     * 账号ID
     * @return userIds
     */
    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    public ShowIamUserRequestBody withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 账号名称
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIamUserRequestBody that = (ShowIamUserRequestBody) obj;
        return Objects.equals(this.userIds, that.userIds) && Objects.equals(this.connectionId, that.connectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIds, connectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIamUserRequestBody {\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
