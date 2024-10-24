package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginInstallBasicParam
 */
public class PluginInstallBasicParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_version")

    private String installVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ak")

    private String domainAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_sk")

    private String domainSk;

    public PluginInstallBasicParam withInstallVersion(String installVersion) {
        this.installVersion = installVersion;
        return this;
    }

    /**
     * 指定安装的ICAgent版本。
     * @return installVersion
     */
    public String getInstallVersion() {
        return installVersion;
    }

    public void setInstallVersion(String installVersion) {
        this.installVersion = installVersion;
    }

    public PluginInstallBasicParam withDomainAk(String domainAk) {
        this.domainAk = domainAk;
        return this;
    }

    /**
     * IAM账号AK，选填。.
     * @return domainAk
     */
    public String getDomainAk() {
        return domainAk;
    }

    public void setDomainAk(String domainAk) {
        this.domainAk = domainAk;
    }

    public PluginInstallBasicParam withDomainSk(String domainSk) {
        this.domainSk = domainSk;
        return this;
    }

    /**
     * IAM账号SK，选填。
     * @return domainSk
     */
    public String getDomainSk() {
        return domainSk;
    }

    public void setDomainSk(String domainSk) {
        this.domainSk = domainSk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginInstallBasicParam that = (PluginInstallBasicParam) obj;
        return Objects.equals(this.installVersion, that.installVersion) && Objects.equals(this.domainAk, that.domainAk)
            && Objects.equals(this.domainSk, that.domainSk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installVersion, domainAk, domainSk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginInstallBasicParam {\n");
        sb.append("    installVersion: ").append(toIndentedString(installVersion)).append("\n");
        sb.append("    domainAk: ").append(toIndentedString(domainAk)).append("\n");
        sb.append("    domainSk: ").append(toIndentedString(domainSk)).append("\n");
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
