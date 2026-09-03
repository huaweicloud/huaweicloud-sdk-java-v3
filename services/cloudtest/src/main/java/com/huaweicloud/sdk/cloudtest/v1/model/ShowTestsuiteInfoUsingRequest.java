package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTestsuiteInfoUsingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suite_id")

    private String suiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planId")

    private String planId;

    public ShowTestsuiteInfoUsingRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ShowTestsuiteInfoUsingRequest withSuiteId(String suiteId) {
        this.suiteId = suiteId;
        return this;
    }

    /**
     * 任务id
     * @return suiteId
     */
    public String getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(String suiteId) {
        this.suiteId = suiteId;
    }

    public ShowTestsuiteInfoUsingRequest withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划Id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTestsuiteInfoUsingRequest that = (ShowTestsuiteInfoUsingRequest) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.suiteId, that.suiteId)
            && Objects.equals(this.planId, that.planId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, suiteId, planId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTestsuiteInfoUsingRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    suiteId: ").append(toIndentedString(suiteId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
