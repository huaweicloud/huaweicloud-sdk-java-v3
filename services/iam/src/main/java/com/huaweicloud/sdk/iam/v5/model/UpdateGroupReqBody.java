package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of update group request.
 */
public class UpdateGroupReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_group_name")

    private String newGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_group_description")

    private String newGroupDescription;

    public UpdateGroupReqBody withNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }

    /**
     * 用户组名，长度为1到128个字符，可包含中文、英文、数字、空格、\"_\"、\"-\"、\"{\"和\"}\"的字符串。
     * @return newGroupName
     */
    public String getNewGroupName() {
        return newGroupName;
    }

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    public UpdateGroupReqBody withNewGroupDescription(String newGroupDescription) {
        this.newGroupDescription = newGroupDescription;
        return this;
    }

    /**
     * 用户组描述信息，长度为0到255字符，不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\\\"、\"$\"、\"^\"和\"*\"的字符串。
     * @return newGroupDescription
     */
    public String getNewGroupDescription() {
        return newGroupDescription;
    }

    public void setNewGroupDescription(String newGroupDescription) {
        this.newGroupDescription = newGroupDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupReqBody that = (UpdateGroupReqBody) obj;
        return Objects.equals(this.newGroupName, that.newGroupName)
            && Objects.equals(this.newGroupDescription, that.newGroupDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newGroupName, newGroupDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupReqBody {\n");
        sb.append("    newGroupName: ").append(toIndentedString(newGroupName)).append("\n");
        sb.append("    newGroupDescription: ").append(toIndentedString(newGroupDescription)).append("\n");
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
