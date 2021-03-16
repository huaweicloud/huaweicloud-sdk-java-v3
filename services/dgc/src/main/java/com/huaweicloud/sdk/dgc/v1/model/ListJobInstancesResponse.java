package com.huaweicloud.sdk.dgc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.JobInstance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJobInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<JobInstance> instances = null;
    
    public ListJobInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListJobInstancesResponse withInstances(List<JobInstance> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListJobInstancesResponse addInstancesItem(JobInstance instancesItem) {
        this.instances.add(instancesItem);
        return this;
    }

    public ListJobInstancesResponse withInstances(Consumer<List<JobInstance>> instancesSetter) {
        if(this.instances == null ){
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * Get instances
     * @return instances
     */
    public List<JobInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<JobInstance> instances) {
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
        ListJobInstancesResponse listJobInstancesResponse = (ListJobInstancesResponse) o;
        return Objects.equals(this.total, listJobInstancesResponse.total) &&
            Objects.equals(this.instances, listJobInstancesResponse.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobInstancesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

