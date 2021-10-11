package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UploadProtocolMappingsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UploadProtocolMappingsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private UploadProtocolMappingsRequestBody body;

    public UploadProtocolMappingsRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public UploadProtocolMappingsRequest withBody(UploadProtocolMappingsRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadProtocolMappingsRequest withBody(Consumer<UploadProtocolMappingsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UploadProtocolMappingsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UploadProtocolMappingsRequestBody getBody() {
        return body;
    }

    public void setBody(UploadProtocolMappingsRequestBody body) {
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
        UploadProtocolMappingsRequest uploadProtocolMappingsRequest = (UploadProtocolMappingsRequest) o;
        return Objects.equals(this.productId, uploadProtocolMappingsRequest.productId) &&
            Objects.equals(this.body, uploadProtocolMappingsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadProtocolMappingsRequest {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

