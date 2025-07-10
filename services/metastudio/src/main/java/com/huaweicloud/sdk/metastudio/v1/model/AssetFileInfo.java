package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件信息。
 */
public class AssetFileInfo {

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

    /**
     * 文件状态枚举: * CREATING：文件上传中 * CREATED：文件已上传（自动审核通过） * FAILED：文件上传失败 * CANCELLED：文件上传已取消 * DELETING：文件删除中 * DELETED：文件已删除 * UPLOADED：文件已上传（尚未审核） * REVIEW：人工审核（文件已上传） * BLOCK：冻结
     */
    public static final class StateEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StateEnum CREATING = new StateEnum("CREATING");

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StateEnum CREATED = new StateEnum("CREATED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final StateEnum CANCELLED = new StateEnum("CANCELLED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StateEnum DELETED = new StateEnum("DELETED");

        /**
         * Enum UPLOADED for value: "UPLOADED"
         */
        public static final StateEnum UPLOADED = new StateEnum("UPLOADED");

        /**
         * Enum REVIEW for value: "REVIEW"
         */
        public static final StateEnum REVIEW = new StateEnum("REVIEW");

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final StateEnum BLOCK = new StateEnum("BLOCK");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATED", CREATED);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            map.put("DELETING", DELETING);
            map.put("DELETED", DELETED);
            map.put("UPLOADED", UPLOADED);
            map.put("REVIEW", REVIEW);
            map.put("BLOCK", BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_extra_meta")

    private FileExtraMeta fileExtraMeta;

    public AssetFileInfo withFileId(String fileId) {
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

    public AssetFileInfo withFileName(String fileName) {
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

    public AssetFileInfo withFileMd5(String fileMd5) {
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

    public AssetFileInfo withFileSize(Long fileSize) {
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

    public AssetFileInfo withFileType(String fileType) {
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

    public AssetFileInfo withAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
        return this;
    }

    /**
     * 文件在资产中的分类。每种资产类型包含的文件分类不同。 * MAIN：主文件 * COVER：封面文件 * PAGE：内容页图片 * SAMPLE：样例音频 * OTHER：其他文件 * TEMPORARY：临时文件夹（用于文件替换时上传新文件） * PACKAGE：打包后的资产文件 > * 资产类型为PPT时，包含MAIN、COVER、PAGE和OTHER > * 资产类型为VOICE_MODEL时，包含MAIN、SAMPLE(样例音频文件)和OTHER > * 资产类型为HUMAN_MODEL_2D时，包含MAIN、COVER、SAMPLE(动作样例)和OTHER(遮罩文件) > * 资产类型为BUSINESS_CARD_TEMPLET时，包含MAIN和COVER(名片效果图)
     * @return assetFileCategory
     */
    public String getAssetFileCategory() {
        return assetFileCategory;
    }

    public void setAssetFileCategory(String assetFileCategory) {
        this.assetFileCategory = assetFileCategory;
    }

    public AssetFileInfo withDownloadUrl(String downloadUrl) {
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

    public AssetFileInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 文件状态枚举: * CREATING：文件上传中 * CREATED：文件已上传（自动审核通过） * FAILED：文件上传失败 * CANCELLED：文件上传已取消 * DELETING：文件删除中 * DELETED：文件已删除 * UPLOADED：文件已上传（尚未审核） * REVIEW：人工审核（文件已上传） * BLOCK：冻结
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public AssetFileInfo withReason(String reason) {
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

    public AssetFileInfo withFileExtraMeta(FileExtraMeta fileExtraMeta) {
        this.fileExtraMeta = fileExtraMeta;
        return this;
    }

    public AssetFileInfo withFileExtraMeta(Consumer<FileExtraMeta> fileExtraMetaSetter) {
        if (this.fileExtraMeta == null) {
            this.fileExtraMeta = new FileExtraMeta();
            fileExtraMetaSetter.accept(this.fileExtraMeta);
        }

        return this;
    }

    /**
     * Get fileExtraMeta
     * @return fileExtraMeta
     */
    public FileExtraMeta getFileExtraMeta() {
        return fileExtraMeta;
    }

    public void setFileExtraMeta(FileExtraMeta fileExtraMeta) {
        this.fileExtraMeta = fileExtraMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetFileInfo that = (AssetFileInfo) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileMd5, that.fileMd5) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.assetFileCategory, that.assetFileCategory)
            && Objects.equals(this.downloadUrl, that.downloadUrl) && Objects.equals(this.state, that.state)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.fileExtraMeta, that.fileExtraMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId,
            fileName,
            fileMd5,
            fileSize,
            fileType,
            assetFileCategory,
            downloadUrl,
            state,
            reason,
            fileExtraMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetFileInfo {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    assetFileCategory: ").append(toIndentedString(assetFileCategory)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    fileExtraMeta: ").append(toIndentedString(fileExtraMeta)).append("\n");
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
