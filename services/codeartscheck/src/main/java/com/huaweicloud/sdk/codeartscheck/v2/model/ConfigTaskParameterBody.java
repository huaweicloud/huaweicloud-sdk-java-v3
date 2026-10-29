package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 任务配置检查参数请求信息。 **取值范围：** 不涉及。
 */
public class ConfigTaskParameterBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_id")

    private Integer checkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleset_id")

    private String rulesetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_check_settings")

    private List<TaskCheckSettingsItem> taskCheckSettings = null;

    public ConfigTaskParameterBody withCheckId(Integer checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * **参数解释：** 参数已废弃，默认填写0即可。 **约束限制:** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return checkId
     */
    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public ConfigTaskParameterBody withRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }

    /**
     * **参数解释:** 兼容历史版本的废弃参数，不校验真实性。规则集ID，通过[[查询规则集列表](https://support.huaweicloud.com/api-codecheck/ListRulesets.html)](tag:hws)[[查询规则集列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRulesets.html)](tag:hws_hk)[查询规则集列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口可获取到规则集ID。 **约束限制:** 不涉及。 **取值范围:** 长度为[1~32]个字符。 **默认取值：** 不涉及。
     * @return rulesetId
     */
    public String getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
    }

    public ConfigTaskParameterBody withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释:** 兼容历史版本的废弃参数，不校验真实性。规则集对应语言，通过[[查询规则集列表](https://support.huaweicloud.com/api-codecheck/ListRulesets.html)](tag:hws)[[查询规则集列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRulesets.html)](tag:hws_hk)[查询规则集列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口可获取到规则集ID对应的语言。 **约束限制:** 不涉及。 **取值范围:** 与ruleset_id规则集的语言对应。 **默认取值：** 不涉及。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ConfigTaskParameterBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释:** 当前规则集对应的编译配置总开关。 **约束限制:** 不涉及。 **取值范围:** - off：关闭。 - on：打开。 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfigTaskParameterBody withTaskCheckSettings(List<TaskCheckSettingsItem> taskCheckSettings) {
        this.taskCheckSettings = taskCheckSettings;
        return this;
    }

    public ConfigTaskParameterBody addTaskCheckSettingsItem(TaskCheckSettingsItem taskCheckSettingsItem) {
        if (this.taskCheckSettings == null) {
            this.taskCheckSettings = new ArrayList<>();
        }
        this.taskCheckSettings.add(taskCheckSettingsItem);
        return this;
    }

    public ConfigTaskParameterBody withTaskCheckSettings(
        Consumer<List<TaskCheckSettingsItem>> taskCheckSettingsSetter) {
        if (this.taskCheckSettings == null) {
            this.taskCheckSettings = new ArrayList<>();
        }
        taskCheckSettingsSetter.accept(this.taskCheckSettings);
        return this;
    }

    /**
     * **参数解释:** 数组类型，当前规则集对应编译配置具体详情，可基于web页面查看当前规则集所涉及的编译配置，多个参数配置多条即可。 **约束限制:** 不涉及。
     * @return taskCheckSettings
     */
    public List<TaskCheckSettingsItem> getTaskCheckSettings() {
        return taskCheckSettings;
    }

    public void setTaskCheckSettings(List<TaskCheckSettingsItem> taskCheckSettings) {
        this.taskCheckSettings = taskCheckSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigTaskParameterBody that = (ConfigTaskParameterBody) obj;
        return Objects.equals(this.checkId, that.checkId) && Objects.equals(this.rulesetId, that.rulesetId)
            && Objects.equals(this.language, that.language) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskCheckSettings, that.taskCheckSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkId, rulesetId, language, status, taskCheckSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigTaskParameterBody {\n");
        sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
        sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskCheckSettings: ").append(toIndentedString(taskCheckSettings)).append("\n");
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
