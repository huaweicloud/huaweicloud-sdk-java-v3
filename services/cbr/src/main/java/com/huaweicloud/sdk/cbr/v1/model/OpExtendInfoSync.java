package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OpExtendInfoSync */
public class OpExtendInfoSync {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_backup_num")

    private Integer syncBackupNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_backup_num")

    private Integer deleteBackupNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_sync_backup_num")

    private Integer errSyncBackupNum;

    public OpExtendInfoSync withSyncBackupNum(Integer syncBackupNum) {
        this.syncBackupNum = syncBackupNum;
        return this;
    }

    /** 同步备份副本数
     * 
     * @return syncBackupNum */
    public Integer getSyncBackupNum() {
        return syncBackupNum;
    }

    public void setSyncBackupNum(Integer syncBackupNum) {
        this.syncBackupNum = syncBackupNum;
    }

    public OpExtendInfoSync withDeleteBackupNum(Integer deleteBackupNum) {
        this.deleteBackupNum = deleteBackupNum;
        return this;
    }

    /** 删除的备份副本数
     * 
     * @return deleteBackupNum */
    public Integer getDeleteBackupNum() {
        return deleteBackupNum;
    }

    public void setDeleteBackupNum(Integer deleteBackupNum) {
        this.deleteBackupNum = deleteBackupNum;
    }

    public OpExtendInfoSync withErrSyncBackupNum(Integer errSyncBackupNum) {
        this.errSyncBackupNum = errSyncBackupNum;
        return this;
    }

    /** 同步失败备副本数
     * 
     * @return errSyncBackupNum */
    public Integer getErrSyncBackupNum() {
        return errSyncBackupNum;
    }

    public void setErrSyncBackupNum(Integer errSyncBackupNum) {
        this.errSyncBackupNum = errSyncBackupNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoSync opExtendInfoSync = (OpExtendInfoSync) o;
        return Objects.equals(this.syncBackupNum, opExtendInfoSync.syncBackupNum)
            && Objects.equals(this.deleteBackupNum, opExtendInfoSync.deleteBackupNum)
            && Objects.equals(this.errSyncBackupNum, opExtendInfoSync.errSyncBackupNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncBackupNum, deleteBackupNum, errSyncBackupNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoSync {\n");
        sb.append("    syncBackupNum: ").append(toIndentedString(syncBackupNum)).append("\n");
        sb.append("    deleteBackupNum: ").append(toIndentedString(deleteBackupNum)).append("\n");
        sb.append("    errSyncBackupNum: ").append(toIndentedString(errSyncBackupNum)).append("\n");
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
