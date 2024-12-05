package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDisasterRecoverySettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_settings")

    private List<SwitchoverRatioInfo> disasterRecoverySettings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowDisasterRecoverySettingsResponse withDisasterRecoverySettings(
        List<SwitchoverRatioInfo> disasterRecoverySettings) {
        this.disasterRecoverySettings = disasterRecoverySettings;
        return this;
    }

    public ShowDisasterRecoverySettingsResponse addDisasterRecoverySettingsItem(
        SwitchoverRatioInfo disasterRecoverySettingsItem) {
        if (this.disasterRecoverySettings == null) {
            this.disasterRecoverySettings = new ArrayList<>();
        }
        this.disasterRecoverySettings.add(disasterRecoverySettingsItem);
        return this;
    }

    public ShowDisasterRecoverySettingsResponse withDisasterRecoverySettings(
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

    public ShowDisasterRecoverySettingsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDisasterRecoverySettingsResponse that = (ShowDisasterRecoverySettingsResponse) obj;
        return Objects.equals(this.disasterRecoverySettings, that.disasterRecoverySettings)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoverySettings, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterRecoverySettingsResponse {\n");
        sb.append("    disasterRecoverySettings: ").append(toIndentedString(disasterRecoverySettings)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
