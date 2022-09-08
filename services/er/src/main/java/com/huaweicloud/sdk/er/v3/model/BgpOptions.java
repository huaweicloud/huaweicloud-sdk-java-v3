package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BGP选路配置参数
 */
public class BgpOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_balancing_as_path_ignore")

    private Boolean loadBalancingAsPathIgnore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_balancing_as_path_relax")

    private Boolean loadBalancingAsPathRelax;

    public BgpOptions withLoadBalancingAsPathIgnore(Boolean loadBalancingAsPathIgnore) {
        this.loadBalancingAsPathIgnore = loadBalancingAsPathIgnore;
        return this;
    }

    /**
     * 配置路由在形成负载分担时不比较路由的AS-Path属性
     * @return loadBalancingAsPathIgnore
     */
    public Boolean getLoadBalancingAsPathIgnore() {
        return loadBalancingAsPathIgnore;
    }

    public void setLoadBalancingAsPathIgnore(Boolean loadBalancingAsPathIgnore) {
        this.loadBalancingAsPathIgnore = loadBalancingAsPathIgnore;
    }

    public BgpOptions withLoadBalancingAsPathRelax(Boolean loadBalancingAsPathRelax) {
        this.loadBalancingAsPathRelax = loadBalancingAsPathRelax;
        return this;
    }

    /**
     * 配置路由在形成负载分担时不比较相同长度的AS-Path属性
     * @return loadBalancingAsPathRelax
     */
    public Boolean getLoadBalancingAsPathRelax() {
        return loadBalancingAsPathRelax;
    }

    public void setLoadBalancingAsPathRelax(Boolean loadBalancingAsPathRelax) {
        this.loadBalancingAsPathRelax = loadBalancingAsPathRelax;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BgpOptions bgpOptions = (BgpOptions) o;
        return Objects.equals(this.loadBalancingAsPathIgnore, bgpOptions.loadBalancingAsPathIgnore)
            && Objects.equals(this.loadBalancingAsPathRelax, bgpOptions.loadBalancingAsPathRelax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadBalancingAsPathIgnore, loadBalancingAsPathRelax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BgpOptions {\n");
        sb.append("    loadBalancingAsPathIgnore: ").append(toIndentedString(loadBalancingAsPathIgnore)).append("\n");
        sb.append("    loadBalancingAsPathRelax: ").append(toIndentedString(loadBalancingAsPathRelax)).append("\n");
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
