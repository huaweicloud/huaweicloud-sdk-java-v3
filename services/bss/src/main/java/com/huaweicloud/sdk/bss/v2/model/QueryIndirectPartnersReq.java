package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryIndirectPartnersReq
 */
public class QueryIndirectPartnersReq  {



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
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public QueryIndirectPartnersReq withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    


    /**
     * 精英服务商伙伴的账号名。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    

    public QueryIndirectPartnersReq withAssociatedOnBegin(String associatedOnBegin) {
        this.associatedOnBegin = associatedOnBegin;
        return this;
    }

    


    /**
     * 精英服务商关联华为云伙伴能力中心的开始时间。 UTC时间（包括时区），比如2016-03-28T00:00:00Z
     * @return associatedOnBegin
     */
    public String getAssociatedOnBegin() {
        return associatedOnBegin;
    }

    public void setAssociatedOnBegin(String associatedOnBegin) {
        this.associatedOnBegin = associatedOnBegin;
    }

    

    public QueryIndirectPartnersReq withAssociatedOnEnd(String associatedOnEnd) {
        this.associatedOnEnd = associatedOnEnd;
        return this;
    }

    


    /**
     * 精英服务商关联华为云伙伴能力中心的结束时间。 UTC时间（包括时区），比如2016-03-28T00:00:00Z
     * @return associatedOnEnd
     */
    public String getAssociatedOnEnd() {
        return associatedOnEnd;
    }

    public void setAssociatedOnEnd(String associatedOnEnd) {
        this.associatedOnEnd = associatedOnEnd;
    }

    

    public QueryIndirectPartnersReq withOffset(Integer offset) {
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

    

    public QueryIndirectPartnersReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每次查询的数量限制。默认值为10。
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

    

    public QueryIndirectPartnersReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * 精英服务商ID。
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
        QueryIndirectPartnersReq queryIndirectPartnersReq = (QueryIndirectPartnersReq) o;
        return Objects.equals(this.accountName, queryIndirectPartnersReq.accountName) &&
            Objects.equals(this.associatedOnBegin, queryIndirectPartnersReq.associatedOnBegin) &&
            Objects.equals(this.associatedOnEnd, queryIndirectPartnersReq.associatedOnEnd) &&
            Objects.equals(this.offset, queryIndirectPartnersReq.offset) &&
            Objects.equals(this.limit, queryIndirectPartnersReq.limit) &&
            Objects.equals(this.indirectPartnerId, queryIndirectPartnersReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountName, associatedOnBegin, associatedOnEnd, offset, limit, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryIndirectPartnersReq {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    associatedOnBegin: ").append(toIndentedString(associatedOnBegin)).append("\n");
        sb.append("    associatedOnEnd: ").append(toIndentedString(associatedOnEnd)).append("\n");
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

