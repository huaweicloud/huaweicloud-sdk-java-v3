package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SkewedInfo
 */
public class SkewedInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skewed_column_names")

    private List<String> skewedColumnNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skewed_column_value_location_maps")

    private Map<String, String> skewedColumnValueLocationMaps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skewed_column_values")

    private List<List<String>> skewedColumnValues = null;

    public SkewedInfo withSkewedColumnNames(List<String> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
        return this;
    }

    public SkewedInfo addSkewedColumnNamesItem(String skewedColumnNamesItem) {
        if (this.skewedColumnNames == null) {
            this.skewedColumnNames = new ArrayList<>();
        }
        this.skewedColumnNames.add(skewedColumnNamesItem);
        return this;
    }

    public SkewedInfo withSkewedColumnNames(Consumer<List<String>> skewedColumnNamesSetter) {
        if (this.skewedColumnNames == null) {
            this.skewedColumnNames = new ArrayList<>();
        }
        skewedColumnNamesSetter.accept(this.skewedColumnNames);
        return this;
    }

    /**
     * 数据偏移列的列表
     * @return skewedColumnNames
     */
    public List<String> getSkewedColumnNames() {
        return skewedColumnNames;
    }

    public void setSkewedColumnNames(List<String> skewedColumnNames) {
        this.skewedColumnNames = skewedColumnNames;
    }

    public SkewedInfo withSkewedColumnValueLocationMaps(Map<String, String> skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        return this;
    }

    public SkewedInfo putSkewedColumnValueLocationMapsItem(String key, String skewedColumnValueLocationMapsItem) {
        if (this.skewedColumnValueLocationMaps == null) {
            this.skewedColumnValueLocationMaps = new HashMap<>();
        }
        this.skewedColumnValueLocationMaps.put(key, skewedColumnValueLocationMapsItem);
        return this;
    }

    public SkewedInfo withSkewedColumnValueLocationMaps(
        Consumer<Map<String, String>> skewedColumnValueLocationMapsSetter) {
        if (this.skewedColumnValueLocationMaps == null) {
            this.skewedColumnValueLocationMaps = new HashMap<>();
        }
        skewedColumnValueLocationMapsSetter.accept(this.skewedColumnValueLocationMaps);
        return this;
    }

    /**
     * 偏斜值和地址的映射关系.
     * @return skewedColumnValueLocationMaps
     */
    public Map<String, String> getSkewedColumnValueLocationMaps() {
        return skewedColumnValueLocationMaps;
    }

    public void setSkewedColumnValueLocationMaps(Map<String, String> skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
    }

    public SkewedInfo withSkewedColumnValues(List<List<String>> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
        return this;
    }

    public SkewedInfo addSkewedColumnValuesItem(List<String> skewedColumnValuesItem) {
        if (this.skewedColumnValues == null) {
            this.skewedColumnValues = new ArrayList<>();
        }
        this.skewedColumnValues.add(skewedColumnValuesItem);
        return this;
    }

    public SkewedInfo withSkewedColumnValues(Consumer<List<List<String>>> skewedColumnValuesSetter) {
        if (this.skewedColumnValues == null) {
            this.skewedColumnValues = new ArrayList<>();
        }
        skewedColumnValuesSetter.accept(this.skewedColumnValues);
        return this;
    }

    /**
     * 偏斜值的列表.
     * @return skewedColumnValues
     */
    public List<List<String>> getSkewedColumnValues() {
        return skewedColumnValues;
    }

    public void setSkewedColumnValues(List<List<String>> skewedColumnValues) {
        this.skewedColumnValues = skewedColumnValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkewedInfo skewedInfo = (SkewedInfo) o;
        return Objects.equals(this.skewedColumnNames, skewedInfo.skewedColumnNames)
            && Objects.equals(this.skewedColumnValueLocationMaps, skewedInfo.skewedColumnValueLocationMaps)
            && Objects.equals(this.skewedColumnValues, skewedInfo.skewedColumnValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skewedColumnNames, skewedColumnValueLocationMaps, skewedColumnValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkewedInfo {\n");
        sb.append("    skewedColumnNames: ").append(toIndentedString(skewedColumnNames)).append("\n");
        sb.append("    skewedColumnValueLocationMaps: ")
            .append(toIndentedString(skewedColumnValueLocationMaps))
            .append("\n");
        sb.append("    skewedColumnValues: ").append(toIndentedString(skewedColumnValues)).append("\n");
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
