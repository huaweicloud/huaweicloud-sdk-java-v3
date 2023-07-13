package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * group_name和resource_name可以单独使用，也可以组合使用 修改组的拥有者：使用group_name 修改资源包拥有者：使用resource_name 修改组下的资源包的拥有者：使用group_name加resource_name
 */
public class UpdateResourceOwner {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_owner")

    private String newOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public UpdateResourceOwner withNewOwner(String newOwner) {
        this.newOwner = newOwner;
        return this;
    }

    /**
     * 新用户名,只能包含数字、英文字母、下划线和中划线且不能以数字开头,长度在5-32字符之间
     * @return newOwner
     */
    public String getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(String newOwner) {
        this.newOwner = newOwner;
    }

    public UpdateResourceOwner withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名,名称只能包含数字、英文字母、点、下划线和中划线,长度不能超过64字符
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UpdateResourceOwner withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 包名,包名,长度（包含文件后缀）不能超过128个字符
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResourceOwner that = (UpdateResourceOwner) obj;
        return Objects.equals(this.newOwner, that.newOwner) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOwner, groupName, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceOwner {\n");
        sb.append("    newOwner: ").append(toIndentedString(newOwner)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
