package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 素材信息。
 */
public class Material {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdatedBy")

    private String lastUpdatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialName")

    private String materialName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialResolution")

    private String materialResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "materialSizeStr")

    private String materialSizeStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filePath")

    private String filePath;

    public Material withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 素材ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Material withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    /**
     * 更新者。
     * @return lastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Material withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Material withMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }

    /**
     * 素材名称。
     * @return materialName
     */
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Material withMaterialResolution(String materialResolution) {
        this.materialResolution = materialResolution;
        return this;
    }

    /**
     * 素材分辨率。
     * @return materialResolution
     */
    public String getMaterialResolution() {
        return materialResolution;
    }

    public void setMaterialResolution(String materialResolution) {
        this.materialResolution = materialResolution;
    }

    public Material withMaterialSizeStr(String materialSizeStr) {
        this.materialSizeStr = materialSizeStr;
        return this;
    }

    /**
     * 素材大小（含单位）。
     * @return materialSizeStr
     */
    public String getMaterialSizeStr() {
        return materialSizeStr;
    }

    public void setMaterialSizeStr(String materialSizeStr) {
        this.materialSizeStr = materialSizeStr;
    }

    public Material withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 素材云盘存储文件下载地址。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Material material = (Material) o;
        return Objects.equals(this.id, material.id) && Objects.equals(this.lastUpdatedBy, material.lastUpdatedBy)
            && Objects.equals(this.updateTime, material.updateTime)
            && Objects.equals(this.materialName, material.materialName)
            && Objects.equals(this.materialResolution, material.materialResolution)
            && Objects.equals(this.materialSizeStr, material.materialSizeStr)
            && Objects.equals(this.filePath, material.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdatedBy, updateTime, materialName, materialResolution, materialSizeStr, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Material {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
        sb.append("    materialResolution: ").append(toIndentedString(materialResolution)).append("\n");
        sb.append("    materialSizeStr: ").append(toIndentedString(materialSizeStr)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
