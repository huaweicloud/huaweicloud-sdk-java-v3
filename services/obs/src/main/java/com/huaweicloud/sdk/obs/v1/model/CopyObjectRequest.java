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
@JacksonXmlRootElement(localName = "CopyObjectRequest")
public class CopyObjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-acl")

    @JacksonXmlProperty(localName = "x-obs-acl")

    private String xObsAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-read")

    @JacksonXmlProperty(localName = "x-obs-grant-read")

    private String xObsGrantRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-read-acp")

    @JacksonXmlProperty(localName = "x-obs-grant-read-acp")

    private String xObsGrantReadAcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-write-acp")

    @JacksonXmlProperty(localName = "x-obs-grant-write-acp")

    private String xObsGrantWriteAcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-full-control")

    @JacksonXmlProperty(localName = "x-obs-grant-full-control")

    private String xObsGrantFullControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source")

    @JacksonXmlProperty(localName = "x-obs-copy-source")

    private String xObsCopySource;

    /**
     * 此参数用来指定新对象的元数据是从源对象中复制，还是用请求中的元数据替换。  有效取值：COPY或REPLACE。  默认值：COPY。  示例：x-obs-metadata-directive: metadata_directive  约束条件：如果此参数的值不是COPY或REPLACE，则OBS立即返回400错误；如果用户进行修改元数据操作（源对象与目标对象相同），则此参数只能为REPLACE，否则此请求作为无效请求，服务端响应400。此参数不支持将加密的对象更改成非加密对象（源对象与目标对象相同）。如果用户使用此参数更改加密的对象，系统将返回400。 
     */
    public static final class XObsMetadataDirectiveEnum {

        /**
         * Enum COPY for value: "COPY"
         */
        public static final XObsMetadataDirectiveEnum COPY = new XObsMetadataDirectiveEnum("COPY");

        /**
         * Enum REPLACE for value: "REPLACE"
         */
        public static final XObsMetadataDirectiveEnum REPLACE = new XObsMetadataDirectiveEnum("REPLACE");

        private static final Map<String, XObsMetadataDirectiveEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsMetadataDirectiveEnum> createStaticFields() {
            Map<String, XObsMetadataDirectiveEnum> map = new HashMap<>();
            map.put("COPY", COPY);
            map.put("REPLACE", REPLACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsMetadataDirectiveEnum(String value) {
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
        public static XObsMetadataDirectiveEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsMetadataDirectiveEnum(value));
        }

        public static XObsMetadataDirectiveEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsMetadataDirectiveEnum) {
                return this.value.equals(((XObsMetadataDirectiveEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-metadata-directive")

    @JacksonXmlProperty(localName = "x-obs-metadata-directive")

    private XObsMetadataDirectiveEnum xObsMetadataDirective;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-match")

    @JacksonXmlProperty(localName = "x-obs-copy-source-if-match")

    private String xObsCopySourceIfMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-none-match")

    @JacksonXmlProperty(localName = "x-obs-copy-source-if-none-match")

    private String xObsCopySourceIfNoneMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-unmodified-since")

    @JacksonXmlProperty(localName = "x-obs-copy-source-if-unmodified-since")

    private String xObsCopySourceIfUnmodifiedSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-modified-since")

    @JacksonXmlProperty(localName = "x-obs-copy-source-if-modified-since")

    private String xObsCopySourceIfModifiedSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")

    @JacksonXmlProperty(localName = "x-obs-storage-class")

    private String xObsStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-persistent-headers")

    @JacksonXmlProperty(localName = "x-obs-persistent-headers")

    private String xObsPersistentHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-website-redirect-location")

    @JacksonXmlProperty(localName = "x-obs-website-redirect-location")

    private String xObsWebsiteRedirectLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption")

    private String xObsServerSideEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-kms-key-id")

    private String xObsServerSideEncryptionKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-algorithm")

    private String xObsServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key")

    private String xObsServerSideEncryptionCustomerKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-customer-key-MD5")

    private String xObsServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-algorithm")

    @JacksonXmlProperty(localName = "x-obs-copy-source-server-side-encryption-customer-algorithm")

    private String xObsCopySourceServerSideEncryptionCustomerAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-key")

    @JacksonXmlProperty(localName = "x-obs-copy-source-server-side-encryption-customer-key")

    private String xObsCopySourceServerSideEncryptionCustomerKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-key-MD5")

    @JacksonXmlProperty(localName = "x-obs-copy-source-server-side-encryption-customer-key-MD5")

    private String xObsCopySourceServerSideEncryptionCustomerKeyMD5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_action_redirect")

    @JacksonXmlProperty(localName = "success_action_redirect")

    private String successActionRedirect;

    public CopyObjectRequest withDate(String date) {
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

    public CopyObjectRequest withBucketName(String bucketName) {
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

    public CopyObjectRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 目标对象名称。 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public CopyObjectRequest withXObsAcl(String xObsAcl) {
        this.xObsAcl = xObsAcl;
        return this;
    }

    /**
     * 复制对象时，可以加上此消息头设置对象的权限控制策略，使用的策略为预定义的常用策略，包括：private；public-read；public-read-write（各策略详细说明见ACL章节的“使用头域设置ACL”）。 示例：x-obs-acl: acl 
     * @return xObsAcl
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-acl")
    public String getXObsAcl() {
        return xObsAcl;
    }

    public void setXObsAcl(String xObsAcl) {
        this.xObsAcl = xObsAcl;
    }

    public CopyObjectRequest withXObsGrantRead(String xObsGrantRead) {
        this.xObsGrantRead = xObsGrantRead;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权domain下所有用户有读对象和获取对象元数据的权限 
     * @return xObsGrantRead
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-read")
    public String getXObsGrantRead() {
        return xObsGrantRead;
    }

    public void setXObsGrantRead(String xObsGrantRead) {
        this.xObsGrantRead = xObsGrantRead;
    }

    public CopyObjectRequest withXObsGrantReadAcp(String xObsGrantReadAcp) {
        this.xObsGrantReadAcp = xObsGrantReadAcp;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权domain下所有用户有获取对象ACL的权限。 
     * @return xObsGrantReadAcp
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-read-acp")
    public String getXObsGrantReadAcp() {
        return xObsGrantReadAcp;
    }

    public void setXObsGrantReadAcp(String xObsGrantReadAcp) {
        this.xObsGrantReadAcp = xObsGrantReadAcp;
    }

    public CopyObjectRequest withXObsGrantWriteAcp(String xObsGrantWriteAcp) {
        this.xObsGrantWriteAcp = xObsGrantWriteAcp;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权domain下所有用户有写对象ACL的权限。 
     * @return xObsGrantWriteAcp
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-write-acp")
    public String getXObsGrantWriteAcp() {
        return xObsGrantWriteAcp;
    }

    public void setXObsGrantWriteAcp(String xObsGrantWriteAcp) {
        this.xObsGrantWriteAcp = xObsGrantWriteAcp;
    }

    public CopyObjectRequest withXObsGrantFullControl(String xObsGrantFullControl) {
        this.xObsGrantFullControl = xObsGrantFullControl;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权domain下所有用户有读对象、获取对象元数据、获取对象ACL、写对象ACL的权限。 
     * @return xObsGrantFullControl
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-full-control")
    public String getXObsGrantFullControl() {
        return xObsGrantFullControl;
    }

    public void setXObsGrantFullControl(String xObsGrantFullControl) {
        this.xObsGrantFullControl = xObsGrantFullControl;
    }

    public CopyObjectRequest withXObsCopySource(String xObsCopySource) {
        this.xObsCopySource = xObsCopySource;
        return this;
    }

    /**
     * 用来指定复制对象操作的源桶名以及源对象名。当源对象存在多个版本时，通过versionId参数指定版本源对象。 约束：中文字符，需要进行URLEncode 示例：x-obs-copy-source: /source_bucket/sourceObject 
     * @return xObsCopySource
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source")
    public String getXObsCopySource() {
        return xObsCopySource;
    }

    public void setXObsCopySource(String xObsCopySource) {
        this.xObsCopySource = xObsCopySource;
    }

    public CopyObjectRequest withXObsMetadataDirective(XObsMetadataDirectiveEnum xObsMetadataDirective) {
        this.xObsMetadataDirective = xObsMetadataDirective;
        return this;
    }

    /**
     * 此参数用来指定新对象的元数据是从源对象中复制，还是用请求中的元数据替换。  有效取值：COPY或REPLACE。  默认值：COPY。  示例：x-obs-metadata-directive: metadata_directive  约束条件：如果此参数的值不是COPY或REPLACE，则OBS立即返回400错误；如果用户进行修改元数据操作（源对象与目标对象相同），则此参数只能为REPLACE，否则此请求作为无效请求，服务端响应400。此参数不支持将加密的对象更改成非加密对象（源对象与目标对象相同）。如果用户使用此参数更改加密的对象，系统将返回400。 
     * @return xObsMetadataDirective
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-metadata-directive")
    public XObsMetadataDirectiveEnum getXObsMetadataDirective() {
        return xObsMetadataDirective;
    }

    public void setXObsMetadataDirective(XObsMetadataDirectiveEnum xObsMetadataDirective) {
        this.xObsMetadataDirective = xObsMetadataDirective;
    }

    public CopyObjectRequest withXObsCopySourceIfMatch(String xObsCopySourceIfMatch) {
        this.xObsCopySourceIfMatch = xObsCopySourceIfMatch;
        return this;
    }

    /**
     * 只有当源对象的Etag与此参数指定的值相等时才进行复制对象操作，否则返回412（前置条件不满足）。  示例：x-obs-copy-source-if-match: etag  约束条件：此参数可与x-obs-copy-source-if-unmodified-since一起使用，但不能与其它条件复制参数一起使用。 
     * @return xObsCopySourceIfMatch
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-match")
    public String getXObsCopySourceIfMatch() {
        return xObsCopySourceIfMatch;
    }

    public void setXObsCopySourceIfMatch(String xObsCopySourceIfMatch) {
        this.xObsCopySourceIfMatch = xObsCopySourceIfMatch;
    }

    public CopyObjectRequest withXObsCopySourceIfNoneMatch(String xObsCopySourceIfNoneMatch) {
        this.xObsCopySourceIfNoneMatch = xObsCopySourceIfNoneMatch;
        return this;
    }

    /**
     * 只有当源对象的Etag与此参数指定的值不相等时才进行复制对象操作，否则返回412（前置条件不满足）。  示例：x-obs-copy-source-if-none-match: etag  约束条件：此参数可与x-obs-copy-source-if-modified-since一起使用，但不能与其它条件复制参数一起使用。 
     * @return xObsCopySourceIfNoneMatch
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-none-match")
    public String getXObsCopySourceIfNoneMatch() {
        return xObsCopySourceIfNoneMatch;
    }

    public void setXObsCopySourceIfNoneMatch(String xObsCopySourceIfNoneMatch) {
        this.xObsCopySourceIfNoneMatch = xObsCopySourceIfNoneMatch;
    }

    public CopyObjectRequest withXObsCopySourceIfUnmodifiedSince(String xObsCopySourceIfUnmodifiedSince) {
        this.xObsCopySourceIfUnmodifiedSince = xObsCopySourceIfUnmodifiedSince;
        return this;
    }

    /**
     * 只有当源对象在此参数指定的时间之后没有修改过才进行复制对象操作，否则返回412（前置条件不满足），此参数可与x-obs-copy-source-if-match一起使用，但不能与其它条件复制参数一起使用。  类型：符合http://www.ietf.org/rfc/rfc2616.txt规定格式的HTTP时间字符串。  示例：x-obs-copy-source-if-unmodified -since: time-sta 
     * @return xObsCopySourceIfUnmodifiedSince
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-unmodified-since")
    public String getXObsCopySourceIfUnmodifiedSince() {
        return xObsCopySourceIfUnmodifiedSince;
    }

    public void setXObsCopySourceIfUnmodifiedSince(String xObsCopySourceIfUnmodifiedSince) {
        this.xObsCopySourceIfUnmodifiedSince = xObsCopySourceIfUnmodifiedSince;
    }

    public CopyObjectRequest withXObsCopySourceIfModifiedSince(String xObsCopySourceIfModifiedSince) {
        this.xObsCopySourceIfModifiedSince = xObsCopySourceIfModifiedSince;
        return this;
    }

    /**
     * 只有当源对象在此参数指定的时间之后修改过才进行复制对象操作，否则返回412（前置条件不满足），此参数可与x-obs-copy-source-if-none-match一起使用，但不能与其它条件复制参数一起使用。  类型：符合http://www.ietf.org/rfc/rfc2616.txt规定格式的HTTP时间字符串。  示例：x-obs-copy-source-if-modified-since: time-sta 
     * @return xObsCopySourceIfModifiedSince
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-if-modified-since")
    public String getXObsCopySourceIfModifiedSince() {
        return xObsCopySourceIfModifiedSince;
    }

    public void setXObsCopySourceIfModifiedSince(String xObsCopySourceIfModifiedSince) {
        this.xObsCopySourceIfModifiedSince = xObsCopySourceIfModifiedSince;
    }

    public CopyObjectRequest withXObsStorageClass(String xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
        return this;
    }

    /**
     * 复制对象时，可以加上此头域设置目的对象的存储类型。如果未设置此头域，则以目的对象所在桶的默认存储类型作为对象的存储类型。  类型：字符串  说明：存储类型有3种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）。因此这里可配置的值有：STANDARD、WARM和COLD，注意大小写敏感。  示例：x-obs-storage-class: STANDARD 
     * @return xObsStorageClass
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")
    public String getXObsStorageClass() {
        return xObsStorageClass;
    }

    public void setXObsStorageClass(String xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
    }

    public CopyObjectRequest withXObsPersistentHeaders(String xObsPersistentHeaders) {
        this.xObsPersistentHeaders = xObsPersistentHeaders;
        return this;
    }

    /**
     * 复制对象时，可以在HTTP请求中加入“x-obs-persistent-headers”消息头，用来加入一个或多个自定义的响应头，当用户获取目标对象或查询目标对象元数据时，加入的自定义响应头将会在返回消息的头域中出现。  类型：字符串。  格式：x-obs-persistent-headers: key1:base64_encode(value1),key2:base64_encode(value2)....  说明：其中key1/key2等为自定义header，若含有非ASCII码或不可识别字符，可以采用URL编码或者Base64编码，服务端只会作为字符串处理，不会做解码。value1/value2等为对应自定义header的值，base64_encode指做base64编码，即将自定义header和对应值的base64编码作为一个key-value对用“:”连接，然后用“,”将所有的key-value对连接起来，放在x-obs-persistent-headers这个header中即可，服务端会对上传的value做解码处理。  示例：x-obs-persistent-headers: key1:dmFsdWUx,key2:dmFsdWUy  在下载目标对象或获取目标对象元数据时：返回两个头域为“key1:value1”与“key2:value2”  约束：  1. 通过该方式指定的自定义响应头不能以“x-obs-”为前缀，比如可以指定“key1”，但是不能指定“x-obs-key1”  2. 不能指定http标准头，例如host/content-md5/origin/range/Content-Disposition等  3. 此头域和自定义元数据总长度不能超过8KB  4. 如果传入相同key，将value以“,”拼接后放入同一个key中返回  5. 如果源对象中已经存在自定义响应头，复制的时候不会拷贝到目标对象中 
     * @return xObsPersistentHeaders
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-persistent-headers")
    public String getXObsPersistentHeaders() {
        return xObsPersistentHeaders;
    }

    public void setXObsPersistentHeaders(String xObsPersistentHeaders) {
        this.xObsPersistentHeaders = xObsPersistentHeaders;
    }

    public CopyObjectRequest withXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
        this.xObsWebsiteRedirectLocation = xObsWebsiteRedirectLocation;
        return this;
    }

    /**
     * 当桶设置了Website配置，可以将获取这个对象的请求重定向到桶内另一个对象或一个外部的URL，OBS将这个值从头域中取出，保存在对象的元数据中。  类型：字符串  默认值：无  约束：必须以“/”、“http://”或“https://”开头，长度不超过2K。 
     * @return xObsWebsiteRedirectLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-website-redirect-location")
    public String getXObsWebsiteRedirectLocation() {
        return xObsWebsiteRedirectLocation;
    }

    public void setXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
        this.xObsWebsiteRedirectLocation = xObsWebsiteRedirectLocation;
    }

    public CopyObjectRequest withXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
        return this;
    }

    /**
     * 使用该头域表示服务端加密是SSE-KMS方式。目标对象使用SSE-KMS方式加密。  类型：字符串  示例：x-obs-server-side-encryption: kms  当使用SSE-KMS方式时，必选。 
     * @return xObsServerSideEncryption
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")
    public String getXObsServerSideEncryption() {
        return xObsServerSideEncryption;
    }

    public void setXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
    }

    public CopyObjectRequest withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * SSE-KMS方式下使用该头域，该头域表示加密目标对象使用的主密钥，如果用户没有提供该头域，那么默认的主密钥将会被使用。  类型：字符串  支持两种格式的描述方式：  1. regionID:domainID(租户ID):key/key_id  或者  2.key_id  其中regionID是使用密钥所属region的ID；domainID是使用密钥所属租户的租户ID；key_id是从数据加密服务创建的密钥ID。  示例：  1. x-obs-server-side-encryption-kms-key-id: cn-north-4:domainiddomainiddomainiddoma0001:key/4f1cd4de-ab64-4807-920a-47fc42e7f0d0 或者  2. x-obs-server-side-encryption-kms-key-id: 4f1cd4de-ab64-4807-920a-47fc42e7f0d0 
     * @return xObsServerSideEncryptionKmsKeyId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")
    public String getXObsServerSideEncryptionKmsKeyId() {
        return xObsServerSideEncryptionKmsKeyId;
    }

    public void setXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
    }

    public CopyObjectRequest withXObsServerSideEncryptionCustomerAlgorithm(
        String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密目标对象使用的算法。  类型：字符串  示例：x-obs-server-side-encryption-customer-algorithm: AES256  约束：需要和x-obs-server-side-encryption-customer-key， x-obs-server-side-encryption-customer-key-MD5一起使用。  当使用SSE-C方式时，必选。 
     * @return xObsServerSideEncryptionCustomerAlgorithm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-algorithm")
    public String getXObsServerSideEncryptionCustomerAlgorithm() {
        return xObsServerSideEncryptionCustomerAlgorithm;
    }

    public void setXObsServerSideEncryptionCustomerAlgorithm(String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
    }

    public CopyObjectRequest withXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密目标对象使用的密钥。  类型：字符串  示例：x-obs-server-side-encryption-customer-key:K7QkYpBkM5+hca27fsNkUnNVaobncnLht/rCB2o/9Cw=  约束：该头域由256-bit的密钥经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key-MD5一起使用。  当使用SSE-C方式时，必选。 
     * @return xObsServerSideEncryptionCustomerKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key")
    public String getXObsServerSideEncryptionCustomerKey() {
        return xObsServerSideEncryptionCustomerKey;
    }

    public void setXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
    }

    public CopyObjectRequest withXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密目标对象使用的密钥的MD5值。MD5值用于验证密钥传输过程中没有出错。  类型：字符串  示例：x-obs-server-side-encryption-customer-key-MD5:4XvB3tbNTN+tIEVa0/fGaQ==  约束：该头域由密钥的128-bit MD5值经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key一起使用。  当使用SSE-C方式时，必选。 
     * @return xObsServerSideEncryptionCustomerKeyMD5
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-customer-key-MD5")
    public String getXObsServerSideEncryptionCustomerKeyMD5() {
        return xObsServerSideEncryptionCustomerKeyMD5;
    }

    public void setXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
    }

    public CopyObjectRequest withXObsCopySourceServerSideEncryptionCustomerAlgorithm(
        String xObsCopySourceServerSideEncryptionCustomerAlgorithm) {
        this.xObsCopySourceServerSideEncryptionCustomerAlgorithm = xObsCopySourceServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示解密源对象使用的算法。  类型：字符串  示例：x-obs-copy-source-server-side-encryption-customer-algorithm: AES256  约束：需要和x-obs-copy-source-server-side-encryption-customer-key，x-obs-copy-source-server-side-encryption-customer-key-MD5一起使用。  当拷贝源对象使用SSE-C方式时，必选。 
     * @return xObsCopySourceServerSideEncryptionCustomerAlgorithm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-algorithm")
    public String getXObsCopySourceServerSideEncryptionCustomerAlgorithm() {
        return xObsCopySourceServerSideEncryptionCustomerAlgorithm;
    }

    public void setXObsCopySourceServerSideEncryptionCustomerAlgorithm(
        String xObsCopySourceServerSideEncryptionCustomerAlgorithm) {
        this.xObsCopySourceServerSideEncryptionCustomerAlgorithm = xObsCopySourceServerSideEncryptionCustomerAlgorithm;
    }

    public CopyObjectRequest withXObsCopySourceServerSideEncryptionCustomerKey(
        String xObsCopySourceServerSideEncryptionCustomerKey) {
        this.xObsCopySourceServerSideEncryptionCustomerKey = xObsCopySourceServerSideEncryptionCustomerKey;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示解密源对象使用的密钥。用于解密源对象。  类型：字符串  示例：x-obs-copy-source-server-side-encryption-customer-key: K7QkYpBkM5+hca27fsNkUnNVaobncnLht/rCB2o/9Cw=  约束：该头域由256-bit的密钥经过base64-encoded得到，需要和x-obs-copy-source-server-side-encryption-customer-algorithm，x-obs-copy-source-server-side-encryption-customer-key-MD5一起使用。  当拷贝源对象使用SSE-C方式时，必选。 
     * @return xObsCopySourceServerSideEncryptionCustomerKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-key")
    public String getXObsCopySourceServerSideEncryptionCustomerKey() {
        return xObsCopySourceServerSideEncryptionCustomerKey;
    }

    public void setXObsCopySourceServerSideEncryptionCustomerKey(String xObsCopySourceServerSideEncryptionCustomerKey) {
        this.xObsCopySourceServerSideEncryptionCustomerKey = xObsCopySourceServerSideEncryptionCustomerKey;
    }

    public CopyObjectRequest withXObsCopySourceServerSideEncryptionCustomerKeyMD5(
        String xObsCopySourceServerSideEncryptionCustomerKeyMD5) {
        this.xObsCopySourceServerSideEncryptionCustomerKeyMD5 = xObsCopySourceServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示解密源对象使用的密钥的MD5值。MD5值用于验证密钥传输过程中没有出错。  类型：字符串  示例：x-obs-copy-source-server-side-encryption-customer-key-MD5:4XvB3tbNTN+tIEVa0/fGaQ==  约束：该头域由密钥的128-bit MD5值经过base64-encoded得到，需要和x-obs-copy-source-server-side-encryption-customer-algorithm，x-obs-copy-source-server-side-encryption-customer-key一起使用。  当拷贝源对象使用SSE-C方式时，必选。 
     * @return xObsCopySourceServerSideEncryptionCustomerKeyMD5
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-copy-source-server-side-encryption-customer-key-MD5")
    public String getXObsCopySourceServerSideEncryptionCustomerKeyMD5() {
        return xObsCopySourceServerSideEncryptionCustomerKeyMD5;
    }

    public void setXObsCopySourceServerSideEncryptionCustomerKeyMD5(
        String xObsCopySourceServerSideEncryptionCustomerKeyMD5) {
        this.xObsCopySourceServerSideEncryptionCustomerKeyMD5 = xObsCopySourceServerSideEncryptionCustomerKeyMD5;
    }

    public CopyObjectRequest withSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
        return this;
    }

    /**
     * 此参数的值是一个URL，用于指定当此次请求操作成功响应后的重定向的地址。  如果此参数值有效且操作成功，响应码为303，Location头域由此参数以及桶名、对象名、对象的ETag组成。 如果此参数值无效，则OBS忽略此参数的作用，响应码为204，Location头域为对象地址。 类型：字符串。 
     * @return successActionRedirect
     */
    public String getSuccessActionRedirect() {
        return successActionRedirect;
    }

    public void setSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CopyObjectRequest that = (CopyObjectRequest) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.xObsAcl, that.xObsAcl)
            && Objects.equals(this.xObsGrantRead, that.xObsGrantRead)
            && Objects.equals(this.xObsGrantReadAcp, that.xObsGrantReadAcp)
            && Objects.equals(this.xObsGrantWriteAcp, that.xObsGrantWriteAcp)
            && Objects.equals(this.xObsGrantFullControl, that.xObsGrantFullControl)
            && Objects.equals(this.xObsCopySource, that.xObsCopySource)
            && Objects.equals(this.xObsMetadataDirective, that.xObsMetadataDirective)
            && Objects.equals(this.xObsCopySourceIfMatch, that.xObsCopySourceIfMatch)
            && Objects.equals(this.xObsCopySourceIfNoneMatch, that.xObsCopySourceIfNoneMatch)
            && Objects.equals(this.xObsCopySourceIfUnmodifiedSince, that.xObsCopySourceIfUnmodifiedSince)
            && Objects.equals(this.xObsCopySourceIfModifiedSince, that.xObsCopySourceIfModifiedSince)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsPersistentHeaders, that.xObsPersistentHeaders)
            && Objects.equals(this.xObsWebsiteRedirectLocation, that.xObsWebsiteRedirectLocation)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKey, that.xObsServerSideEncryptionCustomerKey)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.xObsCopySourceServerSideEncryptionCustomerAlgorithm,
                that.xObsCopySourceServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsCopySourceServerSideEncryptionCustomerKey,
                that.xObsCopySourceServerSideEncryptionCustomerKey)
            && Objects.equals(this.xObsCopySourceServerSideEncryptionCustomerKeyMD5,
                that.xObsCopySourceServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.successActionRedirect, that.successActionRedirect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date,
            bucketName,
            objectKey,
            xObsAcl,
            xObsGrantRead,
            xObsGrantReadAcp,
            xObsGrantWriteAcp,
            xObsGrantFullControl,
            xObsCopySource,
            xObsMetadataDirective,
            xObsCopySourceIfMatch,
            xObsCopySourceIfNoneMatch,
            xObsCopySourceIfUnmodifiedSince,
            xObsCopySourceIfModifiedSince,
            xObsStorageClass,
            xObsPersistentHeaders,
            xObsWebsiteRedirectLocation,
            xObsServerSideEncryption,
            xObsServerSideEncryptionKmsKeyId,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsServerSideEncryptionCustomerKey,
            xObsServerSideEncryptionCustomerKeyMD5,
            xObsCopySourceServerSideEncryptionCustomerAlgorithm,
            xObsCopySourceServerSideEncryptionCustomerKey,
            xObsCopySourceServerSideEncryptionCustomerKeyMD5,
            successActionRedirect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyObjectRequest {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    xObsAcl: ").append(toIndentedString(xObsAcl)).append("\n");
        sb.append("    xObsGrantRead: ").append(toIndentedString(xObsGrantRead)).append("\n");
        sb.append("    xObsGrantReadAcp: ").append(toIndentedString(xObsGrantReadAcp)).append("\n");
        sb.append("    xObsGrantWriteAcp: ").append(toIndentedString(xObsGrantWriteAcp)).append("\n");
        sb.append("    xObsGrantFullControl: ").append(toIndentedString(xObsGrantFullControl)).append("\n");
        sb.append("    xObsCopySource: ").append(toIndentedString(xObsCopySource)).append("\n");
        sb.append("    xObsMetadataDirective: ").append(toIndentedString(xObsMetadataDirective)).append("\n");
        sb.append("    xObsCopySourceIfMatch: ").append(toIndentedString(xObsCopySourceIfMatch)).append("\n");
        sb.append("    xObsCopySourceIfNoneMatch: ").append(toIndentedString(xObsCopySourceIfNoneMatch)).append("\n");
        sb.append("    xObsCopySourceIfUnmodifiedSince: ")
            .append(toIndentedString(xObsCopySourceIfUnmodifiedSince))
            .append("\n");
        sb.append("    xObsCopySourceIfModifiedSince: ")
            .append(toIndentedString(xObsCopySourceIfModifiedSince))
            .append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsPersistentHeaders: ").append(toIndentedString(xObsPersistentHeaders)).append("\n");
        sb.append("    xObsWebsiteRedirectLocation: ")
            .append(toIndentedString(xObsWebsiteRedirectLocation))
            .append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKey: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKey))
            .append("\n");
        sb.append("    xObsServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    xObsCopySourceServerSideEncryptionCustomerAlgorithm: ")
            .append(toIndentedString(xObsCopySourceServerSideEncryptionCustomerAlgorithm))
            .append("\n");
        sb.append("    xObsCopySourceServerSideEncryptionCustomerKey: ")
            .append(toIndentedString(xObsCopySourceServerSideEncryptionCustomerKey))
            .append("\n");
        sb.append("    xObsCopySourceServerSideEncryptionCustomerKeyMD5: ")
            .append(toIndentedString(xObsCopySourceServerSideEncryptionCustomerKeyMD5))
            .append("\n");
        sb.append("    successActionRedirect: ").append(toIndentedString(successActionRedirect)).append("\n");
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
