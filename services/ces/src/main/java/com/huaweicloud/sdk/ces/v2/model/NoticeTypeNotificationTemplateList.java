package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NoticeTypeNotificationTemplateList
 */
public class NoticeTypeNotificationTemplateList {

    /**
     * 通知类型, sms(短信)/email/http(s)/smn/welink/dingding(钉钉)/wechat(微信)/feishu(飞书)/wecomgroup(微信企业版)
     */
    public static final class NoticeTypeEnum {

        /**
         * Enum SMS for value: "sms"
         */
        public static final NoticeTypeEnum SMS = new NoticeTypeEnum("sms");

        /**
         * Enum EMAIL for value: "email"
         */
        public static final NoticeTypeEnum EMAIL = new NoticeTypeEnum("email");

        /**
         * Enum HTTP_S_ for value: "http(s)"
         */
        public static final NoticeTypeEnum HTTP_S_ = new NoticeTypeEnum("http(s)");

        /**
         * Enum SMN for value: "smn"
         */
        public static final NoticeTypeEnum SMN = new NoticeTypeEnum("smn");

        /**
         * Enum WELINK for value: "welink"
         */
        public static final NoticeTypeEnum WELINK = new NoticeTypeEnum("welink");

        /**
         * Enum DINGDING for value: "dingding"
         */
        public static final NoticeTypeEnum DINGDING = new NoticeTypeEnum("dingding");

        /**
         * Enum WECHAT for value: "wechat"
         */
        public static final NoticeTypeEnum WECHAT = new NoticeTypeEnum("wechat");

        /**
         * Enum FEISHU for value: "feishu"
         */
        public static final NoticeTypeEnum FEISHU = new NoticeTypeEnum("feishu");

        /**
         * Enum WECOMGROUP for value: "wecomgroup"
         */
        public static final NoticeTypeEnum WECOMGROUP = new NoticeTypeEnum("wecomgroup");

        private static final Map<String, NoticeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoticeTypeEnum> createStaticFields() {
            Map<String, NoticeTypeEnum> map = new HashMap<>();
            map.put("sms", SMS);
            map.put("email", EMAIL);
            map.put("http(s)", HTTP_S_);
            map.put("smn", SMN);
            map.put("welink", WELINK);
            map.put("dingding", DINGDING);
            map.put("wechat", WECHAT);
            map.put("feishu", FEISHU);
            map.put("wecomgroup", WECOMGROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoticeTypeEnum(String value) {
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
        public static NoticeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoticeTypeEnum(value));
        }

        public static NoticeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoticeTypeEnum) {
                return this.value.equals(((NoticeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_type")

    private NoticeTypeEnum noticeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notification_template_id")

    private String alarmNotificationTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notification_template_name")

    private String alarmNotificationTemplateName;

    public NoticeTypeNotificationTemplateList withNoticeType(NoticeTypeEnum noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    /**
     * 通知类型, sms(短信)/email/http(s)/smn/welink/dingding(钉钉)/wechat(微信)/feishu(飞书)/wecomgroup(微信企业版)
     * @return noticeType
     */
    public NoticeTypeEnum getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(NoticeTypeEnum noticeType) {
        this.noticeType = noticeType;
    }

    public NoticeTypeNotificationTemplateList withAlarmNotificationTemplateId(String alarmNotificationTemplateId) {
        this.alarmNotificationTemplateId = alarmNotificationTemplateId;
        return this;
    }

    /**
     * **参数解释**： 通知模板id **约束限制**： 不涉及。 **取值范围**： 长度为[3,64]个字符。 **默认取值**： 不涉及 
     * @return alarmNotificationTemplateId
     */
    public String getAlarmNotificationTemplateId() {
        return alarmNotificationTemplateId;
    }

    public void setAlarmNotificationTemplateId(String alarmNotificationTemplateId) {
        this.alarmNotificationTemplateId = alarmNotificationTemplateId;
    }

    public NoticeTypeNotificationTemplateList withAlarmNotificationTemplateName(String alarmNotificationTemplateName) {
        this.alarmNotificationTemplateName = alarmNotificationTemplateName;
        return this;
    }

    /**
     * **参数解释**： 通知模板名 **约束限制**： 不涉及。 **取值范围**： 长度为[1,200]个字符。 **默认取值**： 不涉及 
     * @return alarmNotificationTemplateName
     */
    public String getAlarmNotificationTemplateName() {
        return alarmNotificationTemplateName;
    }

    public void setAlarmNotificationTemplateName(String alarmNotificationTemplateName) {
        this.alarmNotificationTemplateName = alarmNotificationTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoticeTypeNotificationTemplateList that = (NoticeTypeNotificationTemplateList) obj;
        return Objects.equals(this.noticeType, that.noticeType)
            && Objects.equals(this.alarmNotificationTemplateId, that.alarmNotificationTemplateId)
            && Objects.equals(this.alarmNotificationTemplateName, that.alarmNotificationTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeType, alarmNotificationTemplateId, alarmNotificationTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoticeTypeNotificationTemplateList {\n");
        sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
        sb.append("    alarmNotificationTemplateId: ")
            .append(toIndentedString(alarmNotificationTemplateId))
            .append("\n");
        sb.append("    alarmNotificationTemplateName: ")
            .append(toIndentedString(alarmNotificationTemplateName))
            .append("\n");
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
