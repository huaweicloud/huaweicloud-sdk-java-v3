package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEventSeverityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_num")

    private Integer lowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_num")

    private Integer mediumNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_num")

    private Integer highNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_num")

    private Integer criticalNum;

    public ShowEventSeverityResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowEventSeverityResponse withLowNum(Integer lowNum) {
        this.lowNum = lowNum;
        return this;
    }

    /**
     * 低危数量
     * minimum: 0
     * maximum: 2147483647
     * @return lowNum
     */
    public Integer getLowNum() {
        return lowNum;
    }

    public void setLowNum(Integer lowNum) {
        this.lowNum = lowNum;
    }

    public ShowEventSeverityResponse withMediumNum(Integer mediumNum) {
        this.mediumNum = mediumNum;
        return this;
    }

    /**
     * 中危数量
     * minimum: 0
     * maximum: 2147483647
     * @return mediumNum
     */
    public Integer getMediumNum() {
        return mediumNum;
    }

    public void setMediumNum(Integer mediumNum) {
        this.mediumNum = mediumNum;
    }

    public ShowEventSeverityResponse withHighNum(Integer highNum) {
        this.highNum = highNum;
        return this;
    }

    /**
     * 高危数量
     * minimum: 0
     * maximum: 2147483647
     * @return highNum
     */
    public Integer getHighNum() {
        return highNum;
    }

    public void setHighNum(Integer highNum) {
        this.highNum = highNum;
    }

    public ShowEventSeverityResponse withCriticalNum(Integer criticalNum) {
        this.criticalNum = criticalNum;
        return this;
    }

    /**
     * 危急数量
     * minimum: 0
     * maximum: 2147483647
     * @return criticalNum
     */
    public Integer getCriticalNum() {
        return criticalNum;
    }

    public void setCriticalNum(Integer criticalNum) {
        this.criticalNum = criticalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEventSeverityResponse that = (ShowEventSeverityResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lowNum, that.lowNum)
            && Objects.equals(this.mediumNum, that.mediumNum) && Objects.equals(this.highNum, that.highNum)
            && Objects.equals(this.criticalNum, that.criticalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lowNum, mediumNum, highNum, criticalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventSeverityResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lowNum: ").append(toIndentedString(lowNum)).append("\n");
        sb.append("    mediumNum: ").append(toIndentedString(mediumNum)).append("\n");
        sb.append("    highNum: ").append(toIndentedString(highNum)).append("\n");
        sb.append("    criticalNum: ").append(toIndentedString(criticalNum)).append("\n");
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
