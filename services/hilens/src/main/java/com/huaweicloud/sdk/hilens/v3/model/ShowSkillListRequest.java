package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSkillListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_name")

    private String skillName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_form")

    private String skillForm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_source")

    private String templateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_model")

    private Integer chargeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip")

    private String chip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_models")

    private String chargeModels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_types")

    private String deviceTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenes")

    private String scenes;

    public ShowSkillListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量, 最大 100，默认值 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowSkillListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置, 默认值 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowSkillListRequest withSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }

    /**
     * 技能名称，支持模糊匹配。中英文、数字、下划线、中划线 长度[1-60]
     * @return skillName
     */
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public ShowSkillListRequest withSkillForm(String skillForm) {
        this.skillForm = skillForm;
        return this;
    }

    /**
     * 技能形式，no_termplate不支持Modelbox部署模板，support_template支持Modelbox模板。
     * @return skillForm
     */
    public String getSkillForm() {
        return skillForm;
    }

    public void setSkillForm(String skillForm) {
        this.skillForm = skillForm;
    }

    public ShowSkillListRequest withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 技能可见权限，支持公开可见public以及白名单whitelist
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public ShowSkillListRequest withTemplateSource(String templateSource) {
        this.templateSource = templateSource;
        return this;
    }

    /**
     * 技能来源，分别hilens，ma_pro，studio
     * @return templateSource
     */
    public String getTemplateSource() {
        return templateSource;
    }

    public void setTemplateSource(String templateSource) {
        this.templateSource = templateSource;
    }

    public ShowSkillListRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 技能审核状态状态，1表示审核通过，2表示审核不通过，0表示待审核
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowSkillListRequest withChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
        return this;
    }

    /**
     * 收费模式，0表示永久免费，1表示收费，2表示30天试用，3表示365天试用，4表示收费（永久使用）
     * @return chargeModel
     */
    public Integer getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
    }

    public ShowSkillListRequest withPlatform(String platform) {
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

    public ShowSkillListRequest withChip(String chip) {
        this.chip = chip;
        return this;
    }

    /**
     * 技能芯片类型，其值为Ascend 310,Ascend 310(Atlas 200 DK)，Arm，x86，3516CV500,3519AV100,3519V101,3516DV300,3516EV200,3516EV300,3518EV300
     * @return chip
     */
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public ShowSkillListRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 技能类型，lite表示使用于海思芯片的轻量型技能。standard表示标准技能。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowSkillListRequest withChargeModels(String chargeModels) {
        this.chargeModels = chargeModels;
        return this;
    }

    /**
     * 收费模式多选，0表示永久免费，1表示收费，2表示30天试用，3表示365天试用，4表示收费（永久使用），分隔符为|，例如输入为1|2|3
     * @return chargeModels
     */
    public String getChargeModels() {
        return chargeModels;
    }

    public void setChargeModels(String chargeModels) {
        this.chargeModels = chargeModels;
    }

    public ShowSkillListRequest withDeviceTypes(String deviceTypes) {
        this.deviceTypes = deviceTypes;
        return this;
    }

    /**
     * 设备类型校验，允许输入多个设备类型，用|分隔，例如设备a|设备b。每种设备类型不允许#~^$%&*<>{}[]'|字符，长度1到100。最多50个设备类型
     * @return deviceTypes
     */
    public String getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(String deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    public ShowSkillListRequest withScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }

    /**
     * 技能适用场景，支持多选，分隔符|，例如场景a|场景b，每种场景不允许输入#~^$%&*<>{}\\\\[\\\\]'\\\\|等字符，长度100以内，最多20个设备类型。
     * @return scenes
     */
    public String getScenes() {
        return scenes;
    }

    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSkillListRequest showSkillListRequest = (ShowSkillListRequest) o;
        return Objects.equals(this.limit, showSkillListRequest.limit)
            && Objects.equals(this.offset, showSkillListRequest.offset)
            && Objects.equals(this.skillName, showSkillListRequest.skillName)
            && Objects.equals(this.skillForm, showSkillListRequest.skillForm)
            && Objects.equals(this.permission, showSkillListRequest.permission)
            && Objects.equals(this.templateSource, showSkillListRequest.templateSource)
            && Objects.equals(this.status, showSkillListRequest.status)
            && Objects.equals(this.chargeModel, showSkillListRequest.chargeModel)
            && Objects.equals(this.platform, showSkillListRequest.platform)
            && Objects.equals(this.chip, showSkillListRequest.chip)
            && Objects.equals(this.type, showSkillListRequest.type)
            && Objects.equals(this.chargeModels, showSkillListRequest.chargeModels)
            && Objects.equals(this.deviceTypes, showSkillListRequest.deviceTypes)
            && Objects.equals(this.scenes, showSkillListRequest.scenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            skillName,
            skillForm,
            permission,
            templateSource,
            status,
            chargeModel,
            platform,
            chip,
            type,
            chargeModels,
            deviceTypes,
            scenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSkillListRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
        sb.append("    skillForm: ").append(toIndentedString(skillForm)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    templateSource: ").append(toIndentedString(templateSource)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    chip: ").append(toIndentedString(chip)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    chargeModels: ").append(toIndentedString(chargeModels)).append("\n");
        sb.append("    deviceTypes: ").append(toIndentedString(deviceTypes)).append("\n");
        sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
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
