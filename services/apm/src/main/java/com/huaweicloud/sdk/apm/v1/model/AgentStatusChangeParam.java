package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 改变探针状态的参数。
 */
public class AgentStatusChangeParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<Long> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_status")

    private Integer targetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    public AgentStatusChangeParam withInstanceList(List<Long> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public AgentStatusChangeParam addInstanceListItem(Long instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public AgentStatusChangeParam withInstanceList(Consumer<List<Long>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * 探针实例id列表。
     * @return instanceList
     */
    public List<Long> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<Long> instanceList) {
        this.instanceList = instanceList;
    }

    public AgentStatusChangeParam withTargetStatus(Integer targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }

    /**
     * 期望探针改变后的状态，0或1，0表示启用，1表示停用。
     * @return targetStatus
     */
    public Integer getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(Integer targetStatus) {
        this.targetStatus = targetStatus;
    }

    public AgentStatusChangeParam withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 探针所在的区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AgentStatusChangeParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 探针所属环境的id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentStatusChangeParam agentStatusChangeParam = (AgentStatusChangeParam) o;
        return Objects.equals(this.instanceList, agentStatusChangeParam.instanceList)
            && Objects.equals(this.targetStatus, agentStatusChangeParam.targetStatus)
            && Objects.equals(this.region, agentStatusChangeParam.region)
            && Objects.equals(this.envId, agentStatusChangeParam.envId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceList, targetStatus, region, envId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentStatusChangeParam {\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
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
