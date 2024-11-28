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
     * **参数解释**： 文件名。 **约束限制**： 不区分大小写。 **取值范围**： 字符长度1-256位。 **默认取值**： 不涉及
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
     * **参数解释**： 文件内容MD5值。按照RFC 1864标准计算出消息体的MD5摘要字符串，即消息体128-bit MD5值经过base64编码后得到的字符串。 md5值获取详情请参考[使用Java代码生成文件内容的MD5值](metastudio_02_0052.xml)。 **约束限制**： 不涉及 **取值范围**： 字符长度24位。 **默认取值**： 不涉及
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
     * **参数解释**： 文件总的大小。 **约束限制**： 最大支持5GB  **默认取值**： 不涉及
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
     * **参数解释**： 文件类型 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位。 **默认取值**： 默认提取文件后缀。
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
     * **参数解释**： 本平台资产ID。 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位。 **默认取值**： 不涉及
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
     * **参数解释**： 文件在资产中的分类。每种资产类型包含的文件分类不同。 * MAIN：主文件 * COVER：封面文件 * PAGE：PPT内容页图片文件 * SAMPLE：样例音频或样例动作文件 * OTHER：其他文件 * WHOLE_MODEL：全模型文件（3D数字人） * USER_MODIFIED_MODEL：用户上传模型（3D数字人） * TEMPORARY：临时文件夹（用于文件替换时上传新文件） * PACKAGE：打包后的资产文件 > * 资产类型为SCENE、ANIMATION、VIDEO、IMAGE、MATERIAL时，包含MAIN、COVER和OTHER > * 资产类型为PPT时，包含MAIN、COVER、PAGE和OTHER > * 资产类型为HUMAN_MODEL时，包含MAIN、COVER、WHOLE_MODEL、USER_MODIFIED_MODEL和OTHER > * 资产类型为VOICE_MODEL时，包含MAIN、SAMPLE(样例音频文件)和OTHER > * 资产类型为HUMAN_MODEL_2D时，包含MAIN、COVER、SAMPLE(动作样例)和OTHER > * 资产类型为BUSINESS_CARD_TEMPLET时，包含MAIN和COVER(名片效果图) > * 资产类型为IMAGE时，包含MAIN > * 资产类型为VIDEO时，包含MAIN、COVER  **约束限制**： 一个资产中MAIN文件只有一个，且必须有一个 **取值范围**： 字符长度1-128位。 **默认取值**： 不涉及
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
