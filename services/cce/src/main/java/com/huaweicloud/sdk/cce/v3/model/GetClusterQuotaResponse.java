package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetClusterQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private GetClusterQuotaBodyQuotas quotas;

    public GetClusterQuotaResponse withQuotas(GetClusterQuotaBodyQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public GetClusterQuotaResponse withQuotas(Consumer<GetClusterQuotaBodyQuotas> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new GetClusterQuotaBodyQuotas();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public GetClusterQuotaBodyQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(GetClusterQuotaBodyQuotas quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetClusterQuotaResponse that = (GetClusterQuotaResponse) obj;
        return Objects.equals(this.quotas, that.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterQuotaResponse {\n");
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
