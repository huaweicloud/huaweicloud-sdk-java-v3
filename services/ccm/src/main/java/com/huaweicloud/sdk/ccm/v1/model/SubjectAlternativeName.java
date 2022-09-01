package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SubjectAlternativeName
 */
public class SubjectAlternativeName {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    public SubjectAlternativeName withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 备用名称类型，当前仅支持DNS、IP、EMAIL、URI。 - **DNS** - **IP** - **EMAIL** - **URI**
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubjectAlternativeName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 对应备用名称类型的值。   - DNS类型，长度为不超过253；   - IP类型，长度不超过39，支持IPV4、IPV6；   - EMAIL类型，长度不超过256；   - URI类型，长度不超过253。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubjectAlternativeName subjectAlternativeName = (SubjectAlternativeName) o;
        return Objects.equals(this.type, subjectAlternativeName.type)
            && Objects.equals(this.value, subjectAlternativeName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubjectAlternativeName {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
