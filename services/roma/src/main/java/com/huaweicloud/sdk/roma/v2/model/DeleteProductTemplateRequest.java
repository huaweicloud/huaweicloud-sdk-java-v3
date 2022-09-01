package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteProductTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_template_id")

    @JacksonXmlProperty(localName = "product_template_id")

    private Integer productTemplateId;

    public DeleteProductTemplateRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteProductTemplateRequest withProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
        return this;
    }

    /**
     * 产品模板ID
     * minimum: 0
     * maximum: 200376420520689663
     * @return productTemplateId
     */
    public Integer getProductTemplateId() {
        return productTemplateId;
    }

    public void setProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteProductTemplateRequest deleteProductTemplateRequest = (DeleteProductTemplateRequest) o;
        return Objects.equals(this.instanceId, deleteProductTemplateRequest.instanceId)
            && Objects.equals(this.productTemplateId, deleteProductTemplateRequest.productTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteProductTemplateRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productTemplateId: ").append(toIndentedString(productTemplateId)).append("\n");
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
