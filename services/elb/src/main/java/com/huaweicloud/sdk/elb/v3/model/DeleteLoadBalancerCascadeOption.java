package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteLoadBalancerCascadeOption
 */
public class DeleteLoadBalancerCascadeOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbounded_pool")

    private Boolean unboundedPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private Boolean publicIp;

    public DeleteLoadBalancerCascadeOption withUnboundedPool(Boolean unboundedPool) {
        this.unboundedPool = unboundedPool;
        return this;
    }

    /**
     * 参数解释：是否删除关联的后端服务器组。  约束限制： - 共享型负载均衡器仅支持传参为true。 [- 若开启多挂特性，且后端服务器组关联了多个LB，则无论传入何值，都不会删除后端服务器组。](tag: hws,hws_hk)  取值范围： - true：删除该后端服务器组。 - false：仅解绑后端服务器组，不删除。  默认取值：true
     * @return unboundedPool
     */
    public Boolean getUnboundedPool() {
        return unboundedPool;
    }

    public void setUnboundedPool(Boolean unboundedPool) {
        this.unboundedPool = unboundedPool;
    }

    public DeleteLoadBalancerCascadeOption withPublicIp(Boolean publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 参数解释：删除负载均衡器后是否删除关联的公网IP。  取值范围： - true：删除关联的EIP。 - false：仅解绑关联的EIP，不删除。
     * @return publicIp
     */
    public Boolean getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(Boolean publicIp) {
        this.publicIp = publicIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLoadBalancerCascadeOption that = (DeleteLoadBalancerCascadeOption) obj;
        return Objects.equals(this.unboundedPool, that.unboundedPool) && Objects.equals(this.publicIp, that.publicIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unboundedPool, publicIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLoadBalancerCascadeOption {\n");
        sb.append("    unboundedPool: ").append(toIndentedString(unboundedPool)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
