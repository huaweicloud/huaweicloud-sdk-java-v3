package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 站点覆盖策略
 */
public class CoverageSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demands")

    private List<Demand> demands = null;

    public CoverageSite withSite(String site) {
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

    public CoverageSite withDemands(List<Demand> demands) {
        this.demands = demands;
        return this;
    }

    public CoverageSite addDemandsItem(Demand demandsItem) {
        if (this.demands == null) {
            this.demands = new ArrayList<>();
        }
        this.demands.add(demandsItem);
        return this;
    }

    public CoverageSite withDemands(Consumer<List<Demand>> demandsSetter) {
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
    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(List<Demand> demands) {
        this.demands = demands;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoverageSite that = (CoverageSite) obj;
        return Objects.equals(this.site, that.site) && Objects.equals(this.demands, that.demands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(site, demands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageSite {\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    demands: ").append(toIndentedString(demands)).append("\n");
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
