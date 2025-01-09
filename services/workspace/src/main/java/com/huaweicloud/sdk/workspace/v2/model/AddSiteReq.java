package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 初始化站点请求。
 */
public class AddSiteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_configs")

    private List<SiteConfigsRequest> siteConfigs = null;

    public AddSiteReq withSiteConfigs(List<SiteConfigsRequest> siteConfigs) {
        this.siteConfigs = siteConfigs;
        return this;
    }

    public AddSiteReq addSiteConfigsItem(SiteConfigsRequest siteConfigsItem) {
        if (this.siteConfigs == null) {
            this.siteConfigs = new ArrayList<>();
        }
        this.siteConfigs.add(siteConfigsItem);
        return this;
    }

    public AddSiteReq withSiteConfigs(Consumer<List<SiteConfigsRequest>> siteConfigsSetter) {
        if (this.siteConfigs == null) {
            this.siteConfigs = new ArrayList<>();
        }
        siteConfigsSetter.accept(this.siteConfigs);
        return this;
    }

    /**
     * 站点配置信息。
     * @return siteConfigs
     */
    public List<SiteConfigsRequest> getSiteConfigs() {
        return siteConfigs;
    }

    public void setSiteConfigs(List<SiteConfigsRequest> siteConfigs) {
        this.siteConfigs = siteConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddSiteReq that = (AddSiteReq) obj;
        return Objects.equals(this.siteConfigs, that.siteConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSiteReq {\n");
        sb.append("    siteConfigs: ").append(toIndentedString(siteConfigs)).append("\n");
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
