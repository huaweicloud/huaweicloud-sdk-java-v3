package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 请求限速，将用户请求速度限制在指定范围内，一定程度上减少突发高带宽风险，节省成本 **约束限制：** 不涉及
 */
public class RequestLimitRulesEngine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_rate_after")

    private Long limitRateAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_rate_value")

    private Integer limitRateValue;

    public RequestLimitRulesEngine withLimitRateAfter(Long limitRateAfter) {
        this.limitRateAfter = limitRateAfter;
        return this;
    }

    /**
     * **参数解释：** 限速条件 > 例如：type=size，limit_rate_after=50表示从传输50个字节后开始限速且限速值为limit_rate_value  **约束限制：** 不涉及 **取值范围：** 0-1073741824，单位：byte **默认取值：** 不涉及
     * @return limitRateAfter
     */
    public Long getLimitRateAfter() {
        return limitRateAfter;
    }

    public void setLimitRateAfter(Long limitRateAfter) {
        this.limitRateAfter = limitRateAfter;
    }

    public RequestLimitRulesEngine withLimitRateValue(Integer limitRateValue) {
        this.limitRateValue = limitRateValue;
        return this;
    }

    /**
     * **参数解释：** 限速值，即达到限速条件后的最大访问速度 **约束限制：** 不涉及 **取值范围：** 0-104857600，单位：Bps **默认取值：** 不涉及
     * @return limitRateValue
     */
    public Integer getLimitRateValue() {
        return limitRateValue;
    }

    public void setLimitRateValue(Integer limitRateValue) {
        this.limitRateValue = limitRateValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestLimitRulesEngine that = (RequestLimitRulesEngine) obj;
        return Objects.equals(this.limitRateAfter, that.limitRateAfter)
            && Objects.equals(this.limitRateValue, that.limitRateValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitRateAfter, limitRateValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestLimitRulesEngine {\n");
        sb.append("    limitRateAfter: ").append(toIndentedString(limitRateAfter)).append("\n");
        sb.append("    limitRateValue: ").append(toIndentedString(limitRateValue)).append("\n");
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
