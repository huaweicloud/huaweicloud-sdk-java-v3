package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 站点覆盖策略
 */
public class CoverageSiteResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    @JacksonXmlProperty(localName = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demands")

    @JacksonXmlProperty(localName = "demands")

    private List<DemandResp> demands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_site")

    @JacksonXmlProperty(localName = "i18n_site")

    private String i18nSite;

    public CoverageSiteResp withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * 站点名称。 具体信息可通过调用“查询边缘站点列表”来查询(注意：本字段区分大小写)。
     * @return site
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public CoverageSiteResp withDemands(List<DemandResp> demands) {
        this.demands = demands;
        return this;
    }

    public CoverageSiteResp addDemandsItem(DemandResp demandsItem) {
        if (this.demands == null) {
            this.demands = new ArrayList<>();
        }
        this.demands.add(demandsItem);
        return this;
    }

    public CoverageSiteResp withDemands(Consumer<List<DemandResp>> demandsSetter) {
        if (this.demands == null) {
            this.demands = new ArrayList<>();
        }
        demandsSetter.accept(this.demands);
        return this;
    }

    /**
     * 租户需求数量列表。表示租户发放资源站点的运营商和发放的资源组的数量。
     * @return demands
     */
    public List<DemandResp> getDemands() {
        return demands;
    }

    public void setDemands(List<DemandResp> demands) {
        this.demands = demands;
    }

    public CoverageSiteResp withI18nSite(String i18nSite) {
        this.i18nSite = i18nSite;
        return this;
    }

    /**
     * 覆盖区域的国际化信息。
     * @return i18nSite
     */
    public String getI18nSite() {
        return i18nSite;
    }

    public void setI18nSite(String i18nSite) {
        this.i18nSite = i18nSite;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoverageSiteResp coverageSiteResp = (CoverageSiteResp) o;
        return Objects.equals(this.site, coverageSiteResp.site)
            && Objects.equals(this.demands, coverageSiteResp.demands)
            && Objects.equals(this.i18nSite, coverageSiteResp.i18nSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(site, demands, i18nSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageSiteResp {\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    demands: ").append(toIndentedString(demands)).append("\n");
        sb.append("    i18nSite: ").append(toIndentedString(i18nSite)).append("\n");
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
