package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateUrlAuthchainReq
 */
public class CreateUrlAuthchainReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /**
     * 域名类型
     */
    public static final class DomainTypeEnum {

        /**
         * Enum PULL for value: "pull"
         */
        public static final DomainTypeEnum PULL = new DomainTypeEnum("pull");

        /**
         * Enum PUSH for value: "push"
         */
        public static final DomainTypeEnum PUSH = new DomainTypeEnum("push");

        private static final Map<String, DomainTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainTypeEnum> createStaticFields() {
            Map<String, DomainTypeEnum> map = new HashMap<>();
            map.put("pull", PULL);
            map.put("push", PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainTypeEnum(String value) {
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
        public static DomainTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainTypeEnum(value));
        }

        public static DomainTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainTypeEnum) {
                return this.value.equals(((DomainTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private DomainTypeEnum domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_level")

    private Integer checkLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public CreateUrlAuthchainReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 播放域名或推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateUrlAuthchainReq withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域名类型
     * @return domainType
     */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public CreateUrlAuthchainReq withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名称，与推流或播放地址中的StreamName一致。
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public CreateUrlAuthchainReq withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名称，与推流或播放地址中的AppName一致。
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public CreateUrlAuthchainReq withCheckLevel(Integer checkLevel) {
        this.checkLevel = checkLevel;
        return this;
    }

    /**
     * 鉴权方式C必选。 检查级别。LiveID由AppName和StreamName组成,即\"<app_name>/<stream_name>\"。 包含如下取值： - 3：只检查LiveID是否匹配，不检查鉴权URL是否过期。 - 5：检查LiveID是否匹配，Timestamp是否超时。 
     * @return checkLevel
     */
    public Integer getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Integer checkLevel) {
        this.checkLevel = checkLevel;
    }

    public CreateUrlAuthchainReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 用户定义的有效访问时间起始点；例如：2006-01-02T15:04:05Z07:00 不传或为空表示当前时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUrlAuthchainReq that = (CreateUrlAuthchainReq) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.app, that.app)
            && Objects.equals(this.checkLevel, that.checkLevel) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, domainType, stream, app, checkLevel, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUrlAuthchainReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    checkLevel: ").append(toIndentedString(checkLevel)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
