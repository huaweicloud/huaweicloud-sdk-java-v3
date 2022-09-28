package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<QuotaRsp> quotas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListQuotaResponse withQuotas(List<QuotaRsp> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListQuotaResponse addQuotasItem(QuotaRsp quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListQuotaResponse withQuotas(Consumer<List<QuotaRsp>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 配额信息列表
     * @return quotas
     */
    public List<QuotaRsp> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<QuotaRsp> quotas) {
        this.quotas = quotas;
    }

    public ListQuotaResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 配额列表个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotaResponse listQuotaResponse = (ListQuotaResponse) o;
        return Objects.equals(this.quotas, listQuotaResponse.quotas)
            && Objects.equals(this.count, listQuotaResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
