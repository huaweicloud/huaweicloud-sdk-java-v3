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
import java.util.function.Consumer;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "SetBucketAclRequest")
public class SetBucketAclRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl")

    @JacksonXmlProperty(localName = "acl")

    private String acl;

    /**
     * 通过cannedACL的方式来设置桶的ACL。 取值范围：private | public-read | public-read-write | public-read-delivered | public-read-write-delivered 
     */
    public static final class XObsAclEnum {

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final XObsAclEnum PRIVATE = new XObsAclEnum("private");

        /**
         * Enum PUBLIC_READ for value: "public-read"
         */
        public static final XObsAclEnum PUBLIC_READ = new XObsAclEnum("public-read");

        /**
         * Enum PUBLIC_READ_WRITE for value: "public-read-write"
         */
        public static final XObsAclEnum PUBLIC_READ_WRITE = new XObsAclEnum("public-read-write");

        /**
         * Enum PUBLIC_READ_DELIVERED for value: "public-read-delivered"
         */
        public static final XObsAclEnum PUBLIC_READ_DELIVERED = new XObsAclEnum("public-read-delivered");

        /**
         * Enum PUBLIC_READ_WRITE_DELIVERED for value: "public-read-write-delivered"
         */
        public static final XObsAclEnum PUBLIC_READ_WRITE_DELIVERED = new XObsAclEnum("public-read-write-delivered");

        private static final Map<String, XObsAclEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsAclEnum> createStaticFields() {
            Map<String, XObsAclEnum> map = new HashMap<>();
            map.put("private", PRIVATE);
            map.put("public-read", PUBLIC_READ);
            map.put("public-read-write", PUBLIC_READ_WRITE);
            map.put("public-read-delivered", PUBLIC_READ_DELIVERED);
            map.put("public-read-write-delivered", PUBLIC_READ_WRITE_DELIVERED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsAclEnum(String value) {
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
        public static XObsAclEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsAclEnum(value));
        }

        public static XObsAclEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsAclEnum) {
                return this.value.equals(((XObsAclEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-acl")

    @JacksonXmlProperty(localName = "x-obs-acl")

    private XObsAclEnum xObsAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private SetBucketAclRequestBody body;

    public SetBucketAclRequest withDate(String date) {
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

    public SetBucketAclRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 请求的桶名称。 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SetBucketAclRequest withAcl(String acl) {
        this.acl = acl;
        return this;
    }

    /**
     * acl表示请求访问控制列表API。 
     * @return acl
     */
    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl;
    }

    public SetBucketAclRequest withXObsAcl(XObsAclEnum xObsAcl) {
        this.xObsAcl = xObsAcl;
        return this;
    }

    /**
     * 通过cannedACL的方式来设置桶的ACL。 取值范围：private | public-read | public-read-write | public-read-delivered | public-read-write-delivered 
     * @return xObsAcl
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-acl")
    public XObsAclEnum getXObsAcl() {
        return xObsAcl;
    }

    public void setXObsAcl(XObsAclEnum xObsAcl) {
        this.xObsAcl = xObsAcl;
    }

    public SetBucketAclRequest withBody(SetBucketAclRequestBody body) {
        this.body = body;
        return this;
    }

    public SetBucketAclRequest withBody(Consumer<SetBucketAclRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SetBucketAclRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetBucketAclRequestBody getBody() {
        return body;
    }

    public void setBody(SetBucketAclRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketAclRequest that = (SetBucketAclRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.acl, that.acl) && Objects.equals(this.xObsAcl, that.xObsAcl)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, bucketName, acl, xObsAcl, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketAclRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
        sb.append("    xObsAcl: ").append(toIndentedString(xObsAcl)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
