package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务配置高级选项的请求信息
 */
public class UpdateTaskSettingsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_advanced_settings")

    private List<TaskAdvancedSettingsItem> taskAdvancedSettings = null;

    public UpdateTaskSettingsRequestBody withTaskAdvancedSettings(List<TaskAdvancedSettingsItem> taskAdvancedSettings) {
        this.taskAdvancedSettings = taskAdvancedSettings;
        return this;
    }

    public UpdateTaskSettingsRequestBody addTaskAdvancedSettingsItem(
        TaskAdvancedSettingsItem taskAdvancedSettingsItem) {
        if (this.taskAdvancedSettings == null) {
            this.taskAdvancedSettings = new ArrayList<>();
        }
        this.taskAdvancedSettings.add(taskAdvancedSettingsItem);
        return this;
    }

    public UpdateTaskSettingsRequestBody withTaskAdvancedSettings(
        Consumer<List<TaskAdvancedSettingsItem>> taskAdvancedSettingsSetter) {
        if (this.taskAdvancedSettings == null) {
            this.taskAdvancedSettings = new ArrayList<>();
        }
        taskAdvancedSettingsSetter.accept(this.taskAdvancedSettings);
        return this;
    }

    /**
     * 高级选项参数的相关信息
     * @return taskAdvancedSettings
     */
    public List<TaskAdvancedSettingsItem> getTaskAdvancedSettings() {
        return taskAdvancedSettings;
    }

    public void setTaskAdvancedSettings(List<TaskAdvancedSettingsItem> taskAdvancedSettings) {
        this.taskAdvancedSettings = taskAdvancedSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskSettingsRequestBody that = (UpdateTaskSettingsRequestBody) obj;
        return Objects.equals(this.taskAdvancedSettings, that.taskAdvancedSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskAdvancedSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskSettingsRequestBody {\n");
        sb.append("    taskAdvancedSettings: ").append(toIndentedString(taskAdvancedSettings)).append("\n");
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
