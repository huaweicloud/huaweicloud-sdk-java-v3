package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos_quota")

    private QuotaResponseDdosQuota ddosQuota;

    public ListQuotaResponse withDdosQuota(QuotaResponseDdosQuota ddosQuota) {
        this.ddosQuota = ddosQuota;
        return this;
    }

    public ListQuotaResponse withDdosQuota(Consumer<QuotaResponseDdosQuota> ddosQuotaSetter) {
        if (this.ddosQuota == null) {
            this.ddosQuota = new QuotaResponseDdosQuota();
            ddosQuotaSetter.accept(this.ddosQuota);
        }

        return this;
    }

    /**
     * Get ddosQuota
     * @return ddosQuota
     */
    public QuotaResponseDdosQuota getDdosQuota() {
        return ddosQuota;
    }

    public void setDdosQuota(QuotaResponseDdosQuota ddosQuota) {
        this.ddosQuota = ddosQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotaResponse that = (ListQuotaResponse) obj;
        return Objects.equals(this.ddosQuota, that.ddosQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddosQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaResponse {\n");
        sb.append("    ddosQuota: ").append(toIndentedString(ddosQuota)).append("\n");
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
