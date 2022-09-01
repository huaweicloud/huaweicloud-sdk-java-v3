package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAttributeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_id")

    @JacksonXmlProperty(localName = "attribute_id")

    private Long attributeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private AddOrModifyAttributeReq body;

    public UpdateAttributeRequest withAttributeId(Long attributeId) {
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

    public UpdateAttributeRequest withBody(AddOrModifyAttributeReq body) {
        this.body = body;
        return this;
    }

    public UpdateAttributeRequest withBody(Consumer<AddOrModifyAttributeReq> bodySetter) {
        if (this.body == null) {
            this.body = new AddOrModifyAttributeReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddOrModifyAttributeReq getBody() {
        return body;
    }

    public void setBody(AddOrModifyAttributeReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAttributeRequest updateAttributeRequest = (UpdateAttributeRequest) o;
        return Objects.equals(this.attributeId, updateAttributeRequest.attributeId)
            && Objects.equals(this.body, updateAttributeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAttributeRequest {\n");
        sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
