package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ItemsResponse
 */
public class ItemsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported")

    private Boolean supported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsupported_message")

    private String unsupportedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_price")

    private List<ResourcePriceResponse> resourcePrice = null;

    public ItemsResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源的类型  以HCL格式的模板为例，resource_type 为 huaweicloud_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_type 为 huaweicloud_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
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
     * 资源的名称，默认为资源的逻辑名称  以HCL格式的模板为例，resource_name 为 my_hello_world_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_name 为 my_hello_world_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
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
     * 资源的索引，若用户在模板中使用了count或for_each则会返回index。若index出现，则resource_name + index可以作为该资源的一种标识  若用户在模板中使用count，则index为从0开始的数字  以HCL格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[0]`和`huaweicloud_vpc.my_hello_world_vpc[1]`标识两个资源  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   count = 2   name = \"test_vpc\" } ```  以json格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[0]`和`huaweicloud_vpc.my_hello_world_vpc[1]`标识两个资源  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\",         \"count\": 2       }     }   } } ```  若用户在模板中使用for_each，则index为用户自定义的字符串  以HCL格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[\"vpc1\"]`和`huaweicloud_vpc.my_hello_world_vpc[\"vpc2\"]`标识两个资源  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   for_each = {     \"vpc1\" = \"test_vpc\"     \"vpc2\" = \"test_vpc\"   }   name = each.value } ```  以json格式的模板为例，用户在模板中可以通过`huaweicloud_vpc.my_hello_world_vpc[\"vpc1\"]`和`huaweicloud_vpc.my_hello_world_vpc[\"vpc2\"]`标识两个资源  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"for_each\": {           \"vpc1\": \"test_vpc\",           \"vpc2\": \"test_vpc\"         }         \"name\": \"${each.value}\"       }     }   } } ```
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
     * 该资源或该资源当前所给予的参数是否支持进行询价
     * @return supported
     */
    public Boolean getSupported() {
        return supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    public ItemsResponse withUnsupportedMessage(String unsupportedMessage) {
        this.unsupportedMessage = unsupportedMessage;
        return this;
    }

    /**
     * 该资源不支持询价的具体原因
     * @return unsupportedMessage
     */
    public String getUnsupportedMessage() {
        return unsupportedMessage;
    }

    public void setUnsupportedMessage(String unsupportedMessage) {
        this.unsupportedMessage = unsupportedMessage;
    }

    public ItemsResponse withResourcePrice(List<ResourcePriceResponse> resourcePrice) {
        this.resourcePrice = resourcePrice;
        return this;
    }

    public ItemsResponse addResourcePriceItem(ResourcePriceResponse resourcePriceItem) {
        if (this.resourcePrice == null) {
            this.resourcePrice = new ArrayList<>();
        }
        this.resourcePrice.add(resourcePriceItem);
        return this;
    }

    public ItemsResponse withResourcePrice(Consumer<List<ResourcePriceResponse>> resourcePriceSetter) {
        if (this.resourcePrice == null) {
            this.resourcePrice = new ArrayList<>();
        }
        resourcePriceSetter.accept(this.resourcePrice);
        return this;
    }

    /**
     * 该资源的询价信息  若该资源支持包周期计费或按需计费，或者该资源为免费资源，则返回该字段；若该资源不支持询价，则不返回该字段。
     * @return resourcePrice
     */
    public List<ResourcePriceResponse> getResourcePrice() {
        return resourcePrice;
    }

    public void setResourcePrice(List<ResourcePriceResponse> resourcePrice) {
        this.resourcePrice = resourcePrice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemsResponse that = (ItemsResponse) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.index, that.index)
            && Objects.equals(this.supported, that.supported)
            && Objects.equals(this.unsupportedMessage, that.unsupportedMessage)
            && Objects.equals(this.resourcePrice, that.resourcePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceName, index, supported, unsupportedMessage, resourcePrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemsResponse {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    unsupportedMessage: ").append(toIndentedString(unsupportedMessage)).append("\n");
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
