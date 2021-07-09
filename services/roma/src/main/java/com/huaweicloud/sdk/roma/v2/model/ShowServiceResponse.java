package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowServiceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_template_id")
    
    private Integer productTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private Integer serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private Long lastUpdatedDatetime;

    public ShowServiceResponse withProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
        return this;
    }

    


    /**
     * 服务归属的产品模板ID
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

    

    public ShowServiceResponse withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 服务归属的产品ID
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

    

    public ShowServiceResponse withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 服务ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    

    public ShowServiceResponse withServiceName(String serviceName) {
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

    

    public ShowServiceResponse withDescription(String description) {
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

    

    public ShowServiceResponse withStatus(Integer status) {
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

    

    public ShowServiceResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public ShowServiceResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }
        
        return this;
    }


    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    

    public ShowServiceResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public ShowServiceResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }
        
        return this;
    }


    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    

    public ShowServiceResponse withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    

    public ShowServiceResponse withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServiceResponse showServiceResponse = (ShowServiceResponse) o;
        return Objects.equals(this.productTemplateId, showServiceResponse.productTemplateId) &&
            Objects.equals(this.productId, showServiceResponse.productId) &&
            Objects.equals(this.serviceId, showServiceResponse.serviceId) &&
            Objects.equals(this.serviceName, showServiceResponse.serviceName) &&
            Objects.equals(this.description, showServiceResponse.description) &&
            Objects.equals(this.status, showServiceResponse.status) &&
            Objects.equals(this.createdUser, showServiceResponse.createdUser) &&
            Objects.equals(this.lastUpdatedUser, showServiceResponse.lastUpdatedUser) &&
            Objects.equals(this.createdDatetime, showServiceResponse.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, showServiceResponse.lastUpdatedDatetime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productTemplateId, productId, serviceId, serviceName, description, status, createdUser, lastUpdatedUser, createdDatetime, lastUpdatedDatetime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServiceResponse {\n");
        sb.append("    productTemplateId: ").append(toIndentedString(productTemplateId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
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

