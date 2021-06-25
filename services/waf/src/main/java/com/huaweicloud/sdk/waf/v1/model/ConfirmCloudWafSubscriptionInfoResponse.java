package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CloudWafSubscriptioResponseResources;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ConfirmCloudWafSubscriptionInfoResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<CloudWafSubscriptioResponseResources> resources = null;
    
    public ConfirmCloudWafSubscriptionInfoResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 云模式版本，-2：已冻结，-1：未订购，1：基础版，2：专业版，3：企业版，4：旗舰版，22：按需版本
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public ConfirmCloudWafSubscriptionInfoResponse withResources(List<CloudWafSubscriptioResponseResources> resources) {
        this.resources = resources;
        return this;
    }

    
    public ConfirmCloudWafSubscriptionInfoResponse addResourcesItem(CloudWafSubscriptioResponseResources resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ConfirmCloudWafSubscriptionInfoResponse withResources(Consumer<List<CloudWafSubscriptioResponseResources>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<CloudWafSubscriptioResponseResources> getResources() {
        return resources;
    }

    public void setResources(List<CloudWafSubscriptioResponseResources> resources) {
        this.resources = resources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmCloudWafSubscriptionInfoResponse confirmCloudWafSubscriptionInfoResponse = (ConfirmCloudWafSubscriptionInfoResponse) o;
        return Objects.equals(this.type, confirmCloudWafSubscriptionInfoResponse.type) &&
            Objects.equals(this.resources, confirmCloudWafSubscriptionInfoResponse.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmCloudWafSubscriptionInfoResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

