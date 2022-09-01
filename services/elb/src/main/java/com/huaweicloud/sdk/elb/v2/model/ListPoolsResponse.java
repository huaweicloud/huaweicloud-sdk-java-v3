package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
    @JsonProperty(value = "pools")

    @JacksonXmlProperty(localName = "pools")

    private List<PoolResp> pools = null;

    public ListPoolsResponse withPools(List<PoolResp> pools) {
        this.pools = pools;
        return this;
    }

    public ListPoolsResponse addPoolsItem(PoolResp poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public ListPoolsResponse withPools(Consumer<List<PoolResp>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 后端云服务器对象组列表
     * @return pools
     */
    public List<PoolResp> getPools() {
        return pools;
    }

    public void setPools(List<PoolResp> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPoolsResponse listPoolsResponse = (ListPoolsResponse) o;
        return Objects.equals(this.pools, listPoolsResponse.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsResponse {\n");
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
