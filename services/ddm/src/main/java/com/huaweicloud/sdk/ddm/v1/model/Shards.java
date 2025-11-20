package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Shards
 */
public class Shards {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_node_id")

    private String dataNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_db_name")

    private String physicalDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_index")

    private Integer shardIndex;

    public Shards withDataNodeId(String dataNodeId) {
        this.dataNodeId = dataNodeId;
        return this;
    }

    /**
     * 物理分片所在RDS的ID。
     * @return dataNodeId
     */
    public String getDataNodeId() {
        return dataNodeId;
    }

    public void setDataNodeId(String dataNodeId) {
        this.dataNodeId = dataNodeId;
    }

    public Shards withPhysicalDbName(String physicalDbName) {
        this.physicalDbName = physicalDbName;
        return this;
    }

    /**
     * 物理分片名称。
     * @return physicalDbName
     */
    public String getPhysicalDbName() {
        return physicalDbName;
    }

    public void setPhysicalDbName(String physicalDbName) {
        this.physicalDbName = physicalDbName;
    }

    public Shards withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 物理分片运行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Shards withShardIndex(Integer shardIndex) {
        this.shardIndex = shardIndex;
        return this;
    }

    /**
     * 物理分片序号。
     * @return shardIndex
     */
    public Integer getShardIndex() {
        return shardIndex;
    }

    public void setShardIndex(Integer shardIndex) {
        this.shardIndex = shardIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shards that = (Shards) obj;
        return Objects.equals(this.dataNodeId, that.dataNodeId)
            && Objects.equals(this.physicalDbName, that.physicalDbName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.shardIndex, that.shardIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNodeId, physicalDbName, status, shardIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shards {\n");
        sb.append("    dataNodeId: ").append(toIndentedString(dataNodeId)).append("\n");
        sb.append("    physicalDbName: ").append(toIndentedString(physicalDbName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    shardIndex: ").append(toIndentedString(shardIndex)).append("\n");
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
