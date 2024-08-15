package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CdmQueryClusterInstanceDetail
 */
public class CdmQueryClusterInstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurationStatus")

    private String configurationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramsGroupId")

    private String paramsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetid")

    private String subnetid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securegroup")

    private String securegroup;

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
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private CdmQueryClusterInstanceDetailFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbuser")

    private String dbuser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payModel")

    private Integer payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIp")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trafficIp")

    private String trafficIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trafficIpv6")

    private String trafficIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public CdmQueryClusterInstanceDetail withConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
        return this;
    }

    /**
     * 节点配置状态： - In-Sync：配置已同步。 - Applying：配置中。 - Sync-Failure：配置失败。
     * @return configurationStatus
     */
    public String getConfigurationStatus() {
        return configurationStatus;
    }

    public void setConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    public CdmQueryClusterInstanceDetail withParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
        return this;
    }

    /**
     * 配置ID
     * @return paramsGroupId
     */
    public String getParamsGroupId() {
        return paramsGroupId;
    }

    public void setParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
    }

    public CdmQueryClusterInstanceDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配置服务类型，这里为cdm
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CdmQueryClusterInstanceDetail withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 实例模式，这里为Standalone
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CdmQueryClusterInstanceDetail withSubnetid(String subnetid) {
        this.subnetid = subnetid;
        return this;
    }

    /**
     * 实例的子网ID
     * @return subnetid
     */
    public String getSubnetid() {
        return subnetid;
    }

    public void setSubnetid(String subnetid) {
        this.subnetid = subnetid;
    }

    public CdmQueryClusterInstanceDetail withSecuregroup(String securegroup) {
        this.securegroup = securegroup;
        return this;
    }

    /**
     * 安全组ID
     * @return securegroup
     */
    public String getSecuregroup() {
        return securegroup;
    }

    public void setSecuregroup(String securegroup) {
        this.securegroup = securegroup;
    }

    public CdmQueryClusterInstanceDetail withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * 实例的VPC ID
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public CdmQueryClusterInstanceDetail withAzcode(String azcode) {
        this.azcode = azcode;
        return this;
    }

    /**
     * 可用区名称
     * @return azcode
     */
    public String getAzcode() {
        return azcode;
    }

    public void setAzcode(String azcode) {
        this.azcode = azcode;
    }

    public CdmQueryClusterInstanceDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CdmQueryClusterInstanceDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 实例创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CdmQueryClusterInstanceDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 实例更新时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CdmQueryClusterInstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CdmQueryClusterInstanceDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CdmQueryClusterInstanceDetail withFlavor(CdmQueryClusterInstanceDetailFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CdmQueryClusterInstanceDetail withFlavor(Consumer<CdmQueryClusterInstanceDetailFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new CdmQueryClusterInstanceDetailFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public CdmQueryClusterInstanceDetailFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(CdmQueryClusterInstanceDetailFlavor flavor) {
        this.flavor = flavor;
    }

    public CdmQueryClusterInstanceDetail withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CdmQueryClusterInstanceDetail withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public CdmQueryClusterInstanceDetail withDbuser(String dbuser) {
        this.dbuser = dbuser;
        return this;
    }

    /**
     * 数据库用户，这里为cdm。
     * @return dbuser
     */
    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public CdmQueryClusterInstanceDetail withPayModel(Integer payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 付费模式： - 0：按需 - 1：包周期
     * @return payModel
     */
    public Integer getPayModel() {
        return payModel;
    }

    public void setPayModel(Integer payModel) {
        this.payModel = payModel;
    }

    public CdmQueryClusterInstanceDetail withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 集群绑定的公网地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public CdmQueryClusterInstanceDetail withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /**
     * 集群的内网地址
     * @return trafficIp
     */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    public CdmQueryClusterInstanceDetail withTrafficIpv6(String trafficIpv6) {
        this.trafficIpv6 = trafficIpv6;
        return this;
    }

    /**
     * 集群的内网IPv6地址
     * @return trafficIpv6
     */
    public String getTrafficIpv6() {
        return trafficIpv6;
    }

    public void setTrafficIpv6(String trafficIpv6) {
        this.trafficIpv6 = trafficIpv6;
    }

    public CdmQueryClusterInstanceDetail withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmQueryClusterInstanceDetail that = (CdmQueryClusterInstanceDetail) obj;
        return Objects.equals(this.configurationStatus, that.configurationStatus)
            && Objects.equals(this.paramsGroupId, that.paramsGroupId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.role, that.role) && Objects.equals(this.subnetid, that.subnetid)
            && Objects.equals(this.securegroup, that.securegroup) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.azcode, that.azcode) && Objects.equals(this.region, that.region)
            && Objects.equals(this.created, that.created) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.dbuser, that.dbuser) && Objects.equals(this.payModel, that.payModel)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.trafficIp, that.trafficIp)
            && Objects.equals(this.trafficIpv6, that.trafficIpv6) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationStatus,
            paramsGroupId,
            type,
            role,
            subnetid,
            securegroup,
            vpc,
            azcode,
            region,
            created,
            updated,
            name,
            id,
            flavor,
            datastore,
            dbuser,
            payModel,
            publicIp,
            trafficIp,
            trafficIpv6,
            clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmQueryClusterInstanceDetail {\n");
        sb.append("    configurationStatus: ").append(toIndentedString(configurationStatus)).append("\n");
        sb.append("    paramsGroupId: ").append(toIndentedString(paramsGroupId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    subnetid: ").append(toIndentedString(subnetid)).append("\n");
        sb.append("    securegroup: ").append(toIndentedString(securegroup)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    azcode: ").append(toIndentedString(azcode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    dbuser: ").append(toIndentedString(dbuser)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
        sb.append("    trafficIpv6: ").append(toIndentedString(trafficIpv6)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
