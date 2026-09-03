package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrainingFlavorMaxAvailableResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_core_num")

    private Integer cpuCoreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_size")

    private Integer memSize;

    public ShowTrainingFlavorMaxAvailableResourceResponse withCpuCoreNum(Integer cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
        return this;
    }

    /**
     * **参数解释**：最大可用CPU核数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return cpuCoreNum
     */
    public Integer getCpuCoreNum() {
        return cpuCoreNum;
    }

    public void setCpuCoreNum(Integer cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
    }

    public ShowTrainingFlavorMaxAvailableResourceResponse withMemSize(Integer memSize) {
        this.memSize = memSize;
        return this;
    }

    /**
     * **参数解释**：最大可用内存大小，单位为GB。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return memSize
     */
    public Integer getMemSize() {
        return memSize;
    }

    public void setMemSize(Integer memSize) {
        this.memSize = memSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingFlavorMaxAvailableResourceResponse that = (ShowTrainingFlavorMaxAvailableResourceResponse) obj;
        return Objects.equals(this.cpuCoreNum, that.cpuCoreNum) && Objects.equals(this.memSize, that.memSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuCoreNum, memSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingFlavorMaxAvailableResourceResponse {\n");
        sb.append("    cpuCoreNum: ").append(toIndentedString(cpuCoreNum)).append("\n");
        sb.append("    memSize: ").append(toIndentedString(memSize)).append("\n");
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
