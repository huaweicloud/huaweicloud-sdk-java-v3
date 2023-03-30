package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * httpserver配置信息
 */
public class HttpForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_name")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni_enable")

    private Boolean sniEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_enable")

    private Boolean signatureEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public HttpForwarding withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数说明**：用于接收满足规则条件数据的http服务器地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpForwarding withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * **参数说明**：证书id，请参见[[加载推送证书第3步](https://support.huaweicloud.com/usermanual-iothub/iot_01_0001.html#section3)](tag:hws)[[加载推送证书第3步](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_0001.html#section3)](tag:hws_hk)获取证书ID
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public HttpForwarding withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * **参数说明**：当sni_enable为true时，此字段需要填写，内容为将要请求的服务端证书的域名,举例:domain:8443;当sni_enbale为false时，此字段默认不填写。
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public HttpForwarding withSniEnable(Boolean sniEnable) {
        this.sniEnable = sniEnable;
        return this;
    }

    /**
     * **参数说明**：需要https服务端和客户端都支持此功能，默认为false，设成true表明Https的客户端在发起请求时，需要携带cn_name；https服务端根据cn_name返回对应的证书；设为false可关闭此功能。
     * @return sniEnable
     */
    public Boolean getSniEnable() {
        return sniEnable;
    }

    public void setSniEnable(Boolean sniEnable) {
        this.sniEnable = sniEnable;
    }

    public HttpForwarding withSignatureEnable(Boolean signatureEnable) {
        this.signatureEnable = signatureEnable;
        return this;
    }

    /**
     * **参数说明**：是否启用签名。填写token时， 该参数必须为true， token才可以生效，否则token不生效。推荐设置成true，使用token签名验证消息是否来自平台。
     * @return signatureEnable
     */
    public Boolean getSignatureEnable() {
        return signatureEnable;
    }

    public void setSignatureEnable(Boolean signatureEnable) {
        this.signatureEnable = signatureEnable;
    }

    public HttpForwarding withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数说明**：用作生成签名的Token，客户端可以使用该token按照规则生成签名并与推送消息中携带的签名做对比， 从而验证安全性。**取值范围**: 长度不超过32， 不小于3， 只允许字母、数字的组合。请参见[[HTTP/HTTPS推送基于Token认证物联网平台](https://support.huaweicloud.com/usermanual-iothub/iot_01_0001.html#section6)](tag:hws)[[HTTP/HTTPS推送基于Token认证物联网平台](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_0001.html#section6)](tag:hws_hk)
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpForwarding httpForwarding = (HttpForwarding) o;
        return Objects.equals(this.url, httpForwarding.url) && Objects.equals(this.certId, httpForwarding.certId)
            && Objects.equals(this.cnName, httpForwarding.cnName)
            && Objects.equals(this.sniEnable, httpForwarding.sniEnable)
            && Objects.equals(this.signatureEnable, httpForwarding.signatureEnable)
            && Objects.equals(this.token, httpForwarding.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, certId, cnName, sniEnable, signatureEnable, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpForwarding {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    sniEnable: ").append(toIndentedString(sniEnable)).append("\n");
        sb.append("    signatureEnable: ").append(toIndentedString(signatureEnable)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
