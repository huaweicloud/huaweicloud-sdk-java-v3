package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * URL鉴权。
 */
public class UrlAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Integer expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_method")

    private String signMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_config")

    private InheritConfig inheritConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_key")

    private String backupKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_arg")

    private String signArg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_format")

    private String timeFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_arg")

    private String timeArg;

    public UrlAuth withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否开启URL鉴权，on：开启,off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UrlAuth withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 鉴权方式 type_a：鉴权方式A type_b：鉴权方式B type_c1：鉴权方式C1 type_c2：鉴权方式C2
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UrlAuth withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间：范围：0-31536000单位为秒。
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public UrlAuth withSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }

    /**
     * 加密的算法 可选择md5或sha256。
     * @return signMethod
     */
    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public UrlAuth withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 鉴权范围，目前仅支持配置所有文件参与鉴权，all：所有文件。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public UrlAuth withInheritConfig(InheritConfig inheritConfig) {
        this.inheritConfig = inheritConfig;
        return this;
    }

    public UrlAuth withInheritConfig(Consumer<InheritConfig> inheritConfigSetter) {
        if (this.inheritConfig == null) {
            this.inheritConfig = new InheritConfig();
            inheritConfigSetter.accept(this.inheritConfig);
        }

        return this;
    }

    /**
     * Get inheritConfig
     * @return inheritConfig
     */
    public InheritConfig getInheritConfig() {
        return inheritConfig;
    }

    public void setInheritConfig(InheritConfig inheritConfig) {
        this.inheritConfig = inheritConfig;
    }

    public UrlAuth withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 鉴权KEY 由6-32位大小写字母、数字构成。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UrlAuth withBackupKey(String backupKey) {
        this.backupKey = backupKey;
        return this;
    }

    /**
     * 鉴权KEY（备） 由6-32位大小写字母、数字构成。
     * @return backupKey
     */
    public String getBackupKey() {
        return backupKey;
    }

    public void setBackupKey(String backupKey) {
        this.backupKey = backupKey;
    }

    public UrlAuth withSignArg(String signArg) {
        this.signArg = signArg;
        return this;
    }

    /**
     * 鉴权参数：1-100位可以由大小写字母、数字、下划线构成（不能以数字开头）。
     * @return signArg
     */
    public String getSignArg() {
        return signArg;
    }

    public void setSignArg(String signArg) {
        this.signArg = signArg;
    }

    public UrlAuth withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * 时间格式 dec：十进制 hex：十六进制 鉴权方式A：只支持十进制 鉴权方式B：只支持十进制 鉴权方式C1：只支持十六进制鉴权方式 鉴权方式C2：支持十进制/十六进制
     * @return timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public UrlAuth withTimeArg(String timeArg) {
        this.timeArg = timeArg;
        return this;
    }

    /**
     * 时间参数名称：当type为“type_c2”时，该字段可选。由1-100个字符组成。必须以字母开头，后面可以衔接任意数字、字母和下划线，不允许出现其他特殊符号。鉴权方式为C2时，不传或传空默认设置为“timestamp”。
     * @return timeArg
     */
    public String getTimeArg() {
        return timeArg;
    }

    public void setTimeArg(String timeArg) {
        this.timeArg = timeArg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlAuth that = (UrlAuth) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.signMethod, that.signMethod)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.inheritConfig, that.inheritConfig)
            && Objects.equals(this.key, that.key) && Objects.equals(this.backupKey, that.backupKey)
            && Objects.equals(this.signArg, that.signArg) && Objects.equals(this.timeFormat, that.timeFormat)
            && Objects.equals(this.timeArg, that.timeArg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            type,
            expireTime,
            signMethod,
            matchType,
            inheritConfig,
            key,
            backupKey,
            signArg,
            timeFormat,
            timeArg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlAuth {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    signMethod: ").append(toIndentedString(signMethod)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    inheritConfig: ").append(toIndentedString(inheritConfig)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    backupKey: ").append(toIndentedString(backupKey)).append("\n");
        sb.append("    signArg: ").append(toIndentedString(signArg)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
        sb.append("    timeArg: ").append(toIndentedString(timeArg)).append("\n");
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
