package com.huaweicloud.sdk.dws.v2.model;

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
public class ShowInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_status")

    private String configurationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params_group_id")

    private String paramsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_subnet_id")

    private String internalSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_group")

    private String secureGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azcode")

    private String azcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinkResp> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private ClusterFlavorResp flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private CompatibleInstanceVolumeResp volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private CompatibleDataStoreResp datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private CompatibleFaultResp fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private CompatibleConfigurationResp _configuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locality")

    private String locality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private List<CompatibleReplicasResp> replicas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_engine")

    private String storageEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private Integer payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ip")

    private String trafficIp;

    public ShowInstanceResponse withConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
        return this;
    }

    /**
     * **参数解释**： 配置状态。 **取值范围**： 不涉及。
     * @return configurationStatus
     */
    public String getConfigurationStatus() {
        return configurationStatus;
    }

    public void setConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    public ShowInstanceResponse withParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
        return this;
    }

    /**
     * **参数解释**： 参数组ID。 **取值范围**： 不涉及。
     * @return paramsGroupId
     */
    public String getParamsGroupId() {
        return paramsGroupId;
    }

    public void setParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
    }

    public ShowInstanceResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 子网ID。 **取值范围**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowInstanceResponse withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**： 角色。 **取值范围**： 不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ShowInstanceResponse withInternalSubnetId(String internalSubnetId) {
        this.internalSubnetId = internalSubnetId;
        return this;
    }

    /**
     * **参数解释**： 内部子网ID。 **取值范围**： 不涉及。
     * @return internalSubnetId
     */
    public String getInternalSubnetId() {
        return internalSubnetId;
    }

    public void setInternalSubnetId(String internalSubnetId) {
        this.internalSubnetId = internalSubnetId;
    }

    public ShowInstanceResponse withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * **参数解释**： 分组信息。 **取值范围**： 不涉及。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ShowInstanceResponse withSecureGroup(String secureGroup) {
        this.secureGroup = secureGroup;
        return this;
    }

    /**
     * **参数解释**： 安全组。 **取值范围**： 不涉及。
     * @return secureGroup
     */
    public String getSecureGroup() {
        return secureGroup;
    }

    public void setSecureGroup(String secureGroup) {
        this.secureGroup = secureGroup;
    }

    public ShowInstanceResponse withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * **参数解释**： VPC ID。 **取值范围**： 不涉及。
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public ShowInstanceResponse withAzcode(String azcode) {
        this.azcode = azcode;
        return this;
    }

    /**
     * **参数解释**： 可用区编码。 **取值范围**： 不涉及。
     * @return azcode
     */
    public String getAzcode() {
        return azcode;
    }

    public void setAzcode(String azcode) {
        this.azcode = azcode;
    }

    public ShowInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 局点编码。 **取值范围**： 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowInstanceResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowInstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowInstanceResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释**： 更新时间。 **取值范围**： 不涉及。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 节点名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceResponse withLinks(List<LinkResp> links) {
        this.links = links;
        return this;
    }

    public ShowInstanceResponse addLinksItem(LinkResp linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ShowInstanceResponse withLinks(Consumer<List<LinkResp>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * **参数解释**： 链接信息。 **取值范围**： 不涉及。
     * @return links
     */
    public List<LinkResp> getLinks() {
        return links;
    }

    public void setLinks(List<LinkResp> links) {
        this.links = links;
    }

    public ShowInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceResponse withFlavor(ClusterFlavorResp flavor) {
        this.flavor = flavor;
        return this;
    }

    public ShowInstanceResponse withFlavor(Consumer<ClusterFlavorResp> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ClusterFlavorResp();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public ClusterFlavorResp getFlavor() {
        return flavor;
    }

    public void setFlavor(ClusterFlavorResp flavor) {
        this.flavor = flavor;
    }

    public ShowInstanceResponse withVolume(CompatibleInstanceVolumeResp volume) {
        this.volume = volume;
        return this;
    }

    public ShowInstanceResponse withVolume(Consumer<CompatibleInstanceVolumeResp> volumeSetter) {
        if (this.volume == null) {
            this.volume = new CompatibleInstanceVolumeResp();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public CompatibleInstanceVolumeResp getVolume() {
        return volume;
    }

    public void setVolume(CompatibleInstanceVolumeResp volume) {
        this.volume = volume;
    }

    public ShowInstanceResponse withDatastore(CompatibleDataStoreResp datastore) {
        this.datastore = datastore;
        return this;
    }

    public ShowInstanceResponse withDatastore(Consumer<CompatibleDataStoreResp> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new CompatibleDataStoreResp();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public CompatibleDataStoreResp getDatastore() {
        return datastore;
    }

    public void setDatastore(CompatibleDataStoreResp datastore) {
        this.datastore = datastore;
    }

    public ShowInstanceResponse withFault(CompatibleFaultResp fault) {
        this.fault = fault;
        return this;
    }

    public ShowInstanceResponse withFault(Consumer<CompatibleFaultResp> faultSetter) {
        if (this.fault == null) {
            this.fault = new CompatibleFaultResp();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    /**
     * Get fault
     * @return fault
     */
    public CompatibleFaultResp getFault() {
        return fault;
    }

    public void setFault(CompatibleFaultResp fault) {
        this.fault = fault;
    }

    public ShowInstanceResponse withConfiguration(CompatibleConfigurationResp _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ShowInstanceResponse withConfiguration(Consumer<CompatibleConfigurationResp> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new CompatibleConfigurationResp();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    public CompatibleConfigurationResp getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(CompatibleConfigurationResp _configuration) {
        this._configuration = _configuration;
    }

    public ShowInstanceResponse withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * **参数解释**： 废弃字段，无实际含义。 **取值范围**： 不涉及。
     * @return locality
     */
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public ShowInstanceResponse withReplicas(List<CompatibleReplicasResp> replicas) {
        this.replicas = replicas;
        return this;
    }

    public ShowInstanceResponse addReplicasItem(CompatibleReplicasResp replicasItem) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        this.replicas.add(replicasItem);
        return this;
    }

    public ShowInstanceResponse withReplicas(Consumer<List<CompatibleReplicasResp>> replicasSetter) {
        if (this.replicas == null) {
            this.replicas = new ArrayList<>();
        }
        replicasSetter.accept(this.replicas);
        return this;
    }

    /**
     * **参数解释**： 废弃字段，无实际含义。 **取值范围**： 不涉及。
     * @return replicas
     */
    public List<CompatibleReplicasResp> getReplicas() {
        return replicas;
    }

    public void setReplicas(List<CompatibleReplicasResp> replicas) {
        this.replicas = replicas;
    }

    public ShowInstanceResponse withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * **参数解释**： 数据库用户。 **取值范围**： 不涉及。
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public ShowInstanceResponse withStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }

    /**
     * **参数解释**： 存储引擎。 **取值范围**： 不涉及。
     * @return storageEngine
     */
    public String getStorageEngine() {
        return storageEngine;
    }

    public void setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
    }

    public ShowInstanceResponse withPayModel(Integer payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * **参数解释**： 付款方式。 **取值范围**： 不涉及。
     * @return payModel
     */
    public Integer getPayModel() {
        return payModel;
    }

    public void setPayModel(Integer payModel) {
        this.payModel = payModel;
    }

    public ShowInstanceResponse withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 公网IP。 **取值范围**： 不涉及。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ShowInstanceResponse withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /**
     * **参数解释**： 流量IP。 **取值范围**： 不涉及。
     * @return trafficIp
     */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceResponse that = (ShowInstanceResponse) obj;
        return Objects.equals(this.configurationStatus, that.configurationStatus)
            && Objects.equals(this.paramsGroupId, that.paramsGroupId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.role, that.role)
            && Objects.equals(this.internalSubnetId, that.internalSubnetId) && Objects.equals(this.group, that.group)
            && Objects.equals(this.secureGroup, that.secureGroup) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.azcode, that.azcode) && Objects.equals(this.region, that.region)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.links, that.links)
            && Objects.equals(this.id, that.id) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.fault, that.fault) && Objects.equals(this._configuration, that._configuration)
            && Objects.equals(this.locality, that.locality) && Objects.equals(this.replicas, that.replicas)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.storageEngine, that.storageEngine)
            && Objects.equals(this.payModel, that.payModel) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.trafficIp, that.trafficIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationStatus,
            paramsGroupId,
            type,
            subnetId,
            role,
            internalSubnetId,
            group,
            secureGroup,
            vpc,
            azcode,
            region,
            clusterId,
            created,
            updated,
            status,
            name,
            links,
            id,
            flavor,
            volume,
            datastore,
            fault,
            _configuration,
            locality,
            replicas,
            dbUser,
            storageEngine,
            payModel,
            publicIp,
            trafficIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    configurationStatus: ").append(toIndentedString(configurationStatus)).append("\n");
        sb.append("    paramsGroupId: ").append(toIndentedString(paramsGroupId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    internalSubnetId: ").append(toIndentedString(internalSubnetId)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    secureGroup: ").append(toIndentedString(secureGroup)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    azcode: ").append(toIndentedString(azcode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    storageEngine: ").append(toIndentedString(storageEngine)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
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
