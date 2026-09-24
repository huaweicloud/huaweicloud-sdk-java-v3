package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpExtendInfoUpdateExpirationTime
 */
public class OpExtendInfoUpdateExpirationTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_backups_count")

    private Integer affectedBackupsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_day")

    private String expirationDay;

    public OpExtendInfoUpdateExpirationTime withAffectedBackupsCount(Integer affectedBackupsCount) {
        this.affectedBackupsCount = affectedBackupsCount;
        return this;
    }

    /**
     * 本次任务受影响的备份个数
     * @return affectedBackupsCount
     */
    public Integer getAffectedBackupsCount() {
        return affectedBackupsCount;
    }

    public void setAffectedBackupsCount(Integer affectedBackupsCount) {
        this.affectedBackupsCount = affectedBackupsCount;
    }

    public OpExtendInfoUpdateExpirationTime withExpirationDay(String expirationDay) {
        this.expirationDay = expirationDay;
        return this;
    }

    /**
     * 本次任务预期过期日期，格式：YYYY-MM-DD。
     * @return expirationDay
     */
    public String getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(String expirationDay) {
        this.expirationDay = expirationDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpExtendInfoUpdateExpirationTime that = (OpExtendInfoUpdateExpirationTime) obj;
        return Objects.equals(this.affectedBackupsCount, that.affectedBackupsCount)
            && Objects.equals(this.expirationDay, that.expirationDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectedBackupsCount, expirationDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoUpdateExpirationTime {\n");
        sb.append("    affectedBackupsCount: ").append(toIndentedString(affectedBackupsCount)).append("\n");
        sb.append("    expirationDay: ").append(toIndentedString(expirationDay)).append("\n");
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
