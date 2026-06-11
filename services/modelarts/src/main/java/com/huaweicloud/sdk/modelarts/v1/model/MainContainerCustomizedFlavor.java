package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置训练作业自定义规格。
 */
public class MainContainerCustomizedFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_core_num")

    private Float cpuCoreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_size")

    private Float memSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_num")

    private Float acceleratorNum;

    public MainContainerCustomizedFlavor withCpuCoreNum(Float cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
        return this;
    }

    /**
     * **参数解释**：cpu核数。 **取值范围**：大于零。
     * @return cpuCoreNum
     */
    public Float getCpuCoreNum() {
        return cpuCoreNum;
    }

    public void setCpuCoreNum(Float cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
    }

    public MainContainerCustomizedFlavor withMemSize(Float memSize) {
        this.memSize = memSize;
        return this;
    }

    /**
     * **参数解释**：内存大小。 **取值范围**：大于零。
     * @return memSize
     */
    public Float getMemSize() {
        return memSize;
    }

    public void setMemSize(Float memSize) {
        this.memSize = memSize;
    }

    public MainContainerCustomizedFlavor withAcceleratorNum(Float acceleratorNum) {
        this.acceleratorNum = acceleratorNum;
        return this;
    }

    /**
     * **参数解释**：加速卡卡数。 **取值范围**：大于等于零。
     * @return acceleratorNum
     */
    public Float getAcceleratorNum() {
        return acceleratorNum;
    }

    public void setAcceleratorNum(Float acceleratorNum) {
        this.acceleratorNum = acceleratorNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MainContainerCustomizedFlavor that = (MainContainerCustomizedFlavor) obj;
        return Objects.equals(this.cpuCoreNum, that.cpuCoreNum) && Objects.equals(this.memSize, that.memSize)
            && Objects.equals(this.acceleratorNum, that.acceleratorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuCoreNum, memSize, acceleratorNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MainContainerCustomizedFlavor {\n");
        sb.append("    cpuCoreNum: ").append(toIndentedString(cpuCoreNum)).append("\n");
        sb.append("    memSize: ").append(toIndentedString(memSize)).append("\n");
        sb.append("    acceleratorNum: ").append(toIndentedString(acceleratorNum)).append("\n");
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
