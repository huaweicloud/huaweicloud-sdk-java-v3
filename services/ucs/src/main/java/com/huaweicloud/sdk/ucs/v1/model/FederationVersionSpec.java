package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FederationVersionSpec
 */
public class FederationVersionSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FederationVersion")

    private String federationVersion;

    public FederationVersionSpec withFederationVersion(String federationVersion) {
        this.federationVersion = federationVersion;
        return this;
    }

    /**
     * 联邦版本
     * @return federationVersion
     */
    public String getFederationVersion() {
        return federationVersion;
    }

    public void setFederationVersion(String federationVersion) {
        this.federationVersion = federationVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FederationVersionSpec that = (FederationVersionSpec) obj;
        return Objects.equals(this.federationVersion, that.federationVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(federationVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FederationVersionSpec {\n");
        sb.append("    federationVersion: ").append(toIndentedString(federationVersion)).append("\n");
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
