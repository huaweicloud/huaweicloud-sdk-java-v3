package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowMetricNamesRequest {

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**: - zh-cn  - en-us  **默认取值**: en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    /**
     * **参数解释**: 指标分组名称。 **约束限制**: 不涉及。 **取值范围**: - CPUMEMORY：CPU/内存。 - IOSTORAGE：IO存储。 - NETWORK：网络。 - CONNECTION：连接。 - TRANSACTION：事务。 - LOCK：锁。 - SYNCSTAT：同步状态。 - PROCESSRESOURCE：进程资源。  **默认取值**: 不涉及。
     */
    public static final class GroupNameEnum {

        /**
         * Enum CPUMEMORY for value: "CPUMEMORY"
         */
        public static final GroupNameEnum CPUMEMORY = new GroupNameEnum("CPUMEMORY");

        /**
         * Enum IOSTORAGE for value: "IOSTORAGE"
         */
        public static final GroupNameEnum IOSTORAGE = new GroupNameEnum("IOSTORAGE");

        /**
         * Enum NETWORK for value: "NETWORK"
         */
        public static final GroupNameEnum NETWORK = new GroupNameEnum("NETWORK");

        /**
         * Enum CONNECTION for value: "CONNECTION"
         */
        public static final GroupNameEnum CONNECTION = new GroupNameEnum("CONNECTION");

        /**
         * Enum TRANSACTION for value: "TRANSACTION"
         */
        public static final GroupNameEnum TRANSACTION = new GroupNameEnum("TRANSACTION");

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final GroupNameEnum LOCK = new GroupNameEnum("LOCK");

        /**
         * Enum SYNCSTAT for value: "SYNCSTAT"
         */
        public static final GroupNameEnum SYNCSTAT = new GroupNameEnum("SYNCSTAT");

        /**
         * Enum PROCESSRESOURCE for value: "PROCESSRESOURCE"
         */
        public static final GroupNameEnum PROCESSRESOURCE = new GroupNameEnum("PROCESSRESOURCE");

        private static final Map<String, GroupNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupNameEnum> createStaticFields() {
            Map<String, GroupNameEnum> map = new HashMap<>();
            map.put("CPUMEMORY", CPUMEMORY);
            map.put("IOSTORAGE", IOSTORAGE);
            map.put("NETWORK", NETWORK);
            map.put("CONNECTION", CONNECTION);
            map.put("TRANSACTION", TRANSACTION);
            map.put("LOCK", LOCK);
            map.put("SYNCSTAT", SYNCSTAT);
            map.put("PROCESSRESOURCE", PROCESSRESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupNameEnum(String value) {
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
        public static GroupNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupNameEnum(value));
        }

        public static GroupNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupNameEnum) {
                return this.value.equals(((GroupNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private GroupNameEnum groupName;

    public ShowMetricNamesRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**: - zh-cn  - en-us  **默认取值**: en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowMetricNamesRequest withGroupName(GroupNameEnum groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 指标分组名称。 **约束限制**: 不涉及。 **取值范围**: - CPUMEMORY：CPU/内存。 - IOSTORAGE：IO存储。 - NETWORK：网络。 - CONNECTION：连接。 - TRANSACTION：事务。 - LOCK：锁。 - SYNCSTAT：同步状态。 - PROCESSRESOURCE：进程资源。  **默认取值**: 不涉及。
     * @return groupName
     */
    public GroupNameEnum getGroupName() {
        return groupName;
    }

    public void setGroupName(GroupNameEnum groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricNamesRequest that = (ShowMetricNamesRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricNamesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
