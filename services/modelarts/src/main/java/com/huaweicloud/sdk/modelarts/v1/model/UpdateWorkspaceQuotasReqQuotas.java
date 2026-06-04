package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateWorkspaceQuotasReqQuotas
 */
public class UpdateWorkspaceQuotasReqQuotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public UpdateWorkspaceQuotasReqQuotas withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源标识。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public UpdateWorkspaceQuotasReqQuotas withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 要修改的配额值。配额值为正整数或-1，-1代表不限制配额。配额值范围不能超过配额的最大值与最小值。可通过调用查询工作空间配额接口查询配额的最大值。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkspaceQuotasReqQuotas that = (UpdateWorkspaceQuotasReqQuotas) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkspaceQuotasReqQuotas {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
