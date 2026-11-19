package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 影响的主机数 **取值范围**: 不涉及 
 */
public class VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urgent_vul")

    private Integer urgentVul;

    public VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum withUrgentVul(Integer urgentVul) {
        this.urgentVul = urgentVul;
        return this;
    }

    /**
     * **参数解释**: 应急漏洞影响的主机数 **取值范围**: 最小值0，最大值2147483647 
     * @return urgentVul
     */
    public Integer getUrgentVul() {
        return urgentVul;
    }

    public void setUrgentVul(Integer urgentVul) {
        this.urgentVul = urgentVul;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum that =
            (VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum) obj;
        return Objects.equals(this.urgentVul, that.urgentVul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urgentVul);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum {\n");
        sb.append("    urgentVul: ").append(toIndentedString(urgentVul)).append("\n");
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
