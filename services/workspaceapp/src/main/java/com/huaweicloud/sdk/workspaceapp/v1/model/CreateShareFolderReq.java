package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建共享存储声明
 */
public class CreateShareFolderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    public CreateShareFolderReq withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * - 仅支持创建单层级的文件夹 - 单个文件夹名称仅支持以下字符: 英文字母、数字、空格、下划线、中划线 - 名称不能超过32字符 - 不能为全空格或者以空格开头
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateShareFolderReq that = (CreateShareFolderReq) obj;
        return Objects.equals(this.folderName, that.folderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShareFolderReq {\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
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
