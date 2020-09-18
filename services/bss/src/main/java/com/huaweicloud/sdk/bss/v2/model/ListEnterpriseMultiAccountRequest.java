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
public class ListEnterpriseMultiAccountRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_id")
    
    private String subCustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balance_type")
    
    private String balanceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;

    public ListEnterpriseMultiAccountRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    


    /**
     * Get subCustomerId
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public ListEnterpriseMultiAccountRequest withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    


    /**
     * Get balanceType
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public ListEnterpriseMultiAccountRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 21474836476
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEnterpriseMultiAccountRequest withLimit(Integer limit) {
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
        ListEnterpriseMultiAccountRequest listEnterpriseMultiAccountRequest = (ListEnterpriseMultiAccountRequest) o;
        return Objects.equals(this.subCustomerId, listEnterpriseMultiAccountRequest.subCustomerId) &&
            Objects.equals(this.balanceType, listEnterpriseMultiAccountRequest.balanceType) &&
            Objects.equals(this.offset, listEnterpriseMultiAccountRequest.offset) &&
            Objects.equals(this.limit, listEnterpriseMultiAccountRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subCustomerId, balanceType, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseMultiAccountRequest {\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
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

