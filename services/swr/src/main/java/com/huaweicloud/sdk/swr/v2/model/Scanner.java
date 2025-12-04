package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漏洞扫描器
 */
public class Scanner {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public Scanner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 扫描器的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 扫描器的提供商
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Scanner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 扫描器的版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Scanner that = (Scanner) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.vendor, that.vendor)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vendor, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scanner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
