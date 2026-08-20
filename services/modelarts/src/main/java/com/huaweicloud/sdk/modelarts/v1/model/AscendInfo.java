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
    @JsonProperty(value = "ai_core")

    private String aiCore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_cpu")

    private String aiCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_alias")

    private String typeAlias;

    public AscendInfo withNpu(Integer npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释：** NPU数量。 **取值范围：** 不涉及。
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
     * **参数解释：** NPU内存。 **取值范围：** 不涉及。
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
     * **参数解释：** NPU类型。 **取值范围：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AscendInfo withAiCore(String aiCore) {
        this.aiCore = aiCore;
        return this;
    }

    /**
     * **参数解释：** 切分规格中的ai_core。 **取值范围：** 不涉及。
     * @return aiCore
     */
    public String getAiCore() {
        return aiCore;
    }

    public void setAiCore(String aiCore) {
        this.aiCore = aiCore;
    }

    public AscendInfo withAiCpu(String aiCpu) {
        this.aiCpu = aiCpu;
        return this;
    }

    /**
     * **参数解释：** 切分规格中的ai_cpu。 **取值范围：** 不涉及。
     * @return aiCpu
     */
    public String getAiCpu() {
        return aiCpu;
    }

    public void setAiCpu(String aiCpu) {
        this.aiCpu = aiCpu;
    }

    public AscendInfo withTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
        return this;
    }

    /**
     * **参数解释：** 区分卡类型，如Snt9b3、Snt9b2 **取值范围：** 不涉及。
     * @return typeAlias
     */
    public String getTypeAlias() {
        return typeAlias;
    }

    public void setTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
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
            && Objects.equals(this.type, that.type) && Objects.equals(this.aiCore, that.aiCore)
            && Objects.equals(this.aiCpu, that.aiCpu) && Objects.equals(this.typeAlias, that.typeAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(npu, npuMemory, type, aiCore, aiCpu, typeAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AscendInfo {\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    npuMemory: ").append(toIndentedString(npuMemory)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    aiCore: ").append(toIndentedString(aiCore)).append("\n");
        sb.append("    aiCpu: ").append(toIndentedString(aiCpu)).append("\n");
        sb.append("    typeAlias: ").append(toIndentedString(typeAlias)).append("\n");
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
