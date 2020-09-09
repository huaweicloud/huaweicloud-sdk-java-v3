package com.huaweicloud.sdk.testhub.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.testhub.v1.model.TestCaseExecuteBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 执行测试用例请求体
 */
public class RunTestCaseRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private Integer serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plan_id")
    
    private String planId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_list")
    
    private List<TestCaseExecuteBean> executeList = new ArrayList<>();
    
    public RunTestCaseRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 注册结果返回的服务id
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public RunTestCaseRequestBody withPlanId(String planId) {
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

    public RunTestCaseRequestBody withExecuteList(List<TestCaseExecuteBean> executeList) {
        this.executeList = executeList;
        return this;
    }

    
    public RunTestCaseRequestBody addExecuteListItem(TestCaseExecuteBean executeListItem) {
        this.executeList.add(executeListItem);
        return this;
    }

    public RunTestCaseRequestBody withExecuteList(Consumer<List<TestCaseExecuteBean>> executeListSetter) {
        if(this.executeList == null ){
            this.executeList = new ArrayList<>();
        }
        executeListSetter.accept(this.executeList);
        return this;
    }

    /**
     * 测试用例执行信息，数组长度小于等于50
     * @return executeList
     */
    public List<TestCaseExecuteBean> getExecuteList() {
        return executeList;
    }

    public void setExecuteList(List<TestCaseExecuteBean> executeList) {
        this.executeList = executeList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunTestCaseRequestBody runTestCaseRequestBody = (RunTestCaseRequestBody) o;
        return Objects.equals(this.serviceId, runTestCaseRequestBody.serviceId) &&
            Objects.equals(this.planId, runTestCaseRequestBody.planId) &&
            Objects.equals(this.executeList, runTestCaseRequestBody.executeList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, planId, executeList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTestCaseRequestBody {\n");
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

