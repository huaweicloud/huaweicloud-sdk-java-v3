package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.Shards;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SwitchShardRequestBody
 */
public class SwitchShardRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shards")
    
    
    private List<Shards> shards = null;
    
    public SwitchShardRequestBody withShards(List<Shards> shards) {
        this.shards = shards;
        return this;
    }

    
    public SwitchShardRequestBody addShardsItem(Shards shardsItem) {
        if(this.shards == null) {
            this.shards = new ArrayList<>();
        }
        this.shards.add(shardsItem);
        return this;
    }

    public SwitchShardRequestBody withShards(Consumer<List<Shards>> shardsSetter) {
        if(this.shards == null) {
            this.shards = new ArrayList<>();
        }
        shardsSetter.accept(this.shards);
        return this;
    }

    /**
     * 节点列表，支持对单个或者多个DN分片做主备切换。节点信息为将要升主的备DN分片对应的节点id和组件id。
     * @return shards
     */
    public List<Shards> getShards() {
        return shards;
    }

    public void setShards(List<Shards> shards) {
        this.shards = shards;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchShardRequestBody switchShardRequestBody = (SwitchShardRequestBody) o;
        return Objects.equals(this.shards, switchShardRequestBody.shards);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shards);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchShardRequestBody {\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
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

