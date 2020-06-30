package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例的统计信息。
 */
public class InstanceStatistic  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input_kbps")
    
    private String inputKbps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_kbps")
    
    private String outputKbps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keys")
    
    private Long keys;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_memory")
    
    private Long usedMemory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_memory")
    
    private Long maxMemory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmd_get_count")
    
    private Long cmdGetCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmd_set_count")
    
    private Long cmdSetCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_cpu")
    
    private String usedCpu;

    public InstanceStatistic withInputKbps(String inputKbps) {
        this.inputKbps = inputKbps;
        return this;
    }

    


    /**
     * 缓存实例网络入流量，单位：Kbps。
     * @return inputKbps
     */
    public String getInputKbps() {
        return inputKbps;
    }

    public void setInputKbps(String inputKbps) {
        this.inputKbps = inputKbps;
    }

    public InstanceStatistic withOutputKbps(String outputKbps) {
        this.outputKbps = outputKbps;
        return this;
    }

    


    /**
     * 缓存实例网络出流量，单位：Kbps。
     * @return outputKbps
     */
    public String getOutputKbps() {
        return outputKbps;
    }

    public void setOutputKbps(String outputKbps) {
        this.outputKbps = outputKbps;
    }

    public InstanceStatistic withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceStatistic withKeys(Long keys) {
        this.keys = keys;
        return this;
    }

    


    /**
     * 缓存存储的数据条数。
     * @return keys
     */
    public Long getKeys() {
        return keys;
    }

    public void setKeys(Long keys) {
        this.keys = keys;
    }

    public InstanceStatistic withUsedMemory(Long usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    


    /**
     * 缓存已经使用内存，单位：MB。
     * @return usedMemory
     */
    public Long getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(Long usedMemory) {
        this.usedMemory = usedMemory;
    }

    public InstanceStatistic withMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    


    /**
     * 缓存的总内存，单位：MB。
     * @return maxMemory
     */
    public Long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public InstanceStatistic withCmdGetCount(Long cmdGetCount) {
        this.cmdGetCount = cmdGetCount;
        return this;
    }

    


    /**
     * 缓存get命令被调用次数。
     * @return cmdGetCount
     */
    public Long getCmdGetCount() {
        return cmdGetCount;
    }

    public void setCmdGetCount(Long cmdGetCount) {
        this.cmdGetCount = cmdGetCount;
    }

    public InstanceStatistic withCmdSetCount(Long cmdSetCount) {
        this.cmdSetCount = cmdSetCount;
        return this;
    }

    


    /**
     * 缓存set命令被调用次数。
     * @return cmdSetCount
     */
    public Long getCmdSetCount() {
        return cmdSetCount;
    }

    public void setCmdSetCount(Long cmdSetCount) {
        this.cmdSetCount = cmdSetCount;
    }

    public InstanceStatistic withUsedCpu(String usedCpu) {
        this.usedCpu = usedCpu;
        return this;
    }

    


    /**
     * CPU使用率，单位：百分比。
     * @return usedCpu
     */
    public String getUsedCpu() {
        return usedCpu;
    }

    public void setUsedCpu(String usedCpu) {
        this.usedCpu = usedCpu;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceStatistic instanceStatistic = (InstanceStatistic) o;
        return Objects.equals(this.inputKbps, instanceStatistic.inputKbps) &&
            Objects.equals(this.outputKbps, instanceStatistic.outputKbps) &&
            Objects.equals(this.instanceId, instanceStatistic.instanceId) &&
            Objects.equals(this.keys, instanceStatistic.keys) &&
            Objects.equals(this.usedMemory, instanceStatistic.usedMemory) &&
            Objects.equals(this.maxMemory, instanceStatistic.maxMemory) &&
            Objects.equals(this.cmdGetCount, instanceStatistic.cmdGetCount) &&
            Objects.equals(this.cmdSetCount, instanceStatistic.cmdSetCount) &&
            Objects.equals(this.usedCpu, instanceStatistic.usedCpu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(inputKbps, outputKbps, instanceId, keys, usedMemory, maxMemory, cmdGetCount, cmdSetCount, usedCpu);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceStatistic {\n");
        sb.append("    inputKbps: ").append(toIndentedString(inputKbps)).append("\n");
        sb.append("    outputKbps: ").append(toIndentedString(outputKbps)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    usedMemory: ").append(toIndentedString(usedMemory)).append("\n");
        sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
        sb.append("    cmdGetCount: ").append(toIndentedString(cmdGetCount)).append("\n");
        sb.append("    cmdSetCount: ").append(toIndentedString(cmdSetCount)).append("\n");
        sb.append("    usedCpu: ").append(toIndentedString(usedCpu)).append("\n");
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

