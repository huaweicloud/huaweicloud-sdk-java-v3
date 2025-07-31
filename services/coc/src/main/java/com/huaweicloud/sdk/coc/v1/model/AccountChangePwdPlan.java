package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 改密计划的信息
 */
public class AccountChangePwdPlan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public AccountChangePwdPlan withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 改密计划唯一UUID
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public AccountChangePwdPlan withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 改密资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AccountChangePwdPlan withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 改密账号名称
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountChangePwdPlan withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 需要修改的密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountChangePwdPlan withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 资源所属的项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AccountChangePwdPlan withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 改密计划创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountChangePwdPlan that = (AccountChangePwdPlan) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.accountName, that.accountName) && Objects.equals(this.password, that.password)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, resourceId, accountName, password, projectId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountChangePwdPlan {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
