package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateIgnorePathRequestBody
 */
public class UpdateIgnorePathRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_path_settings")

    private List<IgnorePathSettingItem> ignorePathSettings = null;

    public UpdateIgnorePathRequestBody withIgnorePathSettings(List<IgnorePathSettingItem> ignorePathSettings) {
        this.ignorePathSettings = ignorePathSettings;
        return this;
    }

    public UpdateIgnorePathRequestBody addIgnorePathSettingsItem(IgnorePathSettingItem ignorePathSettingsItem) {
        if (this.ignorePathSettings == null) {
            this.ignorePathSettings = new ArrayList<>();
        }
        this.ignorePathSettings.add(ignorePathSettingsItem);
        return this;
    }

    public UpdateIgnorePathRequestBody withIgnorePathSettings(
        Consumer<List<IgnorePathSettingItem>> ignorePathSettingsSetter) {
        if (this.ignorePathSettings == null) {
            this.ignorePathSettings = new ArrayList<>();
        }
        ignorePathSettingsSetter.accept(this.ignorePathSettings);
        return this;
    }

    /**
     * 屏蔽目录的节点信息列表
     * @return ignorePathSettings
     */
    public List<IgnorePathSettingItem> getIgnorePathSettings() {
        return ignorePathSettings;
    }

    public void setIgnorePathSettings(List<IgnorePathSettingItem> ignorePathSettings) {
        this.ignorePathSettings = ignorePathSettings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIgnorePathRequestBody updateIgnorePathRequestBody = (UpdateIgnorePathRequestBody) o;
        return Objects.equals(this.ignorePathSettings, updateIgnorePathRequestBody.ignorePathSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignorePathSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIgnorePathRequestBody {\n");
        sb.append("    ignorePathSettings: ").append(toIndentedString(ignorePathSettings)).append("\n");
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
