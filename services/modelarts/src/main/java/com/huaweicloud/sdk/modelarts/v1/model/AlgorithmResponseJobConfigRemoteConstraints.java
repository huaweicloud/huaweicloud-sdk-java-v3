package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlgorithmResponseJobConfigRemoteConstraints
 */
public class AlgorithmResponseJobConfigRemoteConstraints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<Map<String, String>> attributes = null;

    public AlgorithmResponseJobConfigRemoteConstraints withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据输入类型，包括数据存储位置、数据集两种方式。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public AlgorithmResponseJobConfigRemoteConstraints withAttributes(List<Map<String, String>> attributes) {
        this.attributes = attributes;
        return this;
    }

    public AlgorithmResponseJobConfigRemoteConstraints addAttributesItem(Map<String, String> attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public AlgorithmResponseJobConfigRemoteConstraints withAttributes(
        Consumer<List<Map<String, String>>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 数据输入为数据集时的相关属性。枚举值：   - data_format数据格式。   - data_segmentation数据切分方式。   - dataset_type标注类型。
     * @return attributes
     */
    public List<Map<String, String>> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Map<String, String>> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmResponseJobConfigRemoteConstraints that = (AlgorithmResponseJobConfigRemoteConstraints) obj;
        return Objects.equals(this.dataType, that.dataType) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseJobConfigRemoteConstraints {\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
