package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateProviderDescriptionPrimitiveTypeHolder
 */
public class PrivateProviderDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_description")

    private String providerDescription;

    public PrivateProviderDescriptionPrimitiveTypeHolder withProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
        return this;
    }

    /**
     * 私有provider（private-provider）的描述。可用于客户识别被管理的私有provider。
     * @return providerDescription
     */
    public String getProviderDescription() {
        return providerDescription;
    }

    public void setProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateProviderDescriptionPrimitiveTypeHolder that = (PrivateProviderDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.providerDescription, that.providerDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateProviderDescriptionPrimitiveTypeHolder {\n");
        sb.append("    providerDescription: ").append(toIndentedString(providerDescription)).append("\n");
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
