package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchDeleteLoadbalancersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbounded_pool")

    private Boolean unboundedPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private Boolean publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_ids")

    private List<String> loadbalancerIds = null;

    public BatchDeleteLoadbalancersRequestBody withUnboundedPool(Boolean unboundedPool) {
        this.unboundedPool = unboundedPool;
        return this;
    }

    /**
     * 解绑后的游离pool是否被删除
     * @return unboundedPool
     */
    public Boolean getUnboundedPool() {
        return unboundedPool;
    }

    public void setUnboundedPool(Boolean unboundedPool) {
        this.unboundedPool = unboundedPool;
    }

    public BatchDeleteLoadbalancersRequestBody withPublicIp(Boolean publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 是否删除公网IP
     * @return publicIp
     */
    public Boolean getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(Boolean publicIp) {
        this.publicIp = publicIp;
    }

    public BatchDeleteLoadbalancersRequestBody withLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
        return this;
    }

    public BatchDeleteLoadbalancersRequestBody addLoadbalancerIdsItem(String loadbalancerIdsItem) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        this.loadbalancerIds.add(loadbalancerIdsItem);
        return this;
    }

    public BatchDeleteLoadbalancersRequestBody withLoadbalancerIds(Consumer<List<String>> loadbalancerIdsSetter) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        loadbalancerIdsSetter.accept(this.loadbalancerIds);
        return this;
    }

    /**
     * 待删除的负载均衡器id列表。
     * @return loadbalancerIds
     */
    public List<String> getLoadbalancerIds() {
        return loadbalancerIds;
    }

    public void setLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteLoadbalancersRequestBody that = (BatchDeleteLoadbalancersRequestBody) obj;
        return Objects.equals(this.unboundedPool, that.unboundedPool) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.loadbalancerIds, that.loadbalancerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unboundedPool, publicIp, loadbalancerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteLoadbalancersRequestBody {\n");
        sb.append("    unboundedPool: ").append(toIndentedString(unboundedPool)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    loadbalancerIds: ").append(toIndentedString(loadbalancerIds)).append("\n");
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
