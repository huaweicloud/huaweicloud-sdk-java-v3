package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListUsersForEnterpriseProjectResUsers
 */
public class ListUsersForEnterpriseProjectResUsers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastest_policy_time")

    private Long lastestPolicyTime;

    public ListUsersForEnterpriseProjectResUsers withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 授权用户所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListUsersForEnterpriseProjectResUsers withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 授权用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListUsersForEnterpriseProjectResUsers withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 授权用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListUsersForEnterpriseProjectResUsers withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 授权用户是否启用，true表示启用，false表示停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ListUsersForEnterpriseProjectResUsers withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 授权用户描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListUsersForEnterpriseProjectResUsers withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * 授权用户的策略数。
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public ListUsersForEnterpriseProjectResUsers withLastestPolicyTime(Long lastestPolicyTime) {
        this.lastestPolicyTime = lastestPolicyTime;
        return this;
    }

    /**
     * 用户最近与企业项目关联策略的时间（毫秒）。
     * @return lastestPolicyTime
     */
    public Long getLastestPolicyTime() {
        return lastestPolicyTime;
    }

    public void setLastestPolicyTime(Long lastestPolicyTime) {
        this.lastestPolicyTime = lastestPolicyTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUsersForEnterpriseProjectResUsers listUsersForEnterpriseProjectResUsers =
            (ListUsersForEnterpriseProjectResUsers) o;
        return Objects.equals(this.domainId, listUsersForEnterpriseProjectResUsers.domainId)
            && Objects.equals(this.id, listUsersForEnterpriseProjectResUsers.id)
            && Objects.equals(this.name, listUsersForEnterpriseProjectResUsers.name)
            && Objects.equals(this.enabled, listUsersForEnterpriseProjectResUsers.enabled)
            && Objects.equals(this.description, listUsersForEnterpriseProjectResUsers.description)
            && Objects.equals(this.policyNum, listUsersForEnterpriseProjectResUsers.policyNum)
            && Objects.equals(this.lastestPolicyTime, listUsersForEnterpriseProjectResUsers.lastestPolicyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, id, name, enabled, description, policyNum, lastestPolicyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersForEnterpriseProjectResUsers {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    lastestPolicyTime: ").append(toIndentedString(lastestPolicyTime)).append("\n");
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
