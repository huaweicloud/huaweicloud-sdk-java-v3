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
public class CoverageInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_policy")

    private String coveragePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_level")

    private String coverageLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage_sites")

    private List<CoverageSiteInstance> coverageSites = null;

    public CoverageInstance withCoveragePolicy(String coveragePolicy) {
        this.coveragePolicy = coveragePolicy;
        return this;
    }

    /**
     * 区域调度策略，只支持centralize。  - centralize：代表城市集中策略，指定该策略，边缘业务创建时会保证将所有实例都发放在同一个站点。
     * @return coveragePolicy
     */
    public String getCoveragePolicy() {
        return coveragePolicy;
    }

    public void setCoveragePolicy(String coveragePolicy) {
        this.coveragePolicy = coveragePolicy;
    }

    public CoverageInstance withCoverageLevel(String coverageLevel) {
        this.coverageLevel = coverageLevel;
        return this;
    }

    /**
     * 区域分布层级，只支持site。 - site:站点级别。  约束： coverage_sites中'site'字段仅支持使用ID(站点ID，通过“查询边缘站点列表”获取)，不支持name。
     * @return coverageLevel
     */
    public String getCoverageLevel() {
        return coverageLevel;
    }

    public void setCoverageLevel(String coverageLevel) {
        this.coverageLevel = coverageLevel;
    }

    public CoverageInstance withCoverageSites(List<CoverageSiteInstance> coverageSites) {
        this.coverageSites = coverageSites;
        return this;
    }

    public CoverageInstance addCoverageSitesItem(CoverageSiteInstance coverageSitesItem) {
        if (this.coverageSites == null) {
            this.coverageSites = new ArrayList<>();
        }
        this.coverageSites.add(coverageSitesItem);
        return this;
    }

    public CoverageInstance withCoverageSites(Consumer<List<CoverageSiteInstance>> coverageSitesSetter) {
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
    public List<CoverageSiteInstance> getCoverageSites() {
        return coverageSites;
    }

    public void setCoverageSites(List<CoverageSiteInstance> coverageSites) {
        this.coverageSites = coverageSites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoverageInstance that = (CoverageInstance) obj;
        return Objects.equals(this.coveragePolicy, that.coveragePolicy)
            && Objects.equals(this.coverageLevel, that.coverageLevel)
            && Objects.equals(this.coverageSites, that.coverageSites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coveragePolicy, coverageLevel, coverageSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageInstance {\n");
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
