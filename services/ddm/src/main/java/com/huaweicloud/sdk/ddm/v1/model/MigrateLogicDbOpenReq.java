package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MigrateLogicDbOpenReq
 */
public class MigrateLogicDbOpenReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_nodes")

    private List<DataNode> dataNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_route_begin_time")

    private String switchRouteBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_route_end_time")

    private String switchRouteEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_shard_number")

    private String newShardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exclusive")

    private Boolean isExclusive;

    public MigrateLogicDbOpenReq withDataNodes(List<DataNode> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public MigrateLogicDbOpenReq addDataNodesItem(DataNode dataNodesItem) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        this.dataNodes.add(dataNodesItem);
        return this;
    }

    public MigrateLogicDbOpenReq withDataNodes(Consumer<List<DataNode>> dataNodesSetter) {
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
    public List<DataNode> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<DataNode> dataNodes) {
        this.dataNodes = dataNodes;
    }

    public MigrateLogicDbOpenReq withSwitchRouteBeginTime(String switchRouteBeginTime) {
        this.switchRouteBeginTime = switchRouteBeginTime;
        return this;
    }

    /**
     * 路由切换开始时间。
     * @return switchRouteBeginTime
     */
    public String getSwitchRouteBeginTime() {
        return switchRouteBeginTime;
    }

    public void setSwitchRouteBeginTime(String switchRouteBeginTime) {
        this.switchRouteBeginTime = switchRouteBeginTime;
    }

    public MigrateLogicDbOpenReq withSwitchRouteEndTime(String switchRouteEndTime) {
        this.switchRouteEndTime = switchRouteEndTime;
        return this;
    }

    /**
     * 路由切换结束时间。
     * @return switchRouteEndTime
     */
    public String getSwitchRouteEndTime() {
        return switchRouteEndTime;
    }

    public void setSwitchRouteEndTime(String switchRouteEndTime) {
        this.switchRouteEndTime = switchRouteEndTime;
    }

    public MigrateLogicDbOpenReq withNewShardNumber(String newShardNumber) {
        this.newShardNumber = newShardNumber;
        return this;
    }

    /**
     * 新分片数。
     * @return newShardNumber
     */
    public String getNewShardNumber() {
        return newShardNumber;
    }

    public void setNewShardNumber(String newShardNumber) {
        this.newShardNumber = newShardNumber;
    }

    public MigrateLogicDbOpenReq withIsExclusive(Boolean isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    /**
     * 是否独占。
     * @return isExclusive
     */
    public Boolean getIsExclusive() {
        return isExclusive;
    }

    public void setIsExclusive(Boolean isExclusive) {
        this.isExclusive = isExclusive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateLogicDbOpenReq that = (MigrateLogicDbOpenReq) obj;
        return Objects.equals(this.dataNodes, that.dataNodes)
            && Objects.equals(this.switchRouteBeginTime, that.switchRouteBeginTime)
            && Objects.equals(this.switchRouteEndTime, that.switchRouteEndTime)
            && Objects.equals(this.newShardNumber, that.newShardNumber)
            && Objects.equals(this.isExclusive, that.isExclusive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNodes, switchRouteBeginTime, switchRouteEndTime, newShardNumber, isExclusive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateLogicDbOpenReq {\n");
        sb.append("    dataNodes: ").append(toIndentedString(dataNodes)).append("\n");
        sb.append("    switchRouteBeginTime: ").append(toIndentedString(switchRouteBeginTime)).append("\n");
        sb.append("    switchRouteEndTime: ").append(toIndentedString(switchRouteEndTime)).append("\n");
        sb.append("    newShardNumber: ").append(toIndentedString(newShardNumber)).append("\n");
        sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
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
