package com.huaweicloud.sdk.dss.v1.model;

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
public class ListPoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<PoolDetails> pools = null;

    public ListPoolsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 专属分布式存储池个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPoolsResponse withPools(List<PoolDetails> pools) {
        this.pools = pools;
        return this;
    }

    public ListPoolsResponse addPoolsItem(PoolDetails poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public ListPoolsResponse withPools(Consumer<List<PoolDetails>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 专属分布式存储池详情列表。
     * @return pools
     */
    public List<PoolDetails> getPools() {
        return pools;
    }

    public void setPools(List<PoolDetails> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPoolsResponse that = (ListPoolsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pools, that.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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
