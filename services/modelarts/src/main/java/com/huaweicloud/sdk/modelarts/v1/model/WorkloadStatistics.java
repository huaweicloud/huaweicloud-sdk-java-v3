package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 特定作业类型统计信息。
 */
public class WorkloadStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private WorkloadStatisticsStatus status;

    public WorkloadStatistics withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数描述**： 作业类型。 **取值范围**： 可选值如下： - train：训练作业 - infer：推理作业 - notebook：Notebook作业
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WorkloadStatistics withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数描述**： 作业个数。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public WorkloadStatistics withStatus(WorkloadStatisticsStatus status) {
        this.status = status;
        return this;
    }

    public WorkloadStatistics withStatus(Consumer<WorkloadStatisticsStatus> statusSetter) {
        if (this.status == null) {
            this.status = new WorkloadStatisticsStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public WorkloadStatisticsStatus getStatus() {
        return status;
    }

    public void setStatus(WorkloadStatisticsStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadStatistics that = (WorkloadStatistics) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.total, that.total)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, total, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadStatistics {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
