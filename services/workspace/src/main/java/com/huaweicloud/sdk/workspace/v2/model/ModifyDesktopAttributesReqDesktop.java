package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面属性。
 */
public class ModifyDesktopAttributesReqDesktop {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_backup_management")

    private String selfBackupManagement;

    public ModifyDesktopAttributesReqDesktop withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ModifyDesktopAttributesReqDesktop withSelfBackupManagement(String selfBackupManagement) {
        this.selfBackupManagement = selfBackupManagement;
        return this;
    }

    /**
     * 是否开启快照的操作类型,\"0\":关闭 \"1\":开启。
     * @return selfBackupManagement
     */
    public String getSelfBackupManagement() {
        return selfBackupManagement;
    }

    public void setSelfBackupManagement(String selfBackupManagement) {
        this.selfBackupManagement = selfBackupManagement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDesktopAttributesReqDesktop that = (ModifyDesktopAttributesReqDesktop) obj;
        return Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.selfBackupManagement, that.selfBackupManagement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName, selfBackupManagement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDesktopAttributesReqDesktop {\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    selfBackupManagement: ").append(toIndentedString(selfBackupManagement)).append("\n");
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
