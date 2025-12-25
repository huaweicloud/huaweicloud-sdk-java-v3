package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpensourceCount
 */
public class OpensourceCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high")

    private Integer high;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium")

    private Integer medium;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low")

    private Integer low;

    public OpensourceCount withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * **参数解释**: 危急漏洞数。 **取值范围**: 不涉及。
     * @return critical
     */
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public OpensourceCount withHigh(Integer high) {
        this.high = high;
        return this;
    }

    /**
     * **参数解释**: 高危漏洞数。 **取值范围**: 不涉及。
     * @return high
     */
    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public OpensourceCount withMedium(Integer medium) {
        this.medium = medium;
        return this;
    }

    /**
     * **参数解释**: 中危漏洞数。 **取值范围**: 不涉及。
     * @return medium
     */
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    public OpensourceCount withLow(Integer low) {
        this.low = low;
        return this;
    }

    /**
     * **参数解释**: 低危漏洞数。 **取值范围**: 不涉及。
     * @return low
     */
    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpensourceCount that = (OpensourceCount) obj;
        return Objects.equals(this.critical, that.critical) && Objects.equals(this.high, that.high)
            && Objects.equals(this.medium, that.medium) && Objects.equals(this.low, that.low);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical, high, medium, low);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpensourceCount {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
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
