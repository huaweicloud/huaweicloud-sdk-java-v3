package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络实例BGP协议的AS号。
 */
public class Asn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asn")

    private Long asn;

    public Asn withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * 网络实例BGP协议的AS号。
     * minimum: 0
     * maximum: 4294967295
     * @return asn
     */
    public Long getAsn() {
        return asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Asn that = (Asn) obj;
        return Objects.equals(this.asn, that.asn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Asn {\n");
        sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
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
