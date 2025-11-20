package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowInstanceDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private List<Shards> shards = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_mode")

    private String shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_number")

    private Integer shardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_nodes")

    private List<DataNodes> dataNodes = null;

    public ShowInstanceDatabaseResponse withShards(List<Shards> shards) {
        this.shards = shards;
        return this;
    }

    public ShowInstanceDatabaseResponse addShardsItem(Shards shardsItem) {
        if (this.shards == null) {
            this.shards = new ArrayList<>();
        }
        this.shards.add(shardsItem);
        return this;
    }

    public ShowInstanceDatabaseResponse withShards(Consumer<List<Shards>> shardsSetter) {
        if (this.shards == null) {
            this.shards = new ArrayList<>();
        }
        shardsSetter.accept(this.shards);
        return this;
    }

    /**
     * 逻辑库分片信息。
     * @return shards
     */
    public List<Shards> getShards() {
        return shards;
    }

    public void setShards(List<Shards> shards) {
        this.shards = shards;
    }

    public ShowInstanceDatabaseResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 逻辑库状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceDatabaseResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowInstanceDatabaseResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceDatabaseResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 逻辑库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceDatabaseResponse withShardMode(String shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * 拆分模式。
     * @return shardMode
     */
    public String getShardMode() {
        return shardMode;
    }

    public void setShardMode(String shardMode) {
        this.shardMode = shardMode;
    }

    public ShowInstanceDatabaseResponse withShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }

    /**
     * 逻辑库分片数。
     * @return shardNumber
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }

    public ShowInstanceDatabaseResponse withDataNodes(List<DataNodes> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public ShowInstanceDatabaseResponse addDataNodesItem(DataNodes dataNodesItem) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        this.dataNodes.add(dataNodesItem);
        return this;
    }

    public ShowInstanceDatabaseResponse withDataNodes(Consumer<List<DataNodes>> dataNodesSetter) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        dataNodesSetter.accept(this.dataNodes);
        return this;
    }

    /**
     * 关联的后端DN信息。
     * @return dataNodes
     */
    public List<DataNodes> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<DataNodes> dataNodes) {
        this.dataNodes = dataNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceDatabaseResponse that = (ShowInstanceDatabaseResponse) obj;
        return Objects.equals(this.shards, that.shards) && Objects.equals(this.status, that.status)
            && Objects.equals(this.created, that.created) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.name, that.name) && Objects.equals(this.shardMode, that.shardMode)
            && Objects.equals(this.shardNumber, that.shardNumber) && Objects.equals(this.dataNodes, that.dataNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shards, status, created, updated, name, shardMode, shardNumber, dataNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceDatabaseResponse {\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
        sb.append("    dataNodes: ").append(toIndentedString(dataNodes)).append("\n");
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
