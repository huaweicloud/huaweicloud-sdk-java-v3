package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建文件夹请求体
 */
public class CreateDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_folder")

    private String parentFolder;

    public CreateDataReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 文件夹名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDataReq withParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
        return this;
    }

    /**
     * 所在文件夹
     * @return parentFolder
     */
    public String getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataReq that = (CreateDataReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.parentFolder, that.parentFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentFolder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentFolder: ").append(toIndentedString(parentFolder)).append("\n");
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
