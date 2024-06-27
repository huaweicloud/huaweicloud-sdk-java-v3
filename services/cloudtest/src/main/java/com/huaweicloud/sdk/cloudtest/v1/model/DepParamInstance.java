package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DepParamInstance
 */
public class DepParamInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compareValue")

    private String compareValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison")

    private String comparison;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private Boolean condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inValidValues")

    private List<String> inValidValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullInfo")

    private String nullInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationMap")

    private Map<String, String> relationMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationNum")

    private Integer relationNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public DepParamInstance withCompareValue(String compareValue) {
        this.compareValue = compareValue;
        return this;
    }

    /**
     * 比较值
     * @return compareValue
     */
    public String getCompareValue() {
        return compareValue;
    }

    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    public DepParamInstance withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * 比较
     * @return comparison
     */
    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public DepParamInstance withCondition(Boolean condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 条件
     * @return condition
     */
    public Boolean getCondition() {
        return condition;
    }

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }

    public DepParamInstance withInValidValues(List<String> inValidValues) {
        this.inValidValues = inValidValues;
        return this;
    }

    public DepParamInstance addInValidValuesItem(String inValidValuesItem) {
        if (this.inValidValues == null) {
            this.inValidValues = new ArrayList<>();
        }
        this.inValidValues.add(inValidValuesItem);
        return this;
    }

    public DepParamInstance withInValidValues(Consumer<List<String>> inValidValuesSetter) {
        if (this.inValidValues == null) {
            this.inValidValues = new ArrayList<>();
        }
        inValidValuesSetter.accept(this.inValidValues);
        return this;
    }

    /**
     * 无效值列表
     * @return inValidValues
     */
    public List<String> getInValidValues() {
        return inValidValues;
    }

    public void setInValidValues(List<String> inValidValues) {
        this.inValidValues = inValidValues;
    }

    public DepParamInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepParamInstance withNullInfo(String nullInfo) {
        this.nullInfo = nullInfo;
        return this;
    }

    /**
     * 空值信息
     * @return nullInfo
     */
    public String getNullInfo() {
        return nullInfo;
    }

    public void setNullInfo(String nullInfo) {
        this.nullInfo = nullInfo;
    }

    public DepParamInstance withRelationMap(Map<String, String> relationMap) {
        this.relationMap = relationMap;
        return this;
    }

    public DepParamInstance putRelationMapItem(String key, String relationMapItem) {
        if (this.relationMap == null) {
            this.relationMap = new HashMap<>();
        }
        this.relationMap.put(key, relationMapItem);
        return this;
    }

    public DepParamInstance withRelationMap(Consumer<Map<String, String>> relationMapSetter) {
        if (this.relationMap == null) {
            this.relationMap = new HashMap<>();
        }
        relationMapSetter.accept(this.relationMap);
        return this;
    }

    /**
     * 关系映射，key为整数，value为字符串
     * @return relationMap
     */
    public Map<String, String> getRelationMap() {
        return relationMap;
    }

    public void setRelationMap(Map<String, String> relationMap) {
        this.relationMap = relationMap;
    }

    public DepParamInstance withRelationNum(Integer relationNum) {
        this.relationNum = relationNum;
        return this;
    }

    /**
     * 关系数量
     * @return relationNum
     */
    public Integer getRelationNum() {
        return relationNum;
    }

    public void setRelationNum(Integer relationNum) {
        this.relationNum = relationNum;
    }

    public DepParamInstance withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public DepParamInstance addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public DepParamInstance withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值列表
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
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
        DepParamInstance that = (DepParamInstance) obj;
        return Objects.equals(this.compareValue, that.compareValue) && Objects.equals(this.comparison, that.comparison)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.inValidValues, that.inValidValues)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nullInfo, that.nullInfo)
            && Objects.equals(this.relationMap, that.relationMap) && Objects.equals(this.relationNum, that.relationNum)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(compareValue, comparison, condition, inValidValues, name, nullInfo, relationMap, relationNum, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepParamInstance {\n");
        sb.append("    compareValue: ").append(toIndentedString(compareValue)).append("\n");
        sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    inValidValues: ").append(toIndentedString(inValidValues)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nullInfo: ").append(toIndentedString(nullInfo)).append("\n");
        sb.append("    relationMap: ").append(toIndentedString(relationMap)).append("\n");
        sb.append("    relationNum: ").append(toIndentedString(relationNum)).append("\n");
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
