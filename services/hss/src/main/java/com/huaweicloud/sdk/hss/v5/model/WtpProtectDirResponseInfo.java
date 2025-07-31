package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WtpProtectDirResponseInfo
 */
public class WtpProtectDirResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_list")

    private List<WtpProtectHostDirResponseInfo> protectDirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclue_file_type")

    private String exclueFileType;

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
     * protect dir list
     * @return protectDirList
     */
    public List<WtpProtectHostDirResponseInfo> getProtectDirList() {
        return protectDirList;
    }

    public void setProtectDirList(List<WtpProtectHostDirResponseInfo> protectDirList) {
        this.protectDirList = protectDirList;
    }

    public WtpProtectDirResponseInfo withExclueFileType(String exclueFileType) {
        this.exclueFileType = exclueFileType;
        return this;
    }

    /**
     * 排除文件类型
     * @return exclueFileType
     */
    public String getExclueFileType() {
        return exclueFileType;
    }

    public void setExclueFileType(String exclueFileType) {
        this.exclueFileType = exclueFileType;
    }

    public WtpProtectDirResponseInfo withExcludeFileType(String excludeFileType) {
        this.excludeFileType = excludeFileType;
        return this;
    }

    /**
     * 排除文件类型
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
     * 防护模式，包含如下4种   - recovery ：恢复模式   - alarm ：告警模式
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
            && Objects.equals(this.exclueFileType, that.exclueFileType)
            && Objects.equals(this.excludeFileType, that.excludeFileType)
            && Objects.equals(this.protectMode, that.protectMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirList, exclueFileType, excludeFileType, protectMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpProtectDirResponseInfo {\n");
        sb.append("    protectDirList: ").append(toIndentedString(protectDirList)).append("\n");
        sb.append("    exclueFileType: ").append(toIndentedString(exclueFileType)).append("\n");
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
