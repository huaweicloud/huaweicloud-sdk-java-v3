package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 覆盖策略对象
 */
public class CoverageResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_policy")

    private String coveragePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_level")

    private String coverageLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_sites")

    private List<CoverageSiteResp> coverageSites = null;

    public CoverageResp withCoveragePolicy(String coveragePolicy) {
        this.coveragePolicy = coveragePolicy;
        return this;
    }

    /**
     * 区域调度策略，只支持centralize/discrete。  - centralize：代表城市集中策略，指定该策略，边缘业务创建时会保证将所有实例都发放在同一个站点。 - discrete：代表城市分散，指定该策略，边缘业务创建时，尽量保证所有实例都分散发放在不同站点。
     * @return coveragePolicy
     */
    public String getCoveragePolicy() {
        return coveragePolicy;
    }

    public void setCoveragePolicy(String coveragePolicy) {
        this.coveragePolicy = coveragePolicy;
    }

    public CoverageResp withCoverageLevel(String coverageLevel) {
        this.coverageLevel = coverageLevel;
        return this;
    }

    /**
     * 区域分布层级，只支持area/prov/city/site。  - area:大区，用户的资源会在指定大区下发放。 - prov:省份，用户的资源会在指定省份下发放。 - city:城市，用户的资源会在指定城市下发放。 - site:站点级别。  约束：  站点层级，coverage_policy上仅支持'centralize'，coverage_sites中'site'字段仅支持使用ID(站点ID，通过“查询边缘站点列表”获取)，不支持name。
     * @return coverageLevel
     */
    public String getCoverageLevel() {
        return coverageLevel;
    }

    public void setCoverageLevel(String coverageLevel) {
        this.coverageLevel = coverageLevel;
    }

    public CoverageResp withCoverageSites(List<CoverageSiteResp> coverageSites) {
        this.coverageSites = coverageSites;
        return this;
    }

    public CoverageResp addCoverageSitesItem(CoverageSiteResp coverageSitesItem) {
        if (this.coverageSites == null) {
            this.coverageSites = new ArrayList<>();
        }
        this.coverageSites.add(coverageSitesItem);
        return this;
    }

    public CoverageResp withCoverageSites(Consumer<List<CoverageSiteResp>> coverageSitesSetter) {
        if (this.coverageSites == null) {
            this.coverageSites = new ArrayList<>();
        }
        coverageSitesSetter.accept(this.coverageSites);
        return this;
    }

    /**
     * 区域及购买数量列表。
     * @return coverageSites
     */
    public List<CoverageSiteResp> getCoverageSites() {
        return coverageSites;
    }

    public void setCoverageSites(List<CoverageSiteResp> coverageSites) {
        this.coverageSites = coverageSites;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoverageResp coverageResp = (CoverageResp) o;
        return Objects.equals(this.coveragePolicy, coverageResp.coveragePolicy)
            && Objects.equals(this.coverageLevel, coverageResp.coverageLevel)
            && Objects.equals(this.coverageSites, coverageResp.coverageSites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coveragePolicy, coverageLevel, coverageSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageResp {\n");
        sb.append("    coveragePolicy: ").append(toIndentedString(coveragePolicy)).append("\n");
        sb.append("    coverageLevel: ").append(toIndentedString(coverageLevel)).append("\n");
        sb.append("    coverageSites: ").append(toIndentedString(coverageSites)).append("\n");
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
