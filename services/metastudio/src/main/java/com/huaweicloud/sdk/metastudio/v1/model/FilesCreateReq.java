package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建文件请求。
 */
public class FilesCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_md5")

    private String fileMd5;

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

    public FilesCreateReq withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名。创建文件时候不区分大小写，最大长度256，最小长度1。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FilesCreateReq withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * 文件内容MD5值，MD5值需要进行Base64编码。
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public FilesCreateReq withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件总的大小，最小1，最大5368709120。
     * minimum: 1
     * maximum: 5368709120
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public FilesCreateReq withFileType(String fileType) {
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

    public FilesCreateReq withAssetId(String assetId) {
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

    public FilesCreateReq withAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
        return this;
    }

    /**
     * 文件在资产中的分类。每种资产类型包含的文件分类不同。 * MAIN： 主文件 * COVER： 封面文件 * PAGE: 内容页图片 * SAMPLE：样例音频 * OTHER： 其他文件 > * 资产类型为SCENE、ANIMATION、VIDEO、IMAGE、MATERIAL时，包含MAIN、COVER和OTHER > * 资产类型为PPT时，包含MAIN、COVER、PAGE和OTHER > * 资产类型为HUMAN_MODEL时，包含MAIN、COVER和OTHER > * 资产类型为VOICE_MODEL时，包含MAIN、SAMPLE和OTHER
     * @return assetFileCategory
     */
    public String getAssetFileCategory() {
        return assetFileCategory;
    }

    public void setAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilesCreateReq that = (FilesCreateReq) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileMd5, that.fileMd5)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.assetFileCategory, that.assetFileCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileMd5, fileSize, fileType, assetId, assetFileCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilesCreateReq {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetFileCategory: ").append(toIndentedString(assetFileCategory)).append("\n");
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
