package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateServiceRequestBody
 */
public class CreateServiceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_template_id")
    
    private Integer productTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public CreateServiceRequestBody withProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
        return this;
    }

    


    /**
     * 服务归属的产品模板ID，产品模板ID和产品ID二选一必填，自动向下取整
     * minimum: 1
     * maximum: 999999999999999999
     * @return productTemplateId
     */
    public Integer getProductTemplateId() {
        return productTemplateId;
    }

    public void setProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
    }

    

    public CreateServiceRequestBody withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 服务归属的产品ID，产品模板ID和产品ID二选一必填，自动向下取整
     * minimum: 1
     * maximum: 999999999999999999
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    

    public CreateServiceRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务名称，支持中文,英文大小写，数字，下划线和中划线,长度2-64
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public CreateServiceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 服务描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateServiceRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 服务状态 0-启用 1-停用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServiceRequestBody createServiceRequestBody = (CreateServiceRequestBody) o;
        return Objects.equals(this.productTemplateId, createServiceRequestBody.productTemplateId) &&
            Objects.equals(this.productId, createServiceRequestBody.productId) &&
            Objects.equals(this.serviceName, createServiceRequestBody.serviceName) &&
            Objects.equals(this.description, createServiceRequestBody.description) &&
            Objects.equals(this.status, createServiceRequestBody.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productTemplateId, productId, serviceName, description, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServiceRequestBody {\n");
        sb.append("    productTemplateId: ").append(toIndentedString(productTemplateId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

