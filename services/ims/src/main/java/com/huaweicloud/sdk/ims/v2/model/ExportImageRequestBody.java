package com.huaweicloud.sdk.ims.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 镜像导出请求体
 */
public class ExportImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_url")
    
    private String bucketUrl;
    /**
     * 文件格式，支持qcow2、vhd、zvhd和vmdk。
     */
    public static final class FileFormatEnum {

        
        /**
         * Enum QCOW2 for value: "qcow2"
         */
        public static final FileFormatEnum QCOW2 = new FileFormatEnum("qcow2");
        
        /**
         * Enum VHD for value: "vhd"
         */
        public static final FileFormatEnum VHD = new FileFormatEnum("vhd");
        
        /**
         * Enum ZVHD for value: "zvhd"
         */
        public static final FileFormatEnum ZVHD = new FileFormatEnum("zvhd");
        
        /**
         * Enum VMDK for value: "vmdk"
         */
        public static final FileFormatEnum VMDK = new FileFormatEnum("vmdk");
        

        private static final Map<String, FileFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileFormatEnum> createStaticFields() {
            Map<String, FileFormatEnum> map = new HashMap<>();
            map.put("qcow2", QCOW2);
            map.put("vhd", VHD);
            map.put("zvhd", ZVHD);
            map.put("vmdk", VMDK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileFormatEnum(String value) {
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
        public static FileFormatEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FileFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FileFormatEnum(value);
            }
            return result;
        }

        public static FileFormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FileFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileFormatEnum) {
                return this.value.equals(((FileFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_format")
    
    private FileFormatEnum fileFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_quick_export")
    
    private Boolean isQuickExport;

    public ExportImageRequestBody withBucketUrl(String bucketUrl) {
        this.bucketUrl = bucketUrl;
        return this;
    }

    


    /**
     * 目的文件的URL，格式：<bucket>:<file>。 说明：此处的OBS桶和镜像文件的存储类别必须是OBS标准存储。
     * @return bucketUrl
     */
    public String getBucketUrl() {
        return bucketUrl;
    }

    public void setBucketUrl(String bucketUrl) {
        this.bucketUrl = bucketUrl;
    }

    

    public ExportImageRequestBody withFileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    


    /**
     * 文件格式，支持qcow2、vhd、zvhd和vmdk。
     * @return fileFormat
     */
    public FileFormatEnum getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

    

    public ExportImageRequestBody withIsQuickExport(Boolean isQuickExport) {
        this.isQuickExport = isQuickExport;
        return this;
    }

    


    /**
     * 是否使用快速导出，取值为true或者false。 说明：若使用快速导出，则无法指定file_format参数。
     * @return isQuickExport
     */
    public Boolean getIsQuickExport() {
        return isQuickExport;
    }

    public void setIsQuickExport(Boolean isQuickExport) {
        this.isQuickExport = isQuickExport;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportImageRequestBody exportImageRequestBody = (ExportImageRequestBody) o;
        return Objects.equals(this.bucketUrl, exportImageRequestBody.bucketUrl) &&
            Objects.equals(this.fileFormat, exportImageRequestBody.fileFormat) &&
            Objects.equals(this.isQuickExport, exportImageRequestBody.isQuickExport);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucketUrl, fileFormat, isQuickExport);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportImageRequestBody {\n");
        sb.append("    bucketUrl: ").append(toIndentedString(bucketUrl)).append("\n");
        sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
        sb.append("    isQuickExport: ").append(toIndentedString(isQuickExport)).append("\n");
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

