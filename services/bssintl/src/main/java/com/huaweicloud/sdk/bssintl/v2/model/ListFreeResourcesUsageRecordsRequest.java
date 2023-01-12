package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFreeResourcesUsageRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_id")

    private String freeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_time_begin")

    private String deductTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_time_end")

    private String deductTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFreeResourcesUsageRecordsRequest withFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }

    /**
     * 资源项ID，一个资源包中会含有多个资源项，一个使用量类型对应一个资源项。资源项ID来自查询资源包列表接口的响应。 此参数不携带或携带值为空时，不作为筛选条件。
     * @return freeResourceId
     */
    public String getFreeResourceId() {
        return freeResourceId;
    }

    public void setFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
    }

    public ListFreeResourcesUsageRecordsRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，即资源包ID。 此参数不携带或携带值为空时，不作为筛选条件。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListFreeResourcesUsageRecordsRequest withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。 此参数不携带或携带值为空时，不作为筛选条件。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public ListFreeResourcesUsageRecordsRequest withDeductTimeBegin(String deductTimeBegin) {
        this.deductTimeBegin = deductTimeBegin;
        return this;
    }

    /**
     * 资源抵扣的起始时间。东八区时间，格式为YYYY-MM-DD。
     * @return deductTimeBegin
     */
    public String getDeductTimeBegin() {
        return deductTimeBegin;
    }

    public void setDeductTimeBegin(String deductTimeBegin) {
        this.deductTimeBegin = deductTimeBegin;
    }

    public ListFreeResourcesUsageRecordsRequest withDeductTimeEnd(String deductTimeEnd) {
        this.deductTimeEnd = deductTimeEnd;
        return this;
    }

    /**
     * 资源抵扣的结束时间。东八区时间，格式为YYYY-MM-DD。  说明： 抵扣结束时间-抵扣起始时间<=90天。
     * @return deductTimeEnd
     */
    public String getDeductTimeEnd() {
        return deductTimeEnd;
    }

    public void setDeductTimeEnd(String deductTimeEnd) {
        this.deductTimeEnd = deductTimeEnd;
    }

    public ListFreeResourcesUsageRecordsRequest withOffset(Integer offset) {
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

    public ListFreeResourcesUsageRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的数量限制。默认值为10。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFreeResourcesUsageRecordsRequest listFreeResourcesUsageRecordsRequest =
            (ListFreeResourcesUsageRecordsRequest) o;
        return Objects.equals(this.freeResourceId, listFreeResourcesUsageRecordsRequest.freeResourceId)
            && Objects.equals(this.productId, listFreeResourcesUsageRecordsRequest.productId)
            && Objects.equals(this.resourceTypeCode, listFreeResourcesUsageRecordsRequest.resourceTypeCode)
            && Objects.equals(this.deductTimeBegin, listFreeResourcesUsageRecordsRequest.deductTimeBegin)
            && Objects.equals(this.deductTimeEnd, listFreeResourcesUsageRecordsRequest.deductTimeEnd)
            && Objects.equals(this.offset, listFreeResourcesUsageRecordsRequest.offset)
            && Objects.equals(this.limit, listFreeResourcesUsageRecordsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResourceId, productId, resourceTypeCode, deductTimeBegin, deductTimeEnd, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourcesUsageRecordsRequest {\n");
        sb.append("    freeResourceId: ").append(toIndentedString(freeResourceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    deductTimeBegin: ").append(toIndentedString(deductTimeBegin)).append("\n");
        sb.append("    deductTimeEnd: ").append(toIndentedString(deductTimeEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
