package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AscendInfo
 */
public class AscendInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Integer npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_memory")

    private String npuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip")

    private Integer chip;

    public AscendInfo withNpu(Integer npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：NPU数量。 **取值范围**：不涉及。
     * @return npu
     */
    public Integer getNpu() {
        return npu;
    }

    public void setNpu(Integer npu) {
        this.npu = npu;
    }

    public AscendInfo withNpuMemory(String npuMemory) {
        this.npuMemory = npuMemory;
        return this;
    }

    /**
     * **参数解释**：NPU内存。 **取值范围**：不涉及。
     * @return npuMemory
     */
    public String getNpuMemory() {
        return npuMemory;
    }

    public void setNpuMemory(String npuMemory) {
        this.npuMemory = npuMemory;
    }

    public AscendInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：NPU类型。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AscendInfo withChip(Integer chip) {
        this.chip = chip;
        return this;
    }

    /**
     * **参数解释**：NPU设备数。 **取值范围**：不涉及。
     * @return chip
     */
    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AscendInfo that = (AscendInfo) obj;
        return Objects.equals(this.npu, that.npu) && Objects.equals(this.npuMemory, that.npuMemory)
            && Objects.equals(this.type, that.type) && Objects.equals(this.chip, that.chip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(npu, npuMemory, type, chip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AscendInfo {\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    npuMemory: ").append(toIndentedString(npuMemory)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    chip: ").append(toIndentedString(chip)).append("\n");
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
