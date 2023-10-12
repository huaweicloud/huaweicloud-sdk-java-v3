package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSubCustomerNewTagReq
 */
public class ListSubCustomerNewTagReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_ids")

    private List<String> customerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListSubCustomerNewTagReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    public ListSubCustomerNewTagReq addCustomerIdsItem(String customerIdsItem) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public ListSubCustomerNewTagReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * 客户ID列表。单个客户ID最大长度：64。 此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public ListSubCustomerNewTagReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 示例1，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。 示例2，查询总数20条，期望每页返回10条数据，则获取第一页数据，入参offset填写0，limit填写10；获取第二页数据，入参offset填写10，limit填写10。
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

    public ListSubCustomerNewTagReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的客户数量。默认值为10。
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubCustomerNewTagReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见查询云经销商列表。如果需要查询云经销商的客户新客标签，必须携带该字段。除此之外，此参数不做处理。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerNewTagReq that = (ListSubCustomerNewTagReq) obj;
        return Objects.equals(this.customerIds, that.customerIds) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.indirectPartnerId, that.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, offset, limit, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerNewTagReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
