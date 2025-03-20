package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RemoveUserFromGroupV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RemoveUserFromGroupReqBody body;

    public RemoveUserFromGroupV5Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 用户组ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public RemoveUserFromGroupV5Request withBody(RemoveUserFromGroupReqBody body) {
        this.body = body;
        return this;
    }

    public RemoveUserFromGroupV5Request withBody(Consumer<RemoveUserFromGroupReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new RemoveUserFromGroupReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RemoveUserFromGroupReqBody getBody() {
        return body;
    }

    public void setBody(RemoveUserFromGroupReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveUserFromGroupV5Request that = (RemoveUserFromGroupV5Request) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveUserFromGroupV5Request {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
