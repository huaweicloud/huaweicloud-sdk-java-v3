package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.BlockPage;
import com.huaweicloud.sdk.waf.v1.model.PremiumWafServer;
import com.huaweicloud.sdk.waf.v1.model.TrafficMark;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改云模式域名的请求body
 */
public class UpdateInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    private Boolean proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificateid")
    
    private String certificateid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificatename")
    
    private String certificatename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private List<PremiumWafServer> server = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls")
    
    private String tls;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cipher")
    
    private String cipher;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_page")
    
    private BlockPage blockPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic_mark")
    
    private TrafficMark trafficMark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flag")
    
    private Map<String, String> flag = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend")
    
    private Map<String, String> extend = null;
    
    public UpdateInstanceRequestBody withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    


    /**
     * 是否使用代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    

    public UpdateInstanceRequestBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    


    /**
     * 证书ID
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    

    public UpdateInstanceRequestBody withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    


    /**
     * 证书名称
     * @return certificatename
     */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    

    public UpdateInstanceRequestBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    
    public UpdateInstanceRequestBody addServerItem(PremiumWafServer serverItem) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public UpdateInstanceRequestBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 独享模式回源服务器配置
     * @return server
     */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    

    public UpdateInstanceRequestBody withTls(String tls) {
        this.tls = tls;
        return this;
    }

    


    /**
     * 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）
     * @return tls
     */
    public String getTls() {
        return tls;
    }

    public void setTls(String tls) {
        this.tls = tls;
    }

    

    public UpdateInstanceRequestBody withCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }

    


    /**
     * 加密套件代码（cipher_default/cipher_1/cipher_2）
     * @return cipher
     */
    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    

    public UpdateInstanceRequestBody withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public UpdateInstanceRequestBody withBlockPage(Consumer<BlockPage> blockPageSetter) {
        if(this.blockPage == null ){
            this.blockPage = new BlockPage();
            blockPageSetter.accept(this.blockPage);
        }
        
        return this;
    }


    /**
     * Get blockPage
     * @return blockPage
     */
    public BlockPage getBlockPage() {
        return blockPage;
    }

    public void setBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
    }

    

    public UpdateInstanceRequestBody withTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public UpdateInstanceRequestBody withTrafficMark(Consumer<TrafficMark> trafficMarkSetter) {
        if(this.trafficMark == null ){
            this.trafficMark = new TrafficMark();
            trafficMarkSetter.accept(this.trafficMark);
        }
        
        return this;
    }


    /**
     * Get trafficMark
     * @return trafficMark
     */
    public TrafficMark getTrafficMark() {
        return trafficMark;
    }

    public void setTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
    }

    

    public UpdateInstanceRequestBody withFlag(Map<String, String> flag) {
        this.flag = flag;
        return this;
    }

    

    public UpdateInstanceRequestBody putFlagItem(String key, String flagItem) {
        if(this.flag == null) {
            this.flag = new HashMap<>();
        }
        this.flag.put(key, flagItem);
        return this;
    }

    public UpdateInstanceRequestBody withFlag(Consumer<Map<String, String>> flagSetter) {
        if(this.flag == null) {
            this.flag = new HashMap<>();
        }
        flagSetter.accept(this.flag);
        return this;
    }
    /**
     * 域名特殊标识
     * @return flag
     */
    public Map<String, String> getFlag() {
        return flag;
    }

    public void setFlag(Map<String, String> flag) {
        this.flag = flag;
    }

    

    public UpdateInstanceRequestBody withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    

    public UpdateInstanceRequestBody putExtendItem(String key, String extendItem) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdateInstanceRequestBody withExtend(Consumer<Map<String, String>> extendSetter) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }
    /**
     * 可扩展字段
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceRequestBody updateInstanceRequestBody = (UpdateInstanceRequestBody) o;
        return Objects.equals(this.proxy, updateInstanceRequestBody.proxy) &&
            Objects.equals(this.certificateid, updateInstanceRequestBody.certificateid) &&
            Objects.equals(this.certificatename, updateInstanceRequestBody.certificatename) &&
            Objects.equals(this.server, updateInstanceRequestBody.server) &&
            Objects.equals(this.tls, updateInstanceRequestBody.tls) &&
            Objects.equals(this.cipher, updateInstanceRequestBody.cipher) &&
            Objects.equals(this.blockPage, updateInstanceRequestBody.blockPage) &&
            Objects.equals(this.trafficMark, updateInstanceRequestBody.trafficMark) &&
            Objects.equals(this.flag, updateInstanceRequestBody.flag) &&
            Objects.equals(this.extend, updateInstanceRequestBody.extend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxy, certificateid, certificatename, server, tls, cipher, blockPage, trafficMark, flag, extend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequestBody {\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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

