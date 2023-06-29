package com.huaweicloud.sdk.workspace.v2.model;

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
public class ShowQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private QuotaNoLimit quotas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_quotas")

    private List<SiteQuotaNoLimit> siteQuotas = null;

    public ShowQuotasResponse withQuotas(QuotaNoLimit quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowQuotasResponse withQuotas(Consumer<QuotaNoLimit> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new QuotaNoLimit();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    /**
     * Get quotas
     * @return quotas
     */
    public QuotaNoLimit getQuotas() {
        return quotas;
    }

    public void setQuotas(QuotaNoLimit quotas) {
        this.quotas = quotas;
    }

    public ShowQuotasResponse withSiteQuotas(List<SiteQuotaNoLimit> siteQuotas) {
        this.siteQuotas = siteQuotas;
        return this;
    }

    public ShowQuotasResponse addSiteQuotasItem(SiteQuotaNoLimit siteQuotasItem) {
        if (this.siteQuotas == null) {
            this.siteQuotas = new ArrayList<>();
        }
        this.siteQuotas.add(siteQuotasItem);
        return this;
    }

    public ShowQuotasResponse withSiteQuotas(Consumer<List<SiteQuotaNoLimit>> siteQuotasSetter) {
        if (this.siteQuotas == null) {
            this.siteQuotas = new ArrayList<>();
        }
        siteQuotasSetter.accept(this.siteQuotas);
        return this;
    }

    /**
     * 站点配额信息，暂不包括中心站点
     * @return siteQuotas
     */
    public List<SiteQuotaNoLimit> getSiteQuotas() {
        return siteQuotas;
    }

    public void setSiteQuotas(List<SiteQuotaNoLimit> siteQuotas) {
        this.siteQuotas = siteQuotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasResponse that = (ShowQuotasResponse) obj;
        return Objects.equals(this.quotas, that.quotas) && Objects.equals(this.siteQuotas, that.siteQuotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas, siteQuotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    siteQuotas: ").append(toIndentedString(siteQuotas)).append("\n");
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
