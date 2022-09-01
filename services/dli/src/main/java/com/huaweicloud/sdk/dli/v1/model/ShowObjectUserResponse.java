package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowObjectUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    @JacksonXmlProperty(localName = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    @JacksonXmlProperty(localName = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    @JacksonXmlProperty(localName = "privileges")

    private List<ShowDatabaseUsersPrivilege> privileges = null;

    public ShowObjectUserResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 成功标识
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowObjectUserResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowObjectUserResponse withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ShowObjectUserResponse withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ShowObjectUserResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 对象类型
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowObjectUserResponse withPrivileges(List<ShowDatabaseUsersPrivilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public ShowObjectUserResponse addPrivilegesItem(ShowDatabaseUsersPrivilege privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public ShowObjectUserResponse withPrivileges(Consumer<List<ShowDatabaseUsersPrivilege>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 权限信息
     * @return privileges
     */
    public List<ShowDatabaseUsersPrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<ShowDatabaseUsersPrivilege> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowObjectUserResponse showObjectUserResponse = (ShowObjectUserResponse) o;
        return Objects.equals(this.isSuccess, showObjectUserResponse.isSuccess)
            && Objects.equals(this.message, showObjectUserResponse.message)
            && Objects.equals(this.objectName, showObjectUserResponse.objectName)
            && Objects.equals(this.objectType, showObjectUserResponse.objectType)
            && Objects.equals(this.count, showObjectUserResponse.count)
            && Objects.equals(this.privileges, showObjectUserResponse.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, objectName, objectType, count, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObjectUserResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
