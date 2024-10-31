package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PGSQL服务实例的配置，在DeployService中使用
 */
public class PGSQLInstanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_resource_spec")

    private String coordinatorResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_pod_label")

    private String coordinatorPodLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_resource_spec")

    private String workerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_pod_label")

    private String workerPodLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_port")

    private Integer coordinatorPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_param")

    private String runtimeParam;

    public PGSQLInstanceConfig withCoordinatorResourceSpec(String coordinatorResourceSpec) {
        this.coordinatorResourceSpec = coordinatorResourceSpec;
        return this;
    }

    /**
     * 资源规格，从规格列表查询获取。
     * @return coordinatorResourceSpec
     */
    public String getCoordinatorResourceSpec() {
        return coordinatorResourceSpec;
    }

    public void setCoordinatorResourceSpec(String coordinatorResourceSpec) {
        this.coordinatorResourceSpec = coordinatorResourceSpec;
    }

    public PGSQLInstanceConfig withCoordinatorPodLabel(String coordinatorPodLabel) {
        this.coordinatorPodLabel = coordinatorPodLabel;
        return this;
    }

    /**
     * Coordinator的POD标签
     * @return coordinatorPodLabel
     */
    public String getCoordinatorPodLabel() {
        return coordinatorPodLabel;
    }

    public void setCoordinatorPodLabel(String coordinatorPodLabel) {
        this.coordinatorPodLabel = coordinatorPodLabel;
    }

    public PGSQLInstanceConfig withWorkerResourceSpec(String workerResourceSpec) {
        this.workerResourceSpec = workerResourceSpec;
        return this;
    }

    /**
     * 资源规格，从规格列表查询获取。
     * @return workerResourceSpec
     */
    public String getWorkerResourceSpec() {
        return workerResourceSpec;
    }

    public void setWorkerResourceSpec(String workerResourceSpec) {
        this.workerResourceSpec = workerResourceSpec;
    }

    public PGSQLInstanceConfig withWorkerPodLabel(String workerPodLabel) {
        this.workerPodLabel = workerPodLabel;
        return this;
    }

    /**
     * Worker的POD标签
     * @return workerPodLabel
     */
    public String getWorkerPodLabel() {
        return workerPodLabel;
    }

    public void setWorkerPodLabel(String workerPodLabel) {
        this.workerPodLabel = workerPodLabel;
    }

    public PGSQLInstanceConfig withCoordinatorPort(Integer coordinatorPort) {
        this.coordinatorPort = coordinatorPort;
        return this;
    }

    /**
     * Coordinator对外服务的端口
     * minimum: 30000
     * maximum: 60000
     * @return coordinatorPort
     */
    public Integer getCoordinatorPort() {
        return coordinatorPort;
    }

    public void setCoordinatorPort(Integer coordinatorPort) {
        this.coordinatorPort = coordinatorPort;
    }

    public PGSQLInstanceConfig withRuntimeParam(String runtimeParam) {
        this.runtimeParam = runtimeParam;
        return this;
    }

    /**
     * json格式 元数据以及data位置信息
     * @return runtimeParam
     */
    public String getRuntimeParam() {
        return runtimeParam;
    }

    public void setRuntimeParam(String runtimeParam) {
        this.runtimeParam = runtimeParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PGSQLInstanceConfig that = (PGSQLInstanceConfig) obj;
        return Objects.equals(this.coordinatorResourceSpec, that.coordinatorResourceSpec)
            && Objects.equals(this.coordinatorPodLabel, that.coordinatorPodLabel)
            && Objects.equals(this.workerResourceSpec, that.workerResourceSpec)
            && Objects.equals(this.workerPodLabel, that.workerPodLabel)
            && Objects.equals(this.coordinatorPort, that.coordinatorPort)
            && Objects.equals(this.runtimeParam, that.runtimeParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinatorResourceSpec,
            coordinatorPodLabel,
            workerResourceSpec,
            workerPodLabel,
            coordinatorPort,
            runtimeParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PGSQLInstanceConfig {\n");
        sb.append("    coordinatorResourceSpec: ").append(toIndentedString(coordinatorResourceSpec)).append("\n");
        sb.append("    coordinatorPodLabel: ").append(toIndentedString(coordinatorPodLabel)).append("\n");
        sb.append("    workerResourceSpec: ").append(toIndentedString(workerResourceSpec)).append("\n");
        sb.append("    workerPodLabel: ").append(toIndentedString(workerPodLabel)).append("\n");
        sb.append("    coordinatorPort: ").append(toIndentedString(coordinatorPort)).append("\n");
        sb.append("    runtimeParam: ").append(toIndentedString(runtimeParam)).append("\n");
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
