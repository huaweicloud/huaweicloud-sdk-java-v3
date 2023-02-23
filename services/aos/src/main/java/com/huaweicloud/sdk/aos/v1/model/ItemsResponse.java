package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ResourcePriceResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * items response
 */
public class ItemsResponse  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="supported")
    

    private Boolean supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_price")
    
    private List<ResourcePriceResponse> resourcePrice = null;
    
    public ItemsResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 执行计划中的资源类型，如：huaweicloud_evs_volume
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public ItemsResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 执行计划中的用户定义的资源的名字，如：my_volume
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public ItemsResponse withIndex(String index) {
        this.index = index;
        return this;
    }

    


    /**
     * 使用count构建的资源时资源对应的index
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    

    public ItemsResponse withSupported(Boolean supported) {
        this.supported = supported;
        return this;
    }

    


    /**
     * 执行计划中的资源是否支持询价
     * @return supported
     */
    public Boolean getSupported() {
        return supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    

    public ItemsResponse withResourcePrice(List<ResourcePriceResponse> resourcePrice) {
        this.resourcePrice = resourcePrice;
        return this;
    }

    
    public ItemsResponse addResourcePriceItem(ResourcePriceResponse resourcePriceItem) {
        if(this.resourcePrice == null) {
            this.resourcePrice = new ArrayList<>();
        }
        this.resourcePrice.add(resourcePriceItem);
        return this;
    }

    public ItemsResponse withResourcePrice(Consumer<List<ResourcePriceResponse>> resourcePriceSetter) {
        if(this.resourcePrice == null) {
            this.resourcePrice = new ArrayList<>();
        }
        resourcePriceSetter.accept(this.resourcePrice);
        return this;
    }

    /**
     * 执行计划中的每个资源部署后的总的询价信息，如果该资源询价结果包含不同的period_type，则询价结果根据period_type类型展示总价。 包周期计费和按需计费返回，免费和不支持询价的资源不返回
     * @return resourcePrice
     */
    public List<ResourcePriceResponse> getResourcePrice() {
        return resourcePrice;
    }

    public void setResourcePrice(List<ResourcePriceResponse> resourcePrice) {
        this.resourcePrice = resourcePrice;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemsResponse itemsResponse = (ItemsResponse) o;
        return Objects.equals(this.resourceType, itemsResponse.resourceType) &&
            Objects.equals(this.resourceName, itemsResponse.resourceName) &&
            Objects.equals(this.index, itemsResponse.index) &&
            Objects.equals(this.supported, itemsResponse.supported) &&
            Objects.equals(this.resourcePrice, itemsResponse.resourcePrice);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceName, index, supported, resourcePrice);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemsResponse {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    resourcePrice: ").append(toIndentedString(resourcePrice)).append("\n");
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

