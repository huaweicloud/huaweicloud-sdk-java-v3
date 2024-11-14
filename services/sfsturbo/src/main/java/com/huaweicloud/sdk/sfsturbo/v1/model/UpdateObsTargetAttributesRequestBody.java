package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新后端存储属性请求体
 */
public class UpdateObsTargetAttributesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private ObsTargetAttributes attributes;

    public UpdateObsTargetAttributesRequestBody withAttributes(ObsTargetAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public UpdateObsTargetAttributesRequestBody withAttributes(Consumer<ObsTargetAttributes> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ObsTargetAttributes();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public ObsTargetAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ObsTargetAttributes attributes) {
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
        UpdateObsTargetAttributesRequestBody that = (UpdateObsTargetAttributesRequestBody) obj;
        return Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateObsTargetAttributesRequestBody {\n");
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
