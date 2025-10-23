package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateComplianceRuleRequestBody
 */
public class UpdateComplianceRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_enabled")

    private Boolean localBackupEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_retention")

    private Integer localBackupRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_frequency")

    private UpdateComplianceRuleRequestBodyLocalBackupFrequency localBackupFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup_enabled")

    private Boolean remoteBackupEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup_retention")

    private Integer remoteBackupRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_worm_enabled")

    private Boolean localWormEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_worm_enabled")

    private Boolean remoteWormEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cross_account_backup_forced")

    private Boolean isCrossAccountBackupForced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateComplianceRuleRequestBody withLocalBackupEnabled(Boolean localBackupEnabled) {
        this.localBackupEnabled = localBackupEnabled;
        return this;
    }

    /**
     * 是否启用本地备份
     * @return localBackupEnabled
     */
    public Boolean getLocalBackupEnabled() {
        return localBackupEnabled;
    }

    public void setLocalBackupEnabled(Boolean localBackupEnabled) {
        this.localBackupEnabled = localBackupEnabled;
    }

    public UpdateComplianceRuleRequestBody withLocalBackupRetention(Integer localBackupRetention) {
        this.localBackupRetention = localBackupRetention;
        return this;
    }

    /**
     * 本地备份副本保留时长
     * minimum: -1
     * maximum: 99999
     * @return localBackupRetention
     */
    public Integer getLocalBackupRetention() {
        return localBackupRetention;
    }

    public void setLocalBackupRetention(Integer localBackupRetention) {
        this.localBackupRetention = localBackupRetention;
    }

    public UpdateComplianceRuleRequestBody withLocalBackupFrequency(
        UpdateComplianceRuleRequestBodyLocalBackupFrequency localBackupFrequency) {
        this.localBackupFrequency = localBackupFrequency;
        return this;
    }

    public UpdateComplianceRuleRequestBody withLocalBackupFrequency(
        Consumer<UpdateComplianceRuleRequestBodyLocalBackupFrequency> localBackupFrequencySetter) {
        if (this.localBackupFrequency == null) {
            this.localBackupFrequency = new UpdateComplianceRuleRequestBodyLocalBackupFrequency();
            localBackupFrequencySetter.accept(this.localBackupFrequency);
        }

        return this;
    }

    /**
     * Get localBackupFrequency
     * @return localBackupFrequency
     */
    public UpdateComplianceRuleRequestBodyLocalBackupFrequency getLocalBackupFrequency() {
        return localBackupFrequency;
    }

    public void setLocalBackupFrequency(UpdateComplianceRuleRequestBodyLocalBackupFrequency localBackupFrequency) {
        this.localBackupFrequency = localBackupFrequency;
    }

    public UpdateComplianceRuleRequestBody withRemoteBackupEnabled(Boolean remoteBackupEnabled) {
        this.remoteBackupEnabled = remoteBackupEnabled;
        return this;
    }

    /**
     * 是否启用异地复制
     * @return remoteBackupEnabled
     */
    public Boolean getRemoteBackupEnabled() {
        return remoteBackupEnabled;
    }

    public void setRemoteBackupEnabled(Boolean remoteBackupEnabled) {
        this.remoteBackupEnabled = remoteBackupEnabled;
    }

    public UpdateComplianceRuleRequestBody withRemoteBackupRetention(Integer remoteBackupRetention) {
        this.remoteBackupRetention = remoteBackupRetention;
        return this;
    }

    /**
     * 异地复制副本保留时长。
     * minimum: -1
     * maximum: 99999
     * @return remoteBackupRetention
     */
    public Integer getRemoteBackupRetention() {
        return remoteBackupRetention;
    }

    public void setRemoteBackupRetention(Integer remoteBackupRetention) {
        this.remoteBackupRetention = remoteBackupRetention;
    }

    public UpdateComplianceRuleRequestBody withLocalWormEnabled(Boolean localWormEnabled) {
        this.localWormEnabled = localWormEnabled;
        return this;
    }

    /**
     * 本地副本是否启用WORM特性。
     * @return localWormEnabled
     */
    public Boolean getLocalWormEnabled() {
        return localWormEnabled;
    }

    public void setLocalWormEnabled(Boolean localWormEnabled) {
        this.localWormEnabled = localWormEnabled;
    }

    public UpdateComplianceRuleRequestBody withRemoteWormEnabled(Boolean remoteWormEnabled) {
        this.remoteWormEnabled = remoteWormEnabled;
        return this;
    }

    /**
     * 异地复制副本是否开启WORM特性
     * @return remoteWormEnabled
     */
    public Boolean getRemoteWormEnabled() {
        return remoteWormEnabled;
    }

    public void setRemoteWormEnabled(Boolean remoteWormEnabled) {
        this.remoteWormEnabled = remoteWormEnabled;
    }

    public UpdateComplianceRuleRequestBody withIsCrossAccountBackupForced(Boolean isCrossAccountBackupForced) {
        this.isCrossAccountBackupForced = isCrossAccountBackupForced;
        return this;
    }

    /**
     * 是否强制开启跨账号备份
     * @return isCrossAccountBackupForced
     */
    public Boolean getIsCrossAccountBackupForced() {
        return isCrossAccountBackupForced;
    }

    public void setIsCrossAccountBackupForced(Boolean isCrossAccountBackupForced) {
        this.isCrossAccountBackupForced = isCrossAccountBackupForced;
    }

    public UpdateComplianceRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateComplianceRuleRequestBody that = (UpdateComplianceRuleRequestBody) obj;
        return Objects.equals(this.localBackupEnabled, that.localBackupEnabled)
            && Objects.equals(this.localBackupRetention, that.localBackupRetention)
            && Objects.equals(this.localBackupFrequency, that.localBackupFrequency)
            && Objects.equals(this.remoteBackupEnabled, that.remoteBackupEnabled)
            && Objects.equals(this.remoteBackupRetention, that.remoteBackupRetention)
            && Objects.equals(this.localWormEnabled, that.localWormEnabled)
            && Objects.equals(this.remoteWormEnabled, that.remoteWormEnabled)
            && Objects.equals(this.isCrossAccountBackupForced, that.isCrossAccountBackupForced)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localBackupEnabled,
            localBackupRetention,
            localBackupFrequency,
            remoteBackupEnabled,
            remoteBackupRetention,
            localWormEnabled,
            remoteWormEnabled,
            isCrossAccountBackupForced,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComplianceRuleRequestBody {\n");
        sb.append("    localBackupEnabled: ").append(toIndentedString(localBackupEnabled)).append("\n");
        sb.append("    localBackupRetention: ").append(toIndentedString(localBackupRetention)).append("\n");
        sb.append("    localBackupFrequency: ").append(toIndentedString(localBackupFrequency)).append("\n");
        sb.append("    remoteBackupEnabled: ").append(toIndentedString(remoteBackupEnabled)).append("\n");
        sb.append("    remoteBackupRetention: ").append(toIndentedString(remoteBackupRetention)).append("\n");
        sb.append("    localWormEnabled: ").append(toIndentedString(localWormEnabled)).append("\n");
        sb.append("    remoteWormEnabled: ").append(toIndentedString(remoteWormEnabled)).append("\n");
        sb.append("    isCrossAccountBackupForced: ").append(toIndentedString(isCrossAccountBackupForced)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
