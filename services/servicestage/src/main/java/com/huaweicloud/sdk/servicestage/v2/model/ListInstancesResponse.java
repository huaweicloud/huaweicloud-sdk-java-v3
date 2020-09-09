package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceListView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<InstanceListView> instances = null;
    
    public ListInstancesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 实例总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInstancesResponse withInstances(List<InstanceListView> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListInstancesResponse addInstancesItem(InstanceListView instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListInstancesResponse withInstances(Consumer<List<InstanceListView>> instancesSetter) {
        if(this.instances == null ){
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例列表。
     * @return instances
     */
    public List<InstanceListView> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceListView> instances) {
        this.instances = instances;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesResponse listInstancesResponse = (ListInstancesResponse) o;
        return Objects.equals(this.count, listInstancesResponse.count) &&
            Objects.equals(this.instances, listInstancesResponse.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

