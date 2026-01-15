package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改桌面池属性请求。
 */
public class UpdateDesktopPoolAttributesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnected_retention_period")

    private Integer disconnectedRetentionPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_autoscale")

    private Boolean enableAutoscale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscale_policy")

    private AutoscalePolicy autoscalePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private DesktopPoolVolumeInfo rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<DesktopPoolVolumeInfo> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupIdInfo> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public UpdateDesktopPoolAttributesReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 桌面池名称，桌面池名称必须保证唯一。桌面名称只允许输入中文、大写字母、小写字母、数字、中划线，长度范围为1~255。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDesktopPoolAttributesReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 桌面池描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateDesktopPoolAttributesReq withOuName(String ouName) {
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

    public UpdateDesktopPoolAttributesReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDesktopPoolAttributesReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDesktopPoolAttributesReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public UpdateDesktopPoolAttributesReq withDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
        return this;
    }

    /**
     * 桌面断连多少分钟内，保留用户与桌面的绑定关系，超时后自动解绑。
     * minimum: 10
     * maximum: 43200
     * @return disconnectedRetentionPeriod
     */
    public Integer getDisconnectedRetentionPeriod() {
        return disconnectedRetentionPeriod;
    }

    public void setDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
    }

    public UpdateDesktopPoolAttributesReq withEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
        return this;
    }

    /**
     * 桌面池是否开启弹性伸缩类型，为false则表示不开启弹性伸缩，为true则表示开启弹性伸缩。
     * @return enableAutoscale
     */
    public Boolean getEnableAutoscale() {
        return enableAutoscale;
    }

    public void setEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
    }

    public UpdateDesktopPoolAttributesReq withAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
        return this;
    }

    public UpdateDesktopPoolAttributesReq withAutoscalePolicy(Consumer<AutoscalePolicy> autoscalePolicySetter) {
        if (this.autoscalePolicy == null) {
            this.autoscalePolicy = new AutoscalePolicy();
            autoscalePolicySetter.accept(this.autoscalePolicy);
        }

        return this;
    }

    /**
     * Get autoscalePolicy
     * @return autoscalePolicy
     */
    public AutoscalePolicy getAutoscalePolicy() {
        return autoscalePolicy;
    }

    public void setAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
    }

    public UpdateDesktopPoolAttributesReq withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 是否处于管理员维护模式。
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    public UpdateDesktopPoolAttributesReq withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    public UpdateDesktopPoolAttributesReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 桌面池的可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public UpdateDesktopPoolAttributesReq withRootVolume(DesktopPoolVolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public UpdateDesktopPoolAttributesReq withRootVolume(Consumer<DesktopPoolVolumeInfo> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new DesktopPoolVolumeInfo();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public DesktopPoolVolumeInfo getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(DesktopPoolVolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
    }

    public UpdateDesktopPoolAttributesReq withDataVolumes(List<DesktopPoolVolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public UpdateDesktopPoolAttributesReq addDataVolumesItem(DesktopPoolVolumeInfo dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public UpdateDesktopPoolAttributesReq withDataVolumes(Consumer<List<DesktopPoolVolumeInfo>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘列表。
     * @return dataVolumes
     */
    public List<DesktopPoolVolumeInfo> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DesktopPoolVolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public UpdateDesktopPoolAttributesReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdateDesktopPoolAttributesReq withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public UpdateDesktopPoolAttributesReq addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public UpdateDesktopPoolAttributesReq withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 桌面池子网ID列表
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public UpdateDesktopPoolAttributesReq withSecurityGroups(List<SecurityGroupIdInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public UpdateDesktopPoolAttributesReq addSecurityGroupsItem(SecurityGroupIdInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public UpdateDesktopPoolAttributesReq withSecurityGroups(Consumer<List<SecurityGroupIdInfo>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面使用的安全组，如果不指定则默认使用桌面代理中指定的安全组
     * @return securityGroups
     */
    public List<SecurityGroupIdInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupIdInfo> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public UpdateDesktopPoolAttributesReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
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
        UpdateDesktopPoolAttributesReq that = (UpdateDesktopPoolAttributesReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ouName, that.ouName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.disconnectedRetentionPeriod, that.disconnectedRetentionPeriod)
            && Objects.equals(this.enableAutoscale, that.enableAutoscale)
            && Objects.equals(this.autoscalePolicy, that.autoscalePolicy)
            && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            ouName,
            tags,
            disconnectedRetentionPeriod,
            enableAutoscale,
            autoscalePolicy,
            inMaintenanceMode,
            desktopNamePolicyId,
            availabilityZone,
            rootVolume,
            dataVolumes,
            vpcId,
            subnetIds,
            securityGroups,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesktopPoolAttributesReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    disconnectedRetentionPeriod: ")
            .append(toIndentedString(disconnectedRetentionPeriod))
            .append("\n");
        sb.append("    enableAutoscale: ").append(toIndentedString(enableAutoscale)).append("\n");
        sb.append("    autoscalePolicy: ").append(toIndentedString(autoscalePolicy)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
