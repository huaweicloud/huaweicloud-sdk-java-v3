package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisableAttributeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_id")

    @JacksonXmlProperty(localName = "attribute_id")

    private Long attributeId;

    public DisableAttributeRequest withAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    /**
     * 自定义属性标识
     * minimum: 0
     * @return attributeId
     */
    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisableAttributeRequest disableAttributeRequest = (DisableAttributeRequest) o;
        return Objects.equals(this.attributeId, disableAttributeRequest.attributeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableAttributeRequest {\n");
        sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
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
