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
public class ShowAllInstancesBackupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private List<QueryInstanceBackupResponseBodyBackups> backups = null;

    public ShowAllInstancesBackupsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowAllInstancesBackupsResponse withBackups(List<QueryInstanceBackupResponseBodyBackups> backups) {
        this.backups = backups;
        return this;
    }

    public ShowAllInstancesBackupsResponse addBackupsItem(QueryInstanceBackupResponseBodyBackups backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ShowAllInstancesBackupsResponse withBackups(
        Consumer<List<QueryInstanceBackupResponseBodyBackups>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 备份列表信息。
     * @return backups
     */
    public List<QueryInstanceBackupResponseBodyBackups> getBackups() {
        return backups;
    }

    public void setBackups(List<QueryInstanceBackupResponseBodyBackups> backups) {
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
        ShowAllInstancesBackupsResponse that = (ShowAllInstancesBackupsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.backups, that.backups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, backups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAllInstancesBackupsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
