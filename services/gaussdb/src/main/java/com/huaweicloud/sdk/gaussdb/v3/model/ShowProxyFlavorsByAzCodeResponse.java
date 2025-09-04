package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProxyFlavorsByAzCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_flavor_groups")

    private List<ProxyFlavorGroup> proxyFlavorGroups = null;

    public ShowProxyFlavorsByAzCodeResponse withProxyFlavorGroups(List<ProxyFlavorGroup> proxyFlavorGroups) {
        this.proxyFlavorGroups = proxyFlavorGroups;
        return this;
    }

    public ShowProxyFlavorsByAzCodeResponse addProxyFlavorGroupsItem(ProxyFlavorGroup proxyFlavorGroupsItem) {
        if (this.proxyFlavorGroups == null) {
            this.proxyFlavorGroups = new ArrayList<>();
        }
        this.proxyFlavorGroups.add(proxyFlavorGroupsItem);
        return this;
    }

    public ShowProxyFlavorsByAzCodeResponse withProxyFlavorGroups(
        Consumer<List<ProxyFlavorGroup>> proxyFlavorGroupsSetter) {
        if (this.proxyFlavorGroups == null) {
            this.proxyFlavorGroups = new ArrayList<>();
        }
        proxyFlavorGroupsSetter.accept(this.proxyFlavorGroups);
        return this;
    }

    /**
     * **参数解释**：  代理规格分组信息。
     * @return proxyFlavorGroups
     */
    public List<ProxyFlavorGroup> getProxyFlavorGroups() {
        return proxyFlavorGroups;
    }

    public void setProxyFlavorGroups(List<ProxyFlavorGroup> proxyFlavorGroups) {
        this.proxyFlavorGroups = proxyFlavorGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProxyFlavorsByAzCodeResponse that = (ShowProxyFlavorsByAzCodeResponse) obj;
        return Objects.equals(this.proxyFlavorGroups, that.proxyFlavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyFlavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProxyFlavorsByAzCodeResponse {\n");
        sb.append("    proxyFlavorGroups: ").append(toIndentedString(proxyFlavorGroups)).append("\n");
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
