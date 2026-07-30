package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户输入的数据集
 */
public class AlterDatasetInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_format")

    private DatasetFileFormat datasetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    public AlterDatasetInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据集的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlterDatasetInput withDatasetFormat(DatasetFileFormat datasetFormat) {
        this.datasetFormat = datasetFormat;
        return this;
    }

    public AlterDatasetInput withDatasetFormat(Consumer<DatasetFileFormat> datasetFormatSetter) {
        if (this.datasetFormat == null) {
            this.datasetFormat = new DatasetFileFormat();
            datasetFormatSetter.accept(this.datasetFormat);
        }

        return this;
    }

    /**
     * Get datasetFormat
     * @return datasetFormat
     */
    public DatasetFileFormat getDatasetFormat() {
        return datasetFormat;
    }

    public void setDatasetFormat(DatasetFileFormat datasetFormat) {
        this.datasetFormat = datasetFormat;
    }

    public AlterDatasetInput withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public AlterDatasetInput putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public AlterDatasetInput withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 数据集其他属性
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlterDatasetInput that = (AlterDatasetInput) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.datasetFormat, that.datasetFormat)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, datasetFormat, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlterDatasetInput {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datasetFormat: ").append(toIndentedString(datasetFormat)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
