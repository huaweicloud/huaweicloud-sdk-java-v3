package com.huaweicloud.sdk.bcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.BlockchainInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBlockchainsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchains")
    
    private List<BlockchainInfo> blockchains = null;
    
    public ListBlockchainsResponse withBlockchains(List<BlockchainInfo> blockchains) {
        this.blockchains = blockchains;
        return this;
    }

    
    public ListBlockchainsResponse addBlockchainsItem(BlockchainInfo blockchainsItem) {
        this.blockchains.add(blockchainsItem);
        return this;
    }

    public ListBlockchainsResponse withBlockchains(Consumer<List<BlockchainInfo>> blockchainsSetter) {
        if(this.blockchains == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBlockchainsResponse listBlockchainsResponse = (ListBlockchainsResponse) o;
        return Objects.equals(this.blockchains, listBlockchainsResponse.blockchains);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockchains);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlockchainsResponse {\n");
        sb.append("    blockchains: ").append(toIndentedString(blockchains)).append("\n");
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

