package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 统计信息（该字段已废弃）
 */
public class ShowVulReportDataResponseInfoSumary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_repair_necessity")

    private Integer vulNumRepairNecessity;

    public ShowVulReportDataResponseInfoSumary withVulNumRepairNecessity(Integer vulNumRepairNecessity) {
        this.vulNumRepairNecessity = vulNumRepairNecessity;
        return this;
    }

    /**
     * **参数解释**: 紧急修复漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumRepairNecessity
     */
    public Integer getVulNumRepairNecessity() {
        return vulNumRepairNecessity;
    }

    public void setVulNumRepairNecessity(Integer vulNumRepairNecessity) {
        this.vulNumRepairNecessity = vulNumRepairNecessity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulReportDataResponseInfoSumary that = (ShowVulReportDataResponseInfoSumary) obj;
        return Objects.equals(this.vulNumRepairNecessity, that.vulNumRepairNecessity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulNumRepairNecessity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulReportDataResponseInfoSumary {\n");
        sb.append("    vulNumRepairNecessity: ").append(toIndentedString(vulNumRepairNecessity)).append("\n");
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
