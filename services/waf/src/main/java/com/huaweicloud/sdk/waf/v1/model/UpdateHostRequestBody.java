package com.huaweicloud.sdk.waf.v1.model;

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

/** 修改云模式域名的请求体 */
public class UpdateHostRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private Boolean proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateid")

    private String certificateid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificatename")

    private String certificatename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private List<UpdateCloudWafServer> server = null;

    /** 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本 */
    public static final class TlsEnum {

        /** Enum TLS_V1_0 for value: "TLS v1.0" */
        public static final TlsEnum TLS_V1_0 = new TlsEnum("TLS v1.0");

        /** Enum TLS_V1_1 for value: "TLS v1.1" */
        public static final TlsEnum TLS_V1_1 = new TlsEnum("TLS v1.1");

        /** Enum TLS_V1_2 for value: "TLS v1.2" */
        public static final TlsEnum TLS_V1_2 = new TlsEnum("TLS v1.2");

        /** Enum TLS_V1_3 for value: "TLS v1.3" */
        public static final TlsEnum TLS_V1_3 = new TlsEnum("TLS v1.3");

        private static final Map<String, TlsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TlsEnum> createStaticFields() {
            Map<String, TlsEnum> map = new HashMap<>();
            map.put("TLS v1.0", TLS_V1_0);
            map.put("TLS v1.1", TLS_V1_1);
            map.put("TLS v1.2", TLS_V1_2);
            map.put("TLS v1.3", TLS_V1_3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TlsEnum(String value) {
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
        public static TlsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TlsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TlsEnum(value);
            }
            return result;
        }

        public static TlsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TlsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TlsEnum) {
                return this.value.equals(((TlsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    private TlsEnum tls;

    /** 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）： cipher_1：
     * 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH
     * cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM
     * cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH
     * cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH
     * cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM */
    public static final class CipherEnum {

        /** Enum CIPHER_1 for value: "cipher_1" */
        public static final CipherEnum CIPHER_1 = new CipherEnum("cipher_1");

        /** Enum CIPHER_2 for value: "cipher_2" */
        public static final CipherEnum CIPHER_2 = new CipherEnum("cipher_2");

        /** Enum CIPHER_3 for value: "cipher_3" */
        public static final CipherEnum CIPHER_3 = new CipherEnum("cipher_3");

        /** Enum CIPHER_4 for value: "cipher_4" */
        public static final CipherEnum CIPHER_4 = new CipherEnum("cipher_4");

        /** Enum CIPHER_DEFAULT for value: "cipher_default" */
        public static final CipherEnum CIPHER_DEFAULT = new CipherEnum("cipher_default");

        private static final Map<String, CipherEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CipherEnum> createStaticFields() {
            Map<String, CipherEnum> map = new HashMap<>();
            map.put("cipher_1", CIPHER_1);
            map.put("cipher_2", CIPHER_2);
            map.put("cipher_3", CIPHER_3);
            map.put("cipher_4", CIPHER_4);
            map.put("cipher_default", CIPHER_DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CipherEnum(String value) {
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
        public static CipherEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CipherEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CipherEnum(value);
            }
            return result;
        }

        public static CipherEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CipherEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CipherEnum) {
                return this.value.equals(((CipherEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher")

    private CipherEnum cipher;

    public UpdateHostRequestBody withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /** 是否使用代理
     * 
     * @return proxy */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    public UpdateHostRequestBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    /** 证书id,在对外协议为https的场景下可以使用，可以通过查询证书列表（ListCertificates）接口查询证书id
     * 
     * @return certificateid */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public UpdateHostRequestBody withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    /** 证书名称,在对外协议为https的场景下可以使用，可以在页面上获取的证书名称，或通过查询证书列表（ListCertificates）接口获取证书名称
     * 
     * @return certificatename */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public UpdateHostRequestBody withServer(List<UpdateCloudWafServer> server) {
        this.server = server;
        return this;
    }

    public UpdateHostRequestBody addServerItem(UpdateCloudWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public UpdateHostRequestBody withServer(Consumer<List<UpdateCloudWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /** 独享模式回源服务器配置
     * 
     * @return server */
    public List<UpdateCloudWafServer> getServer() {
        return server;
    }

    public void setServer(List<UpdateCloudWafServer> server) {
        this.server = server;
    }

    public UpdateHostRequestBody withTls(TlsEnum tls) {
        this.tls = tls;
        return this;
    }

    /** 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本
     * 
     * @return tls */
    public TlsEnum getTls() {
        return tls;
    }

    public void setTls(TlsEnum tls) {
        this.tls = tls;
    }

    public UpdateHostRequestBody withCipher(CipherEnum cipher) {
        this.cipher = cipher;
        return this;
    }

    /** 加密套件（cipher_1，cipher_2，cipher_3，cipher_4，cipher_default）： cipher_1：
     * 加密算法为ECDHE-ECDSA-AES256-GCM-SHA384:HIGH:!MEDIUM:!LOW:!aNULL:!eNULL:!DES:!MD5:!PSK:!RC4:!kRSA:!SRP:!3DES:!DSS:!EXP:!CAMELLIA:@STRENGTH
     * cipher_2：加密算法为EECDH+AESGCM:EDH+AESGCM
     * cipher_3：加密算法为ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES256-SHA384:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH
     * cipher_4：加密算法为ECDHE-RSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!EDH
     * cipher_default： 加密算法为ECDHE-RSA-AES256-SHA384:AES256-SHA256:RC4:HIGH:!MD5:!aNULL:!eNULL:!NULL:!DH:!EDH:!AESGCM
     * 
     * @return cipher */
    public CipherEnum getCipher() {
        return cipher;
    }

    public void setCipher(CipherEnum cipher) {
        this.cipher = cipher;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHostRequestBody updateHostRequestBody = (UpdateHostRequestBody) o;
        return Objects.equals(this.proxy, updateHostRequestBody.proxy)
            && Objects.equals(this.certificateid, updateHostRequestBody.certificateid)
            && Objects.equals(this.certificatename, updateHostRequestBody.certificatename)
            && Objects.equals(this.server, updateHostRequestBody.server)
            && Objects.equals(this.tls, updateHostRequestBody.tls)
            && Objects.equals(this.cipher, updateHostRequestBody.cipher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxy, certificateid, certificatename, server, tls, cipher);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostRequestBody {\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
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
