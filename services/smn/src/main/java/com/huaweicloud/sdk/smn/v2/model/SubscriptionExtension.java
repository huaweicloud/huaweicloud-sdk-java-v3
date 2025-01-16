package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubscriptionExtension
 */
public class SubscriptionExtension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_secret")

    private String signSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private Map<String, String> header = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_secret")

    private String appSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_code")

    private String robotCode;

    public SubscriptionExtension withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 这是应用ID字段。当protocol值为welink时，该字段为必填字段，从welink方获取。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public SubscriptionExtension withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * 该字段为应用secret字段。当protocol值为welink时，该字段为必填字段，从welink方获取。
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public SubscriptionExtension withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 该字段为关键字字段。当protocol值为feishu时，这里的keyword字段和sign_secret字段二者必选其一。当用户在飞书或钉钉自定义机器人端添加关键字校验的安全策略时，这里的关键字必须是飞书或钉钉自定义机器人中所填写的关键字之一。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public SubscriptionExtension withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /**
     * 这是加签密钥字段。当protocol协议为feishu时，这个字段和keyword字段二者必选且只能选其一。密钥配置必须与客户在飞书或钉钉自定义机器人的密钥配置完全一致。例如，如果在飞书端配置了密钥并且没有配置关键字，则在此处填入从飞书获取的密钥字段，如果在飞书端没有配置密钥并且配置了关键字，则不填写该字段。
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public SubscriptionExtension withHeader(Map<String, String> header) {
        this.header = header;
        return this;
    }

    public SubscriptionExtension putHeaderItem(String key, String headerItem) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        this.header.put(key, headerItem);
        return this;
    }

    public SubscriptionExtension withHeader(Consumer<Map<String, String>> headerSetter) {
        if (this.header == null) {
            this.header = new HashMap<>();
        }
        headerSetter.accept(this.header);
        return this;
    }

    /**
     * 该字段为http header字段，用户可以在字段限制范围内自定义http header，header字段内容以KV对形式存在。当使用主题发送时，已确认的订阅发送消息会携带用户自定义的http header。 header应满足如下要求： key值限定为：包含英文字母([A-Za-z])、数字([0-9])、中划线(-)hyphens，中划线不得作为结尾，不得连续出现。 K/V不得超过10个 key需要以\"x-\"开头，不能以\"x-smn\"开头，正确示例：x-abc-cba, x-abc 所有K/V长度总和不得超过1024个字符 key不区分大小写 key值不可重复 value值限定为ASCII码，不支持中文或其他Unicode，支持空格
     * @return header
     */
    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public SubscriptionExtension withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 个人钉钉appKey字段，字符长度限制64个，仅支持字母、数字、中划线(-)、下划线(_)。当订阅协议为dingTalkBot时，该字段必选。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public SubscriptionExtension withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 个人钉钉appSecret字段，字符长度限制128个，仅支持字母、数字、中划线(-)、下划线(_)。当订阅协议为dingTalkBot时，该字段必选。
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public SubscriptionExtension withRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }

    /**
     * 个人钉钉robotCode字段，名称：机器人编码，字符长度限制64个，仅支持字母、数字、中划线(-)、下划线(_)，一般与appKey一致。当订阅协议为dingTalkBot时，该字段必选。
     * @return robotCode
     */
    public String getRobotCode() {
        return robotCode;
    }

    public void setRobotCode(String robotCode) {
        this.robotCode = robotCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionExtension that = (SubscriptionExtension) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.signSecret, that.signSecret)
            && Objects.equals(this.header, that.header) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.appSecret, that.appSecret) && Objects.equals(this.robotCode, that.robotCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, keyword, signSecret, header, appKey, appSecret, robotCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionExtension {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    robotCode: ").append(toIndentedString(robotCode)).append("\n");
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
