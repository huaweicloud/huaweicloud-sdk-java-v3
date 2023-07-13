package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 复制数据请求体
 */
public class CloneDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_paths")

    private List<String> subPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_folder")

    private String targetFolder;

    public CloneDataReq withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * 执行策略（true：全部覆盖，false：全部跳过，默认为true）
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public CloneDataReq withSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
        return this;
    }

    public CloneDataReq addSubPathsItem(String subPathsItem) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        this.subPaths.add(subPathsItem);
        return this;
    }

    public CloneDataReq withSubPaths(Consumer<List<String>> subPathsSetter) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        subPathsSetter.accept(this.subPaths);
        return this;
    }

    /**
     * 复制的路径集
     * @return subPaths
     */
    public List<String> getSubPaths() {
        return subPaths;
    }

    public void setSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
    }

    public CloneDataReq withTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
        return this;
    }

    /**
     * 目标文件夹
     * @return targetFolder
     */
    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneDataReq that = (CloneDataReq) obj;
        return Objects.equals(this.overwrite, that.overwrite) && Objects.equals(this.subPaths, that.subPaths)
            && Objects.equals(this.targetFolder, that.targetFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overwrite, subPaths, targetFolder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneDataReq {\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    subPaths: ").append(toIndentedString(subPaths)).append("\n");
        sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
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
