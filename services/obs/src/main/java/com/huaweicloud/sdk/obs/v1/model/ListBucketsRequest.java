package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ListBucketsRequest")
public class ListBucketsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    /**
     * 通过此消息头明确获取的列表内容。 取值： OBJECT：获取所有桶列表。 POSIX：获取所有并行文件系统列表。 不带此消息头则获取所有桶和并行文件系统列表。 
     */
    public static final class XObsBucketTypeEnum {

        /**
         * Enum OBJECT for value: "OBJECT"
         */
        public static final XObsBucketTypeEnum OBJECT = new XObsBucketTypeEnum("OBJECT");

        /**
         * Enum POSIX for value: "POSIX"
         */
        public static final XObsBucketTypeEnum POSIX = new XObsBucketTypeEnum("POSIX");

        private static final Map<String, XObsBucketTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsBucketTypeEnum> createStaticFields() {
            Map<String, XObsBucketTypeEnum> map = new HashMap<>();
            map.put("OBJECT", OBJECT);
            map.put("POSIX", POSIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsBucketTypeEnum(String value) {
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
        public static XObsBucketTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsBucketTypeEnum(value));
        }

        public static XObsBucketTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsBucketTypeEnum) {
                return this.value.equals(((XObsBucketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-type")

    @JacksonXmlProperty(localName = "x-obs-bucket-type")

    private XObsBucketTypeEnum xObsBucketType;

    public ListBucketsRequest withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 请求发起端的日期和时间，例如：Wed, 27 Jun 2018 13:39:15 +0000。 默认值：无。 条件：如果消息头中带了x-obs-date字段，则可以不带该字段，其他情况下必选。 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ListBucketsRequest withXObsBucketType(XObsBucketTypeEnum xObsBucketType) {
        this.xObsBucketType = xObsBucketType;
        return this;
    }

    /**
     * 通过此消息头明确获取的列表内容。 取值： OBJECT：获取所有桶列表。 POSIX：获取所有并行文件系统列表。 不带此消息头则获取所有桶和并行文件系统列表。 
     * @return xObsBucketType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-type")
    public XObsBucketTypeEnum getXObsBucketType() {
        return xObsBucketType;
    }

    public void setXObsBucketType(XObsBucketTypeEnum xObsBucketType) {
        this.xObsBucketType = xObsBucketType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBucketsRequest that = (ListBucketsRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.xObsBucketType, that.xObsBucketType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, xObsBucketType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBucketsRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    xObsBucketType: ").append(toIndentedString(xObsBucketType)).append("\n");
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
