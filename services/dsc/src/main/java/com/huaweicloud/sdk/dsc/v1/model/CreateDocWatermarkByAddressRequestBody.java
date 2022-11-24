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
 * OBS文档嵌入水印请求体
 */
public class CreateDocWatermarkByAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_file")

    private String srcFile;

    /**
     * 待嵌入水印的文档类型。
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
    @JsonProperty(value = "dst_file")

    private String dstFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blind_watermark")

    private String blindWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_watermark")

    private String visibleWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_mark")

    private String imageMark;

    /**
     * 该字段控制明水印嵌入文字还是图片。默认为**TEXT**类型，需填写visible_watermark字段设置明文字水印； 当该字段为**IMAGE**时，需填写image_watermark字段设置水印图片地址此时 ，“visible_watermark”，“font_size”，“rotation”和“opacity”字段无效。
     */
    public static final class VisibleTypeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final VisibleTypeEnum TEXT = new VisibleTypeEnum("TEXT");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final VisibleTypeEnum IMAGE = new VisibleTypeEnum("IMAGE");

        private static final Map<String, VisibleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibleTypeEnum> createStaticFields() {
            Map<String, VisibleTypeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("IMAGE", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibleTypeEnum(String value) {
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
        public static VisibleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VisibleTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VisibleTypeEnum(value);
            }
            return result;
        }

        public static VisibleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VisibleTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibleTypeEnum) {
                return this.value.equals(((VisibleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_type")

    private VisibleTypeEnum visibleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_password")

    private String filePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marked_file_password")

    private String markedFilePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_password")

    private String readonlyPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front")

    private Integer front;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation")

    private Integer rotation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opacity")

    private Float opacity;

    public CreateDocWatermarkByAddressRequestBody withRegionId(String regionId) {
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

    public CreateDocWatermarkByAddressRequestBody withSrcFile(String srcFile) {
        this.srcFile = srcFile;
        return this;
    }

    /**
     * 待添加水印的文档地址，当前只支持华为云OBS对象，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.png**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.png为对象全路径名。
     * @return srcFile
     */
    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }

    public CreateDocWatermarkByAddressRequestBody withDocType(DocTypeEnum docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 待嵌入水印的文档类型。
     * @return docType
     */
    public DocTypeEnum getDocType() {
        return docType;
    }

    public void setDocType(DocTypeEnum docType) {
        this.docType = docType;
    }

    public CreateDocWatermarkByAddressRequestBody withDstFile(String dstFile) {
        this.dstFile = dstFile;
        return this;
    }

    /**
     * 添加水印后的文档存放地址，格式和要求同src_file字段，不设置时，默认取src_file的值，即添加水印后覆盖原文件。
     * @return dstFile
     */
    public String getDstFile() {
        return dstFile;
    }

    public void setDstFile(String dstFile) {
        this.dstFile = dstFile;
    }

    public CreateDocWatermarkByAddressRequestBody withBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
        return this;
    }

    /**
     * 暗文字水印内容，与“visible_watermark”字段至少有一个不为空
     * @return blindWatermark
     */
    public String getBlindWatermark() {
        return blindWatermark;
    }

    public void setBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
    }

    public CreateDocWatermarkByAddressRequestBody withVisibleWatermark(String visibleWatermark) {
        this.visibleWatermark = visibleWatermark;
        return this;
    }

    /**
     * 明文字水印内容，与暗水印“blind_watermark”字段至少有一个不为空。
     * @return visibleWatermark
     */
    public String getVisibleWatermark() {
        return visibleWatermark;
    }

    public void setVisibleWatermark(String visibleWatermark) {
        this.visibleWatermark = visibleWatermark;
    }

    public CreateDocWatermarkByAddressRequestBody withImageMark(String imageMark) {
        this.imageMark = imageMark;
        return this;
    }

    /**
     * 待嵌入的图形明水印文件的地址,  字段格式要求同src_file字段，图形文件的格式必须为“png”或“jpg”，否则返回参数错误；图像文件大小不超过1MB
     * @return imageMark
     */
    public String getImageMark() {
        return imageMark;
    }

    public void setImageMark(String imageMark) {
        this.imageMark = imageMark;
    }

    public CreateDocWatermarkByAddressRequestBody withVisibleType(VisibleTypeEnum visibleType) {
        this.visibleType = visibleType;
        return this;
    }

    /**
     * 该字段控制明水印嵌入文字还是图片。默认为**TEXT**类型，需填写visible_watermark字段设置明文字水印； 当该字段为**IMAGE**时，需填写image_watermark字段设置水印图片地址此时 ，“visible_watermark”，“font_size”，“rotation”和“opacity”字段无效。
     * @return visibleType
     */
    public VisibleTypeEnum getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(VisibleTypeEnum visibleType) {
        this.visibleType = visibleType;
    }

    public CreateDocWatermarkByAddressRequestBody withFilePassword(String filePassword) {
        this.filePassword = filePassword;
        return this;
    }

    /**
     * 待加水印文件有密码时，读取文件的密码， 最大支持长度256。如果Office文档有读密码或域控的权限密码，请输入读密码，或者有读权限的域控密码。
     * @return filePassword
     */
    public String getFilePassword() {
        return filePassword;
    }

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    public CreateDocWatermarkByAddressRequestBody withMarkedFilePassword(String markedFilePassword) {
        this.markedFilePassword = markedFilePassword;
        return this;
    }

    /**
     * 添加水印后给文件设置密码， 最大支持长度256。默认不加文档密码。
     * @return markedFilePassword
     */
    public String getMarkedFilePassword() {
        return markedFilePassword;
    }

    public void setMarkedFilePassword(String markedFilePassword) {
        this.markedFilePassword = markedFilePassword;
    }

    public CreateDocWatermarkByAddressRequestBody withReadonlyPassword(String readonlyPassword) {
        this.readonlyPassword = readonlyPassword;
        return this;
    }

    /**
     * 添加水印后给文件设置只读密码， 最大支持长度256。默认不加只读密码。
     * @return readonlyPassword
     */
    public String getReadonlyPassword() {
        return readonlyPassword;
    }

    public void setReadonlyPassword(String readonlyPassword) {
        this.readonlyPassword = readonlyPassword;
    }

    public CreateDocWatermarkByAddressRequestBody withFront(Integer front) {
        this.front = front;
        return this;
    }

    /**
     * 明水印字体大小，取值为[1,100]，默认值50
     * minimum: 1
     * maximum: 100
     * @return front
     */
    public Integer getFront() {
        return front;
    }

    public void setFront(Integer front) {
        this.front = front;
    }

    public CreateDocWatermarkByAddressRequestBody withRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * 明水印旋转角度，逆时针方向，取值为[0,90]，默认值45。
     * minimum: 0
     * maximum: 90
     * @return rotation
     */
    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public CreateDocWatermarkByAddressRequestBody withOpacity(Float opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 明水印的透明度，取值[0,1]，默认值为0.3；
     * minimum: 0
     * maximum: 1
     * @return opacity
     */
    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDocWatermarkByAddressRequestBody createDocWatermarkByAddressRequestBody =
            (CreateDocWatermarkByAddressRequestBody) o;
        return Objects.equals(this.regionId, createDocWatermarkByAddressRequestBody.regionId)
            && Objects.equals(this.srcFile, createDocWatermarkByAddressRequestBody.srcFile)
            && Objects.equals(this.docType, createDocWatermarkByAddressRequestBody.docType)
            && Objects.equals(this.dstFile, createDocWatermarkByAddressRequestBody.dstFile)
            && Objects.equals(this.blindWatermark, createDocWatermarkByAddressRequestBody.blindWatermark)
            && Objects.equals(this.visibleWatermark, createDocWatermarkByAddressRequestBody.visibleWatermark)
            && Objects.equals(this.imageMark, createDocWatermarkByAddressRequestBody.imageMark)
            && Objects.equals(this.visibleType, createDocWatermarkByAddressRequestBody.visibleType)
            && Objects.equals(this.filePassword, createDocWatermarkByAddressRequestBody.filePassword)
            && Objects.equals(this.markedFilePassword, createDocWatermarkByAddressRequestBody.markedFilePassword)
            && Objects.equals(this.readonlyPassword, createDocWatermarkByAddressRequestBody.readonlyPassword)
            && Objects.equals(this.front, createDocWatermarkByAddressRequestBody.front)
            && Objects.equals(this.rotation, createDocWatermarkByAddressRequestBody.rotation)
            && Objects.equals(this.opacity, createDocWatermarkByAddressRequestBody.opacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId,
            srcFile,
            docType,
            dstFile,
            blindWatermark,
            visibleWatermark,
            imageMark,
            visibleType,
            filePassword,
            markedFilePassword,
            readonlyPassword,
            front,
            rotation,
            opacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocWatermarkByAddressRequestBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    srcFile: ").append(toIndentedString(srcFile)).append("\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    dstFile: ").append(toIndentedString(dstFile)).append("\n");
        sb.append("    blindWatermark: ").append(toIndentedString(blindWatermark)).append("\n");
        sb.append("    visibleWatermark: ").append(toIndentedString(visibleWatermark)).append("\n");
        sb.append("    imageMark: ").append(toIndentedString(imageMark)).append("\n");
        sb.append("    visibleType: ").append(toIndentedString(visibleType)).append("\n");
        sb.append("    filePassword: ").append(toIndentedString(filePassword)).append("\n");
        sb.append("    markedFilePassword: ").append(toIndentedString(markedFilePassword)).append("\n");
        sb.append("    readonlyPassword: ").append(toIndentedString(readonlyPassword)).append("\n");
        sb.append("    front: ").append(toIndentedString(front)).append("\n");
        sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
        sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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
