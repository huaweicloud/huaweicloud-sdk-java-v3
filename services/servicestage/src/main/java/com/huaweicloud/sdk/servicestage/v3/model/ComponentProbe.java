package com.huaweicloud.sdk.servicestage.v3.model;

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

/**
 * ComponentProbe
 */
public class ComponentProbe {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum HTTP for value: "http"
         */
        public static final TypeEnum HTTP = new TypeEnum("http");

        /**
         * Enum TCP for value: "tcp"
         */
        public static final TypeEnum TCP = new TypeEnum("tcp");

        /**
         * Enum COMMAND for value: "command"
         */
        public static final TypeEnum COMMAND = new TypeEnum("command");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("tcp", TCP);
            map.put("command", COMMAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    /**
     * type为http类型时生效
     */
    public static final class SchemeEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final SchemeEnum HTTP = new SchemeEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final SchemeEnum HTTPS = new SchemeEnum("HTTPS");

        private static final Map<String, SchemeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemeEnum> createStaticFields() {
            Map<String, SchemeEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemeEnum(String value) {
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
        public static SchemeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SchemeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SchemeEnum(value);
            }
            return result;
        }

        public static SchemeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SchemeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemeEnum) {
                return this.value.equals(((SchemeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private SchemeEnum scheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_seconds")

    private Integer periodSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_threshold")

    private Integer successThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_threshold")

    private Integer failureThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_headers")

    private List<ComponentConfigEnvs> httpHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    public ComponentProbe withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ComponentProbe withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 表示启动后多久开始探测
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public ComponentProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 表示探测超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ComponentProbe withScheme(SchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * type为http类型时生效
     * @return scheme
     */
    public SchemeEnum getScheme() {
        return scheme;
    }

    public void setScheme(SchemeEnum scheme) {
        this.scheme = scheme;
    }

    public ComponentProbe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * 表示检测周期
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public ComponentProbe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * 表示成功阈值
     * @return successThreshold
     */
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public ComponentProbe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * 表示最大失败次数
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public ComponentProbe withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * type为http类型时生效。默认为POD的IP, 可以指定自定义的IP
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ComponentProbe withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * type为http和tcp类型时生效。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ComponentProbe withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * type为http类型时生效。请求路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ComponentProbe withHttpHeaders(List<ComponentConfigEnvs> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public ComponentProbe addHttpHeadersItem(ComponentConfigEnvs httpHeadersItem) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new ArrayList<>();
        }
        this.httpHeaders.add(httpHeadersItem);
        return this;
    }

    public ComponentProbe withHttpHeaders(Consumer<List<ComponentConfigEnvs>> httpHeadersSetter) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new ArrayList<>();
        }
        httpHeadersSetter.accept(this.httpHeaders);
        return this;
    }

    /**
     * Get httpHeaders
     * @return httpHeaders
     */
    public List<ComponentConfigEnvs> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(List<ComponentConfigEnvs> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public ComponentProbe withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public ComponentProbe addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public ComponentProbe withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * type为command类型时生效。命令列表
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentProbe componentProbe = (ComponentProbe) o;
        return Objects.equals(this.type, componentProbe.type) && Objects.equals(this.delay, componentProbe.delay)
            && Objects.equals(this.timeout, componentProbe.timeout)
            && Objects.equals(this.scheme, componentProbe.scheme)
            && Objects.equals(this.periodSeconds, componentProbe.periodSeconds)
            && Objects.equals(this.successThreshold, componentProbe.successThreshold)
            && Objects.equals(this.failureThreshold, componentProbe.failureThreshold)
            && Objects.equals(this.host, componentProbe.host) && Objects.equals(this.port, componentProbe.port)
            && Objects.equals(this.path, componentProbe.path)
            && Objects.equals(this.httpHeaders, componentProbe.httpHeaders)
            && Objects.equals(this.command, componentProbe.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            delay,
            timeout,
            scheme,
            periodSeconds,
            successThreshold,
            failureThreshold,
            host,
            port,
            path,
            httpHeaders,
            command);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentProbe {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
        sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
        sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
