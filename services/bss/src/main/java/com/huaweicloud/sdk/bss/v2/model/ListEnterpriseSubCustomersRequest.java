package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEnterpriseSubCustomersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_account_name")
    
    private String subCustomerAccountName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_display_name")
    
    private String subCustomerDisplayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fuzzy_query")
    
    private Integer fuzzyQuery;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="org_id")
    
    private String orgId;

    public ListEnterpriseSubCustomersRequest withSubCustomerAccountName(String subCustomerAccountName) {
        this.subCustomerAccountName = subCustomerAccountName;
        return this;
    }

    


    /**
     * 企业子账号的账号名。根据fuzzy_query取值决定是否按模糊查询。
     * @return subCustomerAccountName
     */
    public String getSubCustomerAccountName() {
        return subCustomerAccountName;
    }

    public void setSubCustomerAccountName(String subCustomerAccountName) {
        this.subCustomerAccountName = subCustomerAccountName;
    }

    

    public ListEnterpriseSubCustomersRequest withSubCustomerDisplayName(String subCustomerDisplayName) {
        this.subCustomerDisplayName = subCustomerDisplayName;
        return this;
    }

    


    /**
     * 企业子账号的显示名称。不限制特殊字符。根据fuzzy_query取值决定是否按模糊查询。
     * @return subCustomerDisplayName
     */
    public String getSubCustomerDisplayName() {
        return subCustomerDisplayName;
    }

    public void setSubCustomerDisplayName(String subCustomerDisplayName) {
        this.subCustomerDisplayName = subCustomerDisplayName;
    }

    

    public ListEnterpriseSubCustomersRequest withFuzzyQuery(Integer fuzzyQuery) {
        this.fuzzyQuery = fuzzyQuery;
        return this;
    }

    


    /**
     * 企业子账号的显示名称、用户名是否按模糊查询。0：不按模糊查询1：按模糊查询默认值为0。
     * minimum: 0
     * maximum: 1
     * @return fuzzyQuery
     */
    public Integer getFuzzyQuery() {
        return fuzzyQuery;
    }

    public void setFuzzyQuery(Integer fuzzyQuery) {
        this.fuzzyQuery = fuzzyQuery;
    }

    

    public ListEnterpriseSubCustomersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，从0开始，默认值为0。
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

    

    public ListEnterpriseSubCustomersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每次查询记录数，默认值为10。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListEnterpriseSubCustomersRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    


    /**
     * 子账号归属的组织单元ID。
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseSubCustomersRequest listEnterpriseSubCustomersRequest = (ListEnterpriseSubCustomersRequest) o;
        return Objects.equals(this.subCustomerAccountName, listEnterpriseSubCustomersRequest.subCustomerAccountName) &&
            Objects.equals(this.subCustomerDisplayName, listEnterpriseSubCustomersRequest.subCustomerDisplayName) &&
            Objects.equals(this.fuzzyQuery, listEnterpriseSubCustomersRequest.fuzzyQuery) &&
            Objects.equals(this.offset, listEnterpriseSubCustomersRequest.offset) &&
            Objects.equals(this.limit, listEnterpriseSubCustomersRequest.limit) &&
            Objects.equals(this.orgId, listEnterpriseSubCustomersRequest.orgId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subCustomerAccountName, subCustomerDisplayName, fuzzyQuery, offset, limit, orgId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseSubCustomersRequest {\n");
        sb.append("    subCustomerAccountName: ").append(toIndentedString(subCustomerAccountName)).append("\n");
        sb.append("    subCustomerDisplayName: ").append(toIndentedString(subCustomerDisplayName)).append("\n");
        sb.append("    fuzzyQuery: ").append(toIndentedString(fuzzyQuery)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

