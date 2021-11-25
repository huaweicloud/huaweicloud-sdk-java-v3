package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Content */
public class Content {

    /** gauss100的版本号 - V100R003C20 - V300R001C00 */
    public static final class Gauss100VersionEnum {

        /** Enum V100R003C20 for value: "V100R003C20" */
        public static final Gauss100VersionEnum V100R003C20 = new Gauss100VersionEnum("V100R003C20");

        /** Enum V300R001C00 for value: "V300R001C00" */
        public static final Gauss100VersionEnum V300R001C00 = new Gauss100VersionEnum("V300R001C00");

        private static final Map<String, Gauss100VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Gauss100VersionEnum> createStaticFields() {
            Map<String, Gauss100VersionEnum> map = new HashMap<>();
            map.put("V100R003C20", V100R003C20);
            map.put("V300R001C00", V300R001C00);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Gauss100VersionEnum(String value) {
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
        public static Gauss100VersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            Gauss100VersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new Gauss100VersionEnum(value);
            }
            return result;
        }

        public static Gauss100VersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            Gauss100VersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Gauss100VersionEnum) {
                return this.value.equals(((Gauss100VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gauss100_version")

    private Gauss100VersionEnum gauss100Version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_database")

    private String redisDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    /** 数据源连接模式 - 数据源为DWS、MONGODB、REDIS、HANA时配置默认， -
     * 数据源为MYSQL、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、POSTGRESQL、HIVE时配置（default,professional）， -
     * 数据源为ORACLE时配置专有的模式multiAddress - default (默认模式) - professional (专业模式) - multiAddress (多地址) */
    public static final class ModeEnum {

        /** Enum DEFAULT for value: "default" */
        public static final ModeEnum DEFAULT = new ModeEnum("default");

        /** Enum PROFESSIONAL for value: "professional" */
        public static final ModeEnum PROFESSIONAL = new ModeEnum("professional");

        /** Enum MULTIADDRESS for value: "multiAddress" */
        public static final ModeEnum MULTIADDRESS = new ModeEnum("multiAddress");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            map.put("professional", PROFESSIONAL);
            map.put("multiAddress", MULTIADDRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /** cdc模式，只有组合任务使用 */
    public static final class CdcModeEnum {

        /** Enum XSTREAM for value: "xstream" */
        public static final CdcModeEnum XSTREAM = new CdcModeEnum("xstream");

        /** Enum LOGMINER for value: "logminer" */
        public static final CdcModeEnum LOGMINER = new CdcModeEnum("logminer");

        private static final Map<String, CdcModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CdcModeEnum> createStaticFields() {
            Map<String, CdcModeEnum> map = new HashMap<>();
            map.put("xstream", XSTREAM);
            map.put("logminer", LOGMINER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CdcModeEnum(String value) {
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
        public static CdcModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CdcModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CdcModeEnum(value);
            }
            return result;
        }

        public static CdcModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CdcModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CdcModeEnum) {
                return this.value.equals(((CdcModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdc_mode")

    private CdcModeEnum cdcMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_oracle_address")

    private List<ContentMultiOracleAddress> multiOracleAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oracle_service_name")

    private String oracleServiceName;

    /** 访问FTP服务的连接模式 - active (主动模式) - passive (被动模式) */
    public static final class FtpConnectModeEnum {

        /** Enum ACTIVE for value: "active" */
        public static final FtpConnectModeEnum ACTIVE = new FtpConnectModeEnum("active");

        /** Enum PASSIVE for value: "passive" */
        public static final FtpConnectModeEnum PASSIVE = new FtpConnectModeEnum("passive");

        private static final Map<String, FtpConnectModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FtpConnectModeEnum> createStaticFields() {
            Map<String, FtpConnectModeEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("passive", PASSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FtpConnectModeEnum(String value) {
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
        public static FtpConnectModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FtpConnectModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FtpConnectModeEnum(value);
            }
            return result;
        }

        public static FtpConnectModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FtpConnectModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FtpConnectModeEnum) {
                return this.value.equals(((FtpConnectModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ftp_connect_mode")

    private FtpConnectModeEnum ftpConnectMode;

    /** 访问FTP服务协议类型 - sftp - ftp */
    public static final class FtpProtocolEnum {

        /** Enum SFTP for value: "sftp" */
        public static final FtpProtocolEnum SFTP = new FtpProtocolEnum("sftp");

        /** Enum FTP for value: "ftp" */
        public static final FtpProtocolEnum FTP = new FtpProtocolEnum("ftp");

        private static final Map<String, FtpProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FtpProtocolEnum> createStaticFields() {
            Map<String, FtpProtocolEnum> map = new HashMap<>();
            map.put("sftp", SFTP);
            map.put("ftp", FTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FtpProtocolEnum(String value) {
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
        public static FtpProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FtpProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FtpProtocolEnum(value);
            }
            return result;
        }

        public static FtpProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FtpProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FtpProtocolEnum) {
                return this.value.equals(((FtpProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ftp_protocol")

    private FtpProtocolEnum ftpProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private Boolean https;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /** 访问API请求方式 - POST - PUT - DELETE - PATCH - GET */
    public static final class ApiMethodEnum {

        /** Enum POST for value: "POST" */
        public static final ApiMethodEnum POST = new ApiMethodEnum("POST");

        /** Enum PUT for value: "PUT" */
        public static final ApiMethodEnum PUT = new ApiMethodEnum("PUT");

        /** Enum DELETE for value: "DELETE" */
        public static final ApiMethodEnum DELETE = new ApiMethodEnum("DELETE");

        /** Enum PATCH for value: "PATCH" */
        public static final ApiMethodEnum PATCH = new ApiMethodEnum("PATCH");

        /** Enum GET for value: "GET" */
        public static final ApiMethodEnum GET = new ApiMethodEnum("GET");

        private static final Map<String, ApiMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiMethodEnum> createStaticFields() {
            Map<String, ApiMethodEnum> map = new HashMap<>();
            map.put("POST", POST);
            map.put("PUT", PUT);
            map.put("DELETE", DELETE);
            map.put("PATCH", PATCH);
            map.put("GET", GET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiMethodEnum(String value) {
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
        public static ApiMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiMethodEnum(value);
            }
            return result;
        }

        public static ApiMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiMethodEnum) {
                return this.value.equals(((ApiMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_method")

    private ApiMethodEnum apiMethod;

    /** 访问WEBSOCKET服务的认证方式 - none - basicauth */
    public static final class AuthMethodEnum {

        /** Enum NONE for value: "none" */
        public static final AuthMethodEnum NONE = new AuthMethodEnum("none");

        /** Enum BASICAUTH for value: "basicauth" */
        public static final AuthMethodEnum BASICAUTH = new AuthMethodEnum("basicauth");

        private static final Map<String, AuthMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthMethodEnum> createStaticFields() {
            Map<String, AuthMethodEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("basicauth", BASICAUTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthMethodEnum(String value) {
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
        public static AuthMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthMethodEnum(value);
            }
            return result;
        }

        public static AuthMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthMethodEnum) {
                return this.value.equals(((AuthMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_method")

    private AuthMethodEnum authMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_auth_detail")

    private ApiAuthDetail apiAuthDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker")

    private String broker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_username")

    private String sslUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_password")

    private String sslPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mongodb_auth_source")

    private String mongodbAuthSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mongodb_cluster_enable")

    private Boolean mongodbClusterEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mongodb_replica_set")

    private String mongodbReplicaSet;

    /** 编码格式 - 数据源为GAUSS200、GAUSS100、POSTGRESQL类型时配置\"big5\"， - 数据源为MYSQL、TAURUS类型且mode为default时配置 */
    public static final class EncodingEnum {

        /** Enum BIG5 for value: "big5" */
        public static final EncodingEnum BIG5 = new EncodingEnum("big5");

        /** Enum DEC8 for value: "dec8" */
        public static final EncodingEnum DEC8 = new EncodingEnum("dec8");

        /** Enum CP850 for value: "cp850" */
        public static final EncodingEnum CP850 = new EncodingEnum("cp850");

        /** Enum HP8 for value: "hp8" */
        public static final EncodingEnum HP8 = new EncodingEnum("hp8");

        /** Enum KOI8R for value: "koi8r" */
        public static final EncodingEnum KOI8R = new EncodingEnum("koi8r");

        /** Enum LATIN1 for value: "latin1" */
        public static final EncodingEnum LATIN1 = new EncodingEnum("latin1");

        /** Enum LATIN2 for value: "latin2" */
        public static final EncodingEnum LATIN2 = new EncodingEnum("latin2");

        /** Enum SWE7 for value: "swe7" */
        public static final EncodingEnum SWE7 = new EncodingEnum("swe7");

        /** Enum ASCII for value: "ascii" */
        public static final EncodingEnum ASCII = new EncodingEnum("ascii");

        /** Enum UJIS for value: "ujis" */
        public static final EncodingEnum UJIS = new EncodingEnum("ujis");

        /** Enum SJIS for value: "sjis" */
        public static final EncodingEnum SJIS = new EncodingEnum("sjis");

        /** Enum HEBREW for value: "hebrew" */
        public static final EncodingEnum HEBREW = new EncodingEnum("hebrew");

        /** Enum TIS620 for value: "tis620" */
        public static final EncodingEnum TIS620 = new EncodingEnum("tis620");

        /** Enum KOI8U for value: "koi8u" */
        public static final EncodingEnum KOI8U = new EncodingEnum("koi8u");

        /** Enum GB2312 for value: "gb2312" */
        public static final EncodingEnum GB2312 = new EncodingEnum("gb2312");

        /** Enum GREEK for value: "greek" */
        public static final EncodingEnum GREEK = new EncodingEnum("greek");

        /** Enum CP1250 for value: "cp1250" */
        public static final EncodingEnum CP1250 = new EncodingEnum("cp1250");

        /** Enum GBK for value: "gbk" */
        public static final EncodingEnum GBK = new EncodingEnum("gbk");

        /** Enum LATIN5 for value: "latin5" */
        public static final EncodingEnum LATIN5 = new EncodingEnum("latin5");

        /** Enum ARMSCII8 for value: "armscii8" */
        public static final EncodingEnum ARMSCII8 = new EncodingEnum("armscii8");

        /** Enum UTF8 for value: "utf8" */
        public static final EncodingEnum UTF8 = new EncodingEnum("utf8");

        /** Enum UCS2 for value: "ucs2" */
        public static final EncodingEnum UCS2 = new EncodingEnum("ucs2");

        /** Enum CP866 for value: "cp866" */
        public static final EncodingEnum CP866 = new EncodingEnum("cp866");

        /** Enum KEYBCS2 for value: "keybcs2" */
        public static final EncodingEnum KEYBCS2 = new EncodingEnum("keybcs2");

        /** Enum MACCE for value: "macce" */
        public static final EncodingEnum MACCE = new EncodingEnum("macce");

        /** Enum MACROMAN for value: "macroman" */
        public static final EncodingEnum MACROMAN = new EncodingEnum("macroman");

        /** Enum CP852 for value: "cp852" */
        public static final EncodingEnum CP852 = new EncodingEnum("cp852");

        /** Enum LATIN7 for value: "latin7" */
        public static final EncodingEnum LATIN7 = new EncodingEnum("latin7");

        /** Enum UTF8MB4 for value: "utf8mb4" */
        public static final EncodingEnum UTF8MB4 = new EncodingEnum("utf8mb4");

        /** Enum CP1251 for value: "cp1251" */
        public static final EncodingEnum CP1251 = new EncodingEnum("cp1251");

        /** Enum UTF16 for value: "utf16" */
        public static final EncodingEnum UTF16 = new EncodingEnum("utf16");

        /** Enum UTF16LE for value: "utf16le" */
        public static final EncodingEnum UTF16LE = new EncodingEnum("utf16le");

        /** Enum CP1256 for value: "cp1256" */
        public static final EncodingEnum CP1256 = new EncodingEnum("cp1256");

        /** Enum CP1257 for value: "cp1257" */
        public static final EncodingEnum CP1257 = new EncodingEnum("cp1257");

        /** Enum UTF32 for value: "utf32" */
        public static final EncodingEnum UTF32 = new EncodingEnum("utf32");

        /** Enum BINARY for value: "binary" */
        public static final EncodingEnum BINARY = new EncodingEnum("binary");

        /** Enum GEOSTD8 for value: "geostd8" */
        public static final EncodingEnum GEOSTD8 = new EncodingEnum("geostd8");

        /** Enum CP932 for value: "cp932" */
        public static final EncodingEnum CP932 = new EncodingEnum("cp932");

        /** Enum EUCJPMS for value: "eucjpms" */
        public static final EncodingEnum EUCJPMS = new EncodingEnum("eucjpms");

        /** Enum GB18030 for value: "gb18030" */
        public static final EncodingEnum GB18030 = new EncodingEnum("gb18030");

        private static final Map<String, EncodingEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncodingEnum> createStaticFields() {
            Map<String, EncodingEnum> map = new HashMap<>();
            map.put("big5", BIG5);
            map.put("dec8", DEC8);
            map.put("cp850", CP850);
            map.put("hp8", HP8);
            map.put("koi8r", KOI8R);
            map.put("latin1", LATIN1);
            map.put("latin2", LATIN2);
            map.put("swe7", SWE7);
            map.put("ascii", ASCII);
            map.put("ujis", UJIS);
            map.put("sjis", SJIS);
            map.put("hebrew", HEBREW);
            map.put("tis620", TIS620);
            map.put("koi8u", KOI8U);
            map.put("gb2312", GB2312);
            map.put("greek", GREEK);
            map.put("cp1250", CP1250);
            map.put("gbk", GBK);
            map.put("latin5", LATIN5);
            map.put("armscii8", ARMSCII8);
            map.put("utf8", UTF8);
            map.put("ucs2", UCS2);
            map.put("cp866", CP866);
            map.put("keybcs2", KEYBCS2);
            map.put("macce", MACCE);
            map.put("macroman", MACROMAN);
            map.put("cp852", CP852);
            map.put("latin7", LATIN7);
            map.put("utf8mb4", UTF8MB4);
            map.put("cp1251", CP1251);
            map.put("utf16", UTF16);
            map.put("utf16le", UTF16LE);
            map.put("cp1256", CP1256);
            map.put("cp1257", CP1257);
            map.put("utf32", UTF32);
            map.put("binary", BINARY);
            map.put("geostd8", GEOSTD8);
            map.put("cp932", CP932);
            map.put("eucjpms", EUCJPMS);
            map.put("gb18030", GB18030);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncodingEnum(String value) {
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
        public static EncodingEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EncodingEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EncodingEnum(value);
            }
            return result;
        }

        public static EncodingEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EncodingEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncodingEnum) {
                return this.value.equals(((EncodingEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private EncodingEnum encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql_timeout")

    private Integer mysqlTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_password")

    private String trustStorePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store")

    private String trustStore;

    /** - 数据源类型为ACTIVEMQ、ARTEMISMQ、RABBITMQ、IBMMQ且开启SSL认证时需要配置，公钥库密码 -
     * 数据源类型为HL7且为目标端（position为target），并且开启SSL认证时需要配置，公钥库密码 */
    public static final class TrustStoreFileTypeEnum {

        /** Enum JKS for value: "jks" */
        public static final TrustStoreFileTypeEnum JKS = new TrustStoreFileTypeEnum("jks");

        /** Enum TS for value: "ts" */
        public static final TrustStoreFileTypeEnum TS = new TrustStoreFileTypeEnum("ts");

        private static final Map<String, TrustStoreFileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrustStoreFileTypeEnum> createStaticFields() {
            Map<String, TrustStoreFileTypeEnum> map = new HashMap<>();
            map.put("jks", JKS);
            map.put("ts", TS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrustStoreFileTypeEnum(String value) {
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
        public static TrustStoreFileTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TrustStoreFileTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TrustStoreFileTypeEnum(value);
            }
            return result;
        }

        public static TrustStoreFileTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TrustStoreFileTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrustStoreFileTypeEnum) {
                return this.value.equals(((TrustStoreFileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_file_type")

    private TrustStoreFileTypeEnum trustStoreFileType;

    /** 数据源类型为ACTIVEMQ、ARTEMISMQ且开启SSL认证时需要配置 - one-way (单向认证) - two-way (双向认证) */
    public static final class SslAuthMethodEnum {

        /** Enum ONE_WAY for value: "one-way" */
        public static final SslAuthMethodEnum ONE_WAY = new SslAuthMethodEnum("one-way");

        /** Enum TWO_WAY for value: "two-way" */
        public static final SslAuthMethodEnum TWO_WAY = new SslAuthMethodEnum("two-way");

        private static final Map<String, SslAuthMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SslAuthMethodEnum> createStaticFields() {
            Map<String, SslAuthMethodEnum> map = new HashMap<>();
            map.put("one-way", ONE_WAY);
            map.put("two-way", TWO_WAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SslAuthMethodEnum(String value) {
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
        public static SslAuthMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SslAuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SslAuthMethodEnum(value);
            }
            return result;
        }

        public static SslAuthMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SslAuthMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SslAuthMethodEnum) {
                return this.value.equals(((SslAuthMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_auth_method")

    private SslAuthMethodEnum sslAuthMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store")

    private String keyStore;

    /** 私钥库文件类型 - 数据源类型为ACTIVEMQ、ARTEMISMQ，开启SSL认证并且认证方式是two-way时需要配置 */
    public static final class KeyStoreFileTypeEnum {

        /** Enum KS for value: "ks" */
        public static final KeyStoreFileTypeEnum KS = new KeyStoreFileTypeEnum("ks");

        /** Enum JKS for value: "jks" */
        public static final KeyStoreFileTypeEnum JKS = new KeyStoreFileTypeEnum("jks");

        private static final Map<String, KeyStoreFileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyStoreFileTypeEnum> createStaticFields() {
            Map<String, KeyStoreFileTypeEnum> map = new HashMap<>();
            map.put("ks", KS);
            map.put("jks", JKS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyStoreFileTypeEnum(String value) {
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
        public static KeyStoreFileTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KeyStoreFileTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeyStoreFileTypeEnum(value);
            }
            return result;
        }

        public static KeyStoreFileTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeyStoreFileTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyStoreFileTypeEnum) {
                return this.value.equals(((KeyStoreFileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_file_type")

    private KeyStoreFileTypeEnum keyStoreFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_password")

    private String keyStorePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_key_password")

    private String keyStoreKeyPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_tunnel_name")

    private String disTunnelName;

    /** DIS数据类别 - JSON */
    public static final class DisDataTypeEnum {

        /** Enum JSON for value: "JSON" */
        public static final DisDataTypeEnum JSON = new DisDataTypeEnum("JSON");

        private static final Map<String, DisDataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisDataTypeEnum> createStaticFields() {
            Map<String, DisDataTypeEnum> map = new HashMap<>();
            map.put("JSON", JSON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisDataTypeEnum(String value) {
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
        public static DisDataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DisDataTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DisDataTypeEnum(value);
            }
            return result;
        }

        public static DisDataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DisDataTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisDataTypeEnum) {
                return this.value.equals(((DisDataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_data_type")

    private DisDataTypeEnum disDataType;

    /** DIS配置类别 - senior (高级) - basic (基础) */
    public static final class DisSettingTypeEnum {

        /** Enum BASIC for value: "basic" */
        public static final DisSettingTypeEnum BASIC = new DisSettingTypeEnum("basic");

        /** Enum SENIOR for value: "senior" */
        public static final DisSettingTypeEnum SENIOR = new DisSettingTypeEnum("senior");

        private static final Map<String, DisSettingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisSettingTypeEnum> createStaticFields() {
            Map<String, DisSettingTypeEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            map.put("senior", SENIOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisSettingTypeEnum(String value) {
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
        public static DisSettingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DisSettingTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DisSettingTypeEnum(value);
            }
            return result;
        }

        public static DisSettingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DisSettingTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisSettingTypeEnum) {
                return this.value.equals(((DisSettingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_setting_type")

    private DisSettingTypeEnum disSettingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_endpoint")

    private String disEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_region")

    private String disRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_source_project_id")

    private String disSourceProjectId;

    /** HL7数据源方向 - source (源端) - target (目标端) */
    public static final class Hl7PositionEnum {

        /** Enum SOURCE for value: "source" */
        public static final Hl7PositionEnum SOURCE = new Hl7PositionEnum("source");

        /** Enum TARGET for value: "target" */
        public static final Hl7PositionEnum TARGET = new Hl7PositionEnum("target");

        private static final Map<String, Hl7PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Hl7PositionEnum> createStaticFields() {
            Map<String, Hl7PositionEnum> map = new HashMap<>();
            map.put("source", SOURCE);
            map.put("target", TARGET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Hl7PositionEnum(String value) {
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
        public static Hl7PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            Hl7PositionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new Hl7PositionEnum(value);
            }
            return result;
        }

        public static Hl7PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            Hl7PositionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Hl7PositionEnum) {
                return this.value.equals(((Hl7PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hl7_position")

    private Hl7PositionEnum hl7Position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hl7_whitelist_enable")

    private Boolean hl7WhitelistEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hl7_whitelist")

    private String hl7Whitelist;

    /** LDAP安全认证类型 */
    public static final class LdapSecurityAuthTypeEnum {

        /** Enum NO for value: "no" */
        public static final LdapSecurityAuthTypeEnum NO = new LdapSecurityAuthTypeEnum("no");

        /** Enum SIMPLE for value: "simple" */
        public static final LdapSecurityAuthTypeEnum SIMPLE = new LdapSecurityAuthTypeEnum("simple");

        private static final Map<String, LdapSecurityAuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LdapSecurityAuthTypeEnum> createStaticFields() {
            Map<String, LdapSecurityAuthTypeEnum> map = new HashMap<>();
            map.put("no", NO);
            map.put("simple", SIMPLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LdapSecurityAuthTypeEnum(String value) {
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
        public static LdapSecurityAuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LdapSecurityAuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LdapSecurityAuthTypeEnum(value);
            }
            return result;
        }

        public static LdapSecurityAuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LdapSecurityAuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LdapSecurityAuthTypeEnum) {
                return this.value.equals(((LdapSecurityAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ldap_security_auth_type")

    private LdapSecurityAuthTypeEnum ldapSecurityAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rabbitmq_virtual_host")

    private String rabbitmqVirtualHost;

    /** RABBITMQ SSL认证协议 - TLS */
    public static final class RabbitmqSslProtocolEnum {

        /** Enum TLS for value: "TLS" */
        public static final RabbitmqSslProtocolEnum TLS = new RabbitmqSslProtocolEnum("TLS");

        private static final Map<String, RabbitmqSslProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RabbitmqSslProtocolEnum> createStaticFields() {
            Map<String, RabbitmqSslProtocolEnum> map = new HashMap<>();
            map.put("TLS", TLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RabbitmqSslProtocolEnum(String value) {
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
        public static RabbitmqSslProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RabbitmqSslProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RabbitmqSslProtocolEnum(value);
            }
            return result;
        }

        public static RabbitmqSslProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RabbitmqSslProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RabbitmqSslProtocolEnum) {
                return this.value.equals(((RabbitmqSslProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rabbitmq_ssl_protocol")

    private RabbitmqSslProtocolEnum rabbitmqSslProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sap_client")

    private String sapClient;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sap_sysnr")

    private String sapSysnr;

    /** SNMP网络协议 - udp - tcp */
    public static final class SnmpNetworkProtocolEnum {

        /** Enum UDP for value: "udp" */
        public static final SnmpNetworkProtocolEnum UDP = new SnmpNetworkProtocolEnum("udp");

        /** Enum TCP for value: "tcp" */
        public static final SnmpNetworkProtocolEnum TCP = new SnmpNetworkProtocolEnum("tcp");

        private static final Map<String, SnmpNetworkProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SnmpNetworkProtocolEnum> createStaticFields() {
            Map<String, SnmpNetworkProtocolEnum> map = new HashMap<>();
            map.put("udp", UDP);
            map.put("tcp", TCP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SnmpNetworkProtocolEnum(String value) {
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
        public static SnmpNetworkProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SnmpNetworkProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SnmpNetworkProtocolEnum(value);
            }
            return result;
        }

        public static SnmpNetworkProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SnmpNetworkProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SnmpNetworkProtocolEnum) {
                return this.value.equals(((SnmpNetworkProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snmp_network_protocol")

    private SnmpNetworkProtocolEnum snmpNetworkProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snmp_version")

    private Integer snmpVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snmp_community")

    private String snmpCommunity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ibmmq_ccs_id")

    private String ibmmqCcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ibmmq_queue_manager")

    private String ibmmqQueueManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ibmmq_channel")

    private String ibmmqChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ibmmq_cipher_suite")

    private String ibmmqCipherSuite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hdfs_path")

    private String hdfsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_name")

    private String principalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_file_name")

    private String configFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_file_content")

    private String configFileContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_instance_id")

    private String connectionInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_params")

    private Object connectorParams;

    public Content withGauss100Version(Gauss100VersionEnum gauss100Version) {
        this.gauss100Version = gauss100Version;
        return this;
    }

    /** gauss100的版本号 - V100R003C20 - V300R001C00
     * 
     * @return gauss100Version */
    public Gauss100VersionEnum getGauss100Version() {
        return gauss100Version;
    }

    public void setGauss100Version(Gauss100VersionEnum gauss100Version) {
        this.gauss100Version = gauss100Version;
    }

    public Content withHost(String host) {
        this.host = host;
        return this;
    }

    /** 主机IP地址 - 数据源为DWS、HANA、RABBITMQ、SAP、SNMP、IBMMQ类型时需要配置。 -
     * 数据源为MYSQL、ORACLE、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、ARTEMISMQ、POSTGRESQL、HIVE类型且mode为default时需要配置。 -
     * 数据源为HL7类型且作为目标端（position为target）时需要配置。 - 初始值为空，配置任务启动后生成host
     * 
     * @return host */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Content withPort(String port) {
        this.port = port;
        return this;
    }

    /** 端口，端口号为0到65535 - 数据源为DWS、HANA、RABBITMQ、SAP、SNMP、IBMMQ，obs类型时需要配置， -
     * 数据源为MYSQL、ORACLE、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、ARTEMISMQ、POSTGRESQL、HIVE类型且mode为default时需要配置， -
     * 数据源为HL7类型且作为目标端（position为target）时需要配置
     * 
     * @return port */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Content withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /** 数据库名称 - 数据源为DWS、HANA、RABBITMQ、SAP、SNMP、IBMMQ，obs类型时需要配置， -
     * 数据源为MYSQL、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、ARTEMISMQ、POSTGRESQL、HIVE类型且mode为default时需要配置， -
     * 数据源为ORACLE类型且mode为（default、multiAddress）时需要配置
     * 
     * @return databaseName */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Content withRedisDatabase(String redisDatabase) {
        this.redisDatabase = redisDatabase;
        return this;
    }

    /** REDIS数据源类型配置，数据库编号, 纯数字编码
     * 
     * @return redisDatabase */
    public String getRedisDatabase() {
        return redisDatabase;
    }

    public void setRedisDatabase(String redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public Content withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 访问服务的用户名 -
     * 数据源为MYSQL、DWS、FTP、ORACLE、MONGODB、HANA、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、ACTIVEMQ、ARTEMISMQ、POSTGRESQL、RABBITMQ、SAP、IBMMQ、HIVE类型时需要配置
     * - 数据源为WEBSOCKET类型，认证方式（basicauth）时需要配置 - 数据源为LDAP，安全认证类型（security_auth_type）为simple时需要配置
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Content withPassword(String password) {
        this.password = password;
        return this;
    }

    /** 访问服务的密码 -
     * 数据源为MYSQL、DWS、FTP、ORACLE、MONGODB、HANA、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、ACTIVEMQ、ARTEMISMQ、POSTGRESQL、RABBITMQ、SAP、IBMMQ、HIVE类型时需要配置
     * - 数据源为WEBSOCKET，且认证方式（basicauth）时需要配置 - 数据源为LDAP，且安全认证类型（security_auth_type）为simple时需要配置
     * 
     * @return password */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Content withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /** 数据源连接模式 - 数据源为DWS、MONGODB、REDIS、HANA时配置默认， -
     * 数据源为MYSQL、SQLSERVER、DB2、GAUSS200、GAUSS100、TAURUS、POSTGRESQL、HIVE时配置（default,professional）， -
     * 数据源为ORACLE时配置专有的模式multiAddress - default (默认模式) - professional (专业模式) - multiAddress (多地址)
     * 
     * @return mode */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public Content withCdcMode(CdcModeEnum cdcMode) {
        this.cdcMode = cdcMode;
        return this;
    }

    /** cdc模式，只有组合任务使用
     * 
     * @return cdcMode */
    public CdcModeEnum getCdcMode() {
        return cdcMode;
    }

    public void setCdcMode(CdcModeEnum cdcMode) {
        this.cdcMode = cdcMode;
    }

    public Content withMultiOracleAddress(List<ContentMultiOracleAddress> multiOracleAddress) {
        this.multiOracleAddress = multiOracleAddress;
        return this;
    }

    public Content addMultiOracleAddressItem(ContentMultiOracleAddress multiOracleAddressItem) {
        if (this.multiOracleAddress == null) {
            this.multiOracleAddress = new ArrayList<>();
        }
        this.multiOracleAddress.add(multiOracleAddressItem);
        return this;
    }

    public Content withMultiOracleAddress(Consumer<List<ContentMultiOracleAddress>> multiOracleAddressSetter) {
        if (this.multiOracleAddress == null) {
            this.multiOracleAddress = new ArrayList<>();
        }
        multiOracleAddressSetter.accept(this.multiOracleAddress);
        return this;
    }

    /** ORACLE集群地址，当mode为multiAddress时需要配置
     * 
     * @return multiOracleAddress */
    public List<ContentMultiOracleAddress> getMultiOracleAddress() {
        return multiOracleAddress;
    }

    public void setMultiOracleAddress(List<ContentMultiOracleAddress> multiOracleAddress) {
        this.multiOracleAddress = multiOracleAddress;
    }

    public Content withOracleServiceName(String oracleServiceName) {
        this.oracleServiceName = oracleServiceName;
        return this;
    }

    /** ORACLE集群服务名
     * 
     * @return oracleServiceName */
    public String getOracleServiceName() {
        return oracleServiceName;
    }

    public void setOracleServiceName(String oracleServiceName) {
        this.oracleServiceName = oracleServiceName;
    }

    public Content withFtpConnectMode(FtpConnectModeEnum ftpConnectMode) {
        this.ftpConnectMode = ftpConnectMode;
        return this;
    }

    /** 访问FTP服务的连接模式 - active (主动模式) - passive (被动模式)
     * 
     * @return ftpConnectMode */
    public FtpConnectModeEnum getFtpConnectMode() {
        return ftpConnectMode;
    }

    public void setFtpConnectMode(FtpConnectModeEnum ftpConnectMode) {
        this.ftpConnectMode = ftpConnectMode;
    }

    public Content withFtpProtocol(FtpProtocolEnum ftpProtocol) {
        this.ftpProtocol = ftpProtocol;
        return this;
    }

    /** 访问FTP服务协议类型 - sftp - ftp
     * 
     * @return ftpProtocol */
    public FtpProtocolEnum getFtpProtocol() {
        return ftpProtocol;
    }

    public void setFtpProtocol(FtpProtocolEnum ftpProtocol) {
        this.ftpProtocol = ftpProtocol;
    }

    public Content withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 地址 - OBS (obs远端地址，obs数据源使用) - MONGODB (MONGODB数据源类型主机IP地址，多个IP:PORT, 使用\",\"隔开) - REDIS (redis服务地址，多个IP:PORT,
     * 使用\",\"隔开)
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Content withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /** Access Key ID - 数据源为OBS，DIS类型时需要配置
     * 
     * @return ak */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public Content withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /** Secret Access Key - 数据源为OBS，DIS类型时需要配置
     * 
     * @return sk */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public Content withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /** 桶名称，数据源为OBS时需要配置
     * 
     * @return bucketName */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Content withHttps(Boolean https) {
        this.https = https;
        return this;
    }

    /** 是否使用https, 数据源为OBS时需要配置，一般默认使用
     * 
     * @return https */
    public Boolean getHttps() {
        return https;
    }

    public void setHttps(Boolean https) {
        this.https = https;
    }

    public Content withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 连接字符串，访问url - 数据源为API、LDAP、WEBSOCKE类型时需要配置， -
     * 数据源为MYSQL、ORACLE、DB2、GAUSS200、GAUSS100、TAURUS、POSTGRESQL，且mode配置为professional专业时需要配置
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Content withApiMethod(ApiMethodEnum apiMethod) {
        this.apiMethod = apiMethod;
        return this;
    }

    /** 访问API请求方式 - POST - PUT - DELETE - PATCH - GET
     * 
     * @return apiMethod */
    public ApiMethodEnum getApiMethod() {
        return apiMethod;
    }

    public void setApiMethod(ApiMethodEnum apiMethod) {
        this.apiMethod = apiMethod;
    }

    public Content withAuthMethod(AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }

    /** 访问WEBSOCKET服务的认证方式 - none - basicauth
     * 
     * @return authMethod */
    public AuthMethodEnum getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
    }

    public Content withApiAuthDetail(ApiAuthDetail apiAuthDetail) {
        this.apiAuthDetail = apiAuthDetail;
        return this;
    }

    public Content withApiAuthDetail(Consumer<ApiAuthDetail> apiAuthDetailSetter) {
        if (this.apiAuthDetail == null) {
            this.apiAuthDetail = new ApiAuthDetail();
            apiAuthDetailSetter.accept(this.apiAuthDetail);
        }

        return this;
    }

    /** Get apiAuthDetail
     * 
     * @return apiAuthDetail */
    public ApiAuthDetail getApiAuthDetail() {
        return apiAuthDetail;
    }

    public void setApiAuthDetail(ApiAuthDetail apiAuthDetail) {
        this.apiAuthDetail = apiAuthDetail;
    }

    public Content withBroker(String broker) {
        this.broker = broker;
        return this;
    }

    /** KAFKA、ACTIVEMQ的服务器地址，多个IP:PORT, 使用\",\"分隔
     * 
     * @return broker */
    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public Content withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /** 是否开启SSL认证 - 数据源为KAFKA时需要配置，连接MQS内网地址时，若MQS同时开启了SSL与VPC内网明文访问，请选择“否” -
     * 数据源为ARTEMISMQ、ACTIVEMQ、RABBITMQ、IBMMQ时需要配置， - 数据源为HL7时且作为源端时需要配置
     * 
     * @return sslEnable */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public Content withSslUsername(String sslUsername) {
        this.sslUsername = sslUsername;
        return this;
    }

    /** SSL用户名/应用Key - 数据源为KAFKA且开启SSL认证时需要配置
     * 
     * @return sslUsername */
    public String getSslUsername() {
        return sslUsername;
    }

    public void setSslUsername(String sslUsername) {
        this.sslUsername = sslUsername;
    }

    public Content withSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
        return this;
    }

    /** SSL密码/应用Secret - 数据源为KAFKA且开启SSL认证时需要配置
     * 
     * @return sslPassword */
    public String getSslPassword() {
        return sslPassword;
    }

    public void setSslPassword(String sslPassword) {
        this.sslPassword = sslPassword;
    }

    public Content withMongodbAuthSource(String mongodbAuthSource) {
        this.mongodbAuthSource = mongodbAuthSource;
        return this;
    }

    /** MONGODB认证源
     * 
     * @return mongodbAuthSource */
    public String getMongodbAuthSource() {
        return mongodbAuthSource;
    }

    public void setMongodbAuthSource(String mongodbAuthSource) {
        this.mongodbAuthSource = mongodbAuthSource;
    }

    public Content withMongodbClusterEnable(Boolean mongodbClusterEnable) {
        this.mongodbClusterEnable = mongodbClusterEnable;
        return this;
    }

    /** MONGODB集群模式 - true (集群模式) - false （非集群模式）
     * 
     * @return mongodbClusterEnable */
    public Boolean getMongodbClusterEnable() {
        return mongodbClusterEnable;
    }

    public void setMongodbClusterEnable(Boolean mongodbClusterEnable) {
        this.mongodbClusterEnable = mongodbClusterEnable;
    }

    public Content withMongodbReplicaSet(String mongodbReplicaSet) {
        this.mongodbReplicaSet = mongodbReplicaSet;
        return this;
    }

    /** MONGODB副本集 当MONGODB为非集群模式时配置
     * 
     * @return mongodbReplicaSet */
    public String getMongodbReplicaSet() {
        return mongodbReplicaSet;
    }

    public void setMongodbReplicaSet(String mongodbReplicaSet) {
        this.mongodbReplicaSet = mongodbReplicaSet;
    }

    public Content withEncoding(EncodingEnum encoding) {
        this.encoding = encoding;
        return this;
    }

    /** 编码格式 - 数据源为GAUSS200、GAUSS100、POSTGRESQL类型时配置\"big5\"， - 数据源为MYSQL、TAURUS类型且mode为default时配置
     * 
     * @return encoding */
    public EncodingEnum getEncoding() {
        return encoding;
    }

    public void setEncoding(EncodingEnum encoding) {
        this.encoding = encoding;
    }

    public Content withMysqlTimeout(Integer mysqlTimeout) {
        this.mysqlTimeout = mysqlTimeout;
        return this;
    }

    /** MYSQL连接超时时间（秒） minimum: 1 maximum: 20000
     * 
     * @return mysqlTimeout */
    public Integer getMysqlTimeout() {
        return mysqlTimeout;
    }

    public void setMysqlTimeout(Integer mysqlTimeout) {
        this.mysqlTimeout = mysqlTimeout;
    }

    public Content withTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
        return this;
    }

    /** 公钥库密码 - 数据源类型为ACTIVEMQ、ARTEMISMQ、RABBITMQ、IBMMQ且开启SSL认证时需要配置 - 数据源类为HL7且HL7为目标端（position为target）时，并且开启SSL认证时需要配置
     * 
     * @return trustStorePassword */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }

    public Content withTrustStore(String trustStore) {
        this.trustStore = trustStore;
        return this;
    }

    /** - 数据源类型为ACTIVEMQ、ARTEMISMQ、RABBITMQ、IBMMQ且开启SSL认证时需要配置，公钥库密码 -
     * 数据源类型为HL7且为目标端（position为target），并且开启SSL认证时需要配置，公钥库密码
     * 
     * @return trustStore */
    public String getTrustStore() {
        return trustStore;
    }

    public void setTrustStore(String trustStore) {
        this.trustStore = trustStore;
    }

    public Content withTrustStoreFileType(TrustStoreFileTypeEnum trustStoreFileType) {
        this.trustStoreFileType = trustStoreFileType;
        return this;
    }

    /** - 数据源类型为ACTIVEMQ、ARTEMISMQ、RABBITMQ、IBMMQ且开启SSL认证时需要配置，公钥库密码 -
     * 数据源类型为HL7且为目标端（position为target），并且开启SSL认证时需要配置，公钥库密码
     * 
     * @return trustStoreFileType */
    public TrustStoreFileTypeEnum getTrustStoreFileType() {
        return trustStoreFileType;
    }

    public void setTrustStoreFileType(TrustStoreFileTypeEnum trustStoreFileType) {
        this.trustStoreFileType = trustStoreFileType;
    }

    public Content withSslAuthMethod(SslAuthMethodEnum sslAuthMethod) {
        this.sslAuthMethod = sslAuthMethod;
        return this;
    }

    /** 数据源类型为ACTIVEMQ、ARTEMISMQ且开启SSL认证时需要配置 - one-way (单向认证) - two-way (双向认证)
     * 
     * @return sslAuthMethod */
    public SslAuthMethodEnum getSslAuthMethod() {
        return sslAuthMethod;
    }

    public void setSslAuthMethod(SslAuthMethodEnum sslAuthMethod) {
        this.sslAuthMethod = sslAuthMethod;
    }

    public Content withKeyStore(String keyStore) {
        this.keyStore = keyStore;
        return this;
    }

    /** 私钥库文件内容， - 数据源类型为ACTIVEMQ、ARTEMISMQ，开启SSL认证并且认证方式是two-way时需要配置 - 数据源类型HL7且为源端（position为source），并且开启SSL认证时需要配置
     * 
     * @return keyStore */
    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    public Content withKeyStoreFileType(KeyStoreFileTypeEnum keyStoreFileType) {
        this.keyStoreFileType = keyStoreFileType;
        return this;
    }

    /** 私钥库文件类型 - 数据源类型为ACTIVEMQ、ARTEMISMQ，开启SSL认证并且认证方式是two-way时需要配置
     * 
     * @return keyStoreFileType */
    public KeyStoreFileTypeEnum getKeyStoreFileType() {
        return keyStoreFileType;
    }

    public void setKeyStoreFileType(KeyStoreFileTypeEnum keyStoreFileType) {
        this.keyStoreFileType = keyStoreFileType;
    }

    public Content withKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    /** 私钥库密码 - 数据源类型为ACTIVEMQ、ARTEMISMQ，开启SSL认证并且认证方式是two-way时需要配置 - 数据源为HL7类型，为源端（position为source）并且开启SSL认证时需要配置
     * 
     * @return keyStorePassword */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    public Content withKeyStoreKeyPassword(String keyStoreKeyPassword) {
        this.keyStoreKeyPassword = keyStoreKeyPassword;
        return this;
    }

    /** 私钥库私钥密码 - 数据源类型为ACTIVEMQ、ARTEMISMQ，开启SSL认证并且认证方式是two-way时需要配置 - 数据源为HL7类型，为源端（position为source）并且开启SSL认证时需要配置
     * 
     * @return keyStoreKeyPassword */
    public String getKeyStoreKeyPassword() {
        return keyStoreKeyPassword;
    }

    public void setKeyStoreKeyPassword(String keyStoreKeyPassword) {
        this.keyStoreKeyPassword = keyStoreKeyPassword;
    }

    public Content withDisTunnelName(String disTunnelName) {
        this.disTunnelName = disTunnelName;
        return this;
    }

    /** DIS通道名称
     * 
     * @return disTunnelName */
    public String getDisTunnelName() {
        return disTunnelName;
    }

    public void setDisTunnelName(String disTunnelName) {
        this.disTunnelName = disTunnelName;
    }

    public Content withDisDataType(DisDataTypeEnum disDataType) {
        this.disDataType = disDataType;
        return this;
    }

    /** DIS数据类别 - JSON
     * 
     * @return disDataType */
    public DisDataTypeEnum getDisDataType() {
        return disDataType;
    }

    public void setDisDataType(DisDataTypeEnum disDataType) {
        this.disDataType = disDataType;
    }

    public Content withDisSettingType(DisSettingTypeEnum disSettingType) {
        this.disSettingType = disSettingType;
        return this;
    }

    /** DIS配置类别 - senior (高级) - basic (基础)
     * 
     * @return disSettingType */
    public DisSettingTypeEnum getDisSettingType() {
        return disSettingType;
    }

    public void setDisSettingType(DisSettingTypeEnum disSettingType) {
        this.disSettingType = disSettingType;
    }

    public Content withDisEndpoint(String disEndpoint) {
        this.disEndpoint = disEndpoint;
        return this;
    }

    /** DIS Endpoint，当setting_type为senior时填写
     * 
     * @return disEndpoint */
    public String getDisEndpoint() {
        return disEndpoint;
    }

    public void setDisEndpoint(String disEndpoint) {
        this.disEndpoint = disEndpoint;
    }

    public Content withDisRegion(String disRegion) {
        this.disRegion = disRegion;
        return this;
    }

    /** DIS Region，当setting_type为senior时填写
     * 
     * @return disRegion */
    public String getDisRegion() {
        return disRegion;
    }

    public void setDisRegion(String disRegion) {
        this.disRegion = disRegion;
    }

    public Content withDisSourceProjectId(String disSourceProjectId) {
        this.disSourceProjectId = disSourceProjectId;
        return this;
    }

    /** DIS源端项目id，当setting_type为senior时填写
     * 
     * @return disSourceProjectId */
    public String getDisSourceProjectId() {
        return disSourceProjectId;
    }

    public void setDisSourceProjectId(String disSourceProjectId) {
        this.disSourceProjectId = disSourceProjectId;
    }

    public Content withHl7Position(Hl7PositionEnum hl7Position) {
        this.hl7Position = hl7Position;
        return this;
    }

    /** HL7数据源方向 - source (源端) - target (目标端)
     * 
     * @return hl7Position */
    public Hl7PositionEnum getHl7Position() {
        return hl7Position;
    }

    public void setHl7Position(Hl7PositionEnum hl7Position) {
        this.hl7Position = hl7Position;
    }

    public Content withHl7WhitelistEnable(Boolean hl7WhitelistEnable) {
        this.hl7WhitelistEnable = hl7WhitelistEnable;
        return this;
    }

    /** HL7是否开启白名单设置
     * 
     * @return hl7WhitelistEnable */
    public Boolean getHl7WhitelistEnable() {
        return hl7WhitelistEnable;
    }

    public void setHl7WhitelistEnable(Boolean hl7WhitelistEnable) {
        this.hl7WhitelistEnable = hl7WhitelistEnable;
    }

    public Content withHl7Whitelist(String hl7Whitelist) {
        this.hl7Whitelist = hl7Whitelist;
        return this;
    }

    /** HL7白名单 - 允许同步数据到源端HL7的服务器地址，当HL7为源端（position为source）并且开启白名单设置(open_whitelist为true)时填写
     * 
     * @return hl7Whitelist */
    public String getHl7Whitelist() {
        return hl7Whitelist;
    }

    public void setHl7Whitelist(String hl7Whitelist) {
        this.hl7Whitelist = hl7Whitelist;
    }

    public Content withLdapSecurityAuthType(LdapSecurityAuthTypeEnum ldapSecurityAuthType) {
        this.ldapSecurityAuthType = ldapSecurityAuthType;
        return this;
    }

    /** LDAP安全认证类型
     * 
     * @return ldapSecurityAuthType */
    public LdapSecurityAuthTypeEnum getLdapSecurityAuthType() {
        return ldapSecurityAuthType;
    }

    public void setLdapSecurityAuthType(LdapSecurityAuthTypeEnum ldapSecurityAuthType) {
        this.ldapSecurityAuthType = ldapSecurityAuthType;
    }

    public Content withRabbitmqVirtualHost(String rabbitmqVirtualHost) {
        this.rabbitmqVirtualHost = rabbitmqVirtualHost;
        return this;
    }

    /** RABBITMQ虚拟主机
     * 
     * @return rabbitmqVirtualHost */
    public String getRabbitmqVirtualHost() {
        return rabbitmqVirtualHost;
    }

    public void setRabbitmqVirtualHost(String rabbitmqVirtualHost) {
        this.rabbitmqVirtualHost = rabbitmqVirtualHost;
    }

    public Content withRabbitmqSslProtocol(RabbitmqSslProtocolEnum rabbitmqSslProtocol) {
        this.rabbitmqSslProtocol = rabbitmqSslProtocol;
        return this;
    }

    /** RABBITMQ SSL认证协议 - TLS
     * 
     * @return rabbitmqSslProtocol */
    public RabbitmqSslProtocolEnum getRabbitmqSslProtocol() {
        return rabbitmqSslProtocol;
    }

    public void setRabbitmqSslProtocol(RabbitmqSslProtocolEnum rabbitmqSslProtocol) {
        this.rabbitmqSslProtocol = rabbitmqSslProtocol;
    }

    public Content withSapClient(String sapClient) {
        this.sapClient = sapClient;
        return this;
    }

    /** SAP客户端号
     * 
     * @return sapClient */
    public String getSapClient() {
        return sapClient;
    }

    public void setSapClient(String sapClient) {
        this.sapClient = sapClient;
    }

    public Content withSapSysnr(String sapSysnr) {
        this.sapSysnr = sapSysnr;
        return this;
    }

    /** SAP实例编号
     * 
     * @return sapSysnr */
    public String getSapSysnr() {
        return sapSysnr;
    }

    public void setSapSysnr(String sapSysnr) {
        this.sapSysnr = sapSysnr;
    }

    public Content withSnmpNetworkProtocol(SnmpNetworkProtocolEnum snmpNetworkProtocol) {
        this.snmpNetworkProtocol = snmpNetworkProtocol;
        return this;
    }

    /** SNMP网络协议 - udp - tcp
     * 
     * @return snmpNetworkProtocol */
    public SnmpNetworkProtocolEnum getSnmpNetworkProtocol() {
        return snmpNetworkProtocol;
    }

    public void setSnmpNetworkProtocol(SnmpNetworkProtocolEnum snmpNetworkProtocol) {
        this.snmpNetworkProtocol = snmpNetworkProtocol;
    }

    public Content withSnmpVersion(Integer snmpVersion) {
        this.snmpVersion = snmpVersion;
        return this;
    }

    /** SNMP版本号 minimum: 0 maximum: 3
     * 
     * @return snmpVersion */
    public Integer getSnmpVersion() {
        return snmpVersion;
    }

    public void setSnmpVersion(Integer snmpVersion) {
        this.snmpVersion = snmpVersion;
    }

    public Content withSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }

    /** SNMP团体名，用于访问SNMP管理代理的身份认证，相当于访问密码
     * 
     * @return snmpCommunity */
    public String getSnmpCommunity() {
        return snmpCommunity;
    }

    public void setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
    }

    public Content withIbmmqCcsId(String ibmmqCcsId) {
        this.ibmmqCcsId = ibmmqCcsId;
        return this;
    }

    /** IBMMQ字符集标识
     * 
     * @return ibmmqCcsId */
    public String getIbmmqCcsId() {
        return ibmmqCcsId;
    }

    public void setIbmmqCcsId(String ibmmqCcsId) {
        this.ibmmqCcsId = ibmmqCcsId;
    }

    public Content withIbmmqQueueManager(String ibmmqQueueManager) {
        this.ibmmqQueueManager = ibmmqQueueManager;
        return this;
    }

    /** IBMMQ队列管理器
     * 
     * @return ibmmqQueueManager */
    public String getIbmmqQueueManager() {
        return ibmmqQueueManager;
    }

    public void setIbmmqQueueManager(String ibmmqQueueManager) {
        this.ibmmqQueueManager = ibmmqQueueManager;
    }

    public Content withIbmmqChannel(String ibmmqChannel) {
        this.ibmmqChannel = ibmmqChannel;
        return this;
    }

    /** IBMMQ通道名称
     * 
     * @return ibmmqChannel */
    public String getIbmmqChannel() {
        return ibmmqChannel;
    }

    public void setIbmmqChannel(String ibmmqChannel) {
        this.ibmmqChannel = ibmmqChannel;
    }

    public Content withIbmmqCipherSuite(String ibmmqCipherSuite) {
        this.ibmmqCipherSuite = ibmmqCipherSuite;
        return this;
    }

    /** IBMMQ密钥算法套件
     * 
     * @return ibmmqCipherSuite */
    public String getIbmmqCipherSuite() {
        return ibmmqCipherSuite;
    }

    public void setIbmmqCipherSuite(String ibmmqCipherSuite) {
        this.ibmmqCipherSuite = ibmmqCipherSuite;
    }

    public Content withHdfsPath(String hdfsPath) {
        this.hdfsPath = hdfsPath;
        return this;
    }

    /** HDFS URL - 数据源为MRSHIVE、MRSHDFS、FIHDFS、FIHIVE类型时配置 - fihadfs (/fdi/autotest)
     * 
     * @return hdfsPath */
    public String getHdfsPath() {
        return hdfsPath;
    }

    public void setHdfsPath(String hdfsPath) {
        this.hdfsPath = hdfsPath;
    }

    public Content withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /** 机机交互用户名 - 数据源为MRSHIVE、MRSHDFS、MRSHBASE、MRSKAFKA、FIHDFS、FIHIVE、FIKAFKA类型时配置
     * 
     * @return principalName */
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public Content withConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }

    /** - 用户认证文件，文件获取方式参考《ROMA Connect API参考》的“附录>获取数据源配置文件”章节 -
     * 将获取到的文件打包成zip文件，文件名配置在config_file_name中，内容以BASE64编码形式放到config_file_content。 -
     * 数据源为MRSHIVE、MRSHDFS、MRSHBASE、MRSKAFKA、FIHDFS、FIHIVE、FIKAFKA类型时配置
     * 
     * @return configFileName */
    public String getConfigFileName() {
        return configFileName;
    }

    public void setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
    }

    public Content withConfigFileContent(String configFileContent) {
        this.configFileContent = configFileContent;
        return this;
    }

    /** - 用户认证文件内容，config_file_name对应的文件内容BASE64编码 - 数据源为MRSHIVE、MRSHDFS、MRSHBASE、MRSKAFKA、FIHDFS、FIHIVE、FIKAFKA类型时配置
     * 
     * @return configFileContent */
    public String getConfigFileContent() {
        return configFileContent;
    }

    public void setConfigFileContent(String configFileContent) {
        this.configFileContent = configFileContent;
    }

    public Content withConnectionInstanceId(String connectionInstanceId) {
        this.connectionInstanceId = connectionInstanceId;
        return this;
    }

    /** 连接器实例ID，连接器发布后对应的实例ID
     * 
     * @return connectionInstanceId */
    public String getConnectionInstanceId() {
        return connectionInstanceId;
    }

    public void setConnectionInstanceId(String connectionInstanceId) {
        this.connectionInstanceId = connectionInstanceId;
    }

    public Content withConnectorParams(Object connectorParams) {
        this.connectorParams = connectorParams;
        return this;
    }

    /** 连接器对应的数据源参数，值按实际填写
     * 
     * @return connectorParams */
    public Object getConnectorParams() {
        return connectorParams;
    }

    public void setConnectorParams(Object connectorParams) {
        this.connectorParams = connectorParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Content content = (Content) o;
        return Objects.equals(this.gauss100Version, content.gauss100Version) && Objects.equals(this.host, content.host)
            && Objects.equals(this.port, content.port) && Objects.equals(this.databaseName, content.databaseName)
            && Objects.equals(this.redisDatabase, content.redisDatabase)
            && Objects.equals(this.userName, content.userName) && Objects.equals(this.password, content.password)
            && Objects.equals(this.mode, content.mode) && Objects.equals(this.cdcMode, content.cdcMode)
            && Objects.equals(this.multiOracleAddress, content.multiOracleAddress)
            && Objects.equals(this.oracleServiceName, content.oracleServiceName)
            && Objects.equals(this.ftpConnectMode, content.ftpConnectMode)
            && Objects.equals(this.ftpProtocol, content.ftpProtocol) && Objects.equals(this.address, content.address)
            && Objects.equals(this.ak, content.ak) && Objects.equals(this.sk, content.sk)
            && Objects.equals(this.bucketName, content.bucketName) && Objects.equals(this.https, content.https)
            && Objects.equals(this.url, content.url) && Objects.equals(this.apiMethod, content.apiMethod)
            && Objects.equals(this.authMethod, content.authMethod)
            && Objects.equals(this.apiAuthDetail, content.apiAuthDetail) && Objects.equals(this.broker, content.broker)
            && Objects.equals(this.sslEnable, content.sslEnable)
            && Objects.equals(this.sslUsername, content.sslUsername)
            && Objects.equals(this.sslPassword, content.sslPassword)
            && Objects.equals(this.mongodbAuthSource, content.mongodbAuthSource)
            && Objects.equals(this.mongodbClusterEnable, content.mongodbClusterEnable)
            && Objects.equals(this.mongodbReplicaSet, content.mongodbReplicaSet)
            && Objects.equals(this.encoding, content.encoding)
            && Objects.equals(this.mysqlTimeout, content.mysqlTimeout)
            && Objects.equals(this.trustStorePassword, content.trustStorePassword)
            && Objects.equals(this.trustStore, content.trustStore)
            && Objects.equals(this.trustStoreFileType, content.trustStoreFileType)
            && Objects.equals(this.sslAuthMethod, content.sslAuthMethod)
            && Objects.equals(this.keyStore, content.keyStore)
            && Objects.equals(this.keyStoreFileType, content.keyStoreFileType)
            && Objects.equals(this.keyStorePassword, content.keyStorePassword)
            && Objects.equals(this.keyStoreKeyPassword, content.keyStoreKeyPassword)
            && Objects.equals(this.disTunnelName, content.disTunnelName)
            && Objects.equals(this.disDataType, content.disDataType)
            && Objects.equals(this.disSettingType, content.disSettingType)
            && Objects.equals(this.disEndpoint, content.disEndpoint)
            && Objects.equals(this.disRegion, content.disRegion)
            && Objects.equals(this.disSourceProjectId, content.disSourceProjectId)
            && Objects.equals(this.hl7Position, content.hl7Position)
            && Objects.equals(this.hl7WhitelistEnable, content.hl7WhitelistEnable)
            && Objects.equals(this.hl7Whitelist, content.hl7Whitelist)
            && Objects.equals(this.ldapSecurityAuthType, content.ldapSecurityAuthType)
            && Objects.equals(this.rabbitmqVirtualHost, content.rabbitmqVirtualHost)
            && Objects.equals(this.rabbitmqSslProtocol, content.rabbitmqSslProtocol)
            && Objects.equals(this.sapClient, content.sapClient) && Objects.equals(this.sapSysnr, content.sapSysnr)
            && Objects.equals(this.snmpNetworkProtocol, content.snmpNetworkProtocol)
            && Objects.equals(this.snmpVersion, content.snmpVersion)
            && Objects.equals(this.snmpCommunity, content.snmpCommunity)
            && Objects.equals(this.ibmmqCcsId, content.ibmmqCcsId)
            && Objects.equals(this.ibmmqQueueManager, content.ibmmqQueueManager)
            && Objects.equals(this.ibmmqChannel, content.ibmmqChannel)
            && Objects.equals(this.ibmmqCipherSuite, content.ibmmqCipherSuite)
            && Objects.equals(this.hdfsPath, content.hdfsPath)
            && Objects.equals(this.principalName, content.principalName)
            && Objects.equals(this.configFileName, content.configFileName)
            && Objects.equals(this.configFileContent, content.configFileContent)
            && Objects.equals(this.connectionInstanceId, content.connectionInstanceId)
            && Objects.equals(this.connectorParams, content.connectorParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gauss100Version,
            host,
            port,
            databaseName,
            redisDatabase,
            userName,
            password,
            mode,
            cdcMode,
            multiOracleAddress,
            oracleServiceName,
            ftpConnectMode,
            ftpProtocol,
            address,
            ak,
            sk,
            bucketName,
            https,
            url,
            apiMethod,
            authMethod,
            apiAuthDetail,
            broker,
            sslEnable,
            sslUsername,
            sslPassword,
            mongodbAuthSource,
            mongodbClusterEnable,
            mongodbReplicaSet,
            encoding,
            mysqlTimeout,
            trustStorePassword,
            trustStore,
            trustStoreFileType,
            sslAuthMethod,
            keyStore,
            keyStoreFileType,
            keyStorePassword,
            keyStoreKeyPassword,
            disTunnelName,
            disDataType,
            disSettingType,
            disEndpoint,
            disRegion,
            disSourceProjectId,
            hl7Position,
            hl7WhitelistEnable,
            hl7Whitelist,
            ldapSecurityAuthType,
            rabbitmqVirtualHost,
            rabbitmqSslProtocol,
            sapClient,
            sapSysnr,
            snmpNetworkProtocol,
            snmpVersion,
            snmpCommunity,
            ibmmqCcsId,
            ibmmqQueueManager,
            ibmmqChannel,
            ibmmqCipherSuite,
            hdfsPath,
            principalName,
            configFileName,
            configFileContent,
            connectionInstanceId,
            connectorParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Content {\n");
        sb.append("    gauss100Version: ").append(toIndentedString(gauss100Version)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    redisDatabase: ").append(toIndentedString(redisDatabase)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    cdcMode: ").append(toIndentedString(cdcMode)).append("\n");
        sb.append("    multiOracleAddress: ").append(toIndentedString(multiOracleAddress)).append("\n");
        sb.append("    oracleServiceName: ").append(toIndentedString(oracleServiceName)).append("\n");
        sb.append("    ftpConnectMode: ").append(toIndentedString(ftpConnectMode)).append("\n");
        sb.append("    ftpProtocol: ").append(toIndentedString(ftpProtocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
        sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
        sb.append("    apiAuthDetail: ").append(toIndentedString(apiAuthDetail)).append("\n");
        sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    sslUsername: ").append(toIndentedString(sslUsername)).append("\n");
        sb.append("    sslPassword: ").append(toIndentedString(sslPassword)).append("\n");
        sb.append("    mongodbAuthSource: ").append(toIndentedString(mongodbAuthSource)).append("\n");
        sb.append("    mongodbClusterEnable: ").append(toIndentedString(mongodbClusterEnable)).append("\n");
        sb.append("    mongodbReplicaSet: ").append(toIndentedString(mongodbReplicaSet)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    mysqlTimeout: ").append(toIndentedString(mysqlTimeout)).append("\n");
        sb.append("    trustStorePassword: ").append(toIndentedString(trustStorePassword)).append("\n");
        sb.append("    trustStore: ").append(toIndentedString(trustStore)).append("\n");
        sb.append("    trustStoreFileType: ").append(toIndentedString(trustStoreFileType)).append("\n");
        sb.append("    sslAuthMethod: ").append(toIndentedString(sslAuthMethod)).append("\n");
        sb.append("    keyStore: ").append(toIndentedString(keyStore)).append("\n");
        sb.append("    keyStoreFileType: ").append(toIndentedString(keyStoreFileType)).append("\n");
        sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
        sb.append("    keyStoreKeyPassword: ").append(toIndentedString(keyStoreKeyPassword)).append("\n");
        sb.append("    disTunnelName: ").append(toIndentedString(disTunnelName)).append("\n");
        sb.append("    disDataType: ").append(toIndentedString(disDataType)).append("\n");
        sb.append("    disSettingType: ").append(toIndentedString(disSettingType)).append("\n");
        sb.append("    disEndpoint: ").append(toIndentedString(disEndpoint)).append("\n");
        sb.append("    disRegion: ").append(toIndentedString(disRegion)).append("\n");
        sb.append("    disSourceProjectId: ").append(toIndentedString(disSourceProjectId)).append("\n");
        sb.append("    hl7Position: ").append(toIndentedString(hl7Position)).append("\n");
        sb.append("    hl7WhitelistEnable: ").append(toIndentedString(hl7WhitelistEnable)).append("\n");
        sb.append("    hl7Whitelist: ").append(toIndentedString(hl7Whitelist)).append("\n");
        sb.append("    ldapSecurityAuthType: ").append(toIndentedString(ldapSecurityAuthType)).append("\n");
        sb.append("    rabbitmqVirtualHost: ").append(toIndentedString(rabbitmqVirtualHost)).append("\n");
        sb.append("    rabbitmqSslProtocol: ").append(toIndentedString(rabbitmqSslProtocol)).append("\n");
        sb.append("    sapClient: ").append(toIndentedString(sapClient)).append("\n");
        sb.append("    sapSysnr: ").append(toIndentedString(sapSysnr)).append("\n");
        sb.append("    snmpNetworkProtocol: ").append(toIndentedString(snmpNetworkProtocol)).append("\n");
        sb.append("    snmpVersion: ").append(toIndentedString(snmpVersion)).append("\n");
        sb.append("    snmpCommunity: ").append(toIndentedString(snmpCommunity)).append("\n");
        sb.append("    ibmmqCcsId: ").append(toIndentedString(ibmmqCcsId)).append("\n");
        sb.append("    ibmmqQueueManager: ").append(toIndentedString(ibmmqQueueManager)).append("\n");
        sb.append("    ibmmqChannel: ").append(toIndentedString(ibmmqChannel)).append("\n");
        sb.append("    ibmmqCipherSuite: ").append(toIndentedString(ibmmqCipherSuite)).append("\n");
        sb.append("    hdfsPath: ").append(toIndentedString(hdfsPath)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    configFileName: ").append(toIndentedString(configFileName)).append("\n");
        sb.append("    configFileContent: ").append(toIndentedString(configFileContent)).append("\n");
        sb.append("    connectionInstanceId: ").append(toIndentedString(connectionInstanceId)).append("\n");
        sb.append("    connectorParams: ").append(toIndentedString(connectorParams)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
