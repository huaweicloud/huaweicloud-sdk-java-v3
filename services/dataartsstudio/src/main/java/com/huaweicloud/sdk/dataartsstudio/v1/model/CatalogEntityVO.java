package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CatalogEntityVO
 */
public class CatalogEntityVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "typeName")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private CatalogAttributeVO attributes;

    public CatalogEntityVO withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称,填写“BusinessCatalog”即可
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public CatalogEntityVO withAttributes(CatalogAttributeVO attributes) {
        this.attributes = attributes;
        return this;
    }

    public CatalogEntityVO withAttributes(Consumer<CatalogAttributeVO> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new CatalogAttributeVO();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public CatalogAttributeVO getAttributes() {
        return attributes;
    }

    public void setAttributes(CatalogAttributeVO attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogEntityVO catalogEntityVO = (CatalogEntityVO) o;
        return Objects.equals(this.typeName, catalogEntityVO.typeName)
            && Objects.equals(this.attributes, catalogEntityVO.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogEntityVO {\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
