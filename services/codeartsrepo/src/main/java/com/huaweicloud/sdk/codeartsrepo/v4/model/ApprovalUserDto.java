package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApprovalUserDto
 */
public class ApprovalUserDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_comment")

    private String approverComment;

    public ApprovalUserDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ApprovalUserDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ApprovalUserDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApprovalUserDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ApprovalUserDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 中文名称
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public ApprovalUserDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 电子邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ApprovalUserDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ApprovalUserDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ApprovalUserDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * 头像url
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public ApprovalUserDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ApprovalUserDto withApproverComment(String approverComment) {
        this.approverComment = approverComment;
        return this;
    }

    /**
     * 审核意见
     * @return approverComment
     */
    public String getApproverComment() {
        return approverComment;
    }

    public void setApproverComment(String approverComment) {
        this.approverComment = approverComment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApprovalUserDto that = (ApprovalUserDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.username, that.username)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.email, that.email)
            && Objects.equals(this.state, that.state) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.avatarUrl, that.avatarUrl) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.approverComment, that.approverComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            username,
            name,
            nickName,
            nameCn,
            email,
            state,
            updatedAt,
            avatarUrl,
            tenantName,
            approverComment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalUserDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    approverComment: ").append(toIndentedString(approverComment)).append("\n");
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
