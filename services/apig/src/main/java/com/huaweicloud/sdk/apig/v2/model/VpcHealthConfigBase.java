package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 健康检查详情。
 */
public class VpcHealthConfigBase {

    /**
     * 使用以下协议，对VPC中主机执行健康检查： - TCP - HTTP - HTTPS
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof ProtocolEnum) {
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
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

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
         * Enum HEAD for value: "HEAD"
         */
        public static final MethodEnum HEAD = new MethodEnum("HEAD");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("HEAD", HEAD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MethodEnum(value);
            }
            return result;
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof MethodEnum) {
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
    @JsonProperty(value = "method")

    private MethodEnum method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_normal")

    private Integer thresholdNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_abnormal")

    private Integer thresholdAbnormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_code")

    private String httpCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_client_ssl")

    private Boolean enableClientSsl;

    /**
     * 健康检查状态   - 1：可用   - 2：不可用
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public VpcHealthConfigBase withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 使用以下协议，对VPC中主机执行健康检查： - TCP - HTTP - HTTPS
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public VpcHealthConfigBase withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 健康检查时的目标路径。protocol = http或https时必选
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VpcHealthConfigBase withMethod(MethodEnum method) {
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

    public VpcHealthConfigBase withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 健康检查的目标端口，缺少或port = 0时为VPC中主机的端口号。  若此端口存在非0值，则使用此端口进行健康检查。
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VpcHealthConfigBase withThresholdNormal(Integer thresholdNormal) {
        this.thresholdNormal = thresholdNormal;
        return this;
    }

    /**
     * 正常阈值。判定VPC通道中主机正常的依据为：连续检查x成功，x为您设置的正常阈值。
     * minimum: 2
     * maximum: 10
     * @return thresholdNormal
     */
    public Integer getThresholdNormal() {
        return thresholdNormal;
    }

    public void setThresholdNormal(Integer thresholdNormal) {
        this.thresholdNormal = thresholdNormal;
    }

    public VpcHealthConfigBase withThresholdAbnormal(Integer thresholdAbnormal) {
        this.thresholdAbnormal = thresholdAbnormal;
        return this;
    }

    /**
     * 异常阈值。判定VPC通道中主机异常的依据为：连续检查x失败，x为您设置的异常阈值。
     * minimum: 2
     * maximum: 10
     * @return thresholdAbnormal
     */
    public Integer getThresholdAbnormal() {
        return thresholdAbnormal;
    }

    public void setThresholdAbnormal(Integer thresholdAbnormal) {
        this.thresholdAbnormal = thresholdAbnormal;
    }

    public VpcHealthConfigBase withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 间隔时间：连续两次检查的间隔时间，单位为秒。必须大于timeout字段取值。
     * minimum: 5
     * maximum: 300
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public VpcHealthConfigBase withHttpCode(String httpCode) {
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

    public VpcHealthConfigBase withEnableClientSsl(Boolean enableClientSsl) {
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

    public VpcHealthConfigBase withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 健康检查状态   - 1：可用   - 2：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcHealthConfigBase vpcHealthConfigBase = (VpcHealthConfigBase) o;
        return Objects.equals(this.protocol, vpcHealthConfigBase.protocol)
            && Objects.equals(this.path, vpcHealthConfigBase.path)
            && Objects.equals(this.method, vpcHealthConfigBase.method)
            && Objects.equals(this.port, vpcHealthConfigBase.port)
            && Objects.equals(this.thresholdNormal, vpcHealthConfigBase.thresholdNormal)
            && Objects.equals(this.thresholdAbnormal, vpcHealthConfigBase.thresholdAbnormal)
            && Objects.equals(this.timeInterval, vpcHealthConfigBase.timeInterval)
            && Objects.equals(this.httpCode, vpcHealthConfigBase.httpCode)
            && Objects.equals(this.enableClientSsl, vpcHealthConfigBase.enableClientSsl)
            && Objects.equals(this.status, vpcHealthConfigBase.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol,
            path,
            method,
            port,
            thresholdNormal,
            thresholdAbnormal,
            timeInterval,
            httpCode,
            enableClientSsl,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcHealthConfigBase {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    thresholdNormal: ").append(toIndentedString(thresholdNormal)).append("\n");
        sb.append("    thresholdAbnormal: ").append(toIndentedString(thresholdAbnormal)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
        sb.append("    enableClientSsl: ").append(toIndentedString(enableClientSsl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
