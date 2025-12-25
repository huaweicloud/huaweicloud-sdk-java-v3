package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DownloadFolderInfo
 */
public class DownloadFolderInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filesCount")

    private Long filesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedSpace")

    private String usedSpace;

    public DownloadFolderInfo withFilesCount(Long filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
     * **参数解释**： 文件总数。  **取值范围**： 不涉及。
     * @return filesCount
     */
    public Long getFilesCount() {
        return filesCount;
    }

    public void setFilesCount(Long filesCount) {
        this.filesCount = filesCount;
    }

    public DownloadFolderInfo withUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    /**
     * **参数解释**： 占用空间。  **取值范围**： 不涉及。
     * @return usedSpace
     */
    public String getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadFolderInfo that = (DownloadFolderInfo) obj;
        return Objects.equals(this.filesCount, that.filesCount) && Objects.equals(this.usedSpace, that.usedSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filesCount, usedSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadFolderInfo {\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
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
