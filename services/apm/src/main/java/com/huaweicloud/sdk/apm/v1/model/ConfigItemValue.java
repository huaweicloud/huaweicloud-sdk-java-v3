package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 采集参数配置列表
 */
public class ConfigItemValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_data_type")

    private String configDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Double minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_values")

    private List<OptionValue> optionValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "since_version")

    private String sinceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_version")

    private String deadVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_array_patterns")

    private List<ObjectArrayPatterns> objectArrayPatterns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override_list")

    private List<ConfigItemOverride> overrideList = null;

    public ConfigItemValue withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配置项名字
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ConfigItemValue withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ConfigItemValue withConfigDataType(String configDataType) {
        this.configDataType = configDataType;
        return this;
    }

    /**
     * 数据类型
     * @return configDataType
     */
    public String getConfigDataType() {
        return configDataType;
    }

    public void setConfigDataType(String configDataType) {
        this.configDataType = configDataType;
    }

    public ConfigItemValue withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 最大长度
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public ConfigItemValue withMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * 最小值
     * @return minValue
     */
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public ConfigItemValue withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值
     * @return maxValue
     */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public ConfigItemValue withOptionValues(List<OptionValue> optionValues) {
        this.optionValues = optionValues;
        return this;
    }

    public ConfigItemValue addOptionValuesItem(OptionValue optionValuesItem) {
        if (this.optionValues == null) {
            this.optionValues = new ArrayList<>();
        }
        this.optionValues.add(optionValuesItem);
        return this;
    }

    public ConfigItemValue withOptionValues(Consumer<List<OptionValue>> optionValuesSetter) {
        if (this.optionValues == null) {
            this.optionValues = new ArrayList<>();
        }
        optionValuesSetter.accept(this.optionValues);
        return this;
    }

    /**
     * 可选值
     * @return optionValues
     */
    public List<OptionValue> getOptionValues() {
        return optionValues;
    }

    public void setOptionValues(List<OptionValue> optionValues) {
        this.optionValues = optionValues;
    }

    public ConfigItemValue withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ConfigItemValue withSinceVersion(String sinceVersion) {
        this.sinceVersion = sinceVersion;
        return this;
    }

    /**
     * 开始版本
     * @return sinceVersion
     */
    public String getSinceVersion() {
        return sinceVersion;
    }

    public void setSinceVersion(String sinceVersion) {
        this.sinceVersion = sinceVersion;
    }

    public ConfigItemValue withDeadVersion(String deadVersion) {
        this.deadVersion = deadVersion;
        return this;
    }

    /**
     * 截至版本
     * @return deadVersion
     */
    public String getDeadVersion() {
        return deadVersion;
    }

    public void setDeadVersion(String deadVersion) {
        this.deadVersion = deadVersion;
    }

    public ConfigItemValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigItemValue withObjectArrayPatterns(List<ObjectArrayPatterns> objectArrayPatterns) {
        this.objectArrayPatterns = objectArrayPatterns;
        return this;
    }

    public ConfigItemValue addObjectArrayPatternsItem(ObjectArrayPatterns objectArrayPatternsItem) {
        if (this.objectArrayPatterns == null) {
            this.objectArrayPatterns = new ArrayList<>();
        }
        this.objectArrayPatterns.add(objectArrayPatternsItem);
        return this;
    }

    public ConfigItemValue withObjectArrayPatterns(Consumer<List<ObjectArrayPatterns>> objectArrayPatternsSetter) {
        if (this.objectArrayPatterns == null) {
            this.objectArrayPatterns = new ArrayList<>();
        }
        objectArrayPatternsSetter.accept(this.objectArrayPatterns);
        return this;
    }

    /**
     * 对象数组
     * @return objectArrayPatterns
     */
    public List<ObjectArrayPatterns> getObjectArrayPatterns() {
        return objectArrayPatterns;
    }

    public void setObjectArrayPatterns(List<ObjectArrayPatterns> objectArrayPatterns) {
        this.objectArrayPatterns = objectArrayPatterns;
    }

    public ConfigItemValue withOverrideList(List<ConfigItemOverride> overrideList) {
        this.overrideList = overrideList;
        return this;
    }

    public ConfigItemValue addOverrideListItem(ConfigItemOverride overrideListItem) {
        if (this.overrideList == null) {
            this.overrideList = new ArrayList<>();
        }
        this.overrideList.add(overrideListItem);
        return this;
    }

    public ConfigItemValue withOverrideList(Consumer<List<ConfigItemOverride>> overrideListSetter) {
        if (this.overrideList == null) {
            this.overrideList = new ArrayList<>();
        }
        overrideListSetter.accept(this.overrideList);
        return this;
    }

    /**
     * 实际生效值
     * @return overrideList
     */
    public List<ConfigItemOverride> getOverrideList() {
        return overrideList;
    }

    public void setOverrideList(List<ConfigItemOverride> overrideList) {
        this.overrideList = overrideList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigItemValue that = (ConfigItemValue) obj;
        return Objects.equals(this.configName, that.configName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.configDataType, that.configDataType)
            && Objects.equals(this.maxLength, that.maxLength) && Objects.equals(this.minValue, that.minValue)
            && Objects.equals(this.maxValue, that.maxValue) && Objects.equals(this.optionValues, that.optionValues)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.sinceVersion, that.sinceVersion)
            && Objects.equals(this.deadVersion, that.deadVersion) && Objects.equals(this.value, that.value)
            && Objects.equals(this.objectArrayPatterns, that.objectArrayPatterns)
            && Objects.equals(this.overrideList, that.overrideList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName,
            displayName,
            configDataType,
            maxLength,
            minValue,
            maxValue,
            optionValues,
            defaultValue,
            sinceVersion,
            deadVersion,
            value,
            objectArrayPatterns,
            overrideList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigItemValue {\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    configDataType: ").append(toIndentedString(configDataType)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    optionValues: ").append(toIndentedString(optionValues)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    sinceVersion: ").append(toIndentedString(sinceVersion)).append("\n");
        sb.append("    deadVersion: ").append(toIndentedString(deadVersion)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    objectArrayPatterns: ").append(toIndentedString(objectArrayPatterns)).append("\n");
        sb.append("    overrideList: ").append(toIndentedString(overrideList)).append("\n");
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
