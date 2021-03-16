package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.TaskMonitorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMonitorInfosResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    private List<TaskMonitorInfo> entities = null;
    
    public ListMonitorInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListMonitorInfosResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 当前页监控信息数量
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListMonitorInfosResponse withEntities(List<TaskMonitorInfo> entities) {
        this.entities = entities;
        return this;
    }

    
    public ListMonitorInfosResponse addEntitiesItem(TaskMonitorInfo entitiesItem) {
        this.entities.add(entitiesItem);
        return this;
    }

    public ListMonitorInfosResponse withEntities(Consumer<List<TaskMonitorInfo>> entitiesSetter) {
        if(this.entities == null ){
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 任务监控信息当前页元素
     * @return entities
     */
    public List<TaskMonitorInfo> getEntities() {
        return entities;
    }

    public void setEntities(List<TaskMonitorInfo> entities) {
        this.entities = entities;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMonitorInfosResponse listMonitorInfosResponse = (ListMonitorInfosResponse) o;
        return Objects.equals(this.total, listMonitorInfosResponse.total) &&
            Objects.equals(this.size, listMonitorInfosResponse.size) &&
            Objects.equals(this.entities, listMonitorInfosResponse.entities);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, entities);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonitorInfosResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

