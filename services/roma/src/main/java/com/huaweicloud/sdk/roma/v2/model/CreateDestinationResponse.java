package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateDestinationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_id")

    @JacksonXmlProperty(localName = "destination_id")

    private Integer destinationId;

    /**
     * 操作类型，枚举值:0-目标端为本ROMA实例内MQS； 7-目标端为设备
     */
    public static final class DestinationTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DestinationTypeEnum NUMBER_0 = new DestinationTypeEnum(0);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final DestinationTypeEnum NUMBER_7 = new DestinationTypeEnum(7);

        private static final Map<Integer, DestinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DestinationTypeEnum> createStaticFields() {
            Map<Integer, DestinationTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DestinationTypeEnum(Integer value) {
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
        public static DestinationTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            DestinationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DestinationTypeEnum(value);
            }
            return result;
        }

        public static DestinationTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            DestinationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    @JacksonXmlProperty(localName = "destination_type")

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_name")

    @JacksonXmlProperty(localName = "destination_name")

    private String destinationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    @JacksonXmlProperty(localName = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    @JacksonXmlProperty(localName = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqs_sasl_ssl")

    @JacksonXmlProperty(localName = "mqs_sasl_ssl")

    private Boolean mqsSaslSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    public CreateDestinationResponse withDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * 目标数据源ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return destinationId
     */
    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public CreateDestinationResponse withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 操作类型，枚举值:0-目标端为本ROMA实例内MQS； 7-目标端为设备
     * minimum: 0
     * maximum: 10
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public CreateDestinationResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID，目标端为0时需明确对方的APP_ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateDestinationResponse withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * 目标数据源名称
     * @return destinationName
     */
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public CreateDestinationResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 目标数据源主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CreateDestinationResponse withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * 目标端数据源服务
     * @return server
     */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public CreateDestinationResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 目标端数据源token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreateDestinationResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 目标数据源标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CreateDestinationResponse withMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
        return this;
    }

    /**
     * 目标端数据源MQS的SASL字段是否需要支持SSL加密
     * @return mqsSaslSsl
     */
    public Boolean getMqsSaslSsl() {
        return mqsSaslSsl;
    }

    public void setMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
    }

    public CreateDestinationResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 目标数据源用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateDestinationResponse withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 目标数据源密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDestinationResponse createDestinationResponse = (CreateDestinationResponse) o;
        return Objects.equals(this.destinationId, createDestinationResponse.destinationId)
            && Objects.equals(this.destinationType, createDestinationResponse.destinationType)
            && Objects.equals(this.appId, createDestinationResponse.appId)
            && Objects.equals(this.destinationName, createDestinationResponse.destinationName)
            && Objects.equals(this.topic, createDestinationResponse.topic)
            && Objects.equals(this.server, createDestinationResponse.server)
            && Objects.equals(this.token, createDestinationResponse.token)
            && Objects.equals(this.tag, createDestinationResponse.tag)
            && Objects.equals(this.mqsSaslSsl, createDestinationResponse.mqsSaslSsl)
            && Objects.equals(this.userName, createDestinationResponse.userName)
            && Objects.equals(this.password, createDestinationResponse.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationId,
            destinationType,
            appId,
            destinationName,
            topic,
            server,
            token,
            tag,
            mqsSaslSsl,
            userName,
            password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDestinationResponse {\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    mqsSaslSsl: ").append(toIndentedString(mqsSaslSsl)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
