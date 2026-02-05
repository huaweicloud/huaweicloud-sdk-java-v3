package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户漫游profiles配置。
 */
public class UserProfileManagementProfiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhd_write_back")

    private String vhdWriteBack;

    public UserProfileManagementProfiles withVhdWriteBack(String vhdWriteBack) {
        this.vhdWriteBack = vhdWriteBack;
        return this;
    }

    /**
     * 配置VHD会话回写状态： 0: 已禁用 1: 已启用 2: 未配置
     * @return vhdWriteBack
     */
    public String getVhdWriteBack() {
        return vhdWriteBack;
    }

    public void setVhdWriteBack(String vhdWriteBack) {
        this.vhdWriteBack = vhdWriteBack;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserProfileManagementProfiles that = (UserProfileManagementProfiles) obj;
        return Objects.equals(this.vhdWriteBack, that.vhdWriteBack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhdWriteBack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfileManagementProfiles {\n");
        sb.append("    vhdWriteBack: ").append(toIndentedString(vhdWriteBack)).append("\n");
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
