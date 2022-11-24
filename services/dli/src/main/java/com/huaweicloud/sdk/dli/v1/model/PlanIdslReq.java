package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PlanIdslReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_ids")

    private List<Long> planIds = null;

    public PlanIdslReq withPlanIds(List<Long> planIds) {
        this.planIds = planIds;
        return this;
    }

    public PlanIdslReq addPlanIdsItem(Long planIdsItem) {
        if (this.planIds == null) {
            this.planIds = new ArrayList<>();
        }
        this.planIds.add(planIdsItem);
        return this;
    }

    public PlanIdslReq withPlanIds(Consumer<List<Long>> planIdsSetter) {
        if (this.planIds == null) {
            this.planIds = new ArrayList<>();
        }
        planIdsSetter.accept(this.planIds);
        return this;
    }

    /**
     * 表示SQL语句的类型
     * @return planIds
     */
    public List<Long> getPlanIds() {
        return planIds;
    }

    public void setPlanIds(List<Long> planIds) {
        this.planIds = planIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanIdslReq planIdslReq = (PlanIdslReq) o;
        return Objects.equals(this.planIds, planIdslReq.planIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanIdslReq {\n");
        sb.append("    planIds: ").append(toIndentedString(planIds)).append("\n");
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
