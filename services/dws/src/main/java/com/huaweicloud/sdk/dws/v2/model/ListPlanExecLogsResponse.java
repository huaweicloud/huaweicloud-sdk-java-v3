package com.huaweicloud.sdk.dws.v2.model;

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
public class ListPlanExecLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_logs")

    private List<PlanLog> planLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListPlanExecLogsResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * **参数解释**： 结果状态码。 **取值范围**： 不涉及。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ListPlanExecLogsResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * **参数解释**： 结果描述。 **取值范围**： 不涉及。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    public ListPlanExecLogsResponse withPlanLogs(List<PlanLog> planLogs) {
        this.planLogs = planLogs;
        return this;
    }

    public ListPlanExecLogsResponse addPlanLogsItem(PlanLog planLogsItem) {
        if (this.planLogs == null) {
            this.planLogs = new ArrayList<>();
        }
        this.planLogs.add(planLogsItem);
        return this;
    }

    public ListPlanExecLogsResponse withPlanLogs(Consumer<List<PlanLog>> planLogsSetter) {
        if (this.planLogs == null) {
            this.planLogs = new ArrayList<>();
        }
        planLogsSetter.accept(this.planLogs);
        return this;
    }

    /**
     * **参数解释**： 资源池名称。 **取值范围**： 不涉及。
     * @return planLogs
     */
    public List<PlanLog> getPlanLogs() {
        return planLogs;
    }

    public void setPlanLogs(List<PlanLog> planLogs) {
        this.planLogs = planLogs;
    }

    public ListPlanExecLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数量。 **取值范围**： 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPlanExecLogsResponse that = (ListPlanExecLogsResponse) obj;
        return Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr) && Objects.equals(this.planLogs, that.planLogs)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, planLogs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlanExecLogsResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
        sb.append("    planLogs: ").append(toIndentedString(planLogs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
