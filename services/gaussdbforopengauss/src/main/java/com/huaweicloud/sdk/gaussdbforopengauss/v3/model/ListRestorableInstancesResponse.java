package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstancesResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRestorableInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    
    private List<InstancesResult> instances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListRestorableInstancesResponse withInstances(List<InstancesResult> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListRestorableInstancesResponse addInstancesItem(InstancesResult instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListRestorableInstancesResponse withInstances(Consumer<List<InstancesResult>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 返回可用于备份恢复的实例列表。
     * @return instances
     */
    public List<InstancesResult> getInstances() {
        return instances;
    }

    public void setInstances(List<InstancesResult> instances) {
        this.instances = instances;
    }

    

    public ListRestorableInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 查询出来的实例总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRestorableInstancesResponse listRestorableInstancesResponse = (ListRestorableInstancesResponse) o;
        return Objects.equals(this.instances, listRestorableInstancesResponse.instances) &&
            Objects.equals(this.totalCount, listRestorableInstancesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestorableInstancesResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

