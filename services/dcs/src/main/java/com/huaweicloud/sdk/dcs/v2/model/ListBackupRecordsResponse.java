package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListBackupRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_record_response")

    private List<BackupRecordResponse> backupRecordResponse = null;

    public ListBackupRecordsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 返回记录数。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListBackupRecordsResponse withBackupRecordResponse(List<BackupRecordResponse> backupRecordResponse) {
        this.backupRecordResponse = backupRecordResponse;
        return this;
    }

    public ListBackupRecordsResponse addBackupRecordResponseItem(BackupRecordResponse backupRecordResponseItem) {
        if (this.backupRecordResponse == null) {
            this.backupRecordResponse = new ArrayList<>();
        }
        this.backupRecordResponse.add(backupRecordResponseItem);
        return this;
    }

    public ListBackupRecordsResponse withBackupRecordResponse(
        Consumer<List<BackupRecordResponse>> backupRecordResponseSetter) {
        if (this.backupRecordResponse == null) {
            this.backupRecordResponse = new ArrayList<>();
        }
        backupRecordResponseSetter.accept(this.backupRecordResponse);
        return this;
    }

    /**
     * 备份信息的详情数组。
     * @return backupRecordResponse
     */
    public List<BackupRecordResponse> getBackupRecordResponse() {
        return backupRecordResponse;
    }

    public void setBackupRecordResponse(List<BackupRecordResponse> backupRecordResponse) {
        this.backupRecordResponse = backupRecordResponse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupRecordsResponse listBackupRecordsResponse = (ListBackupRecordsResponse) o;
        return Objects.equals(this.totalNum, listBackupRecordsResponse.totalNum)
            && Objects.equals(this.backupRecordResponse, listBackupRecordsResponse.backupRecordResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, backupRecordResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupRecordsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    backupRecordResponse: ").append(toIndentedString(backupRecordResponse)).append("\n");
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
