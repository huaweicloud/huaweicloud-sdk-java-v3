package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceInfoDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlInstanceDetailInfoResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    
    private List<MysqlInstanceInfoDetail> instances = null;
    
    public ListGaussMySqlInstanceDetailInfoResponse withInstances(List<MysqlInstanceInfoDetail> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListGaussMySqlInstanceDetailInfoResponse addInstancesItem(MysqlInstanceInfoDetail instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListGaussMySqlInstanceDetailInfoResponse withInstances(Consumer<List<MysqlInstanceInfoDetail>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例详情。
     * @return instances
     */
    public List<MysqlInstanceInfoDetail> getInstances() {
        return instances;
    }

    public void setInstances(List<MysqlInstanceInfoDetail> instances) {
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
        ListGaussMySqlInstanceDetailInfoResponse listGaussMySqlInstanceDetailInfoResponse = (ListGaussMySqlInstanceDetailInfoResponse) o;
        return Objects.equals(this.instances, listGaussMySqlInstanceDetailInfoResponse.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlInstanceDetailInfoResponse {\n");
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

