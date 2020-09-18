package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QuotaReclaim
 */
public class QuotaReclaim  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_balance")
    
    private BigDecimal quotaBalance = null;

    public QuotaReclaim withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * |参数名称：被回收的二级经销商代金券额度ID| |参数约束及描述：被回收的二级经销商代金券额度ID|
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public QuotaReclaim withQuotaBalance(BigDecimal quotaBalance) {
        this.quotaBalance = quotaBalance;
        return this;
    }

    


    /**
     * |参数名称：被回收的代金券的余额| |参数的约束及描述：被回收的代金券的余额|
     * @return quotaBalance
     */
    public BigDecimal getQuotaBalance() {
        return quotaBalance;
    }

    public void setQuotaBalance(BigDecimal quotaBalance) {
        this.quotaBalance = quotaBalance;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaReclaim quotaReclaim = (QuotaReclaim) o;
        return Objects.equals(this.quotaId, quotaReclaim.quotaId) &&
            Objects.equals(this.quotaBalance, quotaReclaim.quotaBalance);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaId, quotaBalance);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaReclaim {\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    quotaBalance: ").append(toIndentedString(quotaBalance)).append("\n");
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

