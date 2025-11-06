package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Get a merge request approver info
 */
public class ApproverBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

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
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_comment")

    private String approverComment;

    public ApproverBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户id。
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

    public ApproverBasicDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApproverBasicDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ApproverBasicDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * **参数解释：** 中文名。 **取值范围：** 不涉及。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public ApproverBasicDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 邮件。 **取值范围：** 不涉及。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ApproverBasicDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 状态。 - optional，可选（审核人、检视人）（未审核/检视） - required，必选（审核人、检视人）（未审核/检视） - approve，审核通过 - true，检视通过 - passed，审核/检视 通过，（未审核/检视） - reject，审核拒绝
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ApproverBasicDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间 **取值范围：** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ApproverBasicDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * **参数解释：** 头像链接 **取值范围：** 不涉及。
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public ApproverBasicDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 昵称 **取值范围：** 不涉及。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ApproverBasicDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **取值范围：** 不涉及。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ApproverBasicDto withApproverComment(String approverComment) {
        this.approverComment = approverComment;
        return this;
    }

    /**
     * **参数解释：** 审核备注。 **取值范围：** 不涉及。
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
        ApproverBasicDto that = (ApproverBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.username, that.username) && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.email, that.email) && Objects.equals(this.state, that.state)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.avatarUrl, that.avatarUrl)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.approverComment, that.approverComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            username,
            nameCn,
            email,
            state,
            updatedAt,
            avatarUrl,
            nickName,
            tenantName,
            approverComment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproverBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
