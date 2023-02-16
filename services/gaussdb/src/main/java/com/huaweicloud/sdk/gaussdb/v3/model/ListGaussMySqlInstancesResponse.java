package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceListInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    
    private List<MysqlInstanceListInfo> instances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListGaussMySqlInstancesResponse withInstances(List<MysqlInstanceListInfo> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListGaussMySqlInstancesResponse addInstancesItem(MysqlInstanceListInfo instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListGaussMySqlInstancesResponse withInstances(Consumer<List<MysqlInstanceListInfo>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例列表信息。
     * @return instances
     */
    public List<MysqlInstanceListInfo> getInstances() {
        return instances;
    }

    public void setInstances(List<MysqlInstanceListInfo> instances) {
        this.instances = instances;
    }

    

    public ListGaussMySqlInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
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
        ListGaussMySqlInstancesResponse listGaussMySqlInstancesResponse = (ListGaussMySqlInstancesResponse) o;
        return Objects.equals(this.instances, listGaussMySqlInstancesResponse.instances) &&
            Objects.equals(this.totalCount, listGaussMySqlInstancesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlInstancesResponse {\n");
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

