package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListQuotaDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<QuotaInfo> quotas = null;

    public ListQuotaDetailsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求ID。 注：自动生成 。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListQuotaDetailsResponse withQuotas(List<QuotaInfo> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListQuotaDetailsResponse addQuotasItem(QuotaInfo quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListQuotaDetailsResponse withQuotas(Consumer<List<QuotaInfo>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /** 资源配额信息列表。
     * 
     * @return quotas */
    public List<QuotaInfo> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<QuotaInfo> quotas) {
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
        ListQuotaDetailsResponse listQuotaDetailsResponse = (ListQuotaDetailsResponse) o;
        return Objects.equals(this.requestId, listQuotaDetailsResponse.requestId)
            && Objects.equals(this.quotas, listQuotaDetailsResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaDetailsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
