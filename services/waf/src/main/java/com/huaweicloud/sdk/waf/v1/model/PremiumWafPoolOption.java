package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ELB实例组额外选项
 */
public class PremiumWafPoolOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body_limit")
    
    private Integer bodyLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="header_limit")
    
    private Integer headerLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connect_timeout")
    
    private Integer connectTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="send_timeout")
    
    private Integer sendTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="read_timeout")
    
    private Integer readTimeout;

    public PremiumWafPoolOption withBodyLimit(Integer bodyLimit) {
        this.bodyLimit = bodyLimit;
        return this;
    }

    


    /**
     * body限制值
     * minimum: 2000
     * maximum: 8000
     * @return bodyLimit
     */
    public Integer getBodyLimit() {
        return bodyLimit;
    }

    public void setBodyLimit(Integer bodyLimit) {
        this.bodyLimit = bodyLimit;
    }

    

    public PremiumWafPoolOption withHeaderLimit(Integer headerLimit) {
        this.headerLimit = headerLimit;
        return this;
    }

    


    /**
     * header限制值
     * minimum: 4000
     * maximum: 20000
     * @return headerLimit
     */
    public Integer getHeaderLimit() {
        return headerLimit;
    }

    public void setHeaderLimit(Integer headerLimit) {
        this.headerLimit = headerLimit;
    }

    

    public PremiumWafPoolOption withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    


    /**
     * 连接超时配置
     * minimum: 1
     * maximum: 20
     * @return connectTimeout
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    

    public PremiumWafPoolOption withSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
        return this;
    }

    


    /**
     * 发送超时配置
     * minimum: 1
     * maximum: 20
     * @return sendTimeout
     */
    public Integer getSendTimeout() {
        return sendTimeout;
    }

    public void setSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
    }

    

    public PremiumWafPoolOption withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    


    /**
     * 接收超时配置
     * minimum: 1
     * maximum: 20
     * @return readTimeout
     */
    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafPoolOption premiumWafPoolOption = (PremiumWafPoolOption) o;
        return Objects.equals(this.bodyLimit, premiumWafPoolOption.bodyLimit) &&
            Objects.equals(this.headerLimit, premiumWafPoolOption.headerLimit) &&
            Objects.equals(this.connectTimeout, premiumWafPoolOption.connectTimeout) &&
            Objects.equals(this.sendTimeout, premiumWafPoolOption.sendTimeout) &&
            Objects.equals(this.readTimeout, premiumWafPoolOption.readTimeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bodyLimit, headerLimit, connectTimeout, sendTimeout, readTimeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafPoolOption {\n");
        sb.append("    bodyLimit: ").append(toIndentedString(bodyLimit)).append("\n");
        sb.append("    headerLimit: ").append(toIndentedString(headerLimit)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    sendTimeout: ").append(toIndentedString(sendTimeout)).append("\n");
        sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
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

