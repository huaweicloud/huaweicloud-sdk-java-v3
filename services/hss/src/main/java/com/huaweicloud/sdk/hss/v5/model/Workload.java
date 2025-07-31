package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作负载信息
 */
public class Workload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_id")

    private String workloadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    public Workload withWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }

    /**
     * 工作负载ID
     * @return workloadId
     */
    public String getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    public Workload withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * 工作负载名称
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public Workload withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * 工作负载类型,包含如下：   - deployments：无状态负载   - statefulsets：有状态负载   - daemonsets：守护进程表
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Workload that = (Workload) obj;
        return Objects.equals(this.workloadId, that.workloadId) && Objects.equals(this.workloadName, that.workloadName)
            && Objects.equals(this.workloadType, that.workloadType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadId, workloadName, workloadType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workload {\n");
        sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
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
