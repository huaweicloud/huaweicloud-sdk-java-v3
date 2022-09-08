package com.huaweicloud.sdk.bcs.v2.model;

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
public class ListBlockchainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchains")

    private List<BlockchainInfo> blockchains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListBlockchainsResponse withBlockchains(List<BlockchainInfo> blockchains) {
        this.blockchains = blockchains;
        return this;
    }

    public ListBlockchainsResponse addBlockchainsItem(BlockchainInfo blockchainsItem) {
        if (this.blockchains == null) {
            this.blockchains = new ArrayList<>();
        }
        this.blockchains.add(blockchainsItem);
        return this;
    }

    public ListBlockchainsResponse withBlockchains(Consumer<List<BlockchainInfo>> blockchainsSetter) {
        if (this.blockchains == null) {
            this.blockchains = new ArrayList<>();
        }
        blockchainsSetter.accept(this.blockchains);
        return this;
    }

    /**
     * 服务实例简要信息
     * @return blockchains
     */
    public List<BlockchainInfo> getBlockchains() {
        return blockchains;
    }

    public void setBlockchains(List<BlockchainInfo> blockchains) {
        this.blockchains = blockchains;
    }

    public ListBlockchainsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 实例总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBlockchainsResponse listBlockchainsResponse = (ListBlockchainsResponse) o;
        return Objects.equals(this.blockchains, listBlockchainsResponse.blockchains)
            && Objects.equals(this.count, listBlockchainsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchains, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlockchainsResponse {\n");
        sb.append("    blockchains: ").append(toIndentedString(blockchains)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
