package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 开源治理策略规则详情
 */
public class OpenSourceRuleContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_set")

    private VersionSetProperty versionSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security")

    private SecurityProperty security;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license")

    private LicenseProperty license;

    public OpenSourceRuleContent withVersionSet(VersionSetProperty versionSet) {
        this.versionSet = versionSet;
        return this;
    }

    public OpenSourceRuleContent withVersionSet(Consumer<VersionSetProperty> versionSetSetter) {
        if (this.versionSet == null) {
            this.versionSet = new VersionSetProperty();
            versionSetSetter.accept(this.versionSet);
        }

        return this;
    }

    /**
     * Get versionSet
     * @return versionSet
     */
    public VersionSetProperty getVersionSet() {
        return versionSet;
    }

    public void setVersionSet(VersionSetProperty versionSet) {
        this.versionSet = versionSet;
    }

    public OpenSourceRuleContent withSecurity(SecurityProperty security) {
        this.security = security;
        return this;
    }

    public OpenSourceRuleContent withSecurity(Consumer<SecurityProperty> securitySetter) {
        if (this.security == null) {
            this.security = new SecurityProperty();
            securitySetter.accept(this.security);
        }

        return this;
    }

    /**
     * Get security
     * @return security
     */
    public SecurityProperty getSecurity() {
        return security;
    }

    public void setSecurity(SecurityProperty security) {
        this.security = security;
    }

    public OpenSourceRuleContent withLicense(LicenseProperty license) {
        this.license = license;
        return this;
    }

    public OpenSourceRuleContent withLicense(Consumer<LicenseProperty> licenseSetter) {
        if (this.license == null) {
            this.license = new LicenseProperty();
            licenseSetter.accept(this.license);
        }

        return this;
    }

    /**
     * Get license
     * @return license
     */
    public LicenseProperty getLicense() {
        return license;
    }

    public void setLicense(LicenseProperty license) {
        this.license = license;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenSourceRuleContent that = (OpenSourceRuleContent) obj;
        return Objects.equals(this.versionSet, that.versionSet) && Objects.equals(this.security, that.security)
            && Objects.equals(this.license, that.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionSet, security, license);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenSourceRuleContent {\n");
        sb.append("    versionSet: ").append(toIndentedString(versionSet)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
