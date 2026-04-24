package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSubscriptionDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_data_type")

    private SubscriptionDataType subscriptionDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private SubscriptionEndpointInfo sourceEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "now_time")

    private String nowTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfoVo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowSubscriptionDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSubscriptionDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称 约束：任务名称在4位到50位之间，不区分大小写，可以包含字母、数字、中划线或下划线，不能包括其他特殊字符。 - 最小长度：4 - 最大长度：50
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSubscriptionDetailResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 内网ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowSubscriptionDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowSubscriptionDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，取值： CONFIGURATION：配置中 CREATING：创建中 CREATE_FAILED：创建失败 STARTJOBING：启动中 STARTJOB_FAILED：任务启动失败 SUBSCRIPTION_STARTED：正常 SUBSCRIPTION_FAILED：异常 DELETED：已删除 FROZEN：冻结状态 REBUILD_NODE_STARTED：订阅任务恢复中 REBUILD_NODE_FAILED：订阅任务恢复失败 NODE_UPGRADE_START：升级开始 NODE_UPGRADE_COMPLETE：升级完成 NODE_UPGRADE_FAILED：升级失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSubscriptionDetailResponse withSubscriptionDataType(SubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }

    public ShowSubscriptionDetailResponse withSubscriptionDataType(
        Consumer<SubscriptionDataType> subscriptionDataTypeSetter) {
        if (this.subscriptionDataType == null) {
            this.subscriptionDataType = new SubscriptionDataType();
            subscriptionDataTypeSetter.accept(this.subscriptionDataType);
        }

        return this;
    }

    /**
     * Get subscriptionDataType
     * @return subscriptionDataType
     */
    public SubscriptionDataType getSubscriptionDataType() {
        return subscriptionDataType;
    }

    public void setSubscriptionDataType(SubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
    }

    public ShowSubscriptionDetailResponse withSourceEndpoint(SubscriptionEndpointInfo sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public ShowSubscriptionDetailResponse withSourceEndpoint(Consumer<SubscriptionEndpointInfo> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new SubscriptionEndpointInfo();
            sourceEndpointSetter.accept(this.sourceEndpoint);
        }

        return this;
    }

    /**
     * Get sourceEndpoint
     * @return sourceEndpoint
     */
    public SubscriptionEndpointInfo getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(SubscriptionEndpointInfo sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public ShowSubscriptionDetailResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间，以时间戳表示
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowSubscriptionDetailResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间，以时间戳表示
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowSubscriptionDetailResponse withNowTime(String nowTime) {
        this.nowTime = nowTime;
        return this;
    }

    /**
     * 当前时间，以时间戳表示
     * @return nowTime
     */
    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public ShowSubscriptionDetailResponse withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 链路类型，当前仅支持“mysql”
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ShowSubscriptionDetailResponse withChargeInfo(ChargeInfoVo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public ShowSubscriptionDetailResponse withChargeInfo(Consumer<ChargeInfoVo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfoVo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfoVo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfoVo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public ShowSubscriptionDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubscriptionDetailResponse that = (ShowSubscriptionDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.subscriptionDataType, that.subscriptionDataType)
            && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.nowTime, that.nowTime) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.chargeInfo, that.chargeInfo) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            ip,
            enterpriseProjectId,
            status,
            subscriptionDataType,
            sourceEndpoint,
            createdTime,
            beginTime,
            nowTime,
            engineType,
            chargeInfo,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubscriptionDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subscriptionDataType: ").append(toIndentedString(subscriptionDataType)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    nowTime: ").append(toIndentedString(nowTime)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
