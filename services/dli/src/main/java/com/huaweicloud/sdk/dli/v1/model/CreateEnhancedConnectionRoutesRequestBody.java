package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateEnhancedConnectionRoutesRequestBody
 */
public class CreateEnhancedConnectionRoutesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    public CreateEnhancedConnectionRoutesRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 路由名称，长度限制：1-64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEnhancedConnectionRoutesRequestBody withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 路由网段范围。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEnhancedConnectionRoutesRequestBody that = (CreateEnhancedConnectionRoutesRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cidr, that.cidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnhancedConnectionRoutesRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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
