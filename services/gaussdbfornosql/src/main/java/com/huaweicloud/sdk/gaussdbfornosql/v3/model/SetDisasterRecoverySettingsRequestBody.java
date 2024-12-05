package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetDisasterRecoverySettingsRequestBody
 */
public class SetDisasterRecoverySettingsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_settings")

    private List<SwitchoverRatioInfo> disasterRecoverySettings = null;

    public SetDisasterRecoverySettingsRequestBody withDisasterRecoverySettings(
        List<SwitchoverRatioInfo> disasterRecoverySettings) {
        this.disasterRecoverySettings = disasterRecoverySettings;
        return this;
    }

    public SetDisasterRecoverySettingsRequestBody addDisasterRecoverySettingsItem(
        SwitchoverRatioInfo disasterRecoverySettingsItem) {
        if (this.disasterRecoverySettings == null) {
            this.disasterRecoverySettings = new ArrayList<>();
        }
        this.disasterRecoverySettings.add(disasterRecoverySettingsItem);
        return this;
    }

    public SetDisasterRecoverySettingsRequestBody withDisasterRecoverySettings(
        Consumer<List<SwitchoverRatioInfo>> disasterRecoverySettingsSetter) {
        if (this.disasterRecoverySettings == null) {
            this.disasterRecoverySettings = new ArrayList<>();
        }
        disasterRecoverySettingsSetter.accept(this.disasterRecoverySettings);
        return this;
    }

    /**
     * 容灾切换的故障节点比例列表。
     * @return disasterRecoverySettings
     */
    public List<SwitchoverRatioInfo> getDisasterRecoverySettings() {
        return disasterRecoverySettings;
    }

    public void setDisasterRecoverySettings(List<SwitchoverRatioInfo> disasterRecoverySettings) {
        this.disasterRecoverySettings = disasterRecoverySettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetDisasterRecoverySettingsRequestBody that = (SetDisasterRecoverySettingsRequestBody) obj;
        return Objects.equals(this.disasterRecoverySettings, that.disasterRecoverySettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoverySettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDisasterRecoverySettingsRequestBody {\n");
        sb.append("    disasterRecoverySettings: ").append(toIndentedString(disasterRecoverySettings)).append("\n");
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
