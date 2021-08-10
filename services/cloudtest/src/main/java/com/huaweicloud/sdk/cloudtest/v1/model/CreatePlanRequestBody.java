package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建计划请求体 */
public class CreatePlanRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_id")

    private String assignedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id_list")

    private List<Integer> serviceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_cycle")

    private PlanCycle planCycle;

    public CreatePlanRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 计划名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePlanRequestBody withAssignedId(String assignedId) {
        this.assignedId = assignedId;
        return this;
    }

    /** 处理者id，不填时默认使用当前用户
     * 
     * @return assignedId */
    public String getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(String assignedId) {
        this.assignedId = assignedId;
    }

    public CreatePlanRequestBody withServiceIdList(List<Integer> serviceIdList) {
        this.serviceIdList = serviceIdList;
        return this;
    }

    public CreatePlanRequestBody addServiceIdListItem(Integer serviceIdListItem) {
        if (this.serviceIdList == null) {
            this.serviceIdList = new ArrayList<>();
        }
        this.serviceIdList.add(serviceIdListItem);
        return this;
    }

    public CreatePlanRequestBody withServiceIdList(Consumer<List<Integer>> serviceIdListSetter) {
        if (this.serviceIdList == null) {
            this.serviceIdList = new ArrayList<>();
        }
        serviceIdListSetter.accept(this.serviceIdList);
        return this;
    }

    /** 计划下包含的用例类型，数组长度小于10个
     * 
     * @return serviceIdList */
    public List<Integer> getServiceIdList() {
        return serviceIdList;
    }

    public void setServiceIdList(List<Integer> serviceIdList) {
        this.serviceIdList = serviceIdList;
    }

    public CreatePlanRequestBody withPlanCycle(PlanCycle planCycle) {
        this.planCycle = planCycle;
        return this;
    }

    public CreatePlanRequestBody withPlanCycle(Consumer<PlanCycle> planCycleSetter) {
        if (this.planCycle == null) {
            this.planCycle = new PlanCycle();
            planCycleSetter.accept(this.planCycle);
        }

        return this;
    }

    /** Get planCycle
     * 
     * @return planCycle */
    public PlanCycle getPlanCycle() {
        return planCycle;
    }

    public void setPlanCycle(PlanCycle planCycle) {
        this.planCycle = planCycle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePlanRequestBody createPlanRequestBody = (CreatePlanRequestBody) o;
        return Objects.equals(this.name, createPlanRequestBody.name)
            && Objects.equals(this.assignedId, createPlanRequestBody.assignedId)
            && Objects.equals(this.serviceIdList, createPlanRequestBody.serviceIdList)
            && Objects.equals(this.planCycle, createPlanRequestBody.planCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, assignedId, serviceIdList, planCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePlanRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
        sb.append("    serviceIdList: ").append(toIndentedString(serviceIdList)).append("\n");
        sb.append("    planCycle: ").append(toIndentedString(planCycle)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
