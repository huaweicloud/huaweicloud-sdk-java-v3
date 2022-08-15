package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuotaReclaim
 */
public class QuotaReclaim {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_balance")

    private Double quotaBalance;

    public QuotaReclaim withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * 被回收的云经销商的代金券额度ID。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public QuotaReclaim withQuotaBalance(Double quotaBalance) {
        this.quotaBalance = quotaBalance;
        return this;
    }

    /**
     * 被回收额度后的代金券额度余额。单位：元。
     * @return quotaBalance
     */
    public Double getQuotaBalance() {
        return quotaBalance;
    }

    public void setQuotaBalance(Double quotaBalance) {
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
        return Objects.equals(this.quotaId, quotaReclaim.quotaId)
            && Objects.equals(this.quotaBalance, quotaReclaim.quotaBalance);
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
