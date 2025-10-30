package com.huaweicloud.sdk.hss.v5.model;

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
 * 大类别对应的名称与数量列表
 */
public class EventTypeDetailResponseInfo {

    /**
     * 大类别对应的名字:   - malicious_software：恶意软件   - \"exploit_attack\"：漏洞利用   - \"system_abnormal_behavior\"：系统异常行为   - \"user_abnormal_behavior\"：用户异常行为   - \"network_abnormal_access\"：网络异常访问   - \"resource_recon\"：资源侦查   - \"risk_audit\"：风险审计   - \"information_destroy\"：信息破坏   - \"denial_of_service\"：拒绝服务攻击   - \"advanced_threat\"：高级威胁   - \"extend\"：其余未列出的，里面的类别显示到外层中
     */
    public static final class EventTypeNameEnum {

        /**
         * Enum MALICIOUS_SOFTWARE for value: "malicious_software"
         */
        public static final EventTypeNameEnum MALICIOUS_SOFTWARE = new EventTypeNameEnum("malicious_software");

        /**
         * Enum EXPLOIT_ATTACK for value: "exploit_attack"
         */
        public static final EventTypeNameEnum EXPLOIT_ATTACK = new EventTypeNameEnum("exploit_attack");

        /**
         * Enum SYSTEM_ABNORMAL_BEHAVIOR for value: "system_abnormal_behavior"
         */
        public static final EventTypeNameEnum SYSTEM_ABNORMAL_BEHAVIOR =
            new EventTypeNameEnum("system_abnormal_behavior");

        /**
         * Enum USER_ABNORMAL_BEHAVIOR for value: "user_abnormal_behavior"
         */
        public static final EventTypeNameEnum USER_ABNORMAL_BEHAVIOR = new EventTypeNameEnum("user_abnormal_behavior");

        /**
         * Enum NETWORK_ABNORMAL_ACCESS for value: "network_abnormal_access"
         */
        public static final EventTypeNameEnum NETWORK_ABNORMAL_ACCESS =
            new EventTypeNameEnum("network_abnormal_access");

        /**
         * Enum RESOURCE_RECON for value: "resource_recon"
         */
        public static final EventTypeNameEnum RESOURCE_RECON = new EventTypeNameEnum("resource_recon");

        /**
         * Enum RISK_AUDIT for value: "risk_audit"
         */
        public static final EventTypeNameEnum RISK_AUDIT = new EventTypeNameEnum("risk_audit");

        /**
         * Enum INFORMATION_DESTROY for value: "information_destroy"
         */
        public static final EventTypeNameEnum INFORMATION_DESTROY = new EventTypeNameEnum("information_destroy");

        /**
         * Enum DENIAL_OF_SERVICE for value: "denial_of_service"
         */
        public static final EventTypeNameEnum DENIAL_OF_SERVICE = new EventTypeNameEnum("denial_of_service");

        /**
         * Enum ADVANCED_THREAT for value: "advanced_threat"
         */
        public static final EventTypeNameEnum ADVANCED_THREAT = new EventTypeNameEnum("advanced_threat");

        /**
         * Enum EXTEND for value: "extend"
         */
        public static final EventTypeNameEnum EXTEND = new EventTypeNameEnum("extend");

        private static final Map<String, EventTypeNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeNameEnum> createStaticFields() {
            Map<String, EventTypeNameEnum> map = new HashMap<>();
            map.put("malicious_software", MALICIOUS_SOFTWARE);
            map.put("exploit_attack", EXPLOIT_ATTACK);
            map.put("system_abnormal_behavior", SYSTEM_ABNORMAL_BEHAVIOR);
            map.put("user_abnormal_behavior", USER_ABNORMAL_BEHAVIOR);
            map.put("network_abnormal_access", NETWORK_ABNORMAL_ACCESS);
            map.put("resource_recon", RESOURCE_RECON);
            map.put("risk_audit", RISK_AUDIT);
            map.put("information_destroy", INFORMATION_DESTROY);
            map.put("denial_of_service", DENIAL_OF_SERVICE);
            map.put("advanced_threat", ADVANCED_THREAT);
            map.put("extend", EXTEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeNameEnum(String value) {
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
        public static EventTypeNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeNameEnum(value));
        }

        public static EventTypeNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeNameEnum) {
                return this.value.equals(((EventTypeNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_name")

    private EventTypeNameEnum eventTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_num")

    private Integer eventTypeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_list")

    private List<EventTypeResponseInfo> eventTypeList = null;

    public EventTypeDetailResponseInfo withEventTypeName(EventTypeNameEnum eventTypeName) {
        this.eventTypeName = eventTypeName;
        return this;
    }

    /**
     * 大类别对应的名字:   - malicious_software：恶意软件   - \"exploit_attack\"：漏洞利用   - \"system_abnormal_behavior\"：系统异常行为   - \"user_abnormal_behavior\"：用户异常行为   - \"network_abnormal_access\"：网络异常访问   - \"resource_recon\"：资源侦查   - \"risk_audit\"：风险审计   - \"information_destroy\"：信息破坏   - \"denial_of_service\"：拒绝服务攻击   - \"advanced_threat\"：高级威胁   - \"extend\"：其余未列出的，里面的类别显示到外层中
     * @return eventTypeName
     */
    public EventTypeNameEnum getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(EventTypeNameEnum eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public EventTypeDetailResponseInfo withEventTypeNum(Integer eventTypeNum) {
        this.eventTypeNum = eventTypeNum;
        return this;
    }

    /**
     * 事件类别的总数量
     * minimum: 0
     * maximum: 2147483647
     * @return eventTypeNum
     */
    public Integer getEventTypeNum() {
        return eventTypeNum;
    }

    public void setEventTypeNum(Integer eventTypeNum) {
        this.eventTypeNum = eventTypeNum;
    }

    public EventTypeDetailResponseInfo withEventTypeList(List<EventTypeResponseInfo> eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }

    public EventTypeDetailResponseInfo addEventTypeListItem(EventTypeResponseInfo eventTypeListItem) {
        if (this.eventTypeList == null) {
            this.eventTypeList = new ArrayList<>();
        }
        this.eventTypeList.add(eventTypeListItem);
        return this;
    }

    public EventTypeDetailResponseInfo withEventTypeList(Consumer<List<EventTypeResponseInfo>> eventTypeListSetter) {
        if (this.eventTypeList == null) {
            this.eventTypeList = new ArrayList<>();
        }
        eventTypeListSetter.accept(this.eventTypeList);
        return this;
    }

    /**
     * 小类别对应的名称与数量列表
     * @return eventTypeList
     */
    public List<EventTypeResponseInfo> getEventTypeList() {
        return eventTypeList;
    }

    public void setEventTypeList(List<EventTypeResponseInfo> eventTypeList) {
        this.eventTypeList = eventTypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventTypeDetailResponseInfo that = (EventTypeDetailResponseInfo) obj;
        return Objects.equals(this.eventTypeName, that.eventTypeName)
            && Objects.equals(this.eventTypeNum, that.eventTypeNum)
            && Objects.equals(this.eventTypeList, that.eventTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventTypeName, eventTypeNum, eventTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventTypeDetailResponseInfo {\n");
        sb.append("    eventTypeName: ").append(toIndentedString(eventTypeName)).append("\n");
        sb.append("    eventTypeNum: ").append(toIndentedString(eventTypeNum)).append("\n");
        sb.append("    eventTypeList: ").append(toIndentedString(eventTypeList)).append("\n");
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
