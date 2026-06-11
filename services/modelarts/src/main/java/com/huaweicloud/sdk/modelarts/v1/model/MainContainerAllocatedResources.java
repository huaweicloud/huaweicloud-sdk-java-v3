package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业的训练容器实际到手的资源规格。
 */
public class MainContainerAllocatedResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_arch")

    private String cpuArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_core_num")

    private Float cpuCoreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_size")

    private Float memSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_num")

    private Float acceleratorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_type")

    private String acceleratorType;

    public MainContainerAllocatedResources withCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }

    /**
     * **参数解释**： cpu架构。 **取值范围**： 不涉及。
     * @return cpuArch
     */
    public String getCpuArch() {
        return cpuArch;
    }

    public void setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
    }

    public MainContainerAllocatedResources withCpuCoreNum(Float cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
        return this;
    }

    /**
     * **参数解释**： 核数。 **取值范围**： 不涉及。
     * @return cpuCoreNum
     */
    public Float getCpuCoreNum() {
        return cpuCoreNum;
    }

    public void setCpuCoreNum(Float cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
    }

    public MainContainerAllocatedResources withMemSize(Float memSize) {
        this.memSize = memSize;
        return this;
    }

    /**
     * **参数解释**： 内存信息。 **取值范围**： 不涉及。
     * @return memSize
     */
    public Float getMemSize() {
        return memSize;
    }

    public void setMemSize(Float memSize) {
        this.memSize = memSize;
    }

    public MainContainerAllocatedResources withAcceleratorNum(Float acceleratorNum) {
        this.acceleratorNum = acceleratorNum;
        return this;
    }

    /**
     * **参数解释**： 加速卡卡数。 **取值范围**： 不涉及。
     * @return acceleratorNum
     */
    public Float getAcceleratorNum() {
        return acceleratorNum;
    }

    public void setAcceleratorNum(Float acceleratorNum) {
        this.acceleratorNum = acceleratorNum;
    }

    public MainContainerAllocatedResources withAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }

    /**
     * **参数解释**： 加速卡类型。如：ascend-Snt9b，ascend-snt9c等 **取值范围**： 不涉及。
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return acceleratorType;
    }

    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MainContainerAllocatedResources that = (MainContainerAllocatedResources) obj;
        return Objects.equals(this.cpuArch, that.cpuArch) && Objects.equals(this.cpuCoreNum, that.cpuCoreNum)
            && Objects.equals(this.memSize, that.memSize) && Objects.equals(this.acceleratorNum, that.acceleratorNum)
            && Objects.equals(this.acceleratorType, that.acceleratorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuArch, cpuCoreNum, memSize, acceleratorNum, acceleratorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MainContainerAllocatedResources {\n");
        sb.append("    cpuArch: ").append(toIndentedString(cpuArch)).append("\n");
        sb.append("    cpuCoreNum: ").append(toIndentedString(cpuCoreNum)).append("\n");
        sb.append("    memSize: ").append(toIndentedString(memSize)).append("\n");
        sb.append("    acceleratorNum: ").append(toIndentedString(acceleratorNum)).append("\n");
        sb.append("    acceleratorType: ").append(toIndentedString(acceleratorType)).append("\n");
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
