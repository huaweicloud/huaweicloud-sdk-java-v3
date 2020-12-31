package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.VpcHealthConfig;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 健康检查详情，仅VPC通道类型为2时有效。
 */
public class VpcHealthConfigInfo  {

    /**
     * 使用以下协议，对VPC中主机执行健康检查。
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");
        
        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");
        
        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("TCP", TCP);
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;
    /**
     * 健康检查时的请求方法
     */
    public static final class MethodEnum {

        
        /**
         * Enum GET for value: "GET"
         */
        public static final MethodEnum GET = new MethodEnum("GET");
        
        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final MethodEnum HEADER = new MethodEnum("HEADER");
        

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("HEADER", HEADER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MethodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MethodEnum(value);
            }
            return result;
        }

        public static MethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private MethodEnum method = MethodEnum.GET;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold_normal")
    
    private Integer thresholdNormal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold_abnormal")
    
    private Integer thresholdAbnormal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_interval")
    
    private Integer timeInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_code")
    
    private String httpCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_client_ssl")
    
    private Boolean enableClientSsl = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_channel_id")
    
    private String vpcChannelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;

    public VpcHealthConfigInfo withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 使用以下协议，对VPC中主机执行健康检查。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public VpcHealthConfigInfo withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 健康检查时的目标路径。protocol = http时必选
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VpcHealthConfigInfo withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    


    /**
     * 健康检查时的请求方法
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public VpcHealthConfigInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 健康检查的目标端口，缺省时为VPC中主机的端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VpcHealthConfigInfo withThresholdNormal(Integer thresholdNormal) {
        this.thresholdNormal = thresholdNormal;
        return this;
    }

    


    /**
     * 正常阈值。判定VPC通道中主机正常的依据为：连续检查x成功，x为您设置的正常阈值。
     * @return thresholdNormal
     */
    public Integer getThresholdNormal() {
        return thresholdNormal;
    }

    public void setThresholdNormal(Integer thresholdNormal) {
        this.thresholdNormal = thresholdNormal;
    }

    public VpcHealthConfigInfo withThresholdAbnormal(Integer thresholdAbnormal) {
        this.thresholdAbnormal = thresholdAbnormal;
        return this;
    }

    


    /**
     * 异常阙值。判定VPC通道中主机异常的依据为：连续检查x失败，x为您设置的异常阈值。
     * @return thresholdAbnormal
     */
    public Integer getThresholdAbnormal() {
        return thresholdAbnormal;
    }

    public void setThresholdAbnormal(Integer thresholdAbnormal) {
        this.thresholdAbnormal = thresholdAbnormal;
    }

    public VpcHealthConfigInfo withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    


    /**
     * 间隔时间：连续两次检查的间隔时间，单位为秒。必须大于timeout字段取值。
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public VpcHealthConfigInfo withHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    


    /**
     * 检查目标HTTP响应时，判断成功使用的HTTP响应码。取值范围为100到599之前的任意整数值，支持如下三种格式： - 多个值，如：200,201,202 - 一系列值，如：200-299 - 组合值，如：201,202,210-299 protocol = http时必选
     * @return httpCode
     */
    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    public VpcHealthConfigInfo withEnableClientSsl(Boolean enableClientSsl) {
        this.enableClientSsl = enableClientSsl;
        return this;
    }

    


    /**
     * 是否开启双向认证。若开启，则使用实例配置中的backend_client_certificate配置项的证书
     * @return enableClientSsl
     */
    public Boolean getEnableClientSsl() {
        return enableClientSsl;
    }

    public void setEnableClientSsl(Boolean enableClientSsl) {
        this.enableClientSsl = enableClientSsl;
    }

    public VpcHealthConfigInfo withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 超时时间：检查期间，无响应的时间，单位为秒。必须小于time_interval字段取值。
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public VpcHealthConfigInfo withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    


    /**
     * VPC通道的编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public VpcHealthConfigInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 健康检查的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VpcHealthConfigInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcHealthConfigInfo vpcHealthConfigInfo = (VpcHealthConfigInfo) o;
        return Objects.equals(this.protocol, vpcHealthConfigInfo.protocol) &&
            Objects.equals(this.path, vpcHealthConfigInfo.path) &&
            Objects.equals(this.method, vpcHealthConfigInfo.method) &&
            Objects.equals(this.port, vpcHealthConfigInfo.port) &&
            Objects.equals(this.thresholdNormal, vpcHealthConfigInfo.thresholdNormal) &&
            Objects.equals(this.thresholdAbnormal, vpcHealthConfigInfo.thresholdAbnormal) &&
            Objects.equals(this.timeInterval, vpcHealthConfigInfo.timeInterval) &&
            Objects.equals(this.httpCode, vpcHealthConfigInfo.httpCode) &&
            Objects.equals(this.enableClientSsl, vpcHealthConfigInfo.enableClientSsl) &&
            Objects.equals(this.timeout, vpcHealthConfigInfo.timeout) &&
            Objects.equals(this.vpcChannelId, vpcHealthConfigInfo.vpcChannelId) &&
            Objects.equals(this.id, vpcHealthConfigInfo.id) &&
            Objects.equals(this.createTime, vpcHealthConfigInfo.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol, path, method, port, thresholdNormal, thresholdAbnormal, timeInterval, httpCode, enableClientSsl, timeout, vpcChannelId, id, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcHealthConfigInfo {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    thresholdNormal: ").append(toIndentedString(thresholdNormal)).append("\n");
        sb.append("    thresholdAbnormal: ").append(toIndentedString(thresholdAbnormal)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
        sb.append("    enableClientSsl: ").append(toIndentedString(enableClientSsl)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

