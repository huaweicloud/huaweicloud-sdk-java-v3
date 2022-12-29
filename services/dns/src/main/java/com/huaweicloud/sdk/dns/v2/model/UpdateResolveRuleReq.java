package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateResolveRuleReq
 */
public class UpdateResolveRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddresses")

    private IpInfo ipaddresses;

    public UpdateResolveRuleReq withName(String name) {
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

    public UpdateResolveRuleReq withIpaddresses(IpInfo ipaddresses) {
        this.ipaddresses = ipaddresses;
        return this;
    }

    public UpdateResolveRuleReq withIpaddresses(Consumer<IpInfo> ipaddressesSetter) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new IpInfo();
            ipaddressesSetter.accept(this.ipaddresses);
        }

        return this;
    }

    /**
     * Get ipaddresses
     * @return ipaddresses
     */
    public IpInfo getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(IpInfo ipaddresses) {
        this.ipaddresses = ipaddresses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResolveRuleReq updateResolveRuleReq = (UpdateResolveRuleReq) o;
        return Objects.equals(this.name, updateResolveRuleReq.name)
            && Objects.equals(this.ipaddresses, updateResolveRuleReq.ipaddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipaddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResolveRuleReq {\n");
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
