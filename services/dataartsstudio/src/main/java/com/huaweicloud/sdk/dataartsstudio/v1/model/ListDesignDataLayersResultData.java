package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接口返回的数据。
 */
public class ListDesignDataLayersResultData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<DataLayerVO> value = null;

    public ListDesignDataLayersResultData withValue(List<DataLayerVO> value) {
        this.value = value;
        return this;
    }

    public ListDesignDataLayersResultData addValueItem(DataLayerVO valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public ListDesignDataLayersResultData withValue(Consumer<List<DataLayerVO>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 数仓分层数组。
     * @return value
     */
    public List<DataLayerVO> getValue() {
        return value;
    }

    public void setValue(List<DataLayerVO> value) {
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
        ListDesignDataLayersResultData that = (ListDesignDataLayersResultData) obj;
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesignDataLayersResultData {\n");
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
