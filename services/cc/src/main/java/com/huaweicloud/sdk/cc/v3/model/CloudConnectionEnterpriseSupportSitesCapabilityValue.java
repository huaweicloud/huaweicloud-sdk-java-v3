package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudConnectionEnterpriseSupportSitesCapabilityValue
 */
public class CloudConnectionEnterpriseSupportSitesCapabilityValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_sites")

    private List<String> supportSites = null;

    public CloudConnectionEnterpriseSupportSitesCapabilityValue withSupportSites(List<String> supportSites) {
        this.supportSites = supportSites;
        return this;
    }

    public CloudConnectionEnterpriseSupportSitesCapabilityValue addSupportSitesItem(String supportSitesItem) {
        if (this.supportSites == null) {
            this.supportSites = new ArrayList<>();
        }
        this.supportSites.add(supportSitesItem);
        return this;
    }

    public CloudConnectionEnterpriseSupportSitesCapabilityValue withSupportSites(
        Consumer<List<String>> supportSitesSetter) {
        if (this.supportSites == null) {
            this.supportSites = new ArrayList<>();
        }
        supportSitesSetter.accept(this.supportSites);
        return this;
    }

    /**
     * 租户支持的Site列表。
     * @return supportSites
     */
    public List<String> getSupportSites() {
        return supportSites;
    }

    public void setSupportSites(List<String> supportSites) {
        this.supportSites = supportSites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionEnterpriseSupportSitesCapabilityValue that =
            (CloudConnectionEnterpriseSupportSitesCapabilityValue) obj;
        return Objects.equals(this.supportSites, that.supportSites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionEnterpriseSupportSitesCapabilityValue {\n");
        sb.append("    supportSites: ").append(toIndentedString(supportSites)).append("\n");
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
