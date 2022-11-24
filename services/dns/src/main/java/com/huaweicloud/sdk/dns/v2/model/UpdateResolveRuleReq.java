package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routers")

    private List<Router> routers = null;

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

    public UpdateResolveRuleReq withRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    public UpdateResolveRuleReq addRoutersItem(Router routersItem) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        this.routers.add(routersItem);
        return this;
    }

    public UpdateResolveRuleReq withRouters(Consumer<List<Router>> routersSetter) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * 规则关联的目标ip地址。
     * @return routers
     */
    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
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
            && Objects.equals(this.ipaddresses, updateResolveRuleReq.ipaddresses)
            && Objects.equals(this.routers, updateResolveRuleReq.routers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipaddresses, routers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResolveRuleReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
        sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
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
