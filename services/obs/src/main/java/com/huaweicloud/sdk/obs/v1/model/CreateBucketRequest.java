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
@JacksonXmlRootElement(localName = "CreateBucketRequest")
public class CreateBucketRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    @JacksonXmlProperty(localName = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-acl")

    @JacksonXmlProperty(localName = "x-obs-acl")

    private String xObsAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption")

    private String xObsServerSideEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-data-encryption")

    @JacksonXmlProperty(localName = "x-obs-server-side-data-encryption")

    private String xObsServerSideDataEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-kms-key-id")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-kms-key-id")

    private String xObsServerSideEncryptionKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-bucket-key-enabled")

    @JacksonXmlProperty(localName = "x-obs-server-side-encryption-bucket-key-enabled")

    private String xObsServerSideEncryptionBucketKeyEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-sse-kms-key-project-id")

    @JacksonXmlProperty(localName = "x-obs-sse-kms-key-project-id")

    private String xObsSseKmsKeyProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-object-lock-enabled")

    @JacksonXmlProperty(localName = "x-obs-bucket-object-lock-enabled")

    private String xObsBucketObjectLockEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-edge-location")

    @JacksonXmlProperty(localName = "x-obs-edge-location")

    private String xObsEdgeLocation;

    /**
     * 创建桶时，可以加上此消息头设置桶的默认存储类型，默认存储类型有4种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）、DEEP_ARCHIVE（深度归档）。如果没有指定此头域，则创建的桶为标准存储类型。 
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

        /**
         * Enum DEEP_ARCHIVE for value: "DEEP_ARCHIVE"
         */
        public static final XObsStorageClassEnum DEEP_ARCHIVE = new XObsStorageClassEnum("DEEP_ARCHIVE");

        private static final Map<String, XObsStorageClassEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsStorageClassEnum> createStaticFields() {
            Map<String, XObsStorageClassEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("WARM", WARM);
            map.put("COLD", COLD);
            map.put("DEEP_ARCHIVE", DEEP_ARCHIVE);
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
    @JsonProperty(value = "x-obs-grant-read")

    @JacksonXmlProperty(localName = "x-obs-grant-read")

    private String xObsGrantRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-write")

    @JacksonXmlProperty(localName = "x-obs-grant-write")

    private String xObsGrantWrite;

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
    @JsonProperty(value = "x-obs-grant-read-delivered")

    @JacksonXmlProperty(localName = "x-obs-grant-read-delivered")

    private String xObsGrantReadDelivered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-full-control-delivered")

    @JacksonXmlProperty(localName = "x-obs-grant-full-control-delivered")

    private String xObsGrantFullControlDelivered;

    /**
     * 创建桶时带上此消息头设置桶的存储类型为多AZ。不携带时默认为单AZ。用户携带该头域指定新创的桶的存储类型为多AZ，存在一种情况是当该区域如果不支持多AZ存储，则该桶的存储类型仍为单AZ。 
     */
    public static final class XObsAzRedundancyEnum {

        /**
         * Enum _3AZ for value: "3az"
         */
        public static final XObsAzRedundancyEnum _3AZ = new XObsAzRedundancyEnum("3az");

        private static final Map<String, XObsAzRedundancyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsAzRedundancyEnum> createStaticFields() {
            Map<String, XObsAzRedundancyEnum> map = new HashMap<>();
            map.put("3az", _3AZ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsAzRedundancyEnum(String value) {
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
        public static XObsAzRedundancyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsAzRedundancyEnum(value));
        }

        public static XObsAzRedundancyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsAzRedundancyEnum) {
                return this.value.equals(((XObsAzRedundancyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-az-redundancy")

    @JacksonXmlProperty(localName = "x-obs-az-redundancy")

    private XObsAzRedundancyEnum xObsAzRedundancy;

    /**
     * 创建桶时可以带上此消息头以创建并行文件系统。 
     */
    public static final class XObsFsFileInterfaceEnum {

        /**
         * Enum ENABLED for value: "Enabled"
         */
        public static final XObsFsFileInterfaceEnum ENABLED = new XObsFsFileInterfaceEnum("Enabled");

        private static final Map<String, XObsFsFileInterfaceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XObsFsFileInterfaceEnum> createStaticFields() {
            Map<String, XObsFsFileInterfaceEnum> map = new HashMap<>();
            map.put("Enabled", ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XObsFsFileInterfaceEnum(String value) {
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
        public static XObsFsFileInterfaceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XObsFsFileInterfaceEnum(value));
        }

        public static XObsFsFileInterfaceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XObsFsFileInterfaceEnum) {
                return this.value.equals(((XObsFsFileInterfaceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-fs-file-interface")

    @JacksonXmlProperty(localName = "x-obs-fs-file-interface")

    private XObsFsFileInterfaceEnum xObsFsFileInterface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-epid")

    @JacksonXmlProperty(localName = "x-obs-epid")

    private String xObsEpid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-ies-location")

    @JacksonXmlProperty(localName = "x-obs-ies-location")

    private String xObsIesLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateBucketRequestBody body;

    public CreateBucketRequest withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 考虑到桶名会作为访问域名的一部分，需要参与域名解析，因此桶名需要满足DNS域名规范。OBS系统在接受创桶请求时，会对桶名进行严格的检查，具体规则如下： 需全局唯一，不能与已有的任何桶名称重复，包括其他用户创建的桶。用户删除桶后，立即创建同名桶或并行文件系统会创建失败，需要等待30分钟才能创建。 长度范围为3到63个字符，支持小写字母、数字、中划线（-）、英文句号（.）。 禁止两个英文句号（.）相邻，禁止英文句号（.）和中划线（-）相邻，禁止以英文句号（.）和中划线（-）开头或结尾。 禁止使用IP地址。 须知： 当使用HTTPS协议访问OBS系统时，由于SSL的通配符证书仅匹配不包含\".\"的桶。这将导致桶名包含\".\"的桶在访问OBS系统时，客户端会提示证书校验存在风险，比如浏览器安全提示会呈现红色告警。因此如非必要，请尽量不要在桶名中包含\".\"。 
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateBucketRequest withDate(String date) {
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

    public CreateBucketRequest withXObsAcl(String xObsAcl) {
        this.xObsAcl = xObsAcl;
        return this;
    }

    /**
     * 创建桶时，可以加上此消息头设置桶的权限控制策略，使用的策略为预定义的常用策略，包括：private、public-read、public-read-write、public-read-delivered、public-read-write-delivered、bucket-owner-full-control（各策略详细说明见ACL章节的“使用头域设置ACL”）。 
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

    public CreateBucketRequest withXObsServerSideEncryption(String xObsServerSideEncryption) {
        this.xObsServerSideEncryption = xObsServerSideEncryption;
        return this;
    }

    /**
     * 创建桶时可以带上此头域来指定桶加密配置的加密模式。 示例：x-obs-server-side-encryption: kms 
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

    public CreateBucketRequest withXObsServerSideDataEncryption(String xObsServerSideDataEncryption) {
        this.xObsServerSideDataEncryption = xObsServerSideDataEncryption;
        return this;
    }

    /**
     * 创建桶时带上此头域来指定服务端加密配置的加密算法。 示例：x-obs-server-side-data-encryption: AES256 
     * @return xObsServerSideDataEncryption
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-data-encryption")
    public String getXObsServerSideDataEncryption() {
        return xObsServerSideDataEncryption;
    }

    public void setXObsServerSideDataEncryption(String xObsServerSideDataEncryption) {
        this.xObsServerSideDataEncryption = xObsServerSideDataEncryption;
    }

    public CreateBucketRequest withXObsServerSideEncryptionKmsKeyId(String xObsServerSideEncryptionKmsKeyId) {
        this.xObsServerSideEncryptionKmsKeyId = xObsServerSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * 当加密方式为SSE-KMS且使用指定密钥加密时，需输入密钥ID。密钥ID获取方法请参见查看密钥。 约束限制： 当您设置了x-obs-server-side-encryption头域且赋值为“kms”，即选择kms加密方式时，才能使用该头域指定加密密钥。 
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

    public CreateBucketRequest withXObsServerSideEncryptionBucketKeyEnabled(
        String xObsServerSideEncryptionBucketKeyEnabled) {
        this.xObsServerSideEncryptionBucketKeyEnabled = xObsServerSideEncryptionBucketKeyEnabled;
        return this;
    }

    /**
     * SSE-KMS桶密钥功能开关。 约束限制： 当您设置本头域为“true”时，必须同时设置本接口的另一个头域x-obs-server-side-encryption-kms-key-id以指定密钥ID。 
     * @return xObsServerSideEncryptionBucketKeyEnabled
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-server-side-encryption-bucket-key-enabled")
    public String getXObsServerSideEncryptionBucketKeyEnabled() {
        return xObsServerSideEncryptionBucketKeyEnabled;
    }

    public void setXObsServerSideEncryptionBucketKeyEnabled(String xObsServerSideEncryptionBucketKeyEnabled) {
        this.xObsServerSideEncryptionBucketKeyEnabled = xObsServerSideEncryptionBucketKeyEnabled;
    }

    public CreateBucketRequest withXObsSseKmsKeyProjectId(String xObsSseKmsKeyProjectId) {
        this.xObsSseKmsKeyProjectId = xObsSseKmsKeyProjectId;
        return this;
    }

    /**
     * SSE-KMS加密方式下KMS主密钥所属的项目ID（非企业项目ID）。 
     * @return xObsSseKmsKeyProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-sse-kms-key-project-id")
    public String getXObsSseKmsKeyProjectId() {
        return xObsSseKmsKeyProjectId;
    }

    public void setXObsSseKmsKeyProjectId(String xObsSseKmsKeyProjectId) {
        this.xObsSseKmsKeyProjectId = xObsSseKmsKeyProjectId;
    }

    public CreateBucketRequest withXObsBucketObjectLockEnabled(String xObsBucketObjectLockEnabled) {
        this.xObsBucketObjectLockEnabled = xObsBucketObjectLockEnabled;
        return this;
    }

    /**
     * 创建桶时可以带上此消息头来开启WORM开关。 示例：x-obs-bucket-object-lock-enabled:true 
     * @return xObsBucketObjectLockEnabled
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-bucket-object-lock-enabled")
    public String getXObsBucketObjectLockEnabled() {
        return xObsBucketObjectLockEnabled;
    }

    public void setXObsBucketObjectLockEnabled(String xObsBucketObjectLockEnabled) {
        this.xObsBucketObjectLockEnabled = xObsBucketObjectLockEnabled;
    }

    public CreateBucketRequest withXObsEdgeLocation(String xObsEdgeLocation) {
        this.xObsEdgeLocation = xObsEdgeLocation;
        return this;
    }

    /**
     * 如果是要在智能边缘云站点上创建桶，需要携带此头域，头域值为智能边缘云站点的AZ ID。 
     * @return xObsEdgeLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-edge-location")
    public String getXObsEdgeLocation() {
        return xObsEdgeLocation;
    }

    public void setXObsEdgeLocation(String xObsEdgeLocation) {
        this.xObsEdgeLocation = xObsEdgeLocation;
    }

    public CreateBucketRequest withXObsStorageClass(XObsStorageClassEnum xObsStorageClass) {
        this.xObsStorageClass = xObsStorageClass;
        return this;
    }

    /**
     * 创建桶时，可以加上此消息头设置桶的默认存储类型，默认存储类型有4种：STANDARD（标准存储）、WARM（低频访问存储）、COLD（归档存储）、DEEP_ARCHIVE（深度归档）。如果没有指定此头域，则创建的桶为标准存储类型。 
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

    public CreateBucketRequest withXObsGrantRead(String xObsGrantRead) {
        this.xObsGrantRead = xObsGrantRead;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有READ权限。允许列举桶内对象、列举桶中多段任务、列举桶中多版本对象、获取桶元数据。 
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

    public CreateBucketRequest withXObsGrantWrite(String xObsGrantWrite) {
        this.xObsGrantWrite = xObsGrantWrite;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有WRITE权限。允许创建、删除、覆盖桶内所有对象，允许初始化段、上传段、拷贝段、合并段、取消多段上传任务。 
     * @return xObsGrantWrite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-write")
    public String getXObsGrantWrite() {
        return xObsGrantWrite;
    }

    public void setXObsGrantWrite(String xObsGrantWrite) {
        this.xObsGrantWrite = xObsGrantWrite;
    }

    public CreateBucketRequest withXObsGrantReadAcp(String xObsGrantReadAcp) {
        this.xObsGrantReadAcp = xObsGrantReadAcp;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有READ_ACP权限。允许读桶的ACL信息。 
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

    public CreateBucketRequest withXObsGrantWriteAcp(String xObsGrantWriteAcp) {
        this.xObsGrantWriteAcp = xObsGrantWriteAcp;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有WRITE_ACP权限，允许修改桶的ACL信息。 
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

    public CreateBucketRequest withXObsGrantFullControl(String xObsGrantFullControl) {
        this.xObsGrantFullControl = xObsGrantFullControl;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有FULL_CONTROL权限。 
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

    public CreateBucketRequest withXObsGrantReadDelivered(String xObsGrantReadDelivered) {
        this.xObsGrantReadDelivered = xObsGrantReadDelivered;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有READ权限，并且在默认情况下，该READ权限将传递给桶内所有对象。 
     * @return xObsGrantReadDelivered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-read-delivered")
    public String getXObsGrantReadDelivered() {
        return xObsGrantReadDelivered;
    }

    public void setXObsGrantReadDelivered(String xObsGrantReadDelivered) {
        this.xObsGrantReadDelivered = xObsGrantReadDelivered;
    }

    public CreateBucketRequest withXObsGrantFullControlDelivered(String xObsGrantFullControlDelivered) {
        this.xObsGrantFullControlDelivered = xObsGrantFullControlDelivered;
        return this;
    }

    /**
     * 授权给指定domain下的所有用户有FULL_CONTROL权限，并且在默认情况下，该FULL_CONTROL权限将传递给桶内所有对象。 
     * @return xObsGrantFullControlDelivered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-grant-full-control-delivered")
    public String getXObsGrantFullControlDelivered() {
        return xObsGrantFullControlDelivered;
    }

    public void setXObsGrantFullControlDelivered(String xObsGrantFullControlDelivered) {
        this.xObsGrantFullControlDelivered = xObsGrantFullControlDelivered;
    }

    public CreateBucketRequest withXObsAzRedundancy(XObsAzRedundancyEnum xObsAzRedundancy) {
        this.xObsAzRedundancy = xObsAzRedundancy;
        return this;
    }

    /**
     * 创建桶时带上此消息头设置桶的存储类型为多AZ。不携带时默认为单AZ。用户携带该头域指定新创的桶的存储类型为多AZ，存在一种情况是当该区域如果不支持多AZ存储，则该桶的存储类型仍为单AZ。 
     * @return xObsAzRedundancy
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-az-redundancy")
    public XObsAzRedundancyEnum getXObsAzRedundancy() {
        return xObsAzRedundancy;
    }

    public void setXObsAzRedundancy(XObsAzRedundancyEnum xObsAzRedundancy) {
        this.xObsAzRedundancy = xObsAzRedundancy;
    }

    public CreateBucketRequest withXObsFsFileInterface(XObsFsFileInterfaceEnum xObsFsFileInterface) {
        this.xObsFsFileInterface = xObsFsFileInterface;
        return this;
    }

    /**
     * 创建桶时可以带上此消息头以创建并行文件系统。 
     * @return xObsFsFileInterface
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-fs-file-interface")
    public XObsFsFileInterfaceEnum getXObsFsFileInterface() {
        return xObsFsFileInterface;
    }

    public void setXObsFsFileInterface(XObsFsFileInterfaceEnum xObsFsFileInterface) {
        this.xObsFsFileInterface = xObsFsFileInterface;
    }

    public CreateBucketRequest withXObsEpid(String xObsEpid) {
        this.xObsEpid = xObsEpid;
        return this;
    }

    /**
     * 企业项目id，开通企业项目的用户可以从企业项目服务获取，格式为uuid，默认项目传“0”或者不带该头域，未开通企业项目的用户可以不带该头域。 
     * @return xObsEpid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-epid")
    public String getXObsEpid() {
        return xObsEpid;
    }

    public void setXObsEpid(String xObsEpid) {
        this.xObsEpid = xObsEpid;
    }

    public CreateBucketRequest withXObsIesLocation(String xObsIesLocation) {
        this.xObsIesLocation = xObsIesLocation;
        return this;
    }

    /**
     * 如果是要创建在IES站点上，则指定IES站点的AZ ID。此参数和x-obs-cluster-type不可共存。 
     * @return xObsIesLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-obs-ies-location")
    public String getXObsIesLocation() {
        return xObsIesLocation;
    }

    public void setXObsIesLocation(String xObsIesLocation) {
        this.xObsIesLocation = xObsIesLocation;
    }

    public CreateBucketRequest withBody(CreateBucketRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateBucketRequest withBody(Consumer<CreateBucketRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateBucketRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateBucketRequestBody getBody() {
        return body;
    }

    public void setBody(CreateBucketRequestBody body) {
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
        CreateBucketRequest that = (CreateBucketRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.date, that.date)
            && Objects.equals(this.xObsAcl, that.xObsAcl)
            && Objects.equals(this.xObsServerSideEncryption, that.xObsServerSideEncryption)
            && Objects.equals(this.xObsServerSideDataEncryption, that.xObsServerSideDataEncryption)
            && Objects.equals(this.xObsServerSideEncryptionKmsKeyId, that.xObsServerSideEncryptionKmsKeyId)
            && Objects.equals(this.xObsServerSideEncryptionBucketKeyEnabled,
                that.xObsServerSideEncryptionBucketKeyEnabled)
            && Objects.equals(this.xObsSseKmsKeyProjectId, that.xObsSseKmsKeyProjectId)
            && Objects.equals(this.xObsBucketObjectLockEnabled, that.xObsBucketObjectLockEnabled)
            && Objects.equals(this.xObsEdgeLocation, that.xObsEdgeLocation)
            && Objects.equals(this.xObsStorageClass, that.xObsStorageClass)
            && Objects.equals(this.xObsGrantRead, that.xObsGrantRead)
            && Objects.equals(this.xObsGrantWrite, that.xObsGrantWrite)
            && Objects.equals(this.xObsGrantReadAcp, that.xObsGrantReadAcp)
            && Objects.equals(this.xObsGrantWriteAcp, that.xObsGrantWriteAcp)
            && Objects.equals(this.xObsGrantFullControl, that.xObsGrantFullControl)
            && Objects.equals(this.xObsGrantReadDelivered, that.xObsGrantReadDelivered)
            && Objects.equals(this.xObsGrantFullControlDelivered, that.xObsGrantFullControlDelivered)
            && Objects.equals(this.xObsAzRedundancy, that.xObsAzRedundancy)
            && Objects.equals(this.xObsFsFileInterface, that.xObsFsFileInterface)
            && Objects.equals(this.xObsEpid, that.xObsEpid)
            && Objects.equals(this.xObsIesLocation, that.xObsIesLocation) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName,
            date,
            xObsAcl,
            xObsServerSideEncryption,
            xObsServerSideDataEncryption,
            xObsServerSideEncryptionKmsKeyId,
            xObsServerSideEncryptionBucketKeyEnabled,
            xObsSseKmsKeyProjectId,
            xObsBucketObjectLockEnabled,
            xObsEdgeLocation,
            xObsStorageClass,
            xObsGrantRead,
            xObsGrantWrite,
            xObsGrantReadAcp,
            xObsGrantWriteAcp,
            xObsGrantFullControl,
            xObsGrantReadDelivered,
            xObsGrantFullControlDelivered,
            xObsAzRedundancy,
            xObsFsFileInterface,
            xObsEpid,
            xObsIesLocation,
            body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBucketRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    xObsAcl: ").append(toIndentedString(xObsAcl)).append("\n");
        sb.append("    xObsServerSideEncryption: ").append(toIndentedString(xObsServerSideEncryption)).append("\n");
        sb.append("    xObsServerSideDataEncryption: ")
            .append(toIndentedString(xObsServerSideDataEncryption))
            .append("\n");
        sb.append("    xObsServerSideEncryptionKmsKeyId: ")
            .append(toIndentedString(xObsServerSideEncryptionKmsKeyId))
            .append("\n");
        sb.append("    xObsServerSideEncryptionBucketKeyEnabled: ")
            .append(toIndentedString(xObsServerSideEncryptionBucketKeyEnabled))
            .append("\n");
        sb.append("    xObsSseKmsKeyProjectId: ").append(toIndentedString(xObsSseKmsKeyProjectId)).append("\n");
        sb.append("    xObsBucketObjectLockEnabled: ")
            .append(toIndentedString(xObsBucketObjectLockEnabled))
            .append("\n");
        sb.append("    xObsEdgeLocation: ").append(toIndentedString(xObsEdgeLocation)).append("\n");
        sb.append("    xObsStorageClass: ").append(toIndentedString(xObsStorageClass)).append("\n");
        sb.append("    xObsGrantRead: ").append(toIndentedString(xObsGrantRead)).append("\n");
        sb.append("    xObsGrantWrite: ").append(toIndentedString(xObsGrantWrite)).append("\n");
        sb.append("    xObsGrantReadAcp: ").append(toIndentedString(xObsGrantReadAcp)).append("\n");
        sb.append("    xObsGrantWriteAcp: ").append(toIndentedString(xObsGrantWriteAcp)).append("\n");
        sb.append("    xObsGrantFullControl: ").append(toIndentedString(xObsGrantFullControl)).append("\n");
        sb.append("    xObsGrantReadDelivered: ").append(toIndentedString(xObsGrantReadDelivered)).append("\n");
        sb.append("    xObsGrantFullControlDelivered: ")
            .append(toIndentedString(xObsGrantFullControlDelivered))
            .append("\n");
        sb.append("    xObsAzRedundancy: ").append(toIndentedString(xObsAzRedundancy)).append("\n");
        sb.append("    xObsFsFileInterface: ").append(toIndentedString(xObsFsFileInterface)).append("\n");
        sb.append("    xObsEpid: ").append(toIndentedString(xObsEpid)).append("\n");
        sb.append("    xObsIesLocation: ").append(toIndentedString(xObsIesLocation)).append("\n");
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
