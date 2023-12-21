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
public class CoverageSiteInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demands")

    private List<DemandInstance> demands = null;

    public CoverageSiteInstance withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * 站点ID。 具体信息可通过调用“查询边缘站点列表”来查询。
     * @return site
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public CoverageSiteInstance withDemands(List<DemandInstance> demands) {
        this.demands = demands;
        return this;
    }

    public CoverageSiteInstance addDemandsItem(DemandInstance demandsItem) {
        if (this.demands == null) {
            this.demands = new ArrayList<>();
        }
        this.demands.add(demandsItem);
        return this;
    }

    public CoverageSiteInstance withDemands(Consumer<List<DemandInstance>> demandsSetter) {
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
    public List<DemandInstance> getDemands() {
        return demands;
    }

    public void setDemands(List<DemandInstance> demands) {
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
        CoverageSiteInstance that = (CoverageSiteInstance) obj;
        return Objects.equals(this.site, that.site) && Objects.equals(this.demands, that.demands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(site, demands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageSiteInstance {\n");
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
