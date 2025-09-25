package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护目录信息
 */
public class WtpProtectDirResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_list")

    private List<WtpProtectHostDirResponseInfo> protectDirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_type")

    private String excludeFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_mode")

    private String protectMode;

    public WtpProtectDirResponseInfo withProtectDirList(List<WtpProtectHostDirResponseInfo> protectDirList) {
        this.protectDirList = protectDirList;
        return this;
    }

    public WtpProtectDirResponseInfo addProtectDirListItem(WtpProtectHostDirResponseInfo protectDirListItem) {
        if (this.protectDirList == null) {
            this.protectDirList = new ArrayList<>();
        }
        this.protectDirList.add(protectDirListItem);
        return this;
    }

    public WtpProtectDirResponseInfo withProtectDirList(
        Consumer<List<WtpProtectHostDirResponseInfo>> protectDirListSetter) {
        if (this.protectDirList == null) {
            this.protectDirList = new ArrayList<>();
        }
        protectDirListSetter.accept(this.protectDirList);
        return this;
    }

    /**
     * **参数解释**: 防护目录列表 **取值范围**: 最少0条，最多50条 
     * @return protectDirList
     */
    public List<WtpProtectHostDirResponseInfo> getProtectDirList() {
        return protectDirList;
    }

    public void setProtectDirList(List<WtpProtectHostDirResponseInfo> protectDirList) {
        this.protectDirList = protectDirList;
    }

    public WtpProtectDirResponseInfo withExcludeFileType(String excludeFileType) {
        this.excludeFileType = excludeFileType;
        return this;
    }

    /**
     * **参数解释**: 排除文件类型 **取值范围**: 字符长度0-512位 
     * @return excludeFileType
     */
    public String getExcludeFileType() {
        return excludeFileType;
    }

    public void setExcludeFileType(String excludeFileType) {
        this.excludeFileType = excludeFileType;
    }

    public WtpProtectDirResponseInfo withProtectMode(String protectMode) {
        this.protectMode = protectMode;
        return this;
    }

    /**
     * **参数解释**: 防护模式。 **取值范围**: - recovery ：拦截模式。 - alarm ：告警模式，仅Linux服务器支持告警模式。 
     * @return protectMode
     */
    public String getProtectMode() {
        return protectMode;
    }

    public void setProtectMode(String protectMode) {
        this.protectMode = protectMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WtpProtectDirResponseInfo that = (WtpProtectDirResponseInfo) obj;
        return Objects.equals(this.protectDirList, that.protectDirList)
            && Objects.equals(this.excludeFileType, that.excludeFileType)
            && Objects.equals(this.protectMode, that.protectMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirList, excludeFileType, protectMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpProtectDirResponseInfo {\n");
        sb.append("    protectDirList: ").append(toIndentedString(protectDirList)).append("\n");
        sb.append("    excludeFileType: ").append(toIndentedString(excludeFileType)).append("\n");
        sb.append("    protectMode: ").append(toIndentedString(protectMode)).append("\n");
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
