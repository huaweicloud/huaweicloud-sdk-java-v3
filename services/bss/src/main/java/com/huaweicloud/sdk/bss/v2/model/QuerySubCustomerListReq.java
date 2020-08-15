package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QuerySubCustomerListReq
 */
public class QuerySubCustomerListReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_name")
    
    private String accountName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="associated_on_begin")
    
    private String associatedOnBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="associated_on_end")
    
    private String associatedOnEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="association_type")
    
    private String associationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer")
    
    private String customer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;

    public QuerySubCustomerListReq withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    


    /**
     * |参数名称：客户登录名称（如果客户创建了子用户，此处需要填写主账号登录名称。关于主账号和子用户的具体介绍请参见身份管理身份管理中“账号”和“IAM用户”的描述）。支持模糊查询。| |参数约束及描述：客户登录名称（如果客户创建了子用户，此处需要填写主账号登录名称。关于主账号和子用户的具体介绍请参见身份管理身份管理中“账号”和“IAM用户”的描述）。支持模糊查询。|
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public QuerySubCustomerListReq withAssociatedOnBegin(String associatedOnBegin) {
        this.associatedOnBegin = associatedOnBegin;
        return this;
    }

    


    /**
     * |参数名称：关联时间区间段开始，UTC时间。| |参数约束及描述：格式为：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。|
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
     * |参数名称：关联时间区间段结束，UTC时间| |参数约束及描述：格式为：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。|
     * @return associatedOnEnd
     */
    public String getAssociatedOnEnd() {
        return associatedOnEnd;
    }

    public void setAssociatedOnEnd(String associatedOnEnd) {
        this.associatedOnEnd = associatedOnEnd;
    }

    public QuerySubCustomerListReq withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    


    /**
     * |参数名称：关联类型1.推荐，2.垫付，3.转售| |参数约束及描述：非必填，最大长度2|
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public QuerySubCustomerListReq withCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    


    /**
     * |参数名称：实名认证名称。支持模糊查询。| |参数约束及描述：实名认证名称。支持模糊查询。|
     * @return customer
     */
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public QuerySubCustomerListReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：子客户ID| |参数约束及描述：非必填，最大长度64|
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
     * |参数名称：二级渠道商ID| |参数约束及描述：如果想查询二级渠道子客户的列表，该字段必须携带，最大长度64|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public QuerySubCustomerListReq withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * |参数名称：标签，支持模糊查找。| |参数约束及描述：非必填，最大长度64|
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public QuerySubCustomerListReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * |参数名称：每次查询的数量。默认10，最多100。| |参数约束及描述： 每次查询的数量。默认10，最多100。|
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

    public QuerySubCustomerListReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * |参数名称：偏移量，从0开始| |参数约束及描述： 偏移量，从0开始|
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySubCustomerListReq querySubCustomerListReq = (QuerySubCustomerListReq) o;
        return Objects.equals(this.accountName, querySubCustomerListReq.accountName) &&
            Objects.equals(this.associatedOnBegin, querySubCustomerListReq.associatedOnBegin) &&
            Objects.equals(this.associatedOnEnd, querySubCustomerListReq.associatedOnEnd) &&
            Objects.equals(this.associationType, querySubCustomerListReq.associationType) &&
            Objects.equals(this.customer, querySubCustomerListReq.customer) &&
            Objects.equals(this.customerId, querySubCustomerListReq.customerId) &&
            Objects.equals(this.indirectPartnerId, querySubCustomerListReq.indirectPartnerId) &&
            Objects.equals(this.label, querySubCustomerListReq.label) &&
            Objects.equals(this.limit, querySubCustomerListReq.limit) &&
            Objects.equals(this.offset, querySubCustomerListReq.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountName, associatedOnBegin, associatedOnEnd, associationType, customer, customerId, indirectPartnerId, label, limit, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySubCustomerListReq {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    associatedOnBegin: ").append(toIndentedString(associatedOnBegin)).append("\n");
        sb.append("    associatedOnEnd: ").append(toIndentedString(associatedOnEnd)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

