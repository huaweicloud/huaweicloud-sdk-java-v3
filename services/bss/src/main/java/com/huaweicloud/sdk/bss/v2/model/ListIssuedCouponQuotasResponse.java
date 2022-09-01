package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListIssuedCouponQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    @JacksonXmlProperty(localName = "quotas")

    private List<IssuedCouponQuota> quotas = null;

    public ListIssuedCouponQuotasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 查询的记录总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListIssuedCouponQuotasResponse withQuotas(List<IssuedCouponQuota> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListIssuedCouponQuotasResponse addQuotasItem(IssuedCouponQuota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListIssuedCouponQuotasResponse withQuotas(Consumer<List<IssuedCouponQuota>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 额度记录列表。 具体请参见表2。
     * @return quotas
     */
    public List<IssuedCouponQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<IssuedCouponQuota> quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuedCouponQuotasResponse listIssuedCouponQuotasResponse = (ListIssuedCouponQuotasResponse) o;
        return Objects.equals(this.totalCount, listIssuedCouponQuotasResponse.totalCount)
            && Objects.equals(this.quotas, listIssuedCouponQuotasResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuedCouponQuotasResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
