package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CreateDestinationRequestBody */
public class CreateDestinationRequestBody {

    /** 操作类型，枚举值:0-目标端为本ROMA实例内MQS，； 7-目标端为设备 */
    public static final class DestinationTypeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final DestinationTypeEnum NUMBER_0 = new DestinationTypeEnum(0);

        /** Enum NUMBER_7 for value: 7 */
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

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_name")

    private String destinationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqs_sasl_ssl")

    private Boolean mqsSaslSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public CreateDestinationRequestBody withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /** 操作类型，枚举值:0-目标端为本ROMA实例内MQS，； 7-目标端为设备 minimum: 0 maximum: 10
     * 
     * @return destinationType */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public CreateDestinationRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用ID，目标端为0时需明确对方的APP_ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateDestinationRequestBody withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /** 目标数据源名称
     * 
     * @return destinationName */
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public CreateDestinationRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** 目标数据源主题，从MQS服务中获取已有topic
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CreateDestinationRequestBody withServer(String server) {
        this.server = server;
        return this;
    }

    /** 目标端数据源服务，连接地址
     * 
     * @return server */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public CreateDestinationRequestBody withToken(String token) {
        this.token = token;
        return this;
    }

    /** 目标端数据源token
     * 
     * @return token */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreateDestinationRequestBody withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 目标数据源标签
     * 
     * @return tag */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CreateDestinationRequestBody withMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
        return this;
    }

    /** 目标端数据源MQS的SASL字段是否需要支持SSL加密
     * 
     * @return mqsSaslSsl */
    public Boolean getMqsSaslSsl() {
        return mqsSaslSsl;
    }

    public void setMqsSaslSsl(Boolean mqsSaslSsl) {
        this.mqsSaslSsl = mqsSaslSsl;
    }

    public CreateDestinationRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 目标数据源用户名
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateDestinationRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /** 目标数据源密码
     * 
     * @return password */
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
        CreateDestinationRequestBody createDestinationRequestBody = (CreateDestinationRequestBody) o;
        return Objects.equals(this.destinationType, createDestinationRequestBody.destinationType)
            && Objects.equals(this.appId, createDestinationRequestBody.appId)
            && Objects.equals(this.destinationName, createDestinationRequestBody.destinationName)
            && Objects.equals(this.topic, createDestinationRequestBody.topic)
            && Objects.equals(this.server, createDestinationRequestBody.server)
            && Objects.equals(this.token, createDestinationRequestBody.token)
            && Objects.equals(this.tag, createDestinationRequestBody.tag)
            && Objects.equals(this.mqsSaslSsl, createDestinationRequestBody.mqsSaslSsl)
            && Objects.equals(this.userName, createDestinationRequestBody.userName)
            && Objects.equals(this.password, createDestinationRequestBody.password);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(destinationType, appId, destinationName, topic, server, token, tag, mqsSaslSsl, userName, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDestinationRequestBody {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
