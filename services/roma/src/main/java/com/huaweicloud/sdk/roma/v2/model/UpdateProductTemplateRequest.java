package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateProductTemplateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_template_id")
    
    private Integer productTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateProductTemplateRequestBody body;

    public UpdateProductTemplateRequest withInstanceId(String instanceId) {
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

    

    public UpdateProductTemplateRequest withProductTemplateId(Integer productTemplateId) {
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

    

    public UpdateProductTemplateRequest withBody(UpdateProductTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateProductTemplateRequest withBody(Consumer<UpdateProductTemplateRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateProductTemplateRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateProductTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateProductTemplateRequestBody body) {
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
        UpdateProductTemplateRequest updateProductTemplateRequest = (UpdateProductTemplateRequest) o;
        return Objects.equals(this.instanceId, updateProductTemplateRequest.instanceId) &&
            Objects.equals(this.productTemplateId, updateProductTemplateRequest.productTemplateId) &&
            Objects.equals(this.body, updateProductTemplateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productTemplateId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductTemplateRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productTemplateId: ").append(toIndentedString(productTemplateId)).append("\n");
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

