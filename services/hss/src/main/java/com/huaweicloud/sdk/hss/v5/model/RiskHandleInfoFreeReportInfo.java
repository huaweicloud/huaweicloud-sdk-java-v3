package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 免费体检报告信息
 */
public class RiskHandleInfoFreeReportInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_check_host_num")

    private Long freeCheckHostNum;

    public RiskHandleInfoFreeReportInfo withFreeCheckHostNum(Long freeCheckHostNum) {
        this.freeCheckHostNum = freeCheckHostNum;
        return this;
    }

    /**
     * **参数解释**: 免费体检服务器数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return freeCheckHostNum
     */
    public Long getFreeCheckHostNum() {
        return freeCheckHostNum;
    }

    public void setFreeCheckHostNum(Long freeCheckHostNum) {
        this.freeCheckHostNum = freeCheckHostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskHandleInfoFreeReportInfo that = (RiskHandleInfoFreeReportInfo) obj;
        return Objects.equals(this.freeCheckHostNum, that.freeCheckHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeCheckHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskHandleInfoFreeReportInfo {\n");
        sb.append("    freeCheckHostNum: ").append(toIndentedString(freeCheckHostNum)).append("\n");
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
