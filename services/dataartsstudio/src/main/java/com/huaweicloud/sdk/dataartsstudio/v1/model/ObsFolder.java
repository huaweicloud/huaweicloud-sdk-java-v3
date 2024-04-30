package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObsFolder
 */
public class ObsFolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_guid")

    private String folderGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_qualified_name")

    private String folderQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_count")

    private Integer objectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Double dataSize;

    public ObsFolder withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 目录名称
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public ObsFolder withFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
        return this;
    }

    /**
     * 目录的guid
     * @return folderGuid
     */
    public String getFolderGuid() {
        return folderGuid;
    }

    public void setFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
    }

    public ObsFolder withFolderQualifiedName(String folderQualifiedName) {
        this.folderQualifiedName = folderQualifiedName;
        return this;
    }

    /**
     * 目录的唯一标识名称
     * @return folderQualifiedName
     */
    public String getFolderQualifiedName() {
        return folderQualifiedName;
    }

    public void setFolderQualifiedName(String folderQualifiedName) {
        this.folderQualifiedName = folderQualifiedName;
    }

    public ObsFolder withObjectCount(Integer objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    /**
     * 对象总数
     * @return objectCount
     */
    public Integer getObjectCount() {
        return objectCount;
    }

    public void setObjectCount(Integer objectCount) {
        this.objectCount = objectCount;
    }

    public ObsFolder withDataSize(Double dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据量
     * @return dataSize
     */
    public Double getDataSize() {
        return dataSize;
    }

    public void setDataSize(Double dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsFolder that = (ObsFolder) obj;
        return Objects.equals(this.folderName, that.folderName) && Objects.equals(this.folderGuid, that.folderGuid)
            && Objects.equals(this.folderQualifiedName, that.folderQualifiedName)
            && Objects.equals(this.objectCount, that.objectCount) && Objects.equals(this.dataSize, that.dataSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderName, folderGuid, folderQualifiedName, objectCount, dataSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsFolder {\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderGuid: ").append(toIndentedString(folderGuid)).append("\n");
        sb.append("    folderQualifiedName: ").append(toIndentedString(folderQualifiedName)).append("\n");
        sb.append("    objectCount: ").append(toIndentedString(objectCount)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
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
