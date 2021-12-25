package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 任务配置检查参数请求信息 */
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

    /** 检查工具ID
     * 
     * @return checkId */
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

    /** 规则集ID
     * 
     * @return rulesetId */
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

    /** 规则集语言
     * 
     * @return language */
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

    /** off：关闭，on：开启
     * 
     * @return status */
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

    /** 检查参数信息
     * 
     * @return taskCheckSettings */
    public List<TaskCheckSettingsItem> getTaskCheckSettings() {
        return taskCheckSettings;
    }

    public void setTaskCheckSettings(List<TaskCheckSettingsItem> taskCheckSettings) {
        this.taskCheckSettings = taskCheckSettings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigTaskParameterBody configTaskParameterBody = (ConfigTaskParameterBody) o;
        return Objects.equals(this.checkId, configTaskParameterBody.checkId)
            && Objects.equals(this.rulesetId, configTaskParameterBody.rulesetId)
            && Objects.equals(this.language, configTaskParameterBody.language)
            && Objects.equals(this.status, configTaskParameterBody.status)
            && Objects.equals(this.taskCheckSettings, configTaskParameterBody.taskCheckSettings);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
