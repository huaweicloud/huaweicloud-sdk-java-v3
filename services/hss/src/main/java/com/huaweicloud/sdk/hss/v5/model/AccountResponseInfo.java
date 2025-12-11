package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件列表详情
 */
public class AccountResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_num")

    private Integer vulnerabilityNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_num")

    private Integer baselineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion_num")

    private Integer intrusionNum;

    public AccountResponseInfo withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * **参数解释**: 账号的唯一名称，用于标识账号身份； **取值范围**: 字符长度1-64位，支持字母、数字、连字符、下划线，不能以特殊字符开头或结尾 
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountResponseInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * **参数解释**: 账号的唯一标识ID，用于唯一确定某个账号； **取值范围**: 字符长度1-64位，符合平台账号ID命名规范（如UUID或数字组合） 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountResponseInfo withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释**: 账号所属组织的唯一标识ID； **取值范围**: 字符长度1-64位，符合平台组织ID命名规范 
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public AccountResponseInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 账号所属项目的唯一标识ID； **取值范围**: 字符长度1-64位，符合平台项目ID命名规范； 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AccountResponseInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**: 账号所属项目的名称，用于直观标识项目； **取值范围**: 字符长度1-64位，支持字母、数字、连字符、下划线及中文，无复杂度额外要求 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public AccountResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 当前账号下已关联的主机总数量； **取值范围**: 非负整数，最小值0，最大值取决于平台资源配额；单位：台 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public AccountResponseInfo withVulnerabilityNum(Integer vulnerabilityNum) {
        this.vulnerabilityNum = vulnerabilityNum;
        return this;
    }

    /**
     * **参数解释**: 当前账号下主机存在的漏洞风险总数量； **取值范围**: 非负整数，取值范围0-2147483647；单位：个 
     * minimum: 0
     * maximum: 2147483647
     * @return vulnerabilityNum
     */
    public Integer getVulnerabilityNum() {
        return vulnerabilityNum;
    }

    public void setVulnerabilityNum(Integer vulnerabilityNum) {
        this.vulnerabilityNum = vulnerabilityNum;
    }

    public AccountResponseInfo withBaselineNum(Integer baselineNum) {
        this.baselineNum = baselineNum;
        return this;
    }

    /**
     * **参数解释**: 当前账号下主机基线检测未通过的风险总数量； **取值范围**: 非负整数，取值范围0-2147483647；单位：个 
     * minimum: 0
     * maximum: 2147483647
     * @return baselineNum
     */
    public Integer getBaselineNum() {
        return baselineNum;
    }

    public void setBaselineNum(Integer baselineNum) {
        this.baselineNum = baselineNum;
    }

    public AccountResponseInfo withIntrusionNum(Integer intrusionNum) {
        this.intrusionNum = intrusionNum;
        return this;
    }

    /**
     * **参数解释**: 当前账号下主机发生的安全入侵告警总数量； **取值范围**: 非负整数，取值范围0-2147483647；单位：条 
     * minimum: 0
     * maximum: 2147483647
     * @return intrusionNum
     */
    public Integer getIntrusionNum() {
        return intrusionNum;
    }

    public void setIntrusionNum(Integer intrusionNum) {
        this.intrusionNum = intrusionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountResponseInfo that = (AccountResponseInfo) obj;
        return Objects.equals(this.accountName, that.accountName) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.vulnerabilityNum, that.vulnerabilityNum)
            && Objects.equals(this.baselineNum, that.baselineNum)
            && Objects.equals(this.intrusionNum, that.intrusionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName,
            accountId,
            organizationId,
            projectId,
            projectName,
            hostNum,
            vulnerabilityNum,
            baselineNum,
            intrusionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountResponseInfo {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    vulnerabilityNum: ").append(toIndentedString(vulnerabilityNum)).append("\n");
        sb.append("    baselineNum: ").append(toIndentedString(baselineNum)).append("\n");
        sb.append("    intrusionNum: ").append(toIndentedString(intrusionNum)).append("\n");
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
