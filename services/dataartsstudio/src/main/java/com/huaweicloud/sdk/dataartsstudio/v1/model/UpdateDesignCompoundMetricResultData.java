package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新复合指标的返回结果，成功的个数。
 */
public class UpdateDesignCompoundMetricResultData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private CompoundMetricVO value;

    public UpdateDesignCompoundMetricResultData withValue(CompoundMetricVO value) {
        this.value = value;
        return this;
    }

    public UpdateDesignCompoundMetricResultData withValue(Consumer<CompoundMetricVO> valueSetter) {
        if (this.value == null) {
            this.value = new CompoundMetricVO();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public CompoundMetricVO getValue() {
        return value;
    }

    public void setValue(CompoundMetricVO value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDesignCompoundMetricResultData that = (UpdateDesignCompoundMetricResultData) obj;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesignCompoundMetricResultData {\n");
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
