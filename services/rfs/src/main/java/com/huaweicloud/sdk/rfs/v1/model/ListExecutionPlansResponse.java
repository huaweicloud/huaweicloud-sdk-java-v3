package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListExecutionPlansResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_plans")

    private List<ExecutionPlan> executionPlans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListExecutionPlansResponse withExecutionPlans(List<ExecutionPlan> executionPlans) {
        this.executionPlans = executionPlans;
        return this;
    }

    public ListExecutionPlansResponse addExecutionPlansItem(ExecutionPlan executionPlansItem) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        this.executionPlans.add(executionPlansItem);
        return this;
    }

    public ListExecutionPlansResponse withExecutionPlans(Consumer<List<ExecutionPlan>> executionPlansSetter) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        executionPlansSetter.accept(this.executionPlans);
        return this;
    }

    /**
     * 执行计划列表。默认按照生成时间降序排序，最新生成的在最前
     * @return executionPlans
     */
    public List<ExecutionPlan> getExecutionPlans() {
        return executionPlans;
    }

    public void setExecutionPlans(List<ExecutionPlan> executionPlans) {
        this.executionPlans = executionPlans;
    }

    public ListExecutionPlansResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListExecutionPlansResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExecutionPlansResponse that = (ListExecutionPlansResponse) obj;
        return Objects.equals(this.executionPlans, that.executionPlans) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionPlans, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecutionPlansResponse {\n");
        sb.append("    executionPlans: ").append(toIndentedString(executionPlans)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
