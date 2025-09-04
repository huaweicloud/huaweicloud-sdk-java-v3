package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件夹信息。
 */
public class FolderInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode_no")

    private Long inodeNo;

    public FolderInfo withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 文件夹名称。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public FolderInfo withInodeNo(Long inodeNo) {
        this.inodeNo = inodeNo;
        return this;
    }

    /**
     * 文件inode。
     * @return inodeNo
     */
    public Long getInodeNo() {
        return inodeNo;
    }

    public void setInodeNo(Long inodeNo) {
        this.inodeNo = inodeNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderInfo that = (FolderInfo) obj;
        return Objects.equals(this.prefix, that.prefix) && Objects.equals(this.inodeNo, that.inodeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, inodeNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderInfo {\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    inodeNo: ").append(toIndentedString(inodeNo)).append("\n");
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
