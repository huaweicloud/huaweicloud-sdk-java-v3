package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSiteInformationPair
 */
public class CreateSiteInformationPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sites")

    private List<CreateSiteInformation> sites = null;

    public CreateSiteInformationPair withSites(List<CreateSiteInformation> sites) {
        this.sites = sites;
        return this;
    }

    public CreateSiteInformationPair addSitesItem(CreateSiteInformation sitesItem) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        this.sites.add(sitesItem);
        return this;
    }

    public CreateSiteInformationPair withSites(Consumer<List<CreateSiteInformation>> sitesSetter) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        sitesSetter.accept(this.sites);
        return this;
    }

    /**
     * 端到端（P2P）类型分支网络连接的两个端点定义，长度固定为2的数组。
     * @return sites
     */
    public List<CreateSiteInformation> getSites() {
        return sites;
    }

    public void setSites(List<CreateSiteInformation> sites) {
        this.sites = sites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSiteInformationPair that = (CreateSiteInformationPair) obj;
        return Objects.equals(this.sites, that.sites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSiteInformationPair {\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
