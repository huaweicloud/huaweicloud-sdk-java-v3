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
public class ListIssuedCouponQuotasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_quota_id")
    
    private String parentQuotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListIssuedCouponQuotasRequest withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * Get quotaId
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    

    public ListIssuedCouponQuotasRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * Get indirectPartnerId
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    

    public ListIssuedCouponQuotasRequest withParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }

    


    /**
     * Get parentQuotaId
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return parentQuotaId;
    }

    public void setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
    }

    

    public ListIssuedCouponQuotasRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
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

    

    public ListIssuedCouponQuotasRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuedCouponQuotasRequest listIssuedCouponQuotasRequest = (ListIssuedCouponQuotasRequest) o;
        return Objects.equals(this.quotaId, listIssuedCouponQuotasRequest.quotaId) &&
            Objects.equals(this.indirectPartnerId, listIssuedCouponQuotasRequest.indirectPartnerId) &&
            Objects.equals(this.parentQuotaId, listIssuedCouponQuotasRequest.parentQuotaId) &&
            Objects.equals(this.offset, listIssuedCouponQuotasRequest.offset) &&
            Objects.equals(this.limit, listIssuedCouponQuotasRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaId, indirectPartnerId, parentQuotaId, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuedCouponQuotasRequest {\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    parentQuotaId: ").append(toIndentedString(parentQuotaId)).append("\n");
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

