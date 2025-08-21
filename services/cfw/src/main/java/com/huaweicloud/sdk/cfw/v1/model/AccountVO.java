package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccountVO
 */
public class AccountVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_count_protected")

    private Integer eipCountProtected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_count_total")

    private Integer eipCountTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_count_unprotected")

    private Integer eipCountUnprotected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public AccountVO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * **参数解释**： 账号ID **取值范围**： 不涉及
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountVO withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * **参数解释**： 账号名称 **取值范围**： 不涉及
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountVO withEipCountProtected(Integer eipCountProtected) {
        this.eipCountProtected = eipCountProtected;
        return this;
    }

    /**
     * **参数解释**： 防护的EIP数量 **取值范围**： 不涉及
     * @return eipCountProtected
     */
    public Integer getEipCountProtected() {
        return eipCountProtected;
    }

    public void setEipCountProtected(Integer eipCountProtected) {
        this.eipCountProtected = eipCountProtected;
    }

    public AccountVO withEipCountTotal(Integer eipCountTotal) {
        this.eipCountTotal = eipCountTotal;
        return this;
    }

    /**
     * **参数解释**： EIP总数 **取值范围**： 不涉及
     * @return eipCountTotal
     */
    public Integer getEipCountTotal() {
        return eipCountTotal;
    }

    public void setEipCountTotal(Integer eipCountTotal) {
        this.eipCountTotal = eipCountTotal;
    }

    public AccountVO withEipCountUnprotected(Integer eipCountUnprotected) {
        this.eipCountUnprotected = eipCountUnprotected;
        return this;
    }

    /**
     * **参数解释**： 未开启防护的EIP数量 **取值范围**： 不涉及
     * @return eipCountUnprotected
     */
    public Integer getEipCountUnprotected() {
        return eipCountUnprotected;
    }

    public void setEipCountUnprotected(Integer eipCountUnprotected) {
        this.eipCountUnprotected = eipCountUnprotected;
    }

    public AccountVO withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释**： 组织ID **取值范围**： 不涉及
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public AccountVO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID **取值范围**： 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AccountVO withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**： 项目名称 **取值范围**： 不涉及
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountVO that = (AccountVO) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.eipCountProtected, that.eipCountProtected)
            && Objects.equals(this.eipCountTotal, that.eipCountTotal)
            && Objects.equals(this.eipCountUnprotected, that.eipCountUnprotected)
            && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId,
            accountName,
            eipCountProtected,
            eipCountTotal,
            eipCountUnprotected,
            organizationId,
            projectId,
            projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountVO {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    eipCountProtected: ").append(toIndentedString(eipCountProtected)).append("\n");
        sb.append("    eipCountTotal: ").append(toIndentedString(eipCountTotal)).append("\n");
        sb.append("    eipCountUnprotected: ").append(toIndentedString(eipCountUnprotected)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
