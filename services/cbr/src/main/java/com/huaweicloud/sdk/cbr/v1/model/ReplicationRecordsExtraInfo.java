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
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

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

    public ReplicationRecordsExtraInfo withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /**
     * 目标端的存储库id
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationRecordsExtraInfo that = (ReplicationRecordsExtraInfo) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.failCode, that.failCode)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.autoTrigger, that.autoTrigger)
            && Objects.equals(this.destinationVaultId, that.destinationVaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, failCode, failReason, autoTrigger, destinationVaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationRecordsExtraInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
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
