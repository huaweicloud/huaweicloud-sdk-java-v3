package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateProviderVersionRequiredPrimitiveTypeHolder
 */
public class PrivateProviderVersionRequiredPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_version")

    private String providerVersion;

    public PrivateProviderVersionRequiredPrimitiveTypeHolder withProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
        return this;
    }

    /**
     * provider的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义
     * @return providerVersion
     */
    public String getProviderVersion() {
        return providerVersion;
    }

    public void setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateProviderVersionRequiredPrimitiveTypeHolder that =
            (PrivateProviderVersionRequiredPrimitiveTypeHolder) obj;
        return Objects.equals(this.providerVersion, that.providerVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateProviderVersionRequiredPrimitiveTypeHolder {\n");
        sb.append("    providerVersion: ").append(toIndentedString(providerVersion)).append("\n");
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
