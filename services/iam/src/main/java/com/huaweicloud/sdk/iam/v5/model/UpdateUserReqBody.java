package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of update user request.
 */
public class UpdateUserReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_user_name")

    private String newUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_description")

    private String newDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public UpdateUserReqBody withNewUserName(String newUserName) {
        this.newUserName = newUserName;
        return this;
    }

    /**
     * IAM用户名，长度为1到64个字符，只包含字母、数字、\"_\"、\"-\"、\".\"和空格的字符串，且首位不能为数字。
     * @return newUserName
     */
    public String getNewUserName() {
        return newUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    public UpdateUserReqBody withNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }

    /**
     * IAM用户描述信息，长度为0到255个字符，不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\\\"、\"$\"、\"^\"和\"*\"的字符串。
     * @return newDescription
     */
    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }

    public UpdateUserReqBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * IAM用户是否启用。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateUserReqBody that = (UpdateUserReqBody) obj;
        return Objects.equals(this.newUserName, that.newUserName)
            && Objects.equals(this.newDescription, that.newDescription) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newUserName, newDescription, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserReqBody {\n");
        sb.append("    newUserName: ").append(toIndentedString(newUserName)).append("\n");
        sb.append("    newDescription: ").append(toIndentedString(newDescription)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
