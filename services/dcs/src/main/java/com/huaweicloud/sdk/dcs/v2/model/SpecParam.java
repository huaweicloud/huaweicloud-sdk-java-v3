package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SpecParam
 */
public class SpecParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharding_count")

    private Integer shardingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_count")

    private Integer replicaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    private String cacheMode;

    public SpecParam withShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }

    /**
     * **参数解释**： 实例分片数。 **约束限制**： 不涉及。 **取值范围**： 1-128。 **默认取值**： 不涉及。 
     * @return shardingCount
     */
    public Integer getShardingCount() {
        return shardingCount;
    }

    public void setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
    }

    public SpecParam withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * 副本数 **参数解释**： 实例副本数。 **约束限制**： 不涉及。 **取值范围**： 1-10。 **默认取值**： 不涉及。
     * @return replicaCount
     */
    public Integer getReplicaCount() {
        return replicaCount;
    }

    public void setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
    }

    public SpecParam withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /**
     * 副本数 **参数解释**： 实例类型。 **约束限制**： 不涉及。 **取值范围**： 1.ha：主备类型 2.single：单机类型 3.ha_rw_split：读写分离类型 4.proxy：proxy集群类型 5.cluster：cluster集群类型 **默认取值**： 不涉及。
     * @return cacheMode
     */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecParam that = (SpecParam) obj;
        return Objects.equals(this.shardingCount, that.shardingCount)
            && Objects.equals(this.replicaCount, that.replicaCount) && Objects.equals(this.cacheMode, that.cacheMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shardingCount, replicaCount, cacheMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecParam {\n");
        sb.append("    shardingCount: ").append(toIndentedString(shardingCount)).append("\n");
        sb.append("    replicaCount: ").append(toIndentedString(replicaCount)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
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
