package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateExpirationTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_backups_count")

    private Integer affectedBackupsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_expiration_day")

    private String newExpirationDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log_id")

    private String operationLogId;

    public UpdateExpirationTimeResponse withAffectedBackupsCount(Integer affectedBackupsCount) {
        this.affectedBackupsCount = affectedBackupsCount;
        return this;
    }

    /**
     * 成功修改过期时间的备份数量。
     * @return affectedBackupsCount
     */
    public Integer getAffectedBackupsCount() {
        return affectedBackupsCount;
    }

    public void setAffectedBackupsCount(Integer affectedBackupsCount) {
        this.affectedBackupsCount = affectedBackupsCount;
    }

    public UpdateExpirationTimeResponse withNewExpirationDay(String newExpirationDay) {
        this.newExpirationDay = newExpirationDay;
        return this;
    }

    /**
     * 修改后的备份过期时间，格式：YYYY-MM-DD。
     * @return newExpirationDay
     */
    public String getNewExpirationDay() {
        return newExpirationDay;
    }

    public void setNewExpirationDay(String newExpirationDay) {
        this.newExpirationDay = newExpirationDay;
    }

    public UpdateExpirationTimeResponse withOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
        return this;
    }

    /**
     * 任务ID
     * @return operationLogId
     */
    public String getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateExpirationTimeResponse that = (UpdateExpirationTimeResponse) obj;
        return Objects.equals(this.affectedBackupsCount, that.affectedBackupsCount)
            && Objects.equals(this.newExpirationDay, that.newExpirationDay)
            && Objects.equals(this.operationLogId, that.operationLogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectedBackupsCount, newExpirationDay, operationLogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExpirationTimeResponse {\n");
        sb.append("    affectedBackupsCount: ").append(toIndentedString(affectedBackupsCount)).append("\n");
        sb.append("    newExpirationDay: ").append(toIndentedString(newExpirationDay)).append("\n");
        sb.append("    operationLogId: ").append(toIndentedString(operationLogId)).append("\n");
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
