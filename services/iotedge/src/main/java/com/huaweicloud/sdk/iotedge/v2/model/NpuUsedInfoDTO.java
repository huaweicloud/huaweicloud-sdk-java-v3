package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NPU设备使用详情
 */
public class NpuUsedInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_ai_core_num")

    private Integer usedAiCoreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_cpu_core_num")

    private Integer usedCpuCoreNum;

    public NpuUsedInfoDTO withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块名称
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public NpuUsedInfoDTO withUsedAiCoreNum(Integer usedAiCoreNum) {
        this.usedAiCoreNum = usedAiCoreNum;
        return this;
    }

    /**
     * 模块使用AI核的个数
     * minimum: 1
     * maximum: 64
     * @return usedAiCoreNum
     */
    public Integer getUsedAiCoreNum() {
        return usedAiCoreNum;
    }

    public void setUsedAiCoreNum(Integer usedAiCoreNum) {
        this.usedAiCoreNum = usedAiCoreNum;
    }

    public NpuUsedInfoDTO withUsedCpuCoreNum(Integer usedCpuCoreNum) {
        this.usedCpuCoreNum = usedCpuCoreNum;
        return this;
    }

    /**
     * 模块使用NPU芯片中的cpu核数
     * minimum: 0
     * maximum: 64
     * @return usedCpuCoreNum
     */
    public Integer getUsedCpuCoreNum() {
        return usedCpuCoreNum;
    }

    public void setUsedCpuCoreNum(Integer usedCpuCoreNum) {
        this.usedCpuCoreNum = usedCpuCoreNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NpuUsedInfoDTO that = (NpuUsedInfoDTO) obj;
        return Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.usedAiCoreNum, that.usedAiCoreNum)
            && Objects.equals(this.usedCpuCoreNum, that.usedCpuCoreNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleId, usedAiCoreNum, usedCpuCoreNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NpuUsedInfoDTO {\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    usedAiCoreNum: ").append(toIndentedString(usedAiCoreNum)).append("\n");
        sb.append("    usedCpuCoreNum: ").append(toIndentedString(usedCpuCoreNum)).append("\n");
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
