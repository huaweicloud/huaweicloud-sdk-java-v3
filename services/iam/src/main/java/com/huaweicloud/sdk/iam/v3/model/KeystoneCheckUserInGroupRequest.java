package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneCheckUserInGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    public KeystoneCheckUserInGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 用户组ID，获取方式请参见：[获取用户组ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public KeystoneCheckUserInGroupRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 待查询的IAM用户ID，获取方式请参见：[获取IAM用户ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCheckUserInGroupRequest keystoneCheckUserInGroupRequest = (KeystoneCheckUserInGroupRequest) o;
        return Objects.equals(this.groupId, keystoneCheckUserInGroupRequest.groupId)
            && Objects.equals(this.userId, keystoneCheckUserInGroupRequest.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCheckUserInGroupRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
