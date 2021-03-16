package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.InstanceListInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_num")
    
    private Integer instanceNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<InstanceListInfo> instances = null;
    
    public ListInstancesResponse withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    


    /**
     * 实例个数。
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    

    public ListInstancesResponse withInstances(List<InstanceListInfo> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListInstancesResponse addInstancesItem(InstanceListInfo instancesItem) {
        this.instances.add(instancesItem);
        return this;
    }

    public ListInstancesResponse withInstances(Consumer<List<InstanceListInfo>> instancesSetter) {
        if(this.instances == null ){
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例的详情数组。
     * @return instances
     */
    public List<InstanceListInfo> getInstances() {
        return instances;
    }

    public void setInstances(List<InstanceListInfo> instances) {
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
        return Objects.equals(this.instanceNum, listInstancesResponse.instanceNum) &&
            Objects.equals(this.instances, listInstancesResponse.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceNum, instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResponse {\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
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

