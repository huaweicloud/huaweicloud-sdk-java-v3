package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComputeDimension
 */
public class ComputeDimension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_instance_id")

    private String nodeInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_instance_id")

    private Long jobInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_ms")

    private Long startTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_ms")

    private Long endTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_ms")

    private Long executeTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_start_time_ms")

    private Long lastStartTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_end_time_ms")

    private Long lastEndTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_resource_consumption_value")

    private Long cpuResourceConsumptionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_unit")

    private String cpuUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_resource_consumption_value")

    private Long memoryResourceConsumptionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_unit")

    private String memoryUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_cpu_resource_consumption_value")

    private Long lastCpuResourceConsumptionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_cpu_unit")

    private String lastCpuUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_memory_resource_consumption_value")

    private Long lastMemoryResourceConsumptionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_memory_unit")

    private String lastMemoryUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warehouse_time_ms")

    private Long warehouseTimeMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_fields")

    private String extendedFields;

    public ComputeDimension withNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * 节点实例ID
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return nodeInstanceId;
    }

    public void setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
    }

    public ComputeDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称或脚本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputeDimension withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型,用于区分节点实例和脚本
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ComputeDimension withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ComputeDimension withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public ComputeDimension withJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }

    /**
     * 作业实例id
     * @return jobInstanceId
     */
    public Long getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    public ComputeDimension withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ComputeDimension withStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
        return this;
    }

    /**
     * 节点实例启动时间,单位毫秒
     * @return startTimeMs
     */
    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public void setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
    }

    public ComputeDimension withEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
        return this;
    }

    /**
     * 节点实例结束时间,单位毫秒
     * @return endTimeMs
     */
    public Long getEndTimeMs() {
        return endTimeMs;
    }

    public void setEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
    }

    public ComputeDimension withExecuteTimeMs(Long executeTimeMs) {
        this.executeTimeMs = executeTimeMs;
        return this;
    }

    /**
     * 节点实例执行时长,单位毫秒
     * @return executeTimeMs
     */
    public Long getExecuteTimeMs() {
        return executeTimeMs;
    }

    public void setExecuteTimeMs(Long executeTimeMs) {
        this.executeTimeMs = executeTimeMs;
    }

    public ComputeDimension withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComputeDimension withLastStartTimeMs(Long lastStartTimeMs) {
        this.lastStartTimeMs = lastStartTimeMs;
        return this;
    }

    /**
     * 节点实例上次执行开始时间,单位毫秒
     * @return lastStartTimeMs
     */
    public Long getLastStartTimeMs() {
        return lastStartTimeMs;
    }

    public void setLastStartTimeMs(Long lastStartTimeMs) {
        this.lastStartTimeMs = lastStartTimeMs;
    }

    public ComputeDimension withLastEndTimeMs(Long lastEndTimeMs) {
        this.lastEndTimeMs = lastEndTimeMs;
        return this;
    }

    /**
     * 节点实例上次执行结束时间,单位毫秒
     * @return lastEndTimeMs
     */
    public Long getLastEndTimeMs() {
        return lastEndTimeMs;
    }

    public void setLastEndTimeMs(Long lastEndTimeMs) {
        this.lastEndTimeMs = lastEndTimeMs;
    }

    public ComputeDimension withCpuResourceConsumptionValue(Long cpuResourceConsumptionValue) {
        this.cpuResourceConsumptionValue = cpuResourceConsumptionValue;
        return this;
    }

    /**
     * cpu消耗值
     * @return cpuResourceConsumptionValue
     */
    public Long getCpuResourceConsumptionValue() {
        return cpuResourceConsumptionValue;
    }

    public void setCpuResourceConsumptionValue(Long cpuResourceConsumptionValue) {
        this.cpuResourceConsumptionValue = cpuResourceConsumptionValue;
    }

    public ComputeDimension withCpuUnit(String cpuUnit) {
        this.cpuUnit = cpuUnit;
        return this;
    }

    /**
     * cpu消耗单位
     * @return cpuUnit
     */
    public String getCpuUnit() {
        return cpuUnit;
    }

    public void setCpuUnit(String cpuUnit) {
        this.cpuUnit = cpuUnit;
    }

    public ComputeDimension withMemoryResourceConsumptionValue(Long memoryResourceConsumptionValue) {
        this.memoryResourceConsumptionValue = memoryResourceConsumptionValue;
        return this;
    }

    /**
     * 内存消耗值
     * @return memoryResourceConsumptionValue
     */
    public Long getMemoryResourceConsumptionValue() {
        return memoryResourceConsumptionValue;
    }

    public void setMemoryResourceConsumptionValue(Long memoryResourceConsumptionValue) {
        this.memoryResourceConsumptionValue = memoryResourceConsumptionValue;
    }

    public ComputeDimension withMemoryUnit(String memoryUnit) {
        this.memoryUnit = memoryUnit;
        return this;
    }

    /**
     * 内存消耗单位
     * @return memoryUnit
     */
    public String getMemoryUnit() {
        return memoryUnit;
    }

    public void setMemoryUnit(String memoryUnit) {
        this.memoryUnit = memoryUnit;
    }

    public ComputeDimension withLastCpuResourceConsumptionValue(Long lastCpuResourceConsumptionValue) {
        this.lastCpuResourceConsumptionValue = lastCpuResourceConsumptionValue;
        return this;
    }

    /**
     * 上次cpu消耗值
     * @return lastCpuResourceConsumptionValue
     */
    public Long getLastCpuResourceConsumptionValue() {
        return lastCpuResourceConsumptionValue;
    }

    public void setLastCpuResourceConsumptionValue(Long lastCpuResourceConsumptionValue) {
        this.lastCpuResourceConsumptionValue = lastCpuResourceConsumptionValue;
    }

    public ComputeDimension withLastCpuUnit(String lastCpuUnit) {
        this.lastCpuUnit = lastCpuUnit;
        return this;
    }

    /**
     * 上次cpu消耗单位
     * @return lastCpuUnit
     */
    public String getLastCpuUnit() {
        return lastCpuUnit;
    }

    public void setLastCpuUnit(String lastCpuUnit) {
        this.lastCpuUnit = lastCpuUnit;
    }

    public ComputeDimension withLastMemoryResourceConsumptionValue(Long lastMemoryResourceConsumptionValue) {
        this.lastMemoryResourceConsumptionValue = lastMemoryResourceConsumptionValue;
        return this;
    }

    /**
     * 上次内存消耗值
     * @return lastMemoryResourceConsumptionValue
     */
    public Long getLastMemoryResourceConsumptionValue() {
        return lastMemoryResourceConsumptionValue;
    }

    public void setLastMemoryResourceConsumptionValue(Long lastMemoryResourceConsumptionValue) {
        this.lastMemoryResourceConsumptionValue = lastMemoryResourceConsumptionValue;
    }

    public ComputeDimension withLastMemoryUnit(String lastMemoryUnit) {
        this.lastMemoryUnit = lastMemoryUnit;
        return this;
    }

    /**
     * 上次内存消耗单位
     * @return lastMemoryUnit
     */
    public String getLastMemoryUnit() {
        return lastMemoryUnit;
    }

    public void setLastMemoryUnit(String lastMemoryUnit) {
        this.lastMemoryUnit = lastMemoryUnit;
    }

    public ComputeDimension withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 节点实例创建者name
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ComputeDimension withWarehouseTimeMs(Long warehouseTimeMs) {
        this.warehouseTimeMs = warehouseTimeMs;
        return this;
    }

    /**
     * 数据入库时间,单位毫秒
     * @return warehouseTimeMs
     */
    public Long getWarehouseTimeMs() {
        return warehouseTimeMs;
    }

    public void setWarehouseTimeMs(Long warehouseTimeMs) {
        this.warehouseTimeMs = warehouseTimeMs;
    }

    public ComputeDimension withExtendedFields(String extendedFields) {
        this.extendedFields = extendedFields;
        return this;
    }

    /**
     * 扩展字段
     * @return extendedFields
     */
    public String getExtendedFields() {
        return extendedFields;
    }

    public void setExtendedFields(String extendedFields) {
        this.extendedFields = extendedFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputeDimension that = (ComputeDimension) obj;
        return Objects.equals(this.nodeInstanceId, that.nodeInstanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobInstanceId, that.jobInstanceId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.startTimeMs, that.startTimeMs)
            && Objects.equals(this.endTimeMs, that.endTimeMs) && Objects.equals(this.executeTimeMs, that.executeTimeMs)
            && Objects.equals(this.status, that.status) && Objects.equals(this.lastStartTimeMs, that.lastStartTimeMs)
            && Objects.equals(this.lastEndTimeMs, that.lastEndTimeMs)
            && Objects.equals(this.cpuResourceConsumptionValue, that.cpuResourceConsumptionValue)
            && Objects.equals(this.cpuUnit, that.cpuUnit)
            && Objects.equals(this.memoryResourceConsumptionValue, that.memoryResourceConsumptionValue)
            && Objects.equals(this.memoryUnit, that.memoryUnit)
            && Objects.equals(this.lastCpuResourceConsumptionValue, that.lastCpuResourceConsumptionValue)
            && Objects.equals(this.lastCpuUnit, that.lastCpuUnit)
            && Objects.equals(this.lastMemoryResourceConsumptionValue, that.lastMemoryResourceConsumptionValue)
            && Objects.equals(this.lastMemoryUnit, that.lastMemoryUnit) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.warehouseTimeMs, that.warehouseTimeMs)
            && Objects.equals(this.extendedFields, that.extendedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeInstanceId,
            name,
            type,
            nodeType,
            jobId,
            jobInstanceId,
            jobName,
            startTimeMs,
            endTimeMs,
            executeTimeMs,
            status,
            lastStartTimeMs,
            lastEndTimeMs,
            cpuResourceConsumptionValue,
            cpuUnit,
            memoryResourceConsumptionValue,
            memoryUnit,
            lastCpuResourceConsumptionValue,
            lastCpuUnit,
            lastMemoryResourceConsumptionValue,
            lastMemoryUnit,
            creator,
            warehouseTimeMs,
            extendedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeDimension {\n");
        sb.append("    nodeInstanceId: ").append(toIndentedString(nodeInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobInstanceId: ").append(toIndentedString(jobInstanceId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
        sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
        sb.append("    executeTimeMs: ").append(toIndentedString(executeTimeMs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastStartTimeMs: ").append(toIndentedString(lastStartTimeMs)).append("\n");
        sb.append("    lastEndTimeMs: ").append(toIndentedString(lastEndTimeMs)).append("\n");
        sb.append("    cpuResourceConsumptionValue: ")
            .append(toIndentedString(cpuResourceConsumptionValue))
            .append("\n");
        sb.append("    cpuUnit: ").append(toIndentedString(cpuUnit)).append("\n");
        sb.append("    memoryResourceConsumptionValue: ")
            .append(toIndentedString(memoryResourceConsumptionValue))
            .append("\n");
        sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
        sb.append("    lastCpuResourceConsumptionValue: ")
            .append(toIndentedString(lastCpuResourceConsumptionValue))
            .append("\n");
        sb.append("    lastCpuUnit: ").append(toIndentedString(lastCpuUnit)).append("\n");
        sb.append("    lastMemoryResourceConsumptionValue: ")
            .append(toIndentedString(lastMemoryResourceConsumptionValue))
            .append("\n");
        sb.append("    lastMemoryUnit: ").append(toIndentedString(lastMemoryUnit)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    warehouseTimeMs: ").append(toIndentedString(warehouseTimeMs)).append("\n");
        sb.append("    extendedFields: ").append(toIndentedString(extendedFields)).append("\n");
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
