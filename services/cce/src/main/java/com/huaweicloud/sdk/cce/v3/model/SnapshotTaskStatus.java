package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SnapshotTaskStatus
 */
public class SnapshotTaskStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestBackupTime")

    private String latestBackupTime;

    public SnapshotTaskStatus withLatestBackupTime(String latestBackupTime) {
        this.latestBackupTime = latestBackupTime;
        return this;
    }

    /**
     * 最近一次备份的时间
     * @return latestBackupTime
     */
    public String getLatestBackupTime() {
        return latestBackupTime;
    }

    public void setLatestBackupTime(String latestBackupTime) {
        this.latestBackupTime = latestBackupTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotTaskStatus that = (SnapshotTaskStatus) obj;
        return Objects.equals(this.latestBackupTime, that.latestBackupTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestBackupTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotTaskStatus {\n");
        sb.append("    latestBackupTime: ").append(toIndentedString(latestBackupTime)).append("\n");
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
