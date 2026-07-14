package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServicePodResponse
 */
public class ServicePodResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_node_ip")

    private String podNodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_node_name")

    private String podNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_role")

    private String podRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ServicePodResponse withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * **参数解释：** od ID。 **取值范围：** 不涉及。
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ServicePodResponse withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释：** pod名字。 **取值范围：** 不涉及。
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ServicePodResponse withPodNodeIp(String podNodeIp) {
        this.podNodeIp = podNodeIp;
        return this;
    }

    /**
     * **参数解释：** pod所在node的IP。 **取值范围：** 不涉及。
     * @return podNodeIp
     */
    public String getPodNodeIp() {
        return podNodeIp;
    }

    public void setPodNodeIp(String podNodeIp) {
        this.podNodeIp = podNodeIp;
    }

    public ServicePodResponse withPodNodeName(String podNodeName) {
        this.podNodeName = podNodeName;
        return this;
    }

    /**
     * **参数解释：** pod所在node的名字。 **取值范围：** 不涉及。
     * @return podNodeName
     */
    public String getPodNodeName() {
        return podNodeName;
    }

    public void setPodNodeName(String podNodeName) {
        this.podNodeName = podNodeName;
    }

    public ServicePodResponse withPodRole(String podRole) {
        this.podRole = podRole;
        return this;
    }

    /**
     * **参数解释：** pod角色。 **取值范围：** 不涉及。
     * @return podRole
     */
    public String getPodRole() {
        return podRole;
    }

    public void setPodRole(String podRole) {
        this.podRole = podRole;
    }

    public ServicePodResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** pod服务状态。 **取值范围：** 有7种状态。RUNNING（运行中）、PENDING（未就绪）、SUCCEEDED（成功）、FAILED（失败）、ABNORMAL（异常）、UNKNOWN（未知）、DELETED（已删除）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServicePodResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 最近更新时间。 **取值范围：** 不涉及。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServicePodResponse that = (ServicePodResponse) obj;
        return Objects.equals(this.podId, that.podId) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.podNodeIp, that.podNodeIp) && Objects.equals(this.podNodeName, that.podNodeName)
            && Objects.equals(this.podRole, that.podRole) && Objects.equals(this.status, that.status)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(podId, podName, podNodeIp, podNodeName, podRole, status, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePodResponse {\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    podNodeIp: ").append(toIndentedString(podNodeIp)).append("\n");
        sb.append("    podNodeName: ").append(toIndentedString(podNodeName)).append("\n");
        sb.append("    podRole: ").append(toIndentedString(podRole)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
