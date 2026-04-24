package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上网DNS管控策略
 */
public class PoliciesDomainControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_enabled")

    private Boolean defaultEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_rules")

    private String domainRules;

    public PoliciesDomainControl withDefaultEnabled(Boolean defaultEnabled) {
        this.defaultEnabled = defaultEnabled;
        return this;
    }

    /**
     * 默认开关
     * @return defaultEnabled
     */
    public Boolean getDefaultEnabled() {
        return defaultEnabled;
    }

    public void setDefaultEnabled(Boolean defaultEnabled) {
        this.defaultEnabled = defaultEnabled;
    }

    public PoliciesDomainControl withDomainRules(String domainRules) {
        this.domainRules = domainRules;
        return this;
    }

    /**
     * 域名
     * @return domainRules
     */
    public String getDomainRules() {
        return domainRules;
    }

    public void setDomainRules(String domainRules) {
        this.domainRules = domainRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDomainControl that = (PoliciesDomainControl) obj;
        return Objects.equals(this.defaultEnabled, that.defaultEnabled)
            && Objects.equals(this.domainRules, that.domainRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultEnabled, domainRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDomainControl {\n");
        sb.append("    defaultEnabled: ").append(toIndentedString(defaultEnabled)).append("\n");
        sb.append("    domainRules: ").append(toIndentedString(domainRules)).append("\n");
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
