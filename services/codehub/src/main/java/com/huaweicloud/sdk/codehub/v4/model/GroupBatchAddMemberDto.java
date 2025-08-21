package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupBatchAddMemberDto
 */
public class GroupBatchAddMemberDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_id")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_role_id")

    private String repoRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_role_id")

    private String reqRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_role_name")

    private String repoRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_role_name")

    private String reqRoleName;

    public GroupBatchAddMemberDto withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * **参数解释：** 用户iam_id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public GroupBatchAddMemberDto withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 用户userId。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GroupBatchAddMemberDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupBatchAddMemberDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 用户昵称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public GroupBatchAddMemberDto withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public GroupBatchAddMemberDto withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupBatchAddMemberDto withRepoRoleId(String repoRoleId) {
        this.repoRoleId = repoRoleId;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return repoRoleId
     */
    public String getRepoRoleId() {
        return repoRoleId;
    }

    public void setRepoRoleId(String repoRoleId) {
        this.repoRoleId = repoRoleId;
    }

    public GroupBatchAddMemberDto withReqRoleId(String reqRoleId) {
        this.reqRoleId = reqRoleId;
        return this;
    }

    /**
     * **参数解释：** 项目角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return reqRoleId
     */
    public String getReqRoleId() {
        return reqRoleId;
    }

    public void setReqRoleId(String reqRoleId) {
        this.reqRoleId = reqRoleId;
    }

    public GroupBatchAddMemberDto withRepoRoleName(String repoRoleName) {
        this.repoRoleName = repoRoleName;
        return this;
    }

    /**
     * **参数解释：** 角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return repoRoleName
     */
    public String getRepoRoleName() {
        return repoRoleName;
    }

    public void setRepoRoleName(String repoRoleName) {
        this.repoRoleName = repoRoleName;
    }

    public GroupBatchAddMemberDto withReqRoleName(String reqRoleName) {
        this.reqRoleName = reqRoleName;
        return this;
    }

    /**
     * **参数解释：** 项目角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return reqRoleName
     */
    public String getReqRoleName() {
        return reqRoleName;
    }

    public void setReqRoleName(String reqRoleName) {
        this.reqRoleName = reqRoleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupBatchAddMemberDto that = (GroupBatchAddMemberDto) obj;
        return Objects.equals(this.iamId, that.iamId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.repoRoleId, that.repoRoleId) && Objects.equals(this.reqRoleId, that.reqRoleId)
            && Objects.equals(this.repoRoleName, that.repoRoleName)
            && Objects.equals(this.reqRoleName, that.reqRoleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamId,
            userId,
            name,
            nickName,
            domainName,
            domainId,
            repoRoleId,
            reqRoleId,
            repoRoleName,
            reqRoleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupBatchAddMemberDto {\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    repoRoleId: ").append(toIndentedString(repoRoleId)).append("\n");
        sb.append("    reqRoleId: ").append(toIndentedString(reqRoleId)).append("\n");
        sb.append("    repoRoleName: ").append(toIndentedString(repoRoleName)).append("\n");
        sb.append("    reqRoleName: ").append(toIndentedString(reqRoleName)).append("\n");
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
