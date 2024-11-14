package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteBackupRequestBody
 */
public class BatchDeleteBackupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_ids")

    private List<String> backupIds = null;

    public BatchDeleteBackupRequestBody withBackupIds(List<String> backupIds) {
        this.backupIds = backupIds;
        return this;
    }

    public BatchDeleteBackupRequestBody addBackupIdsItem(String backupIdsItem) {
        if (this.backupIds == null) {
            this.backupIds = new ArrayList<>();
        }
        this.backupIds.add(backupIdsItem);
        return this;
    }

    public BatchDeleteBackupRequestBody withBackupIds(Consumer<List<String>> backupIdsSetter) {
        if (this.backupIds == null) {
            this.backupIds = new ArrayList<>();
        }
        backupIdsSetter.accept(this.backupIds);
        return this;
    }

    /**
     * 需要批量删除的手动备份id列表，最多一次不超过10条。
     * @return backupIds
     */
    public List<String> getBackupIds() {
        return backupIds;
    }

    public void setBackupIds(List<String> backupIds) {
        this.backupIds = backupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteBackupRequestBody that = (BatchDeleteBackupRequestBody) obj;
        return Objects.equals(this.backupIds, that.backupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBackupRequestBody {\n");
        sb.append("    backupIds: ").append(toIndentedString(backupIds)).append("\n");
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
