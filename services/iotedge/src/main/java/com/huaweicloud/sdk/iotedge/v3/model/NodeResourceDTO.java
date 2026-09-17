package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点资源详情
 */
public class NodeResourceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Long cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Long storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pods")

    private Long pods;

    public NodeResourceDTO withCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 节点cpu，单位个
     * @return cpu
     */
    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public NodeResourceDTO withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 节点内存，单位Byte
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public NodeResourceDTO withStorage(Long storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 磁盘，单位Byte
     * @return storage
     */
    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public NodeResourceDTO withPods(Long pods) {
        this.pods = pods;
        return this;
    }

    /**
     * 容器pod数量
     * @return pods
     */
    public Long getPods() {
        return pods;
    }

    public void setPods(Long pods) {
        this.pods = pods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeResourceDTO that = (NodeResourceDTO) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.storage, that.storage) && Objects.equals(this.pods, that.pods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, storage, pods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeResourceDTO {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
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
