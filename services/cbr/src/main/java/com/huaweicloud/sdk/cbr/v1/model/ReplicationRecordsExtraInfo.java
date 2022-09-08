package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 复制记录额外信息
 */
public class ReplicationRecordsExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_code")

    private String failCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destinatio_vault_id")

    private String destinatioVaultId;

    public ReplicationRecordsExtraInfo withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 复制进度
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ReplicationRecordsExtraInfo withFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }

    /**
     * 失败错误码，成功时为空
     * @return failCode
     */
    public String getFailCode() {
        return failCode;
    }

    public void setFailCode(String failCode) {
        this.failCode = failCode;
    }

    public ReplicationRecordsExtraInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 错误原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ReplicationRecordsExtraInfo withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    /**
     * 是否为自动调度复制
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public ReplicationRecordsExtraInfo withDestinatioVaultId(String destinatioVaultId) {
        this.destinatioVaultId = destinatioVaultId;
        return this;
    }

    /**
     * 目标端的存储库id
     * @return destinatioVaultId
     */
    public String getDestinatioVaultId() {
        return destinatioVaultId;
    }

    public void setDestinatioVaultId(String destinatioVaultId) {
        this.destinatioVaultId = destinatioVaultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationRecordsExtraInfo replicationRecordsExtraInfo = (ReplicationRecordsExtraInfo) o;
        return Objects.equals(this.progress, replicationRecordsExtraInfo.progress)
            && Objects.equals(this.failCode, replicationRecordsExtraInfo.failCode)
            && Objects.equals(this.failReason, replicationRecordsExtraInfo.failReason)
            && Objects.equals(this.autoTrigger, replicationRecordsExtraInfo.autoTrigger)
            && Objects.equals(this.destinatioVaultId, replicationRecordsExtraInfo.destinatioVaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, failCode, failReason, autoTrigger, destinatioVaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationRecordsExtraInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    destinatioVaultId: ").append(toIndentedString(destinatioVaultId)).append("\n");
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
