package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.core.SdkStreamRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "PutObjectRequest")
public class PutObjectRequest extends SdkStreamRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    @JacksonXmlProperty(localName = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-MD5")

    @JacksonXmlProperty(localName = "Content-MD5")

    private String contentMD5;

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

    /**
     * 创建对象时，可以加上此头域设置对象的存储类型。如果未设置此头域，则以桶的默认存储类型作为对象的存储类型  说明：存储类型有3种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）。因此这里可配置的值有：STANDARD、WARM和COLD，注意大小写敏感。  示例：x-obs-storage-class: STANDARD 
     */
    public static final class XObsStorageClassEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final XObsStorageClassEnum STANDARD = new XObsStorageClassEnum("STANDARD");

        /**
         * Enum WARM for value: "WARM"
         */
        public static final XObsStorageClassEnum WARM = new XObsStorageClassEnum("WARM");

        /**
         * Enum COLD for value: "COLD"
         */
        public static final XObsStorageClassEnum COLD = new XObsStorageClassEnum("COLD");

        private static final Map<String, XObsStorageClassEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsStorageClassEnum> createStaticFields() {
            Map<String, XObsStorageClassEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("WARM", WARM);
            map.put("COLD", COLD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsStorageClassEnum(String value) {
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
        public static XObsStorageClassEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsStorageClassEnum(value));
        }

        public static XObsStorageClassEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsStorageClassEnum) {
                return this.value.equals(((XObsStorageClassEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")

    @JacksonXmlProperty(localName = "x-obs-storage-class")

    private XObsStorageClassEnum xObsStorageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-meta-xxx")

    @JacksonXmlProperty(localName = "x-obs-meta-xxx")

    private String xObsMetaXxx;

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
    @JsonProperty(value = "success-action-redirect")

    @JacksonXmlProperty(localName = "success-action-redirect")

    private String successActionRedirect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expires")

    @JacksonXmlProperty(localName = "x-obs-expires")

    private Integer xObsExpires;

    public PutObjectRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public PutObjectRequest withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 通过此请求创建的对象名称。 
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public PutObjectRequest withDate(String date) {
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

    public PutObjectRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * 按照RFC 1864标准计算出消息体的MD5摘要字符串，即消息体128-bit MD5值经过base64编码后得到的字符串  示例：n58IG6hfM7vqI4K0vnWpog==。 
     * @return contentMD5
     */
    public String getContentMD5() {
        return contentMD5;
    }

    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    public PutObjectRequest withXObsAcl(String xObsAcl) {
        this.xObsAcl = xObsAcl;
        return this;
    }

    /**
     * 创建对象时，可以加上此消息头设置对象的权限控制策略，使用的策略为预定义的常用策  示例：x-obs-acl: public-read。 
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

    public PutObjectRequest withXObsGrantRead(String xObsGrantRead) {
        this.xObsGrantRead = xObsGrantRead;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权租户下所有用户有读对象和获取对象元数据的权限  示例：x-obs-grant-read: id=domainID。如果授权给多个租户，需要通过','分割。 
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

    public PutObjectRequest withXObsGrantReadAcp(String xObsGrantReadAcp) {
        this.xObsGrantReadAcp = xObsGrantReadAcp;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权租户下所有用户有获取对象ACL的权限  示例：x-obs-grant-read-acp: id=domainID。如果授权给多个租户，需要通过','分割。 
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

    public PutObjectRequest withXObsGrantWriteAcp(String xObsGrantWriteAcp) {
        this.xObsGrantWriteAcp = xObsGrantWriteAcp;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权租户下所有用户有写对象ACL的权  示例：x-obs-grant-write-acp: id=domainID。如果授权给多个租户，需要通过','分割。 
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

    public PutObjectRequest withXObsGrantFullControl(String xObsGrantFullControl) {
        this.xObsGrantFullControl = xObsGrantFullControl;
        return this;
    }

    /**
     * 创建对象时，使用此头域授权domain下所有用户有读对象、获取对象元数据、获取对象ACL、写对象ACL的权限  示例：x-obs-grant-full-control: id=domainID。如果授权给多个租户，需要通过','分割。 
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

    public PutObjectRequest withXObsStorageClass(XObsStorageClassEnum xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
        return this;
    }

    /**
     * 创建对象时，可以加上此头域设置对象的存储类型。如果未设置此头域，则以桶的默认存储类型作为对象的存储类型  说明：存储类型有3种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）。因此这里可配置的值有：STANDARD、WARM和COLD，注意大小写敏感。  示例：x-obs-storage-class: STANDARD 
     * @return xObsStorageClass
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-storage-class")
    public XObsStorageClassEnum getXObsStorageClass() {
        return xObsStorageClass;
    }

    public void setXObsStorageClass(XObsStorageClassEnum xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
    }

    public PutObjectRequest withXObsMetaXxx(String xObsMetaXxx) {
        this.xObsMetaXxx = xObsMetaXxx;
        return this;
    }

    /**
     * 用户自定义元数据  示例：x-obs-meta-test: test metadata 
     * @return xObsMetaXxx
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-meta-xxx")
    public String getXObsMetaXxx() {
        return xObsMetaXxx;
    }

    public void setXObsMetaXxx(String xObsMetaXxx) {
        this.xObsMetaXxx = xObsMetaXxx;
    }

    public PutObjectRequest withXObsPersistentHeaders(String xObsPersistentHeaders) {
        this.xObsPersistentHeaders = xObsPersistentHeaders;
        return this;
    }

    /**
     * 创建对象时，可以在HTTP请求中加入“x-obs-persistent-headers”消息头，用来加入一个或多个自定义的响应头，当用户获取此对象或查询此对象元数据时，加入的自定义响应头将会在返回消息的头域中出现。 格式：x-obs-persistent-headers: key1:base64_encode(value1),key2:base64_encode(value2)....  说明：其中key1/key2等为自定义header，若含有非ASCII码或不可识别字符，可以采用URL编码或者Base64编码，服务端只会作为字符串处理，不会做解码。value1/value2等为对应自定义header的值，base64_encode指做base64编码，即将自定义header和对应值的base64编码作为一个key-value对用“:”连接，然后用“,”将所有的key-value对连接起来，放在x-obs-persistent-headers这个header中即可，服务端会对上传的value做解码处理。  示例： x-obs-persistent-headers: key1:dmFsdWUx,key2:dmFsdWUy  下载此对象或获取此对象元数据时：返回两个头域分别为“key1:value1”与“key2:value2”  约束：  1. 通过该方式指定的自定义响应头不能以“x-obs-”为前缀，比如可以指定“key1”，但是不能指定“x-obs-key1”  2. 不能指定http标准头，例如host/content-md5/origin/range/Content-Disposition等  3. 此头域和自定义元数据总长度不能超过8KB  4. 如果传入相同key，将value以“,”拼接后放入同一个key中返回 
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

    public PutObjectRequest withXObsWebsiteRedirectLocation(String xObsWebsiteRedirectLocation) {
        this.xObsWebsiteRedirectLocation = xObsWebsiteRedirectLocation;
        return this;
    }

    /**
     * 当桶设置了Website配置，可以将获取这个对象的请求重定向到桶内另一个对象或一个外部的URL，OBS将这个值从头域中取出，保存在对象的元数据中。  例如，重定向请求到桶内另一对象：  x-obs-website-redirect-location:/anotherPage.html  或重定向请求到一个外部URL：  x-obs-website-redirect-location:http://www.example.com/  默认值：无  约束：必须以“/”、“http://”或“https://”开头，长度不超过2KB。 
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

    public PutObjectRequest withXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
        return this;
    }

    /**
     * 使用该头域表示服务端加密是SSE-KMS方式。  示例：x-obs-server-side-encryption: kms 
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

    public PutObjectRequest withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * SSE-KMS方式下使用该头域，该头域表示主密钥，如果用户没有提供该头域，那么默认的主密钥将会被使用。 支持两种格式的描述方式：  1. regionID:domainID(租户ID):key/key_id  或者  2.key_id  其中regionID是使用密钥所属region的ID；domainID是使用密钥所属租户的租户ID；key_id是从数据加密服务创建的密钥ID。  示例：  1. x-obs-server-side-encryption-kms-key-id: cn-north-4:domainiddomainiddomainiddoma0001:key/4f1cd4de-ab64-4807-920a-47fc42e7f0d0 或者  2. x-obs-server-side-encryption-kms-key-id: 4f1cd4de-ab64-4807-920a-47fc42e7f0d0 
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

    public PutObjectRequest withXObsServerSideEncryptionCustomerAlgorithm(
        String xObsServerSideEncryptionCustomerAlgorithm) {
        this.xObsServerSideEncryptionCustomerAlgorithm = xObsServerSideEncryptionCustomerAlgorithm;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的算法。  示例：x-obs-server-side-encryption-customer-algorithm: AES256  约束：需要和x-obs-server-side-encryption-customer-key， x-obs-server-side-encryption-customer-key-MD5一起使用。 
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

    public PutObjectRequest withXObsServerSideEncryptionCustomerKey(String xObsServerSideEncryptionCustomerKey) {
        this.xObsServerSideEncryptionCustomerKey = xObsServerSideEncryptionCustomerKey;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的密钥。该密钥用于加密对象  示例：x-obs-server-side-encryption-customer-key:K7QkYpBkM5+hca27fsNkUnNVaobncnLht/rCB2o/9Cw=  约束：该头域由256-bit的密钥经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key-MD5一起使用。 
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

    public PutObjectRequest withXObsServerSideEncryptionCustomerKeyMD5(String xObsServerSideEncryptionCustomerKeyMD5) {
        this.xObsServerSideEncryptionCustomerKeyMD5 = xObsServerSideEncryptionCustomerKeyMD5;
        return this;
    }

    /**
     * SSE-C方式下使用该头域，该头域表示加密使用的密钥的MD5值。MD5值用于验证密钥传输过程中没有出错。  示例：x-obs-server-side-encryption-customer-key-MD5:4XvB3tbNTN+tIEVa0/fGaQ==  约束: 该头域由密钥的128-bit MD5值经过base64-encoded得到，需要和x-obs-server-side-encryption-customer-algorithm，x-obs-server-side-encryption-customer-key一起使用。 
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

    public PutObjectRequest withSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
        return this;
    }

    /**
     * 此参数的值是一个URL，用于指定当此次请求操作成功响应后的重定向的地址。  如果此参数值有效且操作成功，响应码为303，Location头域由此参数以及桶名、对象名、对象的ETag组成。 如果此参数值无效，则OBS忽略此参数的作用，响应码为204，Location头域为对象地址。 
     * @return successActionRedirect
     */
    public String getSuccessActionRedirect() {
        return successActionRedirect;
    }

    public void setSuccessActionRedirect(String successActionRedirect) {
        this.successActionRedirect = successActionRedirect;
    }

    public PutObjectRequest withXObsExpires(Integer xObsExpires) {
        this.xObsExpires = xObsExpires;
        return this;
    }

    /**
     * 表示对象的过期时间，单位是天。过期之后对象会被自动删除。（从对象最后修改时间开始计算） 此字段对于每个对象仅支持上传时配置，不支持后期通过修改元数据接口修改。  示例：x-obs-expires:3 
     * @return xObsExpires
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-expires")
    public Integer getXObsExpires() {
        return xObsExpires;
    }

    public void setXObsExpires(Integer xObsExpires) {
        this.xObsExpires = xObsExpires;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutObjectRequest that = (PutObjectRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.objectKey, that.objectKey)
            && Objects.equals(this.date, that.date) && Objects.equals(this.contentMD5, that.contentMD5)
            && Objects.equals(this.xObsAcl, that.xObsAcl) && Objects.equals(this.xObsGrantRead, that.xObsGrantRead)
            && Objects.equals(this.xObsGrantReadAcp, that.xObsGrantReadAcp)
            && Objects.equals(this.xObsGrantWriteAcp, that.xObsGrantWriteAcp)
            && Objects.equals(this.xObsGrantFullControl, that.xObsGrantFullControl)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsMetaXxx, that.xObsMetaXxx)
            && Objects.equals(this.xObsPersistentHeaders, that.xObsPersistentHeaders)
            && Objects.equals(this.xObsWebsiteRedirectLocation, that.xObsWebsiteRedirectLocation)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.xObsServerSideEncryptionCustomerAlgorithm,
                that.xObsServerSideEncryptionCustomerAlgorithm)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKey, that.xObsServerSideEncryptionCustomerKey)
            && Objects.equals(this.xObsServerSideEncryptionCustomerKeyMD5, that.xObsServerSideEncryptionCustomerKeyMD5)
            && Objects.equals(this.successActionRedirect, that.successActionRedirect)
            && Objects.equals(this.xObsExpires, that.xObsExpires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName,
            objectKey,
            date,
            contentMD5,
            xObsAcl,
            xObsGrantRead,
            xObsGrantReadAcp,
            xObsGrantWriteAcp,
            xObsGrantFullControl,
            xObsStorageClass,
            xObsMetaXxx,
            xObsPersistentHeaders,
            xObsWebsiteRedirectLocation,
            xObsServerSideEncryption,
            xObsServerSideEncryptionKmsKeyId,
            xObsServerSideEncryptionCustomerAlgorithm,
            xObsServerSideEncryptionCustomerKey,
            xObsServerSideEncryptionCustomerKeyMD5,
            successActionRedirect,
            xObsExpires);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutObjectRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    contentMD5: ").append(toIndentedString(contentMD5)).append("\n");
        sb.append("    xObsAcl: ").append(toIndentedString(xObsAcl)).append("\n");
        sb.append("    xObsGrantRead: ").append(toIndentedString(xObsGrantRead)).append("\n");
        sb.append("    xObsGrantReadAcp: ").append(toIndentedString(xObsGrantReadAcp)).append("\n");
        sb.append("    xObsGrantWriteAcp: ").append(toIndentedString(xObsGrantWriteAcp)).append("\n");
        sb.append("    xObsGrantFullControl: ").append(toIndentedString(xObsGrantFullControl)).append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsMetaXxx: ").append(toIndentedString(xObsMetaXxx)).append("\n");
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
        sb.append("    successActionRedirect: ").append(toIndentedString(successActionRedirect)).append("\n");
        sb.append("    xObsExpires: ").append(toIndentedString(xObsExpires)).append("\n");
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
