package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件信息。
 */
public class TtscAssetFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

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
    @JsonProperty(value = "asset_file_category")

    private String assetFileCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public TtscAssetFileInfo withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件ID。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public TtscAssetFileInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名创建文件时候不区分大小写，最大长度256，最小长度1。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TtscAssetFileInfo withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * 文件内容MD5值，固定24位。
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public TtscAssetFileInfo withFileSize(Long fileSize) {
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

    public TtscAssetFileInfo withFileType(String fileType) {
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

    public TtscAssetFileInfo withAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
        return this;
    }

    /**
     * 文件在资产中的分类。每种资产类型包含的文件分类不同。 * MAIN：主文件 * COVER：封面文件 * PAGE：内容页图片 * SAMPLE：样例音频 * OTHER：其他文件 * WHOLE_MODEL：全模型 * USER_MODIFIED_MODEL：用户上传模型 > * 资产类型为SCENE、ANIMATION、VIDEO、IMAGE、MATERIAL时，包含MAIN、COVER和OTHER > * 资产类型为PPT时，包含MAIN、COVER、PAGE和OTHER > * 资产类型为HUMAN_MODEL时，包含MAIN、COVER和OTHER > * 资产类型为VOICE_MODEL时，包含MAIN、SAMPLE(样例音频文件)和OTHER > * 资产类型为HUMAN_MODEL_2D时，包含MAIN、COVER、SAMPLE(动作样例)和OTHER(遮罩文件) > * 资产类型为BUSINESS_CARD_TEMPLET时，包含MAIN和COVER(名片效果图)
     * @return assetFileCategory
     */
    public String getAssetFileCategory() {
        return assetFileCategory;
    }

    public void setAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
    }

    public TtscAssetFileInfo withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 文件下载URL，有效期为24小时。
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public TtscAssetFileInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 文件状态枚举: * CREATING：文件上传中 * CREATED：文件已上传（自动审核通过） * FAILED：文件上传失败 * CANCELLED：文件上传已取消 * DELETING：文件删除中 * DELETED：文件已删除 * UPLOADED：文件已上传（尚未审核） * REVIEW：人工审核（文件已上传）
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TtscAssetFileInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 审核失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtscAssetFileInfo that = (TtscAssetFileInfo) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileMd5, that.fileMd5) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.assetFileCategory, that.assetFileCategory)
            && Objects.equals(this.downloadUrl, that.downloadUrl) && Objects.equals(this.state, that.state)
            && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fileId, fileName, fileMd5, fileSize, fileType, assetFileCategory, downloadUrl, state, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtscAssetFileInfo {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    assetFileCategory: ").append(toIndentedString(assetFileCategory)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
