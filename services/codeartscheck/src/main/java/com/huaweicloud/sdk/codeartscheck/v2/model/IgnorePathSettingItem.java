package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IgnorePathSettingItem
 */
public class IgnorePathSettingItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkbox_status")

    private String checkboxStatus;

    public IgnorePathSettingItem withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 目录或文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public IgnorePathSettingItem withCheckboxStatus(String checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
        return this;
    }

    /**
     * 屏蔽状态，包括unchecked(不屏蔽)、all(全屏蔽)、half(半屏蔽)
     * @return checkboxStatus
     */
    public String getCheckboxStatus() {
        return checkboxStatus;
    }

    public void setCheckboxStatus(String checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IgnorePathSettingItem that = (IgnorePathSettingItem) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.checkboxStatus, that.checkboxStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, checkboxStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IgnorePathSettingItem {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    checkboxStatus: ").append(toIndentedString(checkboxStatus)).append("\n");
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
