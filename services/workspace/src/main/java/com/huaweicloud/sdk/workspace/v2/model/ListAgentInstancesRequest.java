package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAgentInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_agent_type")

    private List<String> aiAgentType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private List<String> regionId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private List<String> agentStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_status")

    private List<String> desktopStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_connection")

    private List<String> desktopConnection = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_group_id")

    private String modelGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_config_status")

    private List<String> channelConfigStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_start")

    private OffsetDateTime createTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_end")

    private OffsetDateTime createTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_type")

    private List<String> riskType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config_status")

    private List<String> modelConfigStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private String sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAgentInstancesRequest withAiAgentType(List<String> aiAgentType) {
        this.aiAgentType = aiAgentType;
        return this;
    }

    public ListAgentInstancesRequest addAiAgentTypeItem(String aiAgentTypeItem) {
        if (this.aiAgentType == null) {
            this.aiAgentType = new ArrayList<>();
        }
        this.aiAgentType.add(aiAgentTypeItem);
        return this;
    }

    public ListAgentInstancesRequest withAiAgentType(Consumer<List<String>> aiAgentTypeSetter) {
        if (this.aiAgentType == null) {
            this.aiAgentType = new ArrayList<>();
        }
        aiAgentTypeSetter.accept(this.aiAgentType);
        return this;
    }

    /**
     * Agent 类型，支持多选（OR 逻辑）：OpenClaw / OfficeClaw / HermesAgent
     * @return aiAgentType
     */
    public List<String> getAiAgentType() {
        return aiAgentType;
    }

    public void setAiAgentType(List<String> aiAgentType) {
        this.aiAgentType = aiAgentType;
    }

    public ListAgentInstancesRequest withRegionId(List<String> regionId) {
        this.regionId = regionId;
        return this;
    }

    public ListAgentInstancesRequest addRegionIdItem(String regionIdItem) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        this.regionId.add(regionIdItem);
        return this;
    }

    public ListAgentInstancesRequest withRegionId(Consumer<List<String>> regionIdSetter) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        regionIdSetter.accept(this.regionId);
        return this;
    }

    /**
     * 区域 ID，支持多选（OR 逻辑）
     * @return regionId
     */
    public List<String> getRegionId() {
        return regionId;
    }

    public void setRegionId(List<String> regionId) {
        this.regionId = regionId;
    }

    public ListAgentInstancesRequest withAgentStatus(List<String> agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    public ListAgentInstancesRequest addAgentStatusItem(String agentStatusItem) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        this.agentStatus.add(agentStatusItem);
        return this;
    }

    public ListAgentInstancesRequest withAgentStatus(Consumer<List<String>> agentStatusSetter) {
        if (this.agentStatus == null) {
            this.agentStatus = new ArrayList<>();
        }
        agentStatusSetter.accept(this.agentStatus);
        return this;
    }

    /**
     * Agent 运行状态，支持多选（OR 逻辑）： - UNREACHABLE：连续3次心跳丢失（90秒无上报），触发告警 - ERROR：Agent进程健康检查连续失败3次或进程异常退出，尝试自动重启 - OFFLINE：桌面关机或重建中，停止心跳检测 - RUNNING：心跳正常且Agent进程健康检查通过
     * @return agentStatus
     */
    public List<String> getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(List<String> agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListAgentInstancesRequest withDesktopStatus(List<String> desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }

    public ListAgentInstancesRequest addDesktopStatusItem(String desktopStatusItem) {
        if (this.desktopStatus == null) {
            this.desktopStatus = new ArrayList<>();
        }
        this.desktopStatus.add(desktopStatusItem);
        return this;
    }

    public ListAgentInstancesRequest withDesktopStatus(Consumer<List<String>> desktopStatusSetter) {
        if (this.desktopStatus == null) {
            this.desktopStatus = new ArrayList<>();
        }
        desktopStatusSetter.accept(this.desktopStatus);
        return this;
    }

    /**
     * 桌面运行状态，支持多选（OR 逻辑）： - ACTIVE：运行中 - SHUTOFF：已关机 - HIBERNATED：已休眠 - ERROR：故障
     * @return desktopStatus
     */
    public List<String> getDesktopStatus() {
        return desktopStatus;
    }

    public void setDesktopStatus(List<String> desktopStatus) {
        this.desktopStatus = desktopStatus;
    }

    public ListAgentInstancesRequest withDesktopConnection(List<String> desktopConnection) {
        this.desktopConnection = desktopConnection;
        return this;
    }

    public ListAgentInstancesRequest addDesktopConnectionItem(String desktopConnectionItem) {
        if (this.desktopConnection == null) {
            this.desktopConnection = new ArrayList<>();
        }
        this.desktopConnection.add(desktopConnectionItem);
        return this;
    }

    public ListAgentInstancesRequest withDesktopConnection(Consumer<List<String>> desktopConnectionSetter) {
        if (this.desktopConnection == null) {
            this.desktopConnection = new ArrayList<>();
        }
        desktopConnectionSetter.accept(this.desktopConnection);
        return this;
    }

    /**
     * 桌面连接状态，支持多选（OR 逻辑）： - UNREGISTER：桌面未注册（关机后也会出现） - REGISTERED：桌面已注册，等待用户连接 - CONNECTED：用户已连接，正在使用桌面 - DISCONNECTED：桌面与客户端断开会话
     * @return desktopConnection
     */
    public List<String> getDesktopConnection() {
        return desktopConnection;
    }

    public void setDesktopConnection(List<String> desktopConnection) {
        this.desktopConnection = desktopConnection;
    }

    public ListAgentInstancesRequest withModelGroupId(String modelGroupId) {
        this.modelGroupId = modelGroupId;
        return this;
    }

    /**
     * 已授权的模型分组 ID（单选）
     * @return modelGroupId
     */
    public String getModelGroupId() {
        return modelGroupId;
    }

    public void setModelGroupId(String modelGroupId) {
        this.modelGroupId = modelGroupId;
    }

    public ListAgentInstancesRequest withChannelConfigStatus(List<String> channelConfigStatus) {
        this.channelConfigStatus = channelConfigStatus;
        return this;
    }

    public ListAgentInstancesRequest addChannelConfigStatusItem(String channelConfigStatusItem) {
        if (this.channelConfigStatus == null) {
            this.channelConfigStatus = new ArrayList<>();
        }
        this.channelConfigStatus.add(channelConfigStatusItem);
        return this;
    }

    public ListAgentInstancesRequest withChannelConfigStatus(Consumer<List<String>> channelConfigStatusSetter) {
        if (this.channelConfigStatus == null) {
            this.channelConfigStatus = new ArrayList<>();
        }
        channelConfigStatusSetter.accept(this.channelConfigStatus);
        return this;
    }

    /**
     * 通道配置状态，支持多选（OR 逻辑）： - UNCONFIGURED：未配置 - APPLYING：配置中 - CONFIGURED：已配置 - FAILED：配置失败
     * @return channelConfigStatus
     */
    public List<String> getChannelConfigStatus() {
        return channelConfigStatus;
    }

    public void setChannelConfigStatus(List<String> channelConfigStatus) {
        this.channelConfigStatus = channelConfigStatus;
    }

    public ListAgentInstancesRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称（模糊搜索）
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListAgentInstancesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例 ID（精确搜索）
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAgentInstancesRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 云桌面 ID（精确搜索）
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public ListAgentInstancesRequest withCreateTimeStart(OffsetDateTime createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }

    /**
     * 创建时间范围-开始
     * @return createTimeStart
     */
    public OffsetDateTime getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(OffsetDateTime createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public ListAgentInstancesRequest withCreateTimeEnd(OffsetDateTime createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    /**
     * 创建时间范围-结束
     * @return createTimeEnd
     */
    public OffsetDateTime getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(OffsetDateTime createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public ListAgentInstancesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签过滤，格式：key1=val1,key2=val2，多个键值对用逗号分隔
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListAgentInstancesRequest withRiskType(List<String> riskType) {
        this.riskType = riskType;
        return this;
    }

    public ListAgentInstancesRequest addRiskTypeItem(String riskTypeItem) {
        if (this.riskType == null) {
            this.riskType = new ArrayList<>();
        }
        this.riskType.add(riskTypeItem);
        return this;
    }

    public ListAgentInstancesRequest withRiskType(Consumer<List<String>> riskTypeSetter) {
        if (this.riskType == null) {
            this.riskType = new ArrayList<>();
        }
        riskTypeSetter.accept(this.riskType);
        return this;
    }

    /**
     * 风险类型过滤，支持多选（OR 逻辑）： - MODEL_CONFIG_INCONSISTENT：模型配置不一致 - IM_CHANNEL_CONFIG_INCONSISTENT：IM通道配置不一致
     * @return riskType
     */
    public List<String> getRiskType() {
        return riskType;
    }

    public void setRiskType(List<String> riskType) {
        this.riskType = riskType;
    }

    public ListAgentInstancesRequest withModelConfigStatus(List<String> modelConfigStatus) {
        this.modelConfigStatus = modelConfigStatus;
        return this;
    }

    public ListAgentInstancesRequest addModelConfigStatusItem(String modelConfigStatusItem) {
        if (this.modelConfigStatus == null) {
            this.modelConfigStatus = new ArrayList<>();
        }
        this.modelConfigStatus.add(modelConfigStatusItem);
        return this;
    }

    public ListAgentInstancesRequest withModelConfigStatus(Consumer<List<String>> modelConfigStatusSetter) {
        if (this.modelConfigStatus == null) {
            this.modelConfigStatus = new ArrayList<>();
        }
        modelConfigStatusSetter.accept(this.modelConfigStatus);
        return this;
    }

    /**
     * 模型配置状态，支持多选（OR 逻辑）： - UNCONFIGURED：未配置 - APPLYING：配置中 - CONFIGURED：已配置 - FAILED：配置失败
     * @return modelConfigStatus
     */
    public List<String> getModelConfigStatus() {
        return modelConfigStatus;
    }

    public void setModelConfigStatus(List<String> modelConfigStatus) {
        this.modelConfigStatus = modelConfigStatus;
    }

    public ListAgentInstancesRequest withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Agent 版本号（精确搜索）
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ListAgentInstancesRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段：create_time（默认）/ instance_name / agent_status / heartbeat_time
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListAgentInstancesRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * 排序方向：DESC（默认）/ ASC
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ListAgentInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAgentInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentInstancesRequest that = (ListAgentInstancesRequest) obj;
        return Objects.equals(this.aiAgentType, that.aiAgentType) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.desktopStatus, that.desktopStatus)
            && Objects.equals(this.desktopConnection, that.desktopConnection)
            && Objects.equals(this.modelGroupId, that.modelGroupId)
            && Objects.equals(this.channelConfigStatus, that.channelConfigStatus)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.createTimeStart, that.createTimeStart)
            && Objects.equals(this.createTimeEnd, that.createTimeEnd) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.riskType, that.riskType)
            && Objects.equals(this.modelConfigStatus, that.modelConfigStatus)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortOrder, that.sortOrder) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiAgentType,
            regionId,
            agentStatus,
            desktopStatus,
            desktopConnection,
            modelGroupId,
            channelConfigStatus,
            instanceName,
            instanceId,
            desktopId,
            createTimeStart,
            createTimeEnd,
            tags,
            riskType,
            modelConfigStatus,
            agentVersion,
            sortField,
            sortOrder,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInstancesRequest {\n");
        sb.append("    aiAgentType: ").append(toIndentedString(aiAgentType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    desktopStatus: ").append(toIndentedString(desktopStatus)).append("\n");
        sb.append("    desktopConnection: ").append(toIndentedString(desktopConnection)).append("\n");
        sb.append("    modelGroupId: ").append(toIndentedString(modelGroupId)).append("\n");
        sb.append("    channelConfigStatus: ").append(toIndentedString(channelConfigStatus)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    createTimeStart: ").append(toIndentedString(createTimeStart)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    modelConfigStatus: ").append(toIndentedString(modelConfigStatus)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
