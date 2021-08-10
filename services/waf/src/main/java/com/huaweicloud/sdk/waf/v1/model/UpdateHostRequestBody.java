package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    private List<PremiumWafServer> server = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    private String tls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher")

    private String cipher;

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

    /** 证书ID
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

    /** 证书名称
     * 
     * @return certificatename */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    public UpdateHostRequestBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    public UpdateHostRequestBody addServerItem(PremiumWafServer serverItem) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public UpdateHostRequestBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if (this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /** 独享模式回源服务器配置
     * 
     * @return server */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    public UpdateHostRequestBody withTls(String tls) {
        this.tls = tls;
        return this;
    }

    /** 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）
     * 
     * @return tls */
    public String getTls() {
        return tls;
    }

    public void setTls(String tls) {
        this.tls = tls;
    }

    public UpdateHostRequestBody withCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }

    /** 加密套件代码（cipher_default/cipher_1/cipher_2）
     * 
     * @return cipher */
    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
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
