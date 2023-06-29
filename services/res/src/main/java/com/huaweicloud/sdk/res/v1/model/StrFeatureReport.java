package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 物品离散值类型特征统计
 */
public class StrFeatureReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "str_count")

    private Map<String, Integer> strCount = null;

    public StrFeatureReport withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 特征名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StrFeatureReport withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 特征类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public StrFeatureReport withStrCount(Map<String, Integer> strCount) {
        this.strCount = strCount;
        return this;
    }

    public StrFeatureReport putStrCountItem(String key, Integer strCountItem) {
        if (this.strCount == null) {
            this.strCount = new HashMap<>();
        }
        this.strCount.put(key, strCountItem);
        return this;
    }

    public StrFeatureReport withStrCount(Consumer<Map<String, Integer>> strCountSetter) {
        if (this.strCount == null) {
            this.strCount = new HashMap<>();
        }
        strCountSetter.accept(this.strCount);
        return this;
    }

    /**
     * 离散类型特征出现次数统计。
     * @return strCount
     */
    public Map<String, Integer> getStrCount() {
        return strCount;
    }

    public void setStrCount(Map<String, Integer> strCount) {
        this.strCount = strCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StrFeatureReport that = (StrFeatureReport) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.strCount, that.strCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, strCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StrFeatureReport {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    strCount: ").append(toIndentedString(strCount)).append("\n");
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
