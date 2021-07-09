package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.QueryAvailableRdsList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAvailableRdsListResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private List<QueryAvailableRdsList> instances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListAvailableRdsListResponse withInstances(List<QueryAvailableRdsList> instances) {
        this.instances = instances;
        return this;
    }

    
    public ListAvailableRdsListResponse addInstancesItem(QueryAvailableRdsList instancesItem) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListAvailableRdsListResponse withInstances(Consumer<List<QueryAvailableRdsList>> instancesSetter) {
        if(this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 获取创建逻辑库可用数据库实例信息列表的集合。
     * @return instances
     */
    public List<QueryAvailableRdsList> getInstances() {
        return instances;
    }

    public void setInstances(List<QueryAvailableRdsList> instances) {
        this.instances = instances;
    }

    

    public ListAvailableRdsListResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页参数: 起始值。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListAvailableRdsListResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 分页参数：每页多少条。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListAvailableRdsListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 集合总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableRdsListResponse listAvailableRdsListResponse = (ListAvailableRdsListResponse) o;
        return Objects.equals(this.instances, listAvailableRdsListResponse.instances) &&
            Objects.equals(this.offset, listAvailableRdsListResponse.offset) &&
            Objects.equals(this.limit, listAvailableRdsListResponse.limit) &&
            Objects.equals(this.total, listAvailableRdsListResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instances, offset, limit, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableRdsListResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

