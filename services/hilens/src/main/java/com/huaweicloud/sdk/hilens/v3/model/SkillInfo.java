package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 技能详情
 */
public class SkillInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_scenes")

    private String subScenes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_template_id")

    private String appTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private Integer versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private List<String> productInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_dev_flag")

    private Integer selfDevFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private String measureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_result")

    private String approvalResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_limit")

    private Integer channelLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_step_size")

    private Integer resourceStepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private String approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_status")

    private Integer testStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip")

    private String chip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_verify_model")

    private Boolean isVerifyModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_unit")

    private String measureUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private String testResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_times")

    private Integer installTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_policy")

    private List<String> privacyPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenes")

    private List<String> scenes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_model")

    private Integer chargeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer")

    private String developer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_scenes")

    private String mainScenes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_types")

    private List<String> deviceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public SkillInfo withSubScenes(String subScenes) {
        this.subScenes = subScenes;
        return this;
    }

    /**
     * 技能应用场景
     * @return subScenes
     */
    public String getSubScenes() {
        return subScenes;
    }

    public void setSubScenes(String subScenes) {
        this.subScenes = subScenes;
    }

    public SkillInfo withAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }

    /**
     * 应用模板ID
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return appTemplateId;
    }

    public void setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
    }

    public SkillInfo withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 技能图标
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public SkillInfo withVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * 技能版本数量
     * @return versionNum
     */
    public Integer getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
    }

    public SkillInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 技能描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SkillInfo withProductInfo(List<String> productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public SkillInfo addProductInfoItem(String productInfoItem) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        this.productInfo.add(productInfoItem);
        return this;
    }

    public SkillInfo withProductInfo(Consumer<List<String>> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        productInfoSetter.accept(this.productInfo);
        return this;
    }

    /**
     * 计费编码信息
     * @return productInfo
     */
    public List<String> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<String> productInfo) {
        this.productInfo = productInfo;
    }

    public SkillInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 技能类别，分为standard和lite
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SkillInfo withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 技能操作系统平台，其值为：Linux，Android， iOS， LiteOS，Windows
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public SkillInfo withSelfDevFlag(Integer selfDevFlag) {
        this.selfDevFlag = selfDevFlag;
        return this;
    }

    /**
     * 自研标识，1表示是HiLens自研算法。
     * @return selfDevFlag
     */
    public Integer getSelfDevFlag() {
        return selfDevFlag;
    }

    public void setSelfDevFlag(Integer selfDevFlag) {
        this.selfDevFlag = selfDevFlag;
    }

    public SkillInfo withMeasureType(String measureType) {
        this.measureType = measureType;
        return this;
    }

    /**
     * 计费类型，physical_src表示物理量标，如按周期收费。 src表示一次性
     * @return measureType
     */
    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public SkillInfo withApprovalResult(String approvalResult) {
        this.approvalResult = approvalResult;
        return this;
    }

    /**
     * 技能审核结果
     * @return approvalResult
     */
    public String getApprovalResult() {
        return approvalResult;
    }

    public void setApprovalResult(String approvalResult) {
        this.approvalResult = approvalResult;
    }

    public SkillInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，形如2022-06-30 17:22:48 GMT+08:00
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public SkillInfo withChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * 通道数
     * @return channelLimit
     */
    public Integer getChannelLimit() {
        return channelLimit;
    }

    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    public SkillInfo withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public SkillInfo withResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
        return this;
    }

    /**
     * 步长
     * @return resourceStepSize
     */
    public Integer getResourceStepSize() {
        return resourceStepSize;
    }

    public void setResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
    }

    public SkillInfo withApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审批时间
     * @return approvalTime
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public SkillInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务编码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public SkillInfo withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 摘要
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public SkillInfo withTestStatus(Integer testStatus) {
        this.testStatus = testStatus;
        return this;
    }

    /**
     * 测试状态
     * @return testStatus
     */
    public Integer getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(Integer testStatus) {
        this.testStatus = testStatus;
    }

    public SkillInfo withChip(String chip) {
        this.chip = chip;
        return this;
    }

    /**
     * 芯片
     * @return chip
     */
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public SkillInfo withIsVerifyModel(Boolean isVerifyModel) {
        this.isVerifyModel = isVerifyModel;
        return this;
    }

    /**
     * 是否校验模型
     * @return isVerifyModel
     */
    public Boolean getIsVerifyModel() {
        return isVerifyModel;
    }

    public void setIsVerifyModel(Boolean isVerifyModel) {
        this.isVerifyModel = isVerifyModel;
    }

    public SkillInfo withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 技能类型，文件类型file，镜像类型iamge
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public SkillInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类别
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SkillInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 技能版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SkillInfo withMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * 计费单位 qps 表示按qps收费，road表示技能路数instance 表示按实例收费
     * @return measureUnit
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public SkillInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public SkillInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SkillInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public SkillInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 技能大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public SkillInfo withTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    /**
     * 测试结果
     * @return testResult
     */
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public SkillInfo withInstallTimes(Integer installTimes) {
        this.installTimes = installTimes;
        return this;
    }

    /**
     * 安装次数
     * @return installTimes
     */
    public Integer getInstallTimes() {
        return installTimes;
    }

    public void setInstallTimes(Integer installTimes) {
        this.installTimes = installTimes;
    }

    public SkillInfo withPrivacyPolicy(List<String> privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        return this;
    }

    public SkillInfo addPrivacyPolicyItem(String privacyPolicyItem) {
        if (this.privacyPolicy == null) {
            this.privacyPolicy = new ArrayList<>();
        }
        this.privacyPolicy.add(privacyPolicyItem);
        return this;
    }

    public SkillInfo withPrivacyPolicy(Consumer<List<String>> privacyPolicySetter) {
        if (this.privacyPolicy == null) {
            this.privacyPolicy = new ArrayList<>();
        }
        privacyPolicySetter.accept(this.privacyPolicy);
        return this;
    }

    /**
     * 隐私条款
     * @return privacyPolicy
     */
    public List<String> getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void setPrivacyPolicy(List<String> privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public SkillInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 技能名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkillInfo withScenes(List<String> scenes) {
        this.scenes = scenes;
        return this;
    }

    public SkillInfo addScenesItem(String scenesItem) {
        if (this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        this.scenes.add(scenesItem);
        return this;
    }

    public SkillInfo withScenes(Consumer<List<String>> scenesSetter) {
        if (this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        scenesSetter.accept(this.scenes);
        return this;
    }

    /**
     * 技能场景
     * @return scenes
     */
    public List<String> getScenes() {
        return scenes;
    }

    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public SkillInfo withChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
        return this;
    }

    /**
     * 计费模式
     * @return chargeModel
     */
    public Integer getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
    }

    public SkillInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 云服务资源编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public SkillInfo withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能ID
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public SkillInfo withDeveloper(String developer) {
        this.developer = developer;
        return this;
    }

    /**
     * 开发者名字
     * @return developer
     */
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public SkillInfo withMainScenes(String mainScenes) {
        this.mainScenes = mainScenes;
        return this;
    }

    /**
     * 主场景
     * @return mainScenes
     */
    public String getMainScenes() {
        return mainScenes;
    }

    public void setMainScenes(String mainScenes) {
        this.mainScenes = mainScenes;
    }

    public SkillInfo withDeviceTypes(List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
        return this;
    }

    public SkillInfo addDeviceTypesItem(String deviceTypesItem) {
        if (this.deviceTypes == null) {
            this.deviceTypes = new ArrayList<>();
        }
        this.deviceTypes.add(deviceTypesItem);
        return this;
    }

    public SkillInfo withDeviceTypes(Consumer<List<String>> deviceTypesSetter) {
        if (this.deviceTypes == null) {
            this.deviceTypes = new ArrayList<>();
        }
        deviceTypesSetter.accept(this.deviceTypes);
        return this;
    }

    /**
     * 所支持的设备类别
     * @return deviceTypes
     */
    public List<String> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<String> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    public SkillInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 技能状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillInfo skillInfo = (SkillInfo) o;
        return Objects.equals(this.subScenes, skillInfo.subScenes)
            && Objects.equals(this.appTemplateId, skillInfo.appTemplateId) && Objects.equals(this.icon, skillInfo.icon)
            && Objects.equals(this.versionNum, skillInfo.versionNum)
            && Objects.equals(this.description, skillInfo.description)
            && Objects.equals(this.productInfo, skillInfo.productInfo) && Objects.equals(this.type, skillInfo.type)
            && Objects.equals(this.platform, skillInfo.platform)
            && Objects.equals(this.selfDevFlag, skillInfo.selfDevFlag)
            && Objects.equals(this.measureType, skillInfo.measureType)
            && Objects.equals(this.approvalResult, skillInfo.approvalResult)
            && Objects.equals(this.updateTime, skillInfo.updateTime)
            && Objects.equals(this.channelLimit, skillInfo.channelLimit)
            && Objects.equals(this.publishTime, skillInfo.publishTime)
            && Objects.equals(this.resourceStepSize, skillInfo.resourceStepSize)
            && Objects.equals(this.approvalTime, skillInfo.approvalTime)
            && Objects.equals(this.cloudServiceType, skillInfo.cloudServiceType)
            && Objects.equals(this.summary, skillInfo.summary) && Objects.equals(this.testStatus, skillInfo.testStatus)
            && Objects.equals(this.chip, skillInfo.chip) && Objects.equals(this.isVerifyModel, skillInfo.isVerifyModel)
            && Objects.equals(this.format, skillInfo.format)
            && Objects.equals(this.resourceType, skillInfo.resourceType)
            && Objects.equals(this.version, skillInfo.version)
            && Objects.equals(this.measureUnit, skillInfo.measureUnit) && Objects.equals(this.tags, skillInfo.tags)
            && Objects.equals(this.size, skillInfo.size) && Objects.equals(this.testResult, skillInfo.testResult)
            && Objects.equals(this.installTimes, skillInfo.installTimes)
            && Objects.equals(this.privacyPolicy, skillInfo.privacyPolicy) && Objects.equals(this.name, skillInfo.name)
            && Objects.equals(this.scenes, skillInfo.scenes) && Objects.equals(this.chargeModel, skillInfo.chargeModel)
            && Objects.equals(this.resourceSpecCode, skillInfo.resourceSpecCode)
            && Objects.equals(this.skillId, skillInfo.skillId) && Objects.equals(this.developer, skillInfo.developer)
            && Objects.equals(this.mainScenes, skillInfo.mainScenes)
            && Objects.equals(this.deviceTypes, skillInfo.deviceTypes) && Objects.equals(this.status, skillInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subScenes,
            appTemplateId,
            icon,
            versionNum,
            description,
            productInfo,
            type,
            platform,
            selfDevFlag,
            measureType,
            approvalResult,
            updateTime,
            channelLimit,
            publishTime,
            resourceStepSize,
            approvalTime,
            cloudServiceType,
            summary,
            testStatus,
            chip,
            isVerifyModel,
            format,
            resourceType,
            version,
            measureUnit,
            tags,
            size,
            testResult,
            installTimes,
            privacyPolicy,
            name,
            scenes,
            chargeModel,
            resourceSpecCode,
            skillId,
            developer,
            mainScenes,
            deviceTypes,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillInfo {\n");
        sb.append("    subScenes: ").append(toIndentedString(subScenes)).append("\n");
        sb.append("    appTemplateId: ").append(toIndentedString(appTemplateId)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    selfDevFlag: ").append(toIndentedString(selfDevFlag)).append("\n");
        sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
        sb.append("    approvalResult: ").append(toIndentedString(approvalResult)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    resourceStepSize: ").append(toIndentedString(resourceStepSize)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    testStatus: ").append(toIndentedString(testStatus)).append("\n");
        sb.append("    chip: ").append(toIndentedString(chip)).append("\n");
        sb.append("    isVerifyModel: ").append(toIndentedString(isVerifyModel)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
        sb.append("    installTimes: ").append(toIndentedString(installTimes)).append("\n");
        sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
        sb.append("    mainScenes: ").append(toIndentedString(mainScenes)).append("\n");
        sb.append("    deviceTypes: ").append(toIndentedString(deviceTypes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
