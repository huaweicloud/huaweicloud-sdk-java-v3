package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackupSyncReq
 */
public class BackupSyncReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private List<BackupSync> sync = null;

    public BackupSyncReq withSync(List<BackupSync> sync) {
        this.sync = sync;
        return this;
    }

    public BackupSyncReq addSyncItem(BackupSync syncItem) {
        if (this.sync == null) {
            this.sync = new ArrayList<>();
        }
        this.sync.add(syncItem);
        return this;
    }

    public BackupSyncReq withSync(Consumer<List<BackupSync>> syncSetter) {
        if (this.sync == null) {
            this.sync = new ArrayList<>();
        }
        syncSetter.accept(this.sync);
        return this;
    }

    /**
     * 待同步备份副本列表
     * @return sync
     */
    public List<BackupSync> getSync() {
        return sync;
    }

    public void setSync(List<BackupSync> sync) {
        this.sync = sync;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupSyncReq that = (BackupSyncReq) obj;
        return Objects.equals(this.sync, that.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupSyncReq {\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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
