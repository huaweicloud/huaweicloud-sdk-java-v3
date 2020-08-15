package com.huaweicloud.sdk.bssintl.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryResourcesReq
 */
public class QueryResourcesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="only_main_resource")
    
    private Integer onlyMainResource = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_list")
    
    private List<Integer> statusList = null;
    
    public QueryResourcesReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * |参数名称：每次查询的条数。默认值是10。最大值是500。| |参数的约束及描述：每次查询的条数。默认值是10。最大值是500。|
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryResourcesReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * |参数名称：偏移量，从0开始默认值是0。| |参数的约束及描述：偏移量，从0开始默认值是0。|
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryResourcesReq withOnlyMainResource(Integer onlyMainResource) {
        this.onlyMainResource = onlyMainResource;
        return this;
    }

    


    /**
     * |参数名称：是否只查询主资源。0：查询主资源及附属资源。1：只查询主资源。默认值为0。| |参数的约束及描述：是否只查询主资源。0：查询主资源及附属资源。1：只查询主资源。默认值为0。|
     * minimum: 0
     * maximum: 1
     * @return onlyMainResource
     */
    public Integer getOnlyMainResource() {
        return onlyMainResource;
    }

    public void setOnlyMainResource(Integer onlyMainResource) {
        this.onlyMainResource = onlyMainResource;
    }

    public QueryResourcesReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * |参数名称：订单号。查询指定订单下的资源。| |参数约束及描述：订单号。查询指定订单下的资源。|
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public QueryResourcesReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public QueryResourcesReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public QueryResourcesReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null ){
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID列表。查询指定资源ID的资源（当only_main_resource=0时，查询指定资源及其附属资源）。最大支持50个ID同时作为条件查询。| |参数约束以及描述：资源ID列表。查询指定资源ID的资源（当only_main_resource=0时，查询指定资源及其附属资源）。最大支持50个ID同时作为条件查询。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public QueryResourcesReq withStatusList(List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }

    
    public QueryResourcesReq addStatusListItem(Integer statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public QueryResourcesReq withStatusList(Consumer<List<Integer>> statusListSetter) {
        if(this.statusList == null ){
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * |参数名称：资源状态。查询指定状态的资源。1：初始化2：已生效3：已过期4：已冻结5：宽限期6：冻结中7：冻结恢复中（预留，未启用）8：正在关闭| |参数约束以及描述：资源状态。查询指定状态的资源。1：初始化2：已生效3：已过期4：已冻结5：宽限期6：冻结中7：冻结恢复中（预留，未启用）8：正在关闭|
     * @return statusList
     */
    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryResourcesReq queryResourcesReq = (QueryResourcesReq) o;
        return Objects.equals(this.limit, queryResourcesReq.limit) &&
            Objects.equals(this.offset, queryResourcesReq.offset) &&
            Objects.equals(this.onlyMainResource, queryResourcesReq.onlyMainResource) &&
            Objects.equals(this.orderId, queryResourcesReq.orderId) &&
            Objects.equals(this.resourceIds, queryResourcesReq.resourceIds) &&
            Objects.equals(this.statusList, queryResourcesReq.statusList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, onlyMainResource, orderId, resourceIds, statusList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResourcesReq {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    onlyMainResource: ").append(toIndentedString(onlyMainResource)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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

