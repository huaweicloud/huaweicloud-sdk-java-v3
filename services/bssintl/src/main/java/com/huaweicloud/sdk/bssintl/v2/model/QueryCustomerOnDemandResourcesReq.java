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
 * QueryCustomerOnDemandResourcesReq
 */
public class QueryCustomerOnDemandResourcesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time_begin")
    
    private String effectiveTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time_end")
    
    private String effectiveTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public QueryCustomerOnDemandResourcesReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：所属的客户ID。| |参数约束及描述：所属的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public QueryCustomerOnDemandResourcesReq withEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
        return this;
    }

    


    /**
     * |参数名称：生效时间的开始时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：生效时间的开始时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return effectiveTimeBegin
     */
    public String getEffectiveTimeBegin() {
        return effectiveTimeBegin;
    }

    public void setEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
    }

    public QueryCustomerOnDemandResourcesReq withEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }

    


    /**
     * |参数名称：生效时间的结束时间UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：生效时间的结束时间UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return effectiveTimeEnd
     */
    public String getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public QueryCustomerOnDemandResourcesReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级经销商ID，如果想查询二级经销商的子客户的资源列表，必须携带该字段，否则只能查询自己的子客户的按需资源| |参数约束及描述：二级经销商ID，如果想查询二级经销商的子客户的资源列表，必须携带该字段，否则只能查询自己的子客户的按需资源|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public QueryCustomerOnDemandResourcesReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * |参数名称：一次查询的条数，默认10条。| |参数的约束及描述：一次查询的条数，默认10条。|
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryCustomerOnDemandResourcesReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * |参数名称：偏移量，从0开始。默认值：0| |参数的约束及描述：偏移量，从0开始。默认值：0|
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryCustomerOnDemandResourcesReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。| |参数约束及描述：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public QueryCustomerOnDemandResourcesReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public QueryCustomerOnDemandResourcesReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public QueryCustomerOnDemandResourcesReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null ){
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID批量查询| |参数约束以及描述：用于查询指定资源ID对应的资源。最多支持同时传递50个Id的列表。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public QueryCustomerOnDemandResourcesReq withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public QueryCustomerOnDemandResourcesReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * |参数名称：资源状态：1：正常（已开通）；2：宽限期；3：冻结中；4：变更中；5：正在关闭；6：已关闭。| |参数的约束及描述：资源状态：1：正常（已开通）；2：宽限期；3：冻结中；4：变更中；5：正在关闭；6：已关闭。|
     * minimum: 1
     * maximum: 6
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCustomerOnDemandResourcesReq queryCustomerOnDemandResourcesReq = (QueryCustomerOnDemandResourcesReq) o;
        return Objects.equals(this.customerId, queryCustomerOnDemandResourcesReq.customerId) &&
            Objects.equals(this.effectiveTimeBegin, queryCustomerOnDemandResourcesReq.effectiveTimeBegin) &&
            Objects.equals(this.effectiveTimeEnd, queryCustomerOnDemandResourcesReq.effectiveTimeEnd) &&
            Objects.equals(this.indirectPartnerId, queryCustomerOnDemandResourcesReq.indirectPartnerId) &&
            Objects.equals(this.limit, queryCustomerOnDemandResourcesReq.limit) &&
            Objects.equals(this.offset, queryCustomerOnDemandResourcesReq.offset) &&
            Objects.equals(this.regionCode, queryCustomerOnDemandResourcesReq.regionCode) &&
            Objects.equals(this.resourceIds, queryCustomerOnDemandResourcesReq.resourceIds) &&
            Objects.equals(this.serviceTypeCode, queryCustomerOnDemandResourcesReq.serviceTypeCode) &&
            Objects.equals(this.status, queryCustomerOnDemandResourcesReq.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, effectiveTimeBegin, effectiveTimeEnd, indirectPartnerId, limit, offset, regionCode, resourceIds, serviceTypeCode, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCustomerOnDemandResourcesReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    effectiveTimeBegin: ").append(toIndentedString(effectiveTimeBegin)).append("\n");
        sb.append("    effectiveTimeEnd: ").append(toIndentedString(effectiveTimeEnd)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

