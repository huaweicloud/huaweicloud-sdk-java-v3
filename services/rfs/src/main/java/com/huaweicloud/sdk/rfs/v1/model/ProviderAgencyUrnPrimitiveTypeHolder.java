package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProviderAgencyUrnPrimitiveTypeHolder
 */
public class ProviderAgencyUrnPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_agency_urn")

    private String providerAgencyUrn;

    public ProviderAgencyUrnPrimitiveTypeHolder withProviderAgencyUrn(String providerAgencyUrn) {
        this.providerAgencyUrn = providerAgencyUrn;
        return this;
    }

    /**
     * 自定义provider所绑定的IAM委托URN，provider_agency_name和provider_agency_urn最多只能提供一个。
     * @return providerAgencyUrn
     */
    public String getProviderAgencyUrn() {
        return providerAgencyUrn;
    }

    public void setProviderAgencyUrn(String providerAgencyUrn) {
        this.providerAgencyUrn = providerAgencyUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProviderAgencyUrnPrimitiveTypeHolder that = (ProviderAgencyUrnPrimitiveTypeHolder) obj;
        return Objects.equals(this.providerAgencyUrn, that.providerAgencyUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerAgencyUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderAgencyUrnPrimitiveTypeHolder {\n");
        sb.append("    providerAgencyUrn: ").append(toIndentedString(providerAgencyUrn)).append("\n");
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
