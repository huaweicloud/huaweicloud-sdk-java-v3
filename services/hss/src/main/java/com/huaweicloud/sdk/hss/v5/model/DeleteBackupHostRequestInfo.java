package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteBackupHostRequestInfo
 */
public class DeleteBackupHostRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_id_list")

    private List<String> backupHostIdList = null;

    public DeleteBackupHostRequestInfo withBackupHostIdList(List<String> backupHostIdList) {
        this.backupHostIdList = backupHostIdList;
        return this;
    }

    public DeleteBackupHostRequestInfo addBackupHostIdListItem(String backupHostIdListItem) {
        if (this.backupHostIdList == null) {
            this.backupHostIdList = new ArrayList<>();
        }
        this.backupHostIdList.add(backupHostIdListItem);
        return this;
    }

    public DeleteBackupHostRequestInfo withBackupHostIdList(Consumer<List<String>> backupHostIdListSetter) {
        if (this.backupHostIdList == null) {
            this.backupHostIdList = new ArrayList<>();
        }
        backupHostIdListSetter.accept(this.backupHostIdList);
        return this;
    }

    /**
     * **参数解释**: 需要删除的备份服务器ID列表，填写的备份服务器ID必须是已运行中的备份服务器ID **约束限制**: 需要使用 ListBackupHostsInfo 接口查询已运行中的远端备份服务器，在 ListBackupHostsInfo 接口的响应体中，backup_host_status 等于 1 的 backup_host_id 是已运行的远端备份服务器ID **取值范围**: 不超过100条 **默认取值**: 不涉及 
     * @return backupHostIdList
     */
    public List<String> getBackupHostIdList() {
        return backupHostIdList;
    }

    public void setBackupHostIdList(List<String> backupHostIdList) {
        this.backupHostIdList = backupHostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBackupHostRequestInfo that = (DeleteBackupHostRequestInfo) obj;
        return Objects.equals(this.backupHostIdList, that.backupHostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupHostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBackupHostRequestInfo {\n");
        sb.append("    backupHostIdList: ").append(toIndentedString(backupHostIdList)).append("\n");
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
