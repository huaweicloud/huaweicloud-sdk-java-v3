package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持的链路信息
 */
public class SupportLinkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_type")

    private String netType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_modes")

    private List<String> taskModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    private String jobDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_mode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_instance_type")

    private String jobInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_bind_eip")

    private Boolean isSupportBindEip;

    public SupportLinkInfo withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public SupportLinkInfo withNetType(String netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。取值： - eip：公网网络。 - vpc：VPC网络，灾备场景不支持选择VPC网络。 - vpn：VPN、专线网络。
     * @return netType
     */
    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public SupportLinkInfo withTaskModes(List<String> taskModes) {
        this.taskModes = taskModes;
        return this;
    }

    public SupportLinkInfo addTaskModesItem(String taskModesItem) {
        if (this.taskModes == null) {
            this.taskModes = new ArrayList<>();
        }
        this.taskModes.add(taskModesItem);
        return this;
    }

    public SupportLinkInfo withTaskModes(Consumer<List<String>> taskModesSetter) {
        if (this.taskModes == null) {
            this.taskModes = new ArrayList<>();
        }
        taskModesSetter.accept(this.taskModes);
        return this;
    }

    /**
     * 迁移模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
     * @return taskModes
     */
    public List<String> getTaskModes() {
        return taskModes;
    }

    public void setTaskModes(List<String> taskModes) {
        this.taskModes = taskModes;
    }

    public SupportLinkInfo withJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向。取值： - up：入云 ，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
     * @return jobDirection
     */
    public String getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
    }

    public SupportLinkInfo withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 云上实例类型。取值： - Single：单机模式。 - Ha：主备模式。 - Cluster：集群模式。 - Sharding：分片模式。 - Independent：GaussDB独立部署模式。
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public SupportLinkInfo withJobInstanceType(String jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
        return this;
    }

    /**
     * DRS实例类型。取值： - Single ：单机。 - Ha：主备。
     * @return jobInstanceType
     */
    public String getJobInstanceType() {
        return jobInstanceType;
    }

    public void setJobInstanceType(String jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
    }

    public SupportLinkInfo withIsSupportBindEip(Boolean isSupportBindEip) {
        this.isSupportBindEip = isSupportBindEip;
        return this;
    }

    /**
     * 是否支持绑定EIP
     * @return isSupportBindEip
     */
    public Boolean getIsSupportBindEip() {
        return isSupportBindEip;
    }

    public void setIsSupportBindEip(Boolean isSupportBindEip) {
        this.isSupportBindEip = isSupportBindEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportLinkInfo that = (SupportLinkInfo) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.netType, that.netType)
            && Objects.equals(this.taskModes, that.taskModes) && Objects.equals(this.jobDirection, that.jobDirection)
            && Objects.equals(this.clusterMode, that.clusterMode)
            && Objects.equals(this.jobInstanceType, that.jobInstanceType)
            && Objects.equals(this.isSupportBindEip, that.isSupportBindEip);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(engineType, netType, taskModes, jobDirection, clusterMode, jobInstanceType, isSupportBindEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportLinkInfo {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    taskModes: ").append(toIndentedString(taskModes)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    jobInstanceType: ").append(toIndentedString(jobInstanceType)).append("\n");
        sb.append("    isSupportBindEip: ").append(toIndentedString(isSupportBindEip)).append("\n");
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
