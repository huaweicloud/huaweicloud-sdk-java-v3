package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建大文件请求。
 */
public class LargeFilesCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_file_category")

    private String assetFileCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_multipart_count")

    private Integer fileMultipartCount;

    public LargeFilesCreateReq withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名，不区分大小写，最大长度256，最小长度1。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LargeFilesCreateReq withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件总的大小，最小1，最大536870912000。
     * minimum: 1
     * maximum: 536870912000
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public LargeFilesCreateReq withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型（默认提取文件后缀）。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public LargeFilesCreateReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public LargeFilesCreateReq withAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
        return this;
    }

    /**
     * 文件在资产中的分类。每种资产类型包含的文件分类不同。 * MAIN：主文件 * OTHER：其他文件 * PACKAGE：打包后的资产文件
     * @return assetFileCategory
     */
    public String getAssetFileCategory() {
        return assetFileCategory;
    }

    public void setAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
    }

    public LargeFilesCreateReq withFileMultipartCount(Integer fileMultipartCount) {
        this.fileMultipartCount = fileMultipartCount;
        return this;
    }

    /**
     * ORI4K文件分段上传数量，默认值为1
     * minimum: 1
     * maximum: 100
     * @return fileMultipartCount
     */
    public Integer getFileMultipartCount() {
        return fileMultipartCount;
    }

    public void setFileMultipartCount(Integer fileMultipartCount) {
        this.fileMultipartCount = fileMultipartCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LargeFilesCreateReq that = (LargeFilesCreateReq) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.assetFileCategory, that.assetFileCategory)
            && Objects.equals(this.fileMultipartCount, that.fileMultipartCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, fileType, assetId, assetFileCategory, fileMultipartCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LargeFilesCreateReq {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetFileCategory: ").append(toIndentedString(assetFileCategory)).append("\n");
        sb.append("    fileMultipartCount: ").append(toIndentedString(fileMultipartCount)).append("\n");
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
