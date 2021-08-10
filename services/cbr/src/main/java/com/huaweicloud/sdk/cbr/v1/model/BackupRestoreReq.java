package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 恢复请求body */
public class BackupRestoreReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore")

    private BackupRestore restore;

    public BackupRestoreReq withRestore(BackupRestore restore) {
        this.restore = restore;
        return this;
    }

    public BackupRestoreReq withRestore(Consumer<BackupRestore> restoreSetter) {
        if (this.restore == null) {
            this.restore = new BackupRestore();
            restoreSetter.accept(this.restore);
        }

        return this;
    }

    /** Get restore
     * 
     * @return restore */
    public BackupRestore getRestore() {
        return restore;
    }

    public void setRestore(BackupRestore restore) {
        this.restore = restore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestoreReq backupRestoreReq = (BackupRestoreReq) o;
        return Objects.equals(this.restore, backupRestoreReq.restore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestoreReq {\n");
        sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
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
