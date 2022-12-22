package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private QuotasQuotas quotas;

    public ListQuotasResponse withQuotas(QuotasQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListQuotasResponse withQuotas(Consumer<QuotasQuotas> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new QuotasQuotas();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public QuotasQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(QuotasQuotas quotas) {
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
        ListQuotasResponse listQuotasResponse = (ListQuotasResponse) o;
        return Objects.equals(this.quotas, listQuotasResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasResponse {\n");
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
