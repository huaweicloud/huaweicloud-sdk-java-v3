package com.huaweicloud.sdk.dns.v2.model;

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
public class ShowDomainQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    @JacksonXmlProperty(localName = "quotas")

    private List<DomainQuotaResponseQuotas> quotas = null;

    public ShowDomainQuotaResponse withQuotas(List<DomainQuotaResponseQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowDomainQuotaResponse addQuotasItem(DomainQuotaResponseQuotas quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ShowDomainQuotaResponse withQuotas(Consumer<List<DomainQuotaResponseQuotas>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public List<DomainQuotaResponseQuotas> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<DomainQuotaResponseQuotas> quotas) {
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
        ShowDomainQuotaResponse showDomainQuotaResponse = (ShowDomainQuotaResponse) o;
        return Objects.equals(this.quotas, showDomainQuotaResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainQuotaResponse {\n");
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
