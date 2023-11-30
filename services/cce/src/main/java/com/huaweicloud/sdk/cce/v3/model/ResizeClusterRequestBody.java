package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 变更集群规格的请求体
 */
public class ResizeClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorResize")

    private String flavorResize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ResizeClusterRequestBodyExtendParam extendParam;

    public ResizeClusterRequestBody withFlavorResize(String flavorResize) {
        this.flavorResize = flavorResize;
        return this;
    }

    /**
     * 要变更的目标规格。仅支持变更集群最大节点规模，不支持变更控制节点数，且不支持降低集群规格。例如原集群规格为cce.s2.medium，仅支持变更至cce.s2.large及以上规格，不支持变更至cce.s2.small或cce.s1.medium。  - cce.s1.small: 小规模单控制节点CCE集群（最大50节点） - cce.s1.medium: 中等规模单控制节点CCE集群（最大200节点） - cce.s2.small: 小规模多控制节点CCE集群（最大50节点） - cce.s2.medium: 中等规模多控制节点CCE集群（最大200节点） - cce.s2.large: 大规模多控制节点CCE集群（最大1000节点） - cce.s2.xlarge: 超大规模多控制节点CCE集群（最大2000节点）  >    关于规格参数中的字段说明如下： >    - s1：单控制节点的集群，控制节点数为1。单控制节点故障后，集群将不可用，但已运行工作负载不受影响。 >    - s2：多控制节点的集群，即高可用集群，控制节点数为3。当某个控制节点故障时，集群仍然可用。 >    [- dec：表示专属云的CCE集群规格。例如cce.dec.s1.small表示小规模单控制节点的专属云CCE集群（最大50节点）。](tag:hws,hws_hk) >    - small：表示集群支持管理的最大节点规模为50节点。 >    - medium：表示集群支持管理的最大节点规模为200节点。 >    - large：表示集群支持管理的最大节点规模为1000节点。 >    - xlarge：表示集群支持管理的最大节点规模为2000节点。。 
     * @return flavorResize
     */
    public String getFlavorResize() {
        return flavorResize;
    }

    public void setFlavorResize(String flavorResize) {
        this.flavorResize = flavorResize;
    }

    public ResizeClusterRequestBody withExtendParam(ResizeClusterRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ResizeClusterRequestBody withExtendParam(Consumer<ResizeClusterRequestBodyExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ResizeClusterRequestBodyExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ResizeClusterRequestBodyExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ResizeClusterRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterRequestBody that = (ResizeClusterRequestBody) obj;
        return Objects.equals(this.flavorResize, that.flavorResize)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorResize, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterRequestBody {\n");
        sb.append("    flavorResize: ").append(toIndentedString(flavorResize)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
