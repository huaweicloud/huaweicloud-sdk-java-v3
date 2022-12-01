package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源管理信息
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
     * 开关。
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
     * 最大并发数。
     * @return maxConcurrencyNum
     */
    public String getMaxConcurrencyNum() {
        return maxConcurrencyNum;
    }

    public void setMaxConcurrencyNum(String maxConcurrencyNum) {
        this.maxConcurrencyNum = maxConcurrencyNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkloadStatus workloadStatus = (WorkloadStatus) o;
        return Objects.equals(this.workloadSwitch, workloadStatus.workloadSwitch)
            && Objects.equals(this.maxConcurrencyNum, workloadStatus.maxConcurrencyNum);
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
