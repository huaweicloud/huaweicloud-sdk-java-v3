package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * httpserver配置信息
 */
public class HttpForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_id")
    
    private String certId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cn_name")
    
    private String cnName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sni_enable")
    
    private Boolean sniEnable;

    public HttpForwarding withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 用于接收满足规则条件数据的http服务器地址。
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
     * 证书id，通过证书上传接口上传证书获取Id
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
     * 当sni_enable为true时，此字段需要填写，当sni_enbale为false时，此字段默认为*
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
     * 需要https服务端和客户端都支持此功能，默认为false，设成true表明Https的客户端在发起请求时，需要携带cn_name；https服务端根据cn_name返回对应的证书；设为false可关闭此功能
     * @return sniEnable
     */
    public Boolean getSniEnable() {
        return sniEnable;
    }

    public void setSniEnable(Boolean sniEnable) {
        this.sniEnable = sniEnable;
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
        return Objects.equals(this.url, httpForwarding.url) &&
            Objects.equals(this.certId, httpForwarding.certId) &&
            Objects.equals(this.cnName, httpForwarding.cnName) &&
            Objects.equals(this.sniEnable, httpForwarding.sniEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, certId, cnName, sniEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpForwarding {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    sniEnable: ").append(toIndentedString(sniEnable)).append("\n");
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

