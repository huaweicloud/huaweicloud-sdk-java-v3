package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAuthRandomResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random")

    private String random;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    /**
     * 会议类型模型。 * COMMON：MCU会议 * RTC：MMR会议 
     */
    public static final class ConfModeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ConfModeEnum COMMON = new ConfModeEnum("COMMON");

        /**
         * Enum RTC for value: "RTC"
         */
        public static final ConfModeEnum RTC = new ConfModeEnum("RTC");

        private static final Map<String, ConfModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfModeEnum> createStaticFields() {
            Map<String, ConfModeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("RTC", RTC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfModeEnum(String value) {
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
        public static ConfModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfModeEnum(value));
        }

        public static ConfModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfModeEnum) {
                return this.value.equals(((ConfModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf_mode")

    private ConfModeEnum confMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webinar")

    private Boolean webinar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_password")

    private Boolean needPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_applets")

    private Boolean supportApplets;

    public CreateAuthRandomResponse withRandom(String random) {
        this.random = random;
        return this;
    }

    /**
     * 鉴权随机数
     * @return random
     */
    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public CreateAuthRandomResponse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 会议主题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CreateAuthRandomResponse withConfMode(ConfModeEnum confMode) {
        this.confMode = confMode;
        return this;
    }

    /**
     * 会议类型模型。 * COMMON：MCU会议 * RTC：MMR会议 
     * @return confMode
     */
    public ConfModeEnum getConfMode() {
        return confMode;
    }

    public void setConfMode(ConfModeEnum confMode) {
        this.confMode = confMode;
    }

    public CreateAuthRandomResponse withWebinar(Boolean webinar) {
        this.webinar = webinar;
        return this;
    }

    /**
     * 是否为网络研讨会
     * @return webinar
     */
    public Boolean getWebinar() {
        return webinar;
    }

    public void setWebinar(Boolean webinar) {
        this.webinar = webinar;
    }

    public CreateAuthRandomResponse withNeedPassword(Boolean needPassword) {
        this.needPassword = needPassword;
        return this;
    }

    /**
     * 是否需要密码
     * @return needPassword
     */
    public Boolean getNeedPassword() {
        return needPassword;
    }

    public void setNeedPassword(Boolean needPassword) {
        this.needPassword = needPassword;
    }

    public CreateAuthRandomResponse withSupportApplets(Boolean supportApplets) {
        this.supportApplets = supportApplets;
        return this;
    }

    /**
     * 是否支持小程序
     * @return supportApplets
     */
    public Boolean getSupportApplets() {
        return supportApplets;
    }

    public void setSupportApplets(Boolean supportApplets) {
        this.supportApplets = supportApplets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAuthRandomResponse that = (CreateAuthRandomResponse) obj;
        return Objects.equals(this.random, that.random) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.confMode, that.confMode) && Objects.equals(this.webinar, that.webinar)
            && Objects.equals(this.needPassword, that.needPassword)
            && Objects.equals(this.supportApplets, that.supportApplets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(random, subject, confMode, webinar, needPassword, supportApplets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthRandomResponse {\n");
        sb.append("    random: ").append(toIndentedString(random)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    confMode: ").append(toIndentedString(confMode)).append("\n");
        sb.append("    webinar: ").append(toIndentedString(webinar)).append("\n");
        sb.append("    needPassword: ").append(toIndentedString(needPassword)).append("\n");
        sb.append("    supportApplets: ").append(toIndentedString(supportApplets)).append("\n");
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
