package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ImportBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private List<BackupSyncRespBody> sync = null;

    public ImportBackupResponse withSync(List<BackupSyncRespBody> sync) {
        this.sync = sync;
        return this;
    }

    public ImportBackupResponse addSyncItem(BackupSyncRespBody syncItem) {
        if (this.sync == null) {
            this.sync = new ArrayList<>();
        }
        this.sync.add(syncItem);
        return this;
    }

    public ImportBackupResponse withSync(Consumer<List<BackupSyncRespBody>> syncSetter) {
        if (this.sync == null) {
            this.sync = new ArrayList<>();
        }
        syncSetter.accept(this.sync);
        return this;
    }

    /** 同步备份副本接口的返回信息
     * 
     * @return sync */
    public List<BackupSyncRespBody> getSync() {
        return sync;
    }

    public void setSync(List<BackupSyncRespBody> sync) {
        this.sync = sync;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportBackupResponse importBackupResponse = (ImportBackupResponse) o;
        return Objects.equals(this.sync, importBackupResponse.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBackupResponse {\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
