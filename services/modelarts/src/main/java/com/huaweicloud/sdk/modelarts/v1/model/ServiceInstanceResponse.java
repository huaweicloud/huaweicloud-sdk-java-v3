package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务实例列表。
 */
public class ServiceInstanceResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_count")

    private Long podCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_pod_count")

    private Long runningPodCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    public ServiceInstanceResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释：** 服务实例名字。 **取值范围：** 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ServiceInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务实例状态。 **取值范围：** - RUNNING：运行中 - PENDING：未就绪 - CONCERNING：告警 - FAILED：失败 - UNKNOWN：未知 - DELETED：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceInstanceResponse withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 服务实例权重。 **取值范围：** [0, 100] 或者为空。
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ServiceInstanceResponse withPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }

    /**
     * **参数解释：** 服务实例pod数量。 **取值范围：** 不涉及。
     * @return podCount
     */
    public Long getPodCount() {
        return podCount;
    }

    public void setPodCount(Long podCount) {
        this.podCount = podCount;
    }

    public ServiceInstanceResponse withRunningPodCount(Long runningPodCount) {
        this.runningPodCount = runningPodCount;
        return this;
    }

    /**
     * **参数解释：** 服务实例运行中pod数量。 **取值范围：** 不涉及。
     * @return runningPodCount
     */
    public Long getRunningPodCount() {
        return runningPodCount;
    }

    public void setRunningPodCount(Long runningPodCount) {
        this.runningPodCount = runningPodCount;
    }

    public ServiceInstanceResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 服务实例最近更新时间。 **取值范围：** 不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceInstanceResponse that = (ServiceInstanceResponse) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.podCount, that.podCount)
            && Objects.equals(this.runningPodCount, that.runningPodCount)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName, status, weight, podCount, runningPodCount, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceInstanceResponse {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    podCount: ").append(toIndentedString(podCount)).append("\n");
        sb.append("    runningPodCount: ").append(toIndentedString(runningPodCount)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
