package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListProductsRespMonthly
 */
public class ListProductsRespMonthly {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ListProductsRespValues1> values = null;

    public ListProductsRespMonthly withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 消息引擎的名称，该字段显示为kafka。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProductsRespMonthly withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 消息引擎的版本。 **取值范围**： - 1.1.0 - 2.3.0 - 2.7
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListProductsRespMonthly withValues(List<ListProductsRespValues1> values) {
        this.values = values;
        return this;
    }

    public ListProductsRespMonthly addValuesItem(ListProductsRespValues1 valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ListProductsRespMonthly withValues(Consumer<List<ListProductsRespValues1>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * **参数解释**： 产品规格列表。
     * @return values
     */
    public List<ListProductsRespValues1> getValues() {
        return values;
    }

    public void setValues(List<ListProductsRespValues1> values) {
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
        ListProductsRespMonthly that = (ListProductsRespMonthly) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRespMonthly {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
