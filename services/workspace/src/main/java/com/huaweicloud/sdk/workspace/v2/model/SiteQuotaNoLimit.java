package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个站点的配额。
 */
public class SiteQuotaNoLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceNoLimit> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    public SiteQuotaNoLimit withResources(List<ResourceNoLimit> resources) {
        this.resources = resources;
        return this;
    }

    public SiteQuotaNoLimit addResourcesItem(ResourceNoLimit resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public SiteQuotaNoLimit withResources(Consumer<List<ResourceNoLimit>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 配额资源列表。
     * @return resources
     */
    public List<ResourceNoLimit> getResources() {
        return resources;
    }

    public void setResources(List<ResourceNoLimit> resources) {
        this.resources = resources;
    }

    public SiteQuotaNoLimit withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteQuotaNoLimit that = (SiteQuotaNoLimit) obj;
        return Objects.equals(this.resources, that.resources) && Objects.equals(this.siteId, that.siteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, siteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteQuotaNoLimit {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
