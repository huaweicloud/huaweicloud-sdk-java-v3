package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCertificateAuthorityQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    @JacksonXmlProperty(localName = "quotas")

    private Quotas quotas;

    public ShowCertificateAuthorityQuotaResponse withQuotas(Quotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowCertificateAuthorityQuotaResponse withQuotas(Consumer<Quotas> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new Quotas();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public Quotas getQuotas() {
        return quotas;
    }

    public void setQuotas(Quotas quotas) {
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
        ShowCertificateAuthorityQuotaResponse showCertificateAuthorityQuotaResponse =
            (ShowCertificateAuthorityQuotaResponse) o;
        return Objects.equals(this.quotas, showCertificateAuthorityQuotaResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateAuthorityQuotaResponse {\n");
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
