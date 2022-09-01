package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CatalogTargetParameters
 */
public class CatalogTargetParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    @JacksonXmlProperty(localName = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private Object metadata;

    public CatalogTargetParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 目标参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatalogTargetParameters withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 目标参数名称展示说明
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CatalogTargetParameters withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 参数展示元数据，比如是否必选，输入框类型等等
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogTargetParameters catalogTargetParameters = (CatalogTargetParameters) o;
        return Objects.equals(this.name, catalogTargetParameters.name)
            && Objects.equals(this.label, catalogTargetParameters.label)
            && Objects.equals(this.metadata, catalogTargetParameters.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, label, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogTargetParameters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
