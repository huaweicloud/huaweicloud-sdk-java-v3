package com.huaweicloud.sdk.ges.v2.model;

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
public class ListGraphBackups2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_count")

    private Integer backupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_list")

    private List<ListBackupsRespBackupList> backupList = null;

    public ListGraphBackups2Response withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    /**
     * 备份总个数。请求失败时，字段为空。
     * @return backupCount
     */
    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    public ListGraphBackups2Response withBackupList(List<ListBackupsRespBackupList> backupList) {
        this.backupList = backupList;
        return this;
    }

    public ListGraphBackups2Response addBackupListItem(ListBackupsRespBackupList backupListItem) {
        if (this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        this.backupList.add(backupListItem);
        return this;
    }

    public ListGraphBackups2Response withBackupList(Consumer<List<ListBackupsRespBackupList>> backupListSetter) {
        if (this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        backupListSetter.accept(this.backupList);
        return this;
    }

    /**
     * 当前Project ID下的所有图的备份列表。请求失败时，字段为空。
     * @return backupList
     */
    public List<ListBackupsRespBackupList> getBackupList() {
        return backupList;
    }

    public void setBackupList(List<ListBackupsRespBackupList> backupList) {
        this.backupList = backupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGraphBackups2Response that = (ListGraphBackups2Response) obj;
        return Objects.equals(this.backupCount, that.backupCount) && Objects.equals(this.backupList, that.backupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupCount, backupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphBackups2Response {\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
        sb.append("    backupList: ").append(toIndentedString(backupList)).append("\n");
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
