package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryCustomerOnDemandResourcesReq
 */
public class QueryCustomerOnDemandResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    @JacksonXmlProperty(localName = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    @JacksonXmlProperty(localName = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    @JacksonXmlProperty(localName = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    @JacksonXmlProperty(localName = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_begin")

    @JacksonXmlProperty(localName = "effective_time_begin")

    private String effectiveTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_end")

    @JacksonXmlProperty(localName = "effective_time_end")

    private String effectiveTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    @JacksonXmlProperty(localName = "indirect_partner_id")

    private String indirectPartnerId;

    public QueryCustomerOnDemandResourcesReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。 您可以调用查询客户列表接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public QueryCustomerOnDemandResourcesReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“ap-southeast-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public QueryCustomerOnDemandResourcesReq withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
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
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源ID批量查询。 用于查询指定资源ID对应的资源。 最多支持同时传递50个ID的列表。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public QueryCustomerOnDemandResourcesReq withEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
        return this;
    }

    /**
     * 生效时间的开始时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
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
     * 生效时间的结束时间 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
     * @return effectiveTimeEnd
     */
    public String getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public QueryCustomerOnDemandResourcesReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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

    public QueryCustomerOnDemandResourcesReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 一次查询的条数，默认值为10。
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

    public QueryCustomerOnDemandResourcesReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态： 1：正常（已开通）2：宽限期3：冻结中4：变更中5：正在关闭6：已关闭
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

    public QueryCustomerOnDemandResourcesReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。如果需要查询云经销商子客户的按需资源列表，必须携带该字段，除此之外，此参数不做处理。否则只能查询自己的子客户按需资源。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
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
        return Objects.equals(this.customerId, queryCustomerOnDemandResourcesReq.customerId)
            && Objects.equals(this.regionCode, queryCustomerOnDemandResourcesReq.regionCode)
            && Objects.equals(this.serviceTypeCode, queryCustomerOnDemandResourcesReq.serviceTypeCode)
            && Objects.equals(this.resourceIds, queryCustomerOnDemandResourcesReq.resourceIds)
            && Objects.equals(this.effectiveTimeBegin, queryCustomerOnDemandResourcesReq.effectiveTimeBegin)
            && Objects.equals(this.effectiveTimeEnd, queryCustomerOnDemandResourcesReq.effectiveTimeEnd)
            && Objects.equals(this.offset, queryCustomerOnDemandResourcesReq.offset)
            && Objects.equals(this.limit, queryCustomerOnDemandResourcesReq.limit)
            && Objects.equals(this.status, queryCustomerOnDemandResourcesReq.status)
            && Objects.equals(this.indirectPartnerId, queryCustomerOnDemandResourcesReq.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            regionCode,
            serviceTypeCode,
            resourceIds,
            effectiveTimeBegin,
            effectiveTimeEnd,
            offset,
            limit,
            status,
            indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCustomerOnDemandResourcesReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    effectiveTimeBegin: ").append(toIndentedString(effectiveTimeBegin)).append("\n");
        sb.append("    effectiveTimeEnd: ").append(toIndentedString(effectiveTimeEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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
