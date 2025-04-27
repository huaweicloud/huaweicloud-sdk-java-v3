package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateResolverRuleRequestBody
 */
public class UpdateResolverRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddresses")

    private List<IpInfo> ipaddresses = null;

    public UpdateResolverRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称。 取值范围：1-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateResolverRuleRequestBody withIpaddresses(List<IpInfo> ipaddresses) {
        this.ipaddresses = ipaddresses;
        return this;
    }

    public UpdateResolverRuleRequestBody addIpaddressesItem(IpInfo ipaddressesItem) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        this.ipaddresses.add(ipaddressesItem);
        return this;
    }

    public UpdateResolverRuleRequestBody withIpaddresses(Consumer<List<IpInfo>> ipaddressesSetter) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        ipaddressesSetter.accept(this.ipaddresses);
        return this;
    }

    /**
     * 规则的目标IP地址。
     * @return ipaddresses
     */
    public List<IpInfo> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(List<IpInfo> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResolverRuleRequestBody that = (UpdateResolverRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ipaddresses, that.ipaddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipaddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResolverRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
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
