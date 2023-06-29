package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private List<BackupDto> backups = null;

    public ListBackupResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 归档记录总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListBackupResponse withBackups(List<BackupDto> backups) {
        this.backups = backups;
        return this;
    }

    public ListBackupResponse addBackupsItem(BackupDto backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ListBackupResponse withBackups(Consumer<List<BackupDto>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 归档记录列表
     * @return backups
     */
    public List<BackupDto> getBackups() {
        return backups;
    }

    public void setBackups(List<BackupDto> backups) {
        this.backups = backups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackupResponse that = (ListBackupResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.backups, that.backups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, backups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
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
