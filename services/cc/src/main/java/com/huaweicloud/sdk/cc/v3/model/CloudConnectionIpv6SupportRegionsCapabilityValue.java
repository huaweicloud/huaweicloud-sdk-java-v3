package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudConnectionIpv6SupportRegionsCapabilityValue
 */
public class CloudConnectionIpv6SupportRegionsCapabilityValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<String> supportRegions = null;

    public CloudConnectionIpv6SupportRegionsCapabilityValue withSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public CloudConnectionIpv6SupportRegionsCapabilityValue addSupportRegionsItem(String supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public CloudConnectionIpv6SupportRegionsCapabilityValue withSupportRegions(
        Consumer<List<String>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * 租户支持的区域列表。
     * @return supportRegions
     */
    public List<String> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionIpv6SupportRegionsCapabilityValue that = (CloudConnectionIpv6SupportRegionsCapabilityValue) obj;
        return Objects.equals(this.supportRegions, that.supportRegions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportRegions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionIpv6SupportRegionsCapabilityValue {\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
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
