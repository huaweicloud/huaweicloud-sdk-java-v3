package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新测试用例状态请求体
 */
public class UpdateTestCaseResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private Integer serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_list")

    private List<UpdateTestCaseResultBean> executeList = null;

    public UpdateTestCaseResultRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 注册测试类型服务接口返回的服务id
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public UpdateTestCaseResultRequestBody withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public UpdateTestCaseResultRequestBody withExecuteList(List<UpdateTestCaseResultBean> executeList) {
        this.executeList = executeList;
        return this;
    }

    public UpdateTestCaseResultRequestBody addExecuteListItem(UpdateTestCaseResultBean executeListItem) {
        if (this.executeList == null) {
            this.executeList = new ArrayList<>();
        }
        this.executeList.add(executeListItem);
        return this;
    }

    public UpdateTestCaseResultRequestBody withExecuteList(Consumer<List<UpdateTestCaseResultBean>> executeListSetter) {
        if (this.executeList == null) {
            this.executeList = new ArrayList<>();
        }
        executeListSetter.accept(this.executeList);
        return this;
    }

    /**
     * 测试用例状态信息，数组长度小于等于50
     * @return executeList
     */
    public List<UpdateTestCaseResultBean> getExecuteList() {
        return executeList;
    }

    public void setExecuteList(List<UpdateTestCaseResultBean> executeList) {
        this.executeList = executeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTestCaseResultRequestBody that = (UpdateTestCaseResultRequestBody) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.executeList, that.executeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, planId, executeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseResultRequestBody {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    executeList: ").append(toIndentedString(executeList)).append("\n");
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
