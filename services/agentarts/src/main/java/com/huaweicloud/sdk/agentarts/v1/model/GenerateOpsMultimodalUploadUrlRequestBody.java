package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 获取多模态文件上传地址的请求体
 */
public class GenerateOpsMultimodalUploadUrlRequestBody {

    /**
     * **参数解释：** 文件后缀名，用于生成OBS对象名。 **约束限制：** 必须为枚举值之一。 **取值范围：** 由英文字母及点(.)组成的字符串，长度为0~20个字符。 **默认取值：** 不涉及。
     */
    public static final class FileSuffixEnum {

        /**
         * Enum PPT for value: "ppt"
         */
        public static final FileSuffixEnum PPT = new FileSuffixEnum("ppt");

        /**
         * Enum PPTX for value: "pptx"
         */
        public static final FileSuffixEnum PPTX = new FileSuffixEnum("pptx");

        private static final Map<String, FileSuffixEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileSuffixEnum> createStaticFields() {
            Map<String, FileSuffixEnum> map = new HashMap<>();
            map.put("ppt", PPT);
            map.put("pptx", PPTX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileSuffixEnum(String value) {
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
        public static FileSuffixEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileSuffixEnum(value));
        }

        public static FileSuffixEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileSuffixEnum) {
                return this.value.equals(((FileSuffixEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_suffix")

    private FileSuffixEnum fileSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    public GenerateOpsMultimodalUploadUrlRequestBody withFileSuffix(FileSuffixEnum fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }

    /**
     * **参数解释：** 文件后缀名，用于生成OBS对象名。 **约束限制：** 必须为枚举值之一。 **取值范围：** 由英文字母及点(.)组成的字符串，长度为0~20个字符。 **默认取值：** 不涉及。
     * @return fileSuffix
     */
    public FileSuffixEnum getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(FileSuffixEnum fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public GenerateOpsMultimodalUploadUrlRequestBody withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * **参数解释：** 文件的SHA256哈希值，用于OBS上传校验。 **约束限制：** 必须为有效的SHA256哈希值。 **取值范围：** 64位十六进制字符串。 **默认取值：** 不涉及。
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateOpsMultimodalUploadUrlRequestBody that = (GenerateOpsMultimodalUploadUrlRequestBody) obj;
        return Objects.equals(this.fileSuffix, that.fileSuffix) && Objects.equals(this.fileHash, that.fileHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSuffix, fileHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateOpsMultimodalUploadUrlRequestBody {\n");
        sb.append("    fileSuffix: ").append(toIndentedString(fileSuffix)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
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
