package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateRepositoryMemberResponseDto
 */
public class CreateRepositoryMemberResponseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_iam_id")

    private String userIamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_nick_name")

    private String userNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public CreateRepositoryMemberResponseDto withUserIamId(String userIamId) {
        this.userIamId = userIamId;
        return this;
    }

    /**
     * **参数解释：** 用户iamId **约束限制：** 不涉及。
     * @return userIamId
     */
    public String getUserIamId() {
        return userIamId;
    }

    public void setUserIamId(String userIamId) {
        this.userIamId = userIamId;
    }

    public CreateRepositoryMemberResponseDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **约束限制：** 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateRepositoryMemberResponseDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **约束限制：** - 不涉及。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public CreateRepositoryMemberResponseDto withUserNickName(String userNickName) {
        this.userNickName = userNickName;
        return this;
    }

    /**
     * **参数解释：** 用户昵称。 **约束限制：** - 不涉及。    
     * @return userNickName
     */
    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public CreateRepositoryMemberResponseDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **约束限制：** **约束限制：** - success，添加成功。 - error，添加失败。  
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateRepositoryMemberResponseDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 成员添加结果信息。 **约束限制：** - 不涉及。    
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRepositoryMemberResponseDto that = (CreateRepositoryMemberResponseDto) obj;
        return Objects.equals(this.userIamId, that.userIamId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userNickName, that.userNickName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIamId, userName, tenantName, userNickName, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepositoryMemberResponseDto {\n");
        sb.append("    userIamId: ").append(toIndentedString(userIamId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userNickName: ").append(toIndentedString(userNickName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
