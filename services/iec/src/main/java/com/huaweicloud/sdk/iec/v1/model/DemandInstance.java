package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户需求
 */
public class DemandInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_ids")

    private List<String> poolIds = null;

    public DemandInstance withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 弹性公网IP池。 多线路场景下，将在该弹性公网IP池下创建弹性公网IP。 > 覆盖规则为省级/大区时不支持指定线路ID创建边缘业务。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public DemandInstance withPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
        return this;
    }

    public DemandInstance addPoolIdsItem(String poolIdsItem) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        this.poolIds.add(poolIdsItem);
        return this;
    }

    public DemandInstance withPoolIds(Consumer<List<String>> poolIdsSetter) {
        if (this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        poolIdsSetter.accept(this.poolIds);
        return this;
    }

    /**
     * 线路ID集合。多线路场景下，将在各线路下创建弹性公网IP。
     * @return poolIds
     */
    public List<String> getPoolIds() {
        return poolIds;
    }

    public void setPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DemandInstance that = (DemandInstance) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.poolIds, that.poolIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, poolIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandInstance {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
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
