package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统信息
 */
public class OcaIpSystem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "family")

    private String family;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private OcaIpVendor vendor;

    public OcaIpSystem withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * 系统类型
     * @return family
     */
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public OcaIpSystem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 系统名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OcaIpSystem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 系统版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OcaIpSystem withVendor(OcaIpVendor vendor) {
        this.vendor = vendor;
        return this;
    }

    public OcaIpSystem withVendor(Consumer<OcaIpVendor> vendorSetter) {
        if (this.vendor == null) {
            this.vendor = new OcaIpVendor();
            vendorSetter.accept(this.vendor);
        }

        return this;
    }

    /**
     * Get vendor
     * @return vendor
     */
    public OcaIpVendor getVendor() {
        return vendor;
    }

    public void setVendor(OcaIpVendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpSystem that = (OcaIpSystem) obj;
        return Objects.equals(this.family, that.family) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.vendor, that.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, version, vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpSystem {\n");
        sb.append("    family: ").append(toIndentedString(family)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
