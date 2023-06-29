package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StyleExtraMetaEditComponents
 */
public class StyleExtraMetaEditComponents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additionalProperties")

    private StyleExtraMetaAdditionalProperties additionalProperties;

    public StyleExtraMetaEditComponents withAdditionalProperties(
        StyleExtraMetaAdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    public StyleExtraMetaEditComponents withAdditionalProperties(
        Consumer<StyleExtraMetaAdditionalProperties> additionalPropertiesSetter) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new StyleExtraMetaAdditionalProperties();
            additionalPropertiesSetter.accept(this.additionalProperties);
        }

        return this;
    }

    /**
     * Get additionalProperties
     * @return additionalProperties
     */
    public StyleExtraMetaAdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(StyleExtraMetaAdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StyleExtraMetaEditComponents that = (StyleExtraMetaEditComponents) obj;
        return Objects.equals(this.additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMetaEditComponents {\n");
        sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
