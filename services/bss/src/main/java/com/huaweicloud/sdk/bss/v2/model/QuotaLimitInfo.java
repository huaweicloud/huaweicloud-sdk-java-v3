package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QuotaLimitInfo
 */
public class QuotaLimitInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_key")

    @JacksonXmlProperty(localName = "limit_key")

    private String limitKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_values")

    @JacksonXmlProperty(localName = "limit_values")

    private List<LimitValue> limitValues = null;

    public QuotaLimitInfo withLimitKey(String limitKey) {
        this.limitKey = limitKey;
        return this;
    }

    /**
     * 属性key值。
     * @return limitKey
     */
    public String getLimitKey() {
        return limitKey;
    }

    public void setLimitKey(String limitKey) {
        this.limitKey = limitKey;
    }

    public QuotaLimitInfo withLimitValues(List<LimitValue> limitValues) {
        this.limitValues = limitValues;
        return this;
    }

    public QuotaLimitInfo addLimitValuesItem(LimitValue limitValuesItem) {
        if (this.limitValues == null) {
            this.limitValues = new ArrayList<>();
        }
        this.limitValues.add(limitValuesItem);
        return this;
    }

    public QuotaLimitInfo withLimitValues(Consumer<List<LimitValue>> limitValuesSetter) {
        if (this.limitValues == null) {
            this.limitValues = new ArrayList<>();
        }
        limitValuesSetter.accept(this.limitValues);
        return this;
    }

    /**
     * 属性值，具体参见表3。
     * @return limitValues
     */
    public List<LimitValue> getLimitValues() {
        return limitValues;
    }

    public void setLimitValues(List<LimitValue> limitValues) {
        this.limitValues = limitValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaLimitInfo quotaLimitInfo = (QuotaLimitInfo) o;
        return Objects.equals(this.limitKey, quotaLimitInfo.limitKey)
            && Objects.equals(this.limitValues, quotaLimitInfo.limitValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitKey, limitValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaLimitInfo {\n");
        sb.append("    limitKey: ").append(toIndentedString(limitKey)).append("\n");
        sb.append("    limitValues: ").append(toIndentedString(limitValues)).append("\n");
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
