package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InferDeploymentItemResponseData
 */
public class InferDeploymentItemResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group_name")

    private String serviceGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_state")

    private String ltsState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_enable")

    private Boolean mirrorTrafficEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_weight")

    private String mirrorTrafficWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ratio")

    private String trafficRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_infos")

    private List<FrozenInfo> frozenInfos = null;

    public InferDeploymentItemResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务ID，在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **取值范围：** 服务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InferDeploymentItemResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 部署名，用户在[创建服务](CreateInferService.xml)时自定义。 **取值范围：** 支持1-128个字符，可以包含字母、汉字、数字、连字符和下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InferDeploymentItemResponseData withInferName(String inferName) {
        this.inferName = inferName;
        return this;
    }

    /**
     * **参数解释：** 部署ID。 **取值范围：** 不涉及
     * @return inferName
     */
    public String getInferName() {
        return inferName;
    }

    public void setInferName(String inferName) {
        this.inferName = inferName;
    }

    public InferDeploymentItemResponseData withServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
        return this;
    }

    /**
     * **参数解释：** 服务实例组id。 **取值范围：** 不涉及
     * @return serviceGroupName
     */
    public String getServiceGroupName() {
        return serviceGroupName;
    }

    public void setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
    }

    public InferDeploymentItemResponseData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务当前状态，一次只支持一种状态筛选。默认不过滤。 **取值范围：** - DEPLOYING：部署中。 - FAILED：失败。 - STOPPED：停止。 - RUNNING：运行中。 - DELETING：删除中。 - STOPPING：停止中。 - CONCERNING：告警。 - DELETED：已删除。 - RESTARTING：重启中。 - UPGRADING：升级中。 - ERROR：异常。 - INTERRUPTING：中断中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InferDeploymentItemResponseData withLtsState(String ltsState) {
        this.ltsState = ltsState;
        return this;
    }

    /**
     * **参数解释：** 部署对接lts状态。 **取值范围：** - ON：开启。 - OFF：关闭。
     * @return ltsState
     */
    public String getLtsState() {
        return ltsState;
    }

    public void setLtsState(String ltsState) {
        this.ltsState = ltsState;
    }

    public InferDeploymentItemResponseData withMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启镜像流量。 **取值范围：** 不涉及
     * @return mirrorTrafficEnable
     */
    public Boolean getMirrorTrafficEnable() {
        return mirrorTrafficEnable;
    }

    public void setMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
    }

    public InferDeploymentItemResponseData withMirrorTrafficWeight(String mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
        return this;
    }

    /**
     * **参数解释：** 镜像流量权重。 **取值范围：** 50。
     * @return mirrorTrafficWeight
     */
    public String getMirrorTrafficWeight() {
        return mirrorTrafficWeight;
    }

    public void setMirrorTrafficWeight(String mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
    }

    public InferDeploymentItemResponseData withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重百分比，分配到此模型的流量权重，仅当模型部署为在线服务时需要配置。 **取值范围：** [0, 100]。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public InferDeploymentItemResponseData withTrafficRatio(String trafficRatio) {
        this.trafficRatio = trafficRatio;
        return this;
    }

    /**
     * **参数解释：** 流量比例，单个部署实例预期接收用户的流量与总流量比值，是由流量权重配置和部署状态计算所得的值。 **取值范围：** 0.00%~100.00%。
     * @return trafficRatio
     */
    public String getTrafficRatio() {
        return trafficRatio;
    }

    public void setTrafficRatio(String trafficRatio) {
        this.trafficRatio = trafficRatio;
    }

    public InferDeploymentItemResponseData withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 专属资源池ID。 **取值范围：** 50。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public InferDeploymentItemResponseData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 服务版本号，以数字及点号组成，形如1.0.1。 **取值范围：** 版本长度不超过8位。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InferDeploymentItemResponseData withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。 - DIST：分布式部署。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public InferDeploymentItemResponseData withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，根据创建时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public InferDeploymentItemResponseData withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，根据更新时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public InferDeploymentItemResponseData withFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
        return this;
    }

    public InferDeploymentItemResponseData addFrozenInfosItem(FrozenInfo frozenInfosItem) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        this.frozenInfos.add(frozenInfosItem);
        return this;
    }

    public InferDeploymentItemResponseData withFrozenInfos(Consumer<List<FrozenInfo>> frozenInfosSetter) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        frozenInfosSetter.accept(this.frozenInfos);
        return this;
    }

    /**
     * **参数解释：** 当服务或者部署被冻结时返回的冻结类型信息。
     * @return frozenInfos
     */
    public List<FrozenInfo> getFrozenInfos() {
        return frozenInfos;
    }

    public void setFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferDeploymentItemResponseData that = (InferDeploymentItemResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.inferName, that.inferName)
            && Objects.equals(this.serviceGroupName, that.serviceGroupName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.ltsState, that.ltsState)
            && Objects.equals(this.mirrorTrafficEnable, that.mirrorTrafficEnable)
            && Objects.equals(this.mirrorTrafficWeight, that.mirrorTrafficWeight)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.trafficRatio, that.trafficRatio)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.frozenInfos, that.frozenInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            inferName,
            serviceGroupName,
            status,
            ltsState,
            mirrorTrafficEnable,
            mirrorTrafficWeight,
            weight,
            trafficRatio,
            poolId,
            version,
            deployType,
            createAt,
            updateAt,
            frozenInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferDeploymentItemResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
        sb.append("    serviceGroupName: ").append(toIndentedString(serviceGroupName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ltsState: ").append(toIndentedString(ltsState)).append("\n");
        sb.append("    mirrorTrafficEnable: ").append(toIndentedString(mirrorTrafficEnable)).append("\n");
        sb.append("    mirrorTrafficWeight: ").append(toIndentedString(mirrorTrafficWeight)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    trafficRatio: ").append(toIndentedString(trafficRatio)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    frozenInfos: ").append(toIndentedString(frozenInfos)).append("\n");
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
