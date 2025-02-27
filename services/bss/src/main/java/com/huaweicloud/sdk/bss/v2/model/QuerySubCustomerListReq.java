package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuerySubCustomerListReq
 */
public class QuerySubCustomerListReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer")

    private String customer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private String associationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_on_begin")

    private String associatedOnBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_on_end")

    private String associatedOnEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public QuerySubCustomerListReq withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 客户登录名称（如果客户创建了IAM用户，此处需要填写主账号登录名称。关于主账号和IAM用户的具体介绍请参见身份管理中“账号”和“IAM用户”的描述）。 支持模糊查询。仅支持前缀匹配、后缀匹配、中间匹配；不支持携带空格查询。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public QuerySubCustomerListReq withCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * 客户的实名认证名称，支持模糊查询。仅支持前缀匹配、后缀匹配、中间匹配；不支持携带空格查询。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return customer
     */
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public QuerySubCustomerListReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
     * minimum: 0
     * maximum: 40000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QuerySubCustomerListReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的客户数量。默认值为10。
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

    public QuerySubCustomerListReq withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签，支持模糊查找。仅支持前缀匹配、后缀匹配、中间匹配；不支持携带空格查询；不支持英文大小写模糊匹配查询。 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public QuerySubCustomerListReq withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 关联类型： 1：顾问销售2：代售 此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public QuerySubCustomerListReq withAssociatedOnBegin(String associatedOnBegin) {
        this.associatedOnBegin = associatedOnBegin;
        return this;
    }

    /**
     * 关联时间区间段开始，UTC时间。 格式：YYYY-MM-DD'T'hh:mm:ss'Z'，例如“2019-05-06T08:05:01Z”。 此参数不携带或携带值为null时，不作为筛选条件，不支持携带值为空串。
     * @return associatedOnBegin
     */
    public String getAssociatedOnBegin() {
        return associatedOnBegin;
    }

    public void setAssociatedOnBegin(String associatedOnBegin) {
        this.associatedOnBegin = associatedOnBegin;
    }

    public QuerySubCustomerListReq withAssociatedOnEnd(String associatedOnEnd) {
        this.associatedOnEnd = associatedOnEnd;
        return this;
    }

    /**
     * 关联时间区间段结束，UTC时间。 格式：YYYY-MM-DD'T'hh:mm:ss'Z'，例如“2019-05-06T08:05:01Z”。 此参数不携带或携带值为null时，不作为筛选条件，不支持携带值为空串。
     * @return associatedOnEnd
     */
    public String getAssociatedOnEnd() {
        return associatedOnEnd;
    }

    public void setAssociatedOnEnd(String associatedOnEnd) {
        this.associatedOnEnd = associatedOnEnd;
    }

    public QuerySubCustomerListReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id，或者可以从创建客户接口的响应获取domain_id。此参数不携带或携带值为空串或携带值为null时，不作为筛选条件。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public QuerySubCustomerListReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。如果需要查询云经销商的子客户列表，必须携带该字段。除此之外，此参数不做处理。
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
        QuerySubCustomerListReq that = (QuerySubCustomerListReq) obj;
        return Objects.equals(this.accountName, that.accountName) && Objects.equals(this.customer, that.customer)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.label, that.label) && Objects.equals(this.associationType, that.associationType)
            && Objects.equals(this.associatedOnBegin, that.associatedOnBegin)
            && Objects.equals(this.associatedOnEnd, that.associatedOnEnd)
            && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName,
            customer,
            offset,
            limit,
            label,
            associationType,
            associatedOnBegin,
            associatedOnEnd,
            customerId,
            indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySubCustomerListReq {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    associatedOnBegin: ").append(toIndentedString(associatedOnBegin)).append("\n");
        sb.append("    associatedOnEnd: ").append(toIndentedString(associatedOnEnd)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
