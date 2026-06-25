package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkloadNodeVO
 */
public class WorkloadNodeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostIp")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npuTopologyPlacement")

    private String npuTopologyPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceRequirement")

    private ResourceRequirementVO resourceRequirement;

    public WorkloadNodeVO withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**：作业运行节点的IP地址。 **取值范围**：不涉及。
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public WorkloadNodeVO withNpuTopologyPlacement(String npuTopologyPlacement) {
        this.npuTopologyPlacement = npuTopologyPlacement;
        return this;
    }

    /**
     * **参数解释**：NPU卡的资源使用拓扑信息，长度为16的二进制编码，右起第一位编码代表卡1。其中，1表示占用，0表示空闲。例如，16卡的机型中卡1和卡15被占用，值为0100000000000001；8卡的机型中卡1和卡7被占用，返回值为0000000001000001。 **取值范围**：不涉及。
     * @return npuTopologyPlacement
     */
    public String getNpuTopologyPlacement() {
        return npuTopologyPlacement;
    }

    public void setNpuTopologyPlacement(String npuTopologyPlacement) {
        this.npuTopologyPlacement = npuTopologyPlacement;
    }

    public WorkloadNodeVO withResourceRequirement(ResourceRequirementVO resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
        return this;
    }

    public WorkloadNodeVO withResourceRequirement(Consumer<ResourceRequirementVO> resourceRequirementSetter) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new ResourceRequirementVO();
            resourceRequirementSetter.accept(this.resourceRequirement);
        }

        return this;
    }

    /**
     * Get resourceRequirement
     * @return resourceRequirement
     */
    public ResourceRequirementVO getResourceRequirement() {
        return resourceRequirement;
    }

    public void setResourceRequirement(ResourceRequirementVO resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadNodeVO that = (WorkloadNodeVO) obj;
        return Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.npuTopologyPlacement, that.npuTopologyPlacement)
            && Objects.equals(this.resourceRequirement, that.resourceRequirement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIp, npuTopologyPlacement, resourceRequirement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadNodeVO {\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    npuTopologyPlacement: ").append(toIndentedString(npuTopologyPlacement)).append("\n");
        sb.append("    resourceRequirement: ").append(toIndentedString(resourceRequirement)).append("\n");
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
