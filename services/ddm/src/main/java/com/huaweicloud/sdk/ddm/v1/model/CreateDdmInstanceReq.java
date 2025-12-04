package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDdmInstanceReq
 */
public class CreateDdmInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_group_id")

    private String paramGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_user_name")

    private String adminUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_user_password")

    private String adminUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private Object chargeInfo;

    public CreateDdmInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDdmInstanceReq withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateDdmInstanceReq addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateDdmInstanceReq withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateDdmInstanceReq withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点数量。
     * minimum: 1
     * maximum: 2147483647
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateDdmInstanceReq withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateDdmInstanceReq withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateDdmInstanceReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云id。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateDdmInstanceReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateDdmInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组id。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateDdmInstanceReq withParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }

    /**
     * 参数组id。
     * @return paramGroupId
     */
    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    public CreateDdmInstanceReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDdmInstanceReq withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateDdmInstanceReq withAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
        return this;
    }

    /**
     * 账号。
     * @return adminUserName
     */
    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public CreateDdmInstanceReq withAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
        return this;
    }

    /**
     * 密码。
     * @return adminUserPassword
     */
    public String getAdminUserPassword() {
        return adminUserPassword;
    }

    public void setAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
    }

    public CreateDdmInstanceReq withChargeInfo(Object chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    /**
     * 付费信息。
     * @return chargeInfo
     */
    public Object getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(Object chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDdmInstanceReq that = (CreateDdmInstanceReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.paramGroupId, that.paramGroupId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.adminUserName, that.adminUserName)
            && Objects.equals(this.adminUserPassword, that.adminUserPassword)
            && Objects.equals(this.chargeInfo, that.chargeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            availableZones,
            nodeNum,
            engineVersion,
            flavorRef,
            vpcId,
            subnetId,
            securityGroupId,
            paramGroupId,
            enterpriseProjectId,
            timeZone,
            adminUserName,
            adminUserPassword,
            chargeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDdmInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    paramGroupId: ").append(toIndentedString(paramGroupId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    adminUserName: ").append(toIndentedString(adminUserName)).append("\n");
        sb.append("    adminUserPassword: ").append(toIndentedString(adminUserPassword)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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
