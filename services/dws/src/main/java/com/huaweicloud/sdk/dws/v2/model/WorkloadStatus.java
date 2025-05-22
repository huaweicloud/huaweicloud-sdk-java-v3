package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源管理状态请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class WorkloadStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_switch")

    private String workloadSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency_num")

    private String maxConcurrencyNum;

    public WorkloadStatus withWorkloadSwitch(String workloadSwitch) {
        this.workloadSwitch = workloadSwitch;
        return this;
    }

    /**
     * **参数解释**： 开关。 **约束限制**： 不涉及。 **取值范围**： on：开启 off：关闭 **默认取值**： 不涉及。
     * @return workloadSwitch
     */
    public String getWorkloadSwitch() {
        return workloadSwitch;
    }

    public void setWorkloadSwitch(String workloadSwitch) {
        this.workloadSwitch = workloadSwitch;
    }

    public WorkloadStatus withMaxConcurrencyNum(String maxConcurrencyNum) {
        this.maxConcurrencyNum = maxConcurrencyNum;
        return this;
    }

    /**
     * **参数解释**： 最大并发数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxConcurrencyNum
     */
    public String getMaxConcurrencyNum() {
        return maxConcurrencyNum;
    }

    public void setMaxConcurrencyNum(String maxConcurrencyNum) {
        this.maxConcurrencyNum = maxConcurrencyNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadStatus that = (WorkloadStatus) obj;
        return Objects.equals(this.workloadSwitch, that.workloadSwitch)
            && Objects.equals(this.maxConcurrencyNum, that.maxConcurrencyNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadSwitch, maxConcurrencyNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadStatus {\n");
        sb.append("    workloadSwitch: ").append(toIndentedString(workloadSwitch)).append("\n");
        sb.append("    maxConcurrencyNum: ").append(toIndentedString(maxConcurrencyNum)).append("\n");
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
