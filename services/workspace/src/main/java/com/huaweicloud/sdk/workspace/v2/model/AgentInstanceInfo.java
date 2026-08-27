package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Agent 实例信息
 */
public class AgentInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_agent_type")

    private String aiAgentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_status")

    private String desktopStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_connection")

    private String desktopConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config_status")

    private String modelConfigStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_config_status")

    private String channelConfigStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "im_channel_configs")

    private List<String> imChannelConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risks")

    private List<AgentRisk> risks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public AgentInstanceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键 ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgentInstanceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Agent 实例 ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AgentInstanceInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public AgentInstanceInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 关联云桌面 ID
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public AgentInstanceInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域 ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AgentInstanceInfo withAiAgentType(String aiAgentType) {
        this.aiAgentType = aiAgentType;
        return this;
    }

    /**
     * Agent 类型
     * @return aiAgentType
     */
    public String getAiAgentType() {
        return aiAgentType;
    }

    public void setAiAgentType(String aiAgentType) {
        this.aiAgentType = aiAgentType;
    }

    public AgentInstanceInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent 运行状态： - UNREACHABLE：连续3次心跳丢失（90秒无上报），触发告警 - ERROR：Agent进程健康检查连续失败3次或进程异常退出，尝试自动重启 - OFFLINE：桌面关机或重建中，停止心跳检测 - RUNNING：心跳正常且Agent进程健康检查通过
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public AgentInstanceInfo withDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }

    /**
     * 桌面运行状态： - ACTIVE：运行中 - SHUTOFF：已关机 - HIBERNATED：已休眠 - ERROR：故障
     * @return desktopStatus
     */
    public String getDesktopStatus() {
        return desktopStatus;
    }

    public void setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
    }

    public AgentInstanceInfo withDesktopConnection(String desktopConnection) {
        this.desktopConnection = desktopConnection;
        return this;
    }

    /**
     * 桌面连接状态： - UNREGISTER：桌面未注册（关机后也会出现） - REGISTERED：桌面已注册，等待用户连接 - CONNECTED：用户已连接，正在使用桌面 - DISCONNECTED：桌面与客户端断开会话
     * @return desktopConnection
     */
    public String getDesktopConnection() {
        return desktopConnection;
    }

    public void setDesktopConnection(String desktopConnection) {
        this.desktopConnection = desktopConnection;
    }

    public AgentInstanceInfo withModelConfigStatus(String modelConfigStatus) {
        this.modelConfigStatus = modelConfigStatus;
        return this;
    }

    /**
     * 模型配置状态
     * @return modelConfigStatus
     */
    public String getModelConfigStatus() {
        return modelConfigStatus;
    }

    public void setModelConfigStatus(String modelConfigStatus) {
        this.modelConfigStatus = modelConfigStatus;
    }

    public AgentInstanceInfo withChannelConfigStatus(String channelConfigStatus) {
        this.channelConfigStatus = channelConfigStatus;
        return this;
    }

    /**
     * 通道配置状态： - UNCONFIGURED：未配置 - APPLYING：配置中 - CONFIGURED：已配置 - FAILED：配置失败
     * @return channelConfigStatus
     */
    public String getChannelConfigStatus() {
        return channelConfigStatus;
    }

    public void setChannelConfigStatus(String channelConfigStatus) {
        this.channelConfigStatus = channelConfigStatus;
    }

    public AgentInstanceInfo withImChannelConfigs(List<String> imChannelConfigs) {
        this.imChannelConfigs = imChannelConfigs;
        return this;
    }

    public AgentInstanceInfo addImChannelConfigsItem(String imChannelConfigsItem) {
        if (this.imChannelConfigs == null) {
            this.imChannelConfigs = new ArrayList<>();
        }
        this.imChannelConfigs.add(imChannelConfigsItem);
        return this;
    }

    public AgentInstanceInfo withImChannelConfigs(Consumer<List<String>> imChannelConfigsSetter) {
        if (this.imChannelConfigs == null) {
            this.imChannelConfigs = new ArrayList<>();
        }
        imChannelConfigsSetter.accept(this.imChannelConfigs);
        return this;
    }

    /**
     * IM 通道配置 ID 列表
     * @return imChannelConfigs
     */
    public List<String> getImChannelConfigs() {
        return imChannelConfigs;
    }

    public void setImChannelConfigs(List<String> imChannelConfigs) {
        this.imChannelConfigs = imChannelConfigs;
    }

    public AgentInstanceInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AgentInstanceInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AgentInstanceInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品 ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public AgentInstanceInfo withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public AgentInstanceInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像 ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AgentInstanceInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public AgentInstanceInfo withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池 ID
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public AgentInstanceInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AgentInstanceInfo withRisks(List<AgentRisk> risks) {
        this.risks = risks;
        return this;
    }

    public AgentInstanceInfo addRisksItem(AgentRisk risksItem) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        this.risks.add(risksItem);
        return this;
    }

    public AgentInstanceInfo withRisks(Consumer<List<AgentRisk>> risksSetter) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        risksSetter.accept(this.risks);
        return this;
    }

    /**
     * 风险列表
     * @return risks
     */
    public List<AgentRisk> getRisks() {
        return risks;
    }

    public void setRisks(List<AgentRisk> risks) {
        this.risks = risks;
    }

    public AgentInstanceInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Agent 版本号
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public AgentInstanceInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目 ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInstanceInfo that = (AgentInstanceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.aiAgentType, that.aiAgentType)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.desktopStatus, that.desktopStatus)
            && Objects.equals(this.desktopConnection, that.desktopConnection)
            && Objects.equals(this.modelConfigStatus, that.modelConfigStatus)
            && Objects.equals(this.channelConfigStatus, that.channelConfigStatus)
            && Objects.equals(this.imChannelConfigs, that.imChannelConfigs)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.desktopPoolId, that.desktopPoolId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.risks, that.risks) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            instanceName,
            desktopId,
            regionId,
            aiAgentType,
            agentStatus,
            desktopStatus,
            desktopConnection,
            modelConfigStatus,
            channelConfigStatus,
            imChannelConfigs,
            createTime,
            updateTime,
            productId,
            productName,
            imageId,
            imageName,
            desktopPoolId,
            userName,
            risks,
            agentVersion,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInstanceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    aiAgentType: ").append(toIndentedString(aiAgentType)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    desktopStatus: ").append(toIndentedString(desktopStatus)).append("\n");
        sb.append("    desktopConnection: ").append(toIndentedString(desktopConnection)).append("\n");
        sb.append("    modelConfigStatus: ").append(toIndentedString(modelConfigStatus)).append("\n");
        sb.append("    channelConfigStatus: ").append(toIndentedString(channelConfigStatus)).append("\n");
        sb.append("    imChannelConfigs: ").append(toIndentedString(imChannelConfigs)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
