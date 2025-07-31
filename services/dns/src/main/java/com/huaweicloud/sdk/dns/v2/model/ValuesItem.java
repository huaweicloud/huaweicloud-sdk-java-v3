package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 版本对象。 **取值范围：** 不涉及。
 */
public class ValuesItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ListApiVersionsItem> values = null;

    public ValuesItem withValues(List<ListApiVersionsItem> values) {
        this.values = values;
        return this;
    }

    public ValuesItem addValuesItem(ListApiVersionsItem valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ValuesItem withValues(Consumer<List<ListApiVersionsItem>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释：** 所有版本列表。 **取值范围：** 不涉及。
     * @return values
     */
    public List<ListApiVersionsItem> getValues() {
        return values;
    }

    public void setValues(List<ListApiVersionsItem> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValuesItem that = (ValuesItem) obj;
        return Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValuesItem {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
