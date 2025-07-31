package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回写改密结果的信息
 */
public class UpdateAccountPassword {

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
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public UpdateAccountPassword withPlanId(String planId) {
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

    public UpdateAccountPassword withResourceId(String resourceId) {
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

    public UpdateAccountPassword withAccountName(String accountName) {
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

    public UpdateAccountPassword withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 改密结果状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public UpdateAccountPassword withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 改密结果详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccountPassword that = (UpdateAccountPassword) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.accountName, that.accountName) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, resourceId, accountName, statusCode, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccountPassword {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
