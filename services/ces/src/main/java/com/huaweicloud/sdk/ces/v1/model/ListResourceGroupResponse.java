package com.huaweicloud.sdk.ces.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.ResourceGroupInfo;
import com.huaweicloud.sdk.ces.v1.model.TotalMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResourceGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_groups")
    
    private List<ResourceGroupInfo> resourceGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private TotalMetaData metaData = null;

    public ListResourceGroupResponse withResourceGroups(List<ResourceGroupInfo> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    
    public ListResourceGroupResponse addResourceGroupsItem(ResourceGroupInfo resourceGroupsItem) {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ArrayList<>();
        }
        this.resourceGroups.add(resourceGroupsItem);
        return this;
    }

    public ListResourceGroupResponse withResourceGroups(Consumer<List<ResourceGroupInfo>> resourceGroupsSetter) {
        if(this.resourceGroups == null ){
            this.resourceGroups = new ArrayList<>();
        }
        resourceGroupsSetter.accept(this.resourceGroups);
        return this;
    }

    /**
     * 一个或者多个资源分组信息。
     * @return resourceGroups
     */
    public List<ResourceGroupInfo> getResourceGroups() {
        return resourceGroups;
    }

    public void setResourceGroups(List<ResourceGroupInfo> resourceGroups) {
        this.resourceGroups = resourceGroups;
    }

    public ListResourceGroupResponse withMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListResourceGroupResponse withMetaData(Consumer<TotalMetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new TotalMetaData();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public TotalMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceGroupResponse listResourceGroupResponse = (ListResourceGroupResponse) o;
        return Objects.equals(this.resourceGroups, listResourceGroupResponse.resourceGroups) &&
            Objects.equals(this.metaData, listResourceGroupResponse.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceGroups, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceGroupResponse {\n");
        sb.append("    resourceGroups: ").append(toIndentedString(resourceGroups)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

