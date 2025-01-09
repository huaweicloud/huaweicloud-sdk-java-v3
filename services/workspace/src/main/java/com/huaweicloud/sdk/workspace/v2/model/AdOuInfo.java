package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdOuInfo
 */
public class AdOuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_dn")

    private String ouDn;

    public AdOuInfo withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 名称
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public AdOuInfo withOuDn(String ouDn) {
        this.ouDn = ouDn;
        return this;
    }

    /**
     * 域名地址
     * @return ouDn
     */
    public String getOuDn() {
        return ouDn;
    }

    public void setOuDn(String ouDn) {
        this.ouDn = ouDn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdOuInfo that = (AdOuInfo) obj;
        return Objects.equals(this.ouName, that.ouName) && Objects.equals(this.ouDn, that.ouDn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ouName, ouDn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdOuInfo {\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    ouDn: ").append(toIndentedString(ouDn)).append("\n");
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
