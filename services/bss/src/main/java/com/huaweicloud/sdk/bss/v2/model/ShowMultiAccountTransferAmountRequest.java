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
public class ShowMultiAccountTransferAmountRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balance_type")
    
    private String balanceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;

    public ShowMultiAccountTransferAmountRequest withBalanceType(String balanceType) {
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

    public ShowMultiAccountTransferAmountRequest withOffset(Integer offset) {
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

    public ShowMultiAccountTransferAmountRequest withLimit(Integer limit) {
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
        ShowMultiAccountTransferAmountRequest showMultiAccountTransferAmountRequest = (ShowMultiAccountTransferAmountRequest) o;
        return Objects.equals(this.balanceType, showMultiAccountTransferAmountRequest.balanceType) &&
            Objects.equals(this.offset, showMultiAccountTransferAmountRequest.offset) &&
            Objects.equals(this.limit, showMultiAccountTransferAmountRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(balanceType, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiAccountTransferAmountRequest {\n");
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

