package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新增量位点请求体。
 */
public class ModifyStartPositionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_and_position")

    private String fileAndPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gtid_set")

    private String gtidSet;

    public ModifyStartPositionReq withFileAndPosition(String fileAndPosition) {
        this.fileAndPosition = fileAndPosition;
        return this;
    }

    /**
     * - MySQL为源通过show master status命令获取源库位点，根据提示分别填写File:Position。例如：mysql-bin.000277:805  文件名只能为1-60个字符且不能包含< > & : \" \\' / \\\\\\\\ 特殊字符，文件编号只能为3-20个数字，binlog事件位置只能为1-20个数字，且总长度不能超过100个字符。格式为：文件名.文件编号:事件位点  - mogo为源的任务，任务的源库日志从位点开始获取（含当前启动位点），位点需设置在oplog范围以内。非集群通过db.getReplicationInfo()直接获得oplog范围，集群通过db.watch([], {startAtOperationTime: Timestamp(xx, xx)})命令，将启动位点填在xx处，校验位点是否在oplog范围以内。格式为：timestamp:incre。timestamp和incre均为范围在1~2,147,483,647之间的整数。
     * @return fileAndPosition
     */
    public String getFileAndPosition() {
        return fileAndPosition;
    }

    public void setFileAndPosition(String fileAndPosition) {
        this.fileAndPosition = fileAndPosition;
    }

    public ModifyStartPositionReq withGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
        return this;
    }

    /**
     * MySQL为源的任务需要，通过show master status命令获取源库位点，根据提示填写Executed_Gtid_Set（如果源库为MySQL 5.5版本，则不支持使用同步任务）。 - 不能包含< > & \" \\' / \\\\\\\\ 特殊字符和中文。且不能超过2048个字符
     * @return gtidSet
     */
    public String getGtidSet() {
        return gtidSet;
    }

    public void setGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyStartPositionReq that = (ModifyStartPositionReq) obj;
        return Objects.equals(this.fileAndPosition, that.fileAndPosition) && Objects.equals(this.gtidSet, that.gtidSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileAndPosition, gtidSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyStartPositionReq {\n");
        sb.append("    fileAndPosition: ").append(toIndentedString(fileAndPosition)).append("\n");
        sb.append("    gtidSet: ").append(toIndentedString(gtidSet)).append("\n");
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
