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
public class MigrateResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_shard_num")

    private Integer originalShardNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_shard_num")

    private Integer afterShardNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_dn_info_list")

    private List<MigrateDnInfoOpenResponse> originalDnInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_dn_info_list")

    private List<MigrateDnInfoOpenResponse> afterDnInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_route_is_manual")

    private Boolean switchRouteIsManual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_switch_begin_time")

    private String autoSwitchBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_switch_end_time")

    private String autoSwitchEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_for_migrate")

    private String nodeIdForMigrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exclusive")

    private Boolean isExclusive;

    public MigrateResultsResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public MigrateResultsResponse withOriginalShardNum(Integer originalShardNum) {
        this.originalShardNum = originalShardNum;
        return this;
    }

    /**
     * 原始分片数。
     * minimum: 1
     * maximum: 2147483647
     * @return originalShardNum
     */
    public Integer getOriginalShardNum() {
        return originalShardNum;
    }

    public void setOriginalShardNum(Integer originalShardNum) {
        this.originalShardNum = originalShardNum;
    }

    public MigrateResultsResponse withAfterShardNum(Integer afterShardNum) {
        this.afterShardNum = afterShardNum;
        return this;
    }

    /**
     * 现分片数。
     * minimum: 1
     * maximum: 2147483647
     * @return afterShardNum
     */
    public Integer getAfterShardNum() {
        return afterShardNum;
    }

    public void setAfterShardNum(Integer afterShardNum) {
        this.afterShardNum = afterShardNum;
    }

    public MigrateResultsResponse withOriginalDnInfoList(List<MigrateDnInfoOpenResponse> originalDnInfoList) {
        this.originalDnInfoList = originalDnInfoList;
        return this;
    }

    public MigrateResultsResponse addOriginalDnInfoListItem(MigrateDnInfoOpenResponse originalDnInfoListItem) {
        if (this.originalDnInfoList == null) {
            this.originalDnInfoList = new ArrayList<>();
        }
        this.originalDnInfoList.add(originalDnInfoListItem);
        return this;
    }

    public MigrateResultsResponse withOriginalDnInfoList(
        Consumer<List<MigrateDnInfoOpenResponse>> originalDnInfoListSetter) {
        if (this.originalDnInfoList == null) {
            this.originalDnInfoList = new ArrayList<>();
        }
        originalDnInfoListSetter.accept(this.originalDnInfoList);
        return this;
    }

    /**
     * 分片变更前关联的后端DN信息。
     * @return originalDnInfoList
     */
    public List<MigrateDnInfoOpenResponse> getOriginalDnInfoList() {
        return originalDnInfoList;
    }

    public void setOriginalDnInfoList(List<MigrateDnInfoOpenResponse> originalDnInfoList) {
        this.originalDnInfoList = originalDnInfoList;
    }

    public MigrateResultsResponse withAfterDnInfoList(List<MigrateDnInfoOpenResponse> afterDnInfoList) {
        this.afterDnInfoList = afterDnInfoList;
        return this;
    }

    public MigrateResultsResponse addAfterDnInfoListItem(MigrateDnInfoOpenResponse afterDnInfoListItem) {
        if (this.afterDnInfoList == null) {
            this.afterDnInfoList = new ArrayList<>();
        }
        this.afterDnInfoList.add(afterDnInfoListItem);
        return this;
    }

    public MigrateResultsResponse withAfterDnInfoList(Consumer<List<MigrateDnInfoOpenResponse>> afterDnInfoListSetter) {
        if (this.afterDnInfoList == null) {
            this.afterDnInfoList = new ArrayList<>();
        }
        afterDnInfoListSetter.accept(this.afterDnInfoList);
        return this;
    }

    /**
     * 分片变更后关联的后端DN信息。
     * @return afterDnInfoList
     */
    public List<MigrateDnInfoOpenResponse> getAfterDnInfoList() {
        return afterDnInfoList;
    }

    public void setAfterDnInfoList(List<MigrateDnInfoOpenResponse> afterDnInfoList) {
        this.afterDnInfoList = afterDnInfoList;
    }

    public MigrateResultsResponse withSwitchRouteIsManual(Boolean switchRouteIsManual) {
        this.switchRouteIsManual = switchRouteIsManual;
        return this;
    }

    /**
     * 是否手动切换路由。
     * @return switchRouteIsManual
     */
    public Boolean getSwitchRouteIsManual() {
        return switchRouteIsManual;
    }

    public void setSwitchRouteIsManual(Boolean switchRouteIsManual) {
        this.switchRouteIsManual = switchRouteIsManual;
    }

    public MigrateResultsResponse withAutoSwitchBeginTime(String autoSwitchBeginTime) {
        this.autoSwitchBeginTime = autoSwitchBeginTime;
        return this;
    }

    /**
     * 自动切换路由开始时间。
     * @return autoSwitchBeginTime
     */
    public String getAutoSwitchBeginTime() {
        return autoSwitchBeginTime;
    }

    public void setAutoSwitchBeginTime(String autoSwitchBeginTime) {
        this.autoSwitchBeginTime = autoSwitchBeginTime;
    }

    public MigrateResultsResponse withAutoSwitchEndTime(String autoSwitchEndTime) {
        this.autoSwitchEndTime = autoSwitchEndTime;
        return this;
    }

    /**
     * 自动切换路由结束时间。
     * @return autoSwitchEndTime
     */
    public String getAutoSwitchEndTime() {
        return autoSwitchEndTime;
    }

    public void setAutoSwitchEndTime(String autoSwitchEndTime) {
        this.autoSwitchEndTime = autoSwitchEndTime;
    }

    public MigrateResultsResponse withNodeIdForMigrate(String nodeIdForMigrate) {
        this.nodeIdForMigrate = nodeIdForMigrate;
        return this;
    }

    /**
     * 分片变更的节点。
     * @return nodeIdForMigrate
     */
    public String getNodeIdForMigrate() {
        return nodeIdForMigrate;
    }

    public void setNodeIdForMigrate(String nodeIdForMigrate) {
        this.nodeIdForMigrate = nodeIdForMigrate;
    }

    public MigrateResultsResponse withIsExclusive(Boolean isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    /**
     * 是否独占式。
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
        MigrateResultsResponse that = (MigrateResultsResponse) obj;
        return Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.originalShardNum, that.originalShardNum)
            && Objects.equals(this.afterShardNum, that.afterShardNum)
            && Objects.equals(this.originalDnInfoList, that.originalDnInfoList)
            && Objects.equals(this.afterDnInfoList, that.afterDnInfoList)
            && Objects.equals(this.switchRouteIsManual, that.switchRouteIsManual)
            && Objects.equals(this.autoSwitchBeginTime, that.autoSwitchBeginTime)
            && Objects.equals(this.autoSwitchEndTime, that.autoSwitchEndTime)
            && Objects.equals(this.nodeIdForMigrate, that.nodeIdForMigrate)
            && Objects.equals(this.isExclusive, that.isExclusive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            originalShardNum,
            afterShardNum,
            originalDnInfoList,
            afterDnInfoList,
            switchRouteIsManual,
            autoSwitchBeginTime,
            autoSwitchEndTime,
            nodeIdForMigrate,
            isExclusive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateResultsResponse {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    originalShardNum: ").append(toIndentedString(originalShardNum)).append("\n");
        sb.append("    afterShardNum: ").append(toIndentedString(afterShardNum)).append("\n");
        sb.append("    originalDnInfoList: ").append(toIndentedString(originalDnInfoList)).append("\n");
        sb.append("    afterDnInfoList: ").append(toIndentedString(afterDnInfoList)).append("\n");
        sb.append("    switchRouteIsManual: ").append(toIndentedString(switchRouteIsManual)).append("\n");
        sb.append("    autoSwitchBeginTime: ").append(toIndentedString(autoSwitchBeginTime)).append("\n");
        sb.append("    autoSwitchEndTime: ").append(toIndentedString(autoSwitchEndTime)).append("\n");
        sb.append("    nodeIdForMigrate: ").append(toIndentedString(nodeIdForMigrate)).append("\n");
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
