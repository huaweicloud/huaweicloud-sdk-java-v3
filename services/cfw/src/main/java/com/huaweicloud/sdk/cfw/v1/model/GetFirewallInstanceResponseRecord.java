package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetFirewallInstanceResponseRecord
 */
public class GetFirewallInstanceResponseRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private Integer haType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private Integer engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_objects")

    private List<ProtectObjectVO> protectObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_old_firewall_instance")

    private Boolean isOldFirewallInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available_obs")

    private Boolean isAvailableObs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_threat_tags")

    private Boolean isSupportThreatTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ipv6")

    private Boolean supportIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_toggle")

    private Map<String, Boolean> featureToggle = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<FirewallInstanceResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_name")

    private String fwInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_url_filtering")

    private Boolean supportUrlFiltering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public GetFirewallInstanceResponseRecord withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id。，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，默认情况下，fw_instance_Id为空时，返回账号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public GetFirewallInstanceResponseRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防火墙名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetFirewallInstanceResponseRecord withHaType(Integer haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 集群类型，包含主备（0）和集群（1）两种方式，主备模式包含四个节点，2个主节点构成集群，剩余两个节点为主节点的备节点，集群模式仅拉起两个节点作为集群。
     * @return haType
     */
    public Integer getHaType() {
        return haType;
    }

    public void setHaType(Integer haType) {
        this.haType = haType;
    }

    public GetFirewallInstanceResponseRecord withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式 0：包年/包月 1：按需
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public GetFirewallInstanceResponseRecord withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 防火墙防护类型，目前仅支持0，互联网防护
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public GetFirewallInstanceResponseRecord withEngineType(Integer engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型，0：自研引擎 1：山石引擎 3：天融信引擎
     * @return engineType
     */
    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }

    public GetFirewallInstanceResponseRecord withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public GetFirewallInstanceResponseRecord withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public GetFirewallInstanceResponseRecord withProtectObjects(List<ProtectObjectVO> protectObjects) {
        this.protectObjects = protectObjects;
        return this;
    }

    public GetFirewallInstanceResponseRecord addProtectObjectsItem(ProtectObjectVO protectObjectsItem) {
        if (this.protectObjects == null) {
            this.protectObjects = new ArrayList<>();
        }
        this.protectObjects.add(protectObjectsItem);
        return this;
    }

    public GetFirewallInstanceResponseRecord withProtectObjects(Consumer<List<ProtectObjectVO>> protectObjectsSetter) {
        if (this.protectObjects == null) {
            this.protectObjects = new ArrayList<>();
        }
        protectObjectsSetter.accept(this.protectObjects);
        return this;
    }

    /**
     * 防护对象列表
     * @return protectObjects
     */
    public List<ProtectObjectVO> getProtectObjects() {
        return protectObjects;
    }

    public void setProtectObjects(List<ProtectObjectVO> protectObjects) {
        this.protectObjects = protectObjects;
    }

    public GetFirewallInstanceResponseRecord withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 防火墙状态列表，包括-1：等待支付，0：创建中，1，删除中，2：运行中，3：升级中，4：删除完成：5：冻结中，6：创建失败，7：删除失败，8：冻结失败，9：存储中，10：存储失败，11：升级失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GetFirewallInstanceResponseRecord withIsOldFirewallInstance(Boolean isOldFirewallInstance) {
        this.isOldFirewallInstance = isOldFirewallInstance;
        return this;
    }

    /**
     * 是否为旧引擎，true表示是，false表示不是
     * @return isOldFirewallInstance
     */
    public Boolean getIsOldFirewallInstance() {
        return isOldFirewallInstance;
    }

    public void setIsOldFirewallInstance(Boolean isOldFirewallInstance) {
        this.isOldFirewallInstance = isOldFirewallInstance;
    }

    public GetFirewallInstanceResponseRecord withIsAvailableObs(Boolean isAvailableObs) {
        this.isAvailableObs = isAvailableObs;
        return this;
    }

    /**
     * 是否支持obs，true表示是，false表示不是
     * @return isAvailableObs
     */
    public Boolean getIsAvailableObs() {
        return isAvailableObs;
    }

    public void setIsAvailableObs(Boolean isAvailableObs) {
        this.isAvailableObs = isAvailableObs;
    }

    public GetFirewallInstanceResponseRecord withIsSupportThreatTags(Boolean isSupportThreatTags) {
        this.isSupportThreatTags = isSupportThreatTags;
        return this;
    }

    /**
     * 是否支持威胁情报标签，true表示是，false表示不是
     * @return isSupportThreatTags
     */
    public Boolean getIsSupportThreatTags() {
        return isSupportThreatTags;
    }

    public void setIsSupportThreatTags(Boolean isSupportThreatTags) {
        this.isSupportThreatTags = isSupportThreatTags;
    }

    public GetFirewallInstanceResponseRecord withSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
        return this;
    }

    /**
     * 是否支持ipv6，true表示是，false表示不是
     * @return supportIpv6
     */
    public Boolean getSupportIpv6() {
        return supportIpv6;
    }

    public void setSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
    }

    public GetFirewallInstanceResponseRecord withFeatureToggle(Map<String, Boolean> featureToggle) {
        this.featureToggle = featureToggle;
        return this;
    }

    public GetFirewallInstanceResponseRecord putFeatureToggleItem(String key, Boolean featureToggleItem) {
        if (this.featureToggle == null) {
            this.featureToggle = new HashMap<>();
        }
        this.featureToggle.put(key, featureToggleItem);
        return this;
    }

    public GetFirewallInstanceResponseRecord withFeatureToggle(Consumer<Map<String, Boolean>> featureToggleSetter) {
        if (this.featureToggle == null) {
            this.featureToggle = new HashMap<>();
        }
        featureToggleSetter.accept(this.featureToggle);
        return this;
    }

    /**
     * 特性开关，boolean值为true表示是，false表示否
     * @return featureToggle
     */
    public Map<String, Boolean> getFeatureToggle() {
        return featureToggle;
    }

    public void setFeatureToggle(Map<String, Boolean> featureToggle) {
        this.featureToggle = featureToggle;
    }

    public GetFirewallInstanceResponseRecord withResources(List<FirewallInstanceResource> resources) {
        this.resources = resources;
        return this;
    }

    public GetFirewallInstanceResponseRecord addResourcesItem(FirewallInstanceResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public GetFirewallInstanceResponseRecord withResources(Consumer<List<FirewallInstanceResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 防火墙资源列表
     * @return resources
     */
    public List<FirewallInstanceResource> getResources() {
        return resources;
    }

    public void setResources(List<FirewallInstanceResource> resources) {
        this.resources = resources;
    }

    public GetFirewallInstanceResponseRecord withFwInstanceName(String fwInstanceName) {
        this.fwInstanceName = fwInstanceName;
        return this;
    }

    /**
     * 防火墙名称
     * @return fwInstanceName
     */
    public String getFwInstanceName() {
        return fwInstanceName;
    }

    public void setFwInstanceName(String fwInstanceName) {
        this.fwInstanceName = fwInstanceName;
    }

    public GetFirewallInstanceResponseRecord withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，用户根据组织规划企业项目，对应的ID为企业项目ID，可通过[如何获取企业项目ID](cfw_02_0027.xml)获取，用户未开启企业项目时为0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public GetFirewallInstanceResponseRecord withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 防火墙资源id，同fw_instance_id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GetFirewallInstanceResponseRecord withSupportUrlFiltering(Boolean supportUrlFiltering) {
        this.supportUrlFiltering = supportUrlFiltering;
        return this;
    }

    /**
     * 是否支持url过滤，true表示是，false表示不是
     * @return supportUrlFiltering
     */
    public Boolean getSupportUrlFiltering() {
        return supportUrlFiltering;
    }

    public void setSupportUrlFiltering(Boolean supportUrlFiltering) {
        this.supportUrlFiltering = supportUrlFiltering;
    }

    public GetFirewallInstanceResponseRecord withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签列表，标签键值map转化的json字符串，如\"{\\\"key\\\":\\\"value\\\"}\"
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetFirewallInstanceResponseRecord that = (GetFirewallInstanceResponseRecord) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.haType, that.haType) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.protectObjects, that.protectObjects)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.isOldFirewallInstance, that.isOldFirewallInstance)
            && Objects.equals(this.isAvailableObs, that.isAvailableObs)
            && Objects.equals(this.isSupportThreatTags, that.isSupportThreatTags)
            && Objects.equals(this.supportIpv6, that.supportIpv6)
            && Objects.equals(this.featureToggle, that.featureToggle) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.fwInstanceName, that.fwInstanceName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.supportUrlFiltering, that.supportUrlFiltering)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId,
            name,
            haType,
            chargeMode,
            serviceType,
            engineType,
            flavor,
            protectObjects,
            status,
            isOldFirewallInstance,
            isAvailableObs,
            isSupportThreatTags,
            supportIpv6,
            featureToggle,
            resources,
            fwInstanceName,
            enterpriseProjectId,
            resourceId,
            supportUrlFiltering,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFirewallInstanceResponseRecord {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    protectObjects: ").append(toIndentedString(protectObjects)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isOldFirewallInstance: ").append(toIndentedString(isOldFirewallInstance)).append("\n");
        sb.append("    isAvailableObs: ").append(toIndentedString(isAvailableObs)).append("\n");
        sb.append("    isSupportThreatTags: ").append(toIndentedString(isSupportThreatTags)).append("\n");
        sb.append("    supportIpv6: ").append(toIndentedString(supportIpv6)).append("\n");
        sb.append("    featureToggle: ").append(toIndentedString(featureToggle)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    fwInstanceName: ").append(toIndentedString(fwInstanceName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    supportUrlFiltering: ").append(toIndentedString(supportUrlFiltering)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
