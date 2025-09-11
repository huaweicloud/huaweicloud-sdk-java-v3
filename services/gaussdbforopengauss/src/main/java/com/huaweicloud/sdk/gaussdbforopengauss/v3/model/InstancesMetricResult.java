package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstancesMetricResult
 */
public class InstancesMetricResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_used_size")

    private String diskUsedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_total_size")

    private String diskTotalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_usage")

    private String diskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p80")

    private String p80;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p95")

    private String p95;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadlocks")

    private String deadlocks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buffer_hit_ratio")

    private String bufferHitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<InstancesNodesResult> nodes = null;

    public InstancesMetricResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstancesMetricResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstancesMetricResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 实例状态。 **取值范围**： - creating，表示实例正在创建。 - normal，表示实例正常。 - abnormal，表示实例异常。 - createfail，表示实例创建失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstancesMetricResult withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 实例类型。 **取值范围**： 不涉及。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public InstancesMetricResult withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * **参数解释**： 引擎名称。 **取值范围**： 不涉及。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public InstancesMetricResult withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**： 引擎版本。 **取值范围**： 不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public InstancesMetricResult withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * **参数解释**： 部署形态。 **取值范围**： 不涉及。
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public InstancesMetricResult withDiskUsedSize(String diskUsedSize) {
        this.diskUsedSize = diskUsedSize;
        return this;
    }

    /**
     * **参数解释**： 实例数据磁盘已使用大小。 **取值范围**： 不涉及。
     * @return diskUsedSize
     */
    public String getDiskUsedSize() {
        return diskUsedSize;
    }

    public void setDiskUsedSize(String diskUsedSize) {
        this.diskUsedSize = diskUsedSize;
    }

    public InstancesMetricResult withDiskTotalSize(String diskTotalSize) {
        this.diskTotalSize = diskTotalSize;
        return this;
    }

    /**
     * **参数解释**： 实例数据磁盘总大小。 **取值范围**： 不涉及。
     * @return diskTotalSize
     */
    public String getDiskTotalSize() {
        return diskTotalSize;
    }

    public void setDiskTotalSize(String diskTotalSize) {
        this.diskTotalSize = diskTotalSize;
    }

    public InstancesMetricResult withDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * **参数解释**： 实例数据磁盘已使用百分比。 **取值范围**： 不涉及。
     * @return diskUsage
     */
    public String getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
    }

    public InstancesMetricResult withP80(String p80) {
        this.p80 = p80;
        return this;
    }

    /**
     * **参数解释**： 80% SQL的响应时间。 **取值范围**： 不涉及。
     * @return p80
     */
    public String getP80() {
        return p80;
    }

    public void setP80(String p80) {
        this.p80 = p80;
    }

    public InstancesMetricResult withP95(String p95) {
        this.p95 = p95;
        return this;
    }

    /**
     * **参数解释**： 95% SQL的响应时间。 **取值范围**： 不涉及。
     * @return p95
     */
    public String getP95() {
        return p95;
    }

    public void setP95(String p95) {
        this.p95 = p95;
    }

    public InstancesMetricResult withDeadlocks(String deadlocks) {
        this.deadlocks = deadlocks;
        return this;
    }

    /**
     * **参数解释**： 死锁次数。 **取值范围**： 不涉及。
     * @return deadlocks
     */
    public String getDeadlocks() {
        return deadlocks;
    }

    public void setDeadlocks(String deadlocks) {
        this.deadlocks = deadlocks;
    }

    public InstancesMetricResult withBufferHitRatio(String bufferHitRatio) {
        this.bufferHitRatio = bufferHitRatio;
        return this;
    }

    /**
     * **参数解释**： buffer 命中率。 **取值范围**： 不涉及。
     * @return bufferHitRatio
     */
    public String getBufferHitRatio() {
        return bufferHitRatio;
    }

    public void setBufferHitRatio(String bufferHitRatio) {
        this.bufferHitRatio = bufferHitRatio;
    }

    public InstancesMetricResult withNodes(List<InstancesNodesResult> nodes) {
        this.nodes = nodes;
        return this;
    }

    public InstancesMetricResult addNodesItem(InstancesNodesResult nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public InstancesMetricResult withNodes(Consumer<List<InstancesNodesResult>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 实例节点信息列表。
     * @return nodes
     */
    public List<InstancesNodesResult> getNodes() {
        return nodes;
    }

    public void setNodes(List<InstancesNodesResult> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesMetricResult that = (InstancesMetricResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.diskUsedSize, that.diskUsedSize)
            && Objects.equals(this.diskTotalSize, that.diskTotalSize) && Objects.equals(this.diskUsage, that.diskUsage)
            && Objects.equals(this.p80, that.p80) && Objects.equals(this.p95, that.p95)
            && Objects.equals(this.deadlocks, that.deadlocks)
            && Objects.equals(this.bufferHitRatio, that.bufferHitRatio) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            mode,
            engineName,
            engineVersion,
            solution,
            diskUsedSize,
            diskTotalSize,
            diskUsage,
            p80,
            p95,
            deadlocks,
            bufferHitRatio,
            nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesMetricResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    diskUsedSize: ").append(toIndentedString(diskUsedSize)).append("\n");
        sb.append("    diskTotalSize: ").append(toIndentedString(diskTotalSize)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    p80: ").append(toIndentedString(p80)).append("\n");
        sb.append("    p95: ").append(toIndentedString(p95)).append("\n");
        sb.append("    deadlocks: ").append(toIndentedString(deadlocks)).append("\n");
        sb.append("    bufferHitRatio: ").append(toIndentedString(bufferHitRatio)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
