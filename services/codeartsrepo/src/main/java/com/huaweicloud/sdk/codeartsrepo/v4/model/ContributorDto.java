package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContributorDto
 */
public class ContributorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits")

    private Integer commits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public ContributorDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContributorDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 邮箱。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContributorDto withCommits(Integer commits) {
        this.commits = commits;
        return this;
    }

    /**
     * **参数解释：** 提交数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return commits
     */
    public Integer getCommits() {
        return commits;
    }

    public void setCommits(Integer commits) {
        this.commits = commits;
    }

    public ContributorDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 昵称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ContributorDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ContributorDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContributorDto that = (ContributorDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.email, that.email)
            && Objects.equals(this.commits, that.commits) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, commits, nickName, tenantName, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContributorDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
