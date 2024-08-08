package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建云服务请求。
 */
public class CreateAppServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private Volume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler_hints")

    private WdhParam schedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_access_agent")

    private Boolean updateAccessAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_server_extend_param")

    private CreateServerExtendParam createServerExtendParam;

    public CreateAppServerReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 创建云服务类型，当前仅支持创建云应用：createApps。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateAppServerReq withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 服务器组唯一标识。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public CreateAppServerReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。 > - 将服务创建到指定的可用分区，如果不指定则使用系统随机的可用分区。 > - 获取方式详见可用区管理ListAvailabilityZone：\"GET  /v1/{project_id}/availability-zone\"。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateAppServerReq withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订购数量。
     * minimum: 1
     * maximum: 100
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    public CreateAppServerReq withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public CreateAppServerReq addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateAppServerReq withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 服务对应的网卡信息，当前未使用该字段。
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public CreateAppServerReq withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * OU名称，在对接AD时使用，需提前在AD中创建OU。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public CreateAppServerReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。 > - 获取方式详见产品套餐管理ListProduct：\"GET /v1/{project_id}/product\"。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateAppServerReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateAppServerReq withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，当前仅支持Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public CreateAppServerReq withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateAppServerReq withRootVolume(Consumer<Volume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new Volume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public Volume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public CreateAppServerReq withSchedulerHints(WdhParam schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public CreateAppServerReq withSchedulerHints(Consumer<WdhParam> schedulerHintsSetter) {
        if (this.schedulerHints == null) {
            this.schedulerHints = new WdhParam();
            schedulerHintsSetter.accept(this.schedulerHints);
        }

        return this;
    }

    /**
     * Get schedulerHints
     * @return schedulerHints
     */
    public WdhParam getSchedulerHints() {
        return schedulerHints;
    }

    public void setSchedulerHints(WdhParam schedulerHints) {
        this.schedulerHints = schedulerHints;
    }

    public CreateAppServerReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 网卡对应的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateAppServerReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateAppServerReq withUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
        return this;
    }

    /**
     * 是否自动升级hda版本。
     * @return updateAccessAgent
     */
    public Boolean getUpdateAccessAgent() {
        return updateAccessAgent;
    }

    public void setUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
    }

    public CreateAppServerReq withCreateServerExtendParam(CreateServerExtendParam createServerExtendParam) {
        this.createServerExtendParam = createServerExtendParam;
        return this;
    }

    public CreateAppServerReq withCreateServerExtendParam(
        Consumer<CreateServerExtendParam> createServerExtendParamSetter) {
        if (this.createServerExtendParam == null) {
            this.createServerExtendParam = new CreateServerExtendParam();
            createServerExtendParamSetter.accept(this.createServerExtendParam);
        }

        return this;
    }

    /**
     * Get createServerExtendParam
     * @return createServerExtendParam
     */
    public CreateServerExtendParam getCreateServerExtendParam() {
        return createServerExtendParam;
    }

    public void setCreateServerExtendParam(CreateServerExtendParam createServerExtendParam) {
        this.createServerExtendParam = createServerExtendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppServerReq that = (CreateAppServerReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.ouName, that.ouName) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.schedulerHints, that.schedulerHints) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.updateAccessAgent, that.updateAccessAgent)
            && Objects.equals(this.createServerExtendParam, that.createServerExtendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            serverGroupId,
            availabilityZone,
            subscriptionNum,
            nics,
            ouName,
            productId,
            flavorId,
            osType,
            rootVolume,
            schedulerHints,
            subnetId,
            vpcId,
            updateAccessAgent,
            createServerExtendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppServerReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    updateAccessAgent: ").append(toIndentedString(updateAccessAgent)).append("\n");
        sb.append("    createServerExtendParam: ").append(toIndentedString(createServerExtendParam)).append("\n");
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
