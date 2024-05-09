package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建CAE环境访问VPC配置。
 */
public class VpcEgressRequestBodySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<EgressCidr> cidrs = null;

    public VpcEgressRequestBodySpec withCidrs(List<EgressCidr> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public VpcEgressRequestBodySpec addCidrsItem(EgressCidr cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public VpcEgressRequestBodySpec withCidrs(Consumer<List<EgressCidr>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    /**
     * CAE环境访问VPC配置。
     * @return cidrs
     */
    public List<EgressCidr> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<EgressCidr> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcEgressRequestBodySpec that = (VpcEgressRequestBodySpec) obj;
        return Objects.equals(this.cidrs, that.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcEgressRequestBodySpec {\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
