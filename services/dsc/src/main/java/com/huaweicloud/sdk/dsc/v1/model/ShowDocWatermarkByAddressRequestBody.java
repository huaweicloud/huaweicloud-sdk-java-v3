package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShowDocWatermarkByAddressRequestBody
 */
public class ShowDocWatermarkByAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 待提取水印的文档类型
     */
    public static final class DocTypeEnum {

        /**
         * Enum WORD for value: "WORD"
         */
        public static final DocTypeEnum WORD = new DocTypeEnum("WORD");

        /**
         * Enum EXCEL for value: "EXCEL"
         */
        public static final DocTypeEnum EXCEL = new DocTypeEnum("EXCEL");

        /**
         * Enum PDF for value: "PDF"
         */
        public static final DocTypeEnum PDF = new DocTypeEnum("PDF");

        /**
         * Enum PPT for value: "PPT"
         */
        public static final DocTypeEnum PPT = new DocTypeEnum("PPT");

        private static final Map<String, DocTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DocTypeEnum> createStaticFields() {
            Map<String, DocTypeEnum> map = new HashMap<>();
            map.put("WORD", WORD);
            map.put("EXCEL", EXCEL);
            map.put("PDF", PDF);
            map.put("PPT", PPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DocTypeEnum(String value) {
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
        public static DocTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DocTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DocTypeEnum(value);
            }
            return result;
        }

        public static DocTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DocTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DocTypeEnum) {
                return this.value.equals(((DocTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_type")

    private DocTypeEnum docType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_file")

    private String srcFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_password")

    private String filePassword;

    public ShowDocWatermarkByAddressRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 项目所在region的id，如：xx-xx-1。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowDocWatermarkByAddressRequestBody withDocType(DocTypeEnum docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 待提取水印的文档类型
     * @return docType
     */
    public DocTypeEnum getDocType() {
        return docType;
    }

    public void setDocType(DocTypeEnum docType) {
        this.docType = docType;
    }

    public ShowDocWatermarkByAddressRequestBody withSrcFile(String srcFile) {
        this.srcFile = srcFile;
        return this;
    }

    /**
     * 待提取文字暗水印的文档的地址，当前只支持华为云OBS对象，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.doc**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.doc为对象全路径名。
     * @return srcFile
     */
    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }

    public ShowDocWatermarkByAddressRequestBody withFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }

    /**
     * 解密文件的密码， 最大支持长度256。如果Office文档有读密码或域控的权限密码，请输入读密码，或者有读权限的域控密码。
     * @return filePassword
     */
    public String getFilePassword() {
        return filePassword;
    }

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDocWatermarkByAddressRequestBody showDocWatermarkByAddressRequestBody =
            (ShowDocWatermarkByAddressRequestBody) o;
        return Objects.equals(this.regionId, showDocWatermarkByAddressRequestBody.regionId)
            && Objects.equals(this.docType, showDocWatermarkByAddressRequestBody.docType)
            && Objects.equals(this.srcFile, showDocWatermarkByAddressRequestBody.srcFile)
            && Objects.equals(this.filePassword, showDocWatermarkByAddressRequestBody.filePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, docType, srcFile, filePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDocWatermarkByAddressRequestBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    srcFile: ").append(toIndentedString(srcFile)).append("\n");
        sb.append("    filePassword: ").append(toIndentedString(filePassword)).append("\n");
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
