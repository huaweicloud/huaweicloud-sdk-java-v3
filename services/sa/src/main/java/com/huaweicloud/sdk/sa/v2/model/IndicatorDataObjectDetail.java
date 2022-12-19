package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * detail of indicator
 */
public class IndicatorDataObjectDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private CreateIndicatorDetailIndicatorType indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public IndicatorDataObjectDetail withIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    public IndicatorDataObjectDetail withIndicatorType(
        Consumer<CreateIndicatorDetailIndicatorType> indicatorTypeSetter) {
        if (this.indicatorType == null) {
            this.indicatorType = new CreateIndicatorDetailIndicatorType();
            indicatorTypeSetter.accept(this.indicatorType);
        }

        return this;
    }

    /**
     * Get indicatorType
     * @return indicatorType
     */
    public CreateIndicatorDetailIndicatorType getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
    }

    public IndicatorDataObjectDetail withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值，如：ip url domain等
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndicatorDataObjectDetail indicatorDataObjectDetail = (IndicatorDataObjectDetail) o;
        return Objects.equals(this.indicatorType, indicatorDataObjectDetail.indicatorType)
            && Objects.equals(this.value, indicatorDataObjectDetail.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicatorType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorDataObjectDetail {\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
