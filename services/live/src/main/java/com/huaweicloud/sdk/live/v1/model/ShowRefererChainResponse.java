package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRefererChainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /**
     * referer防盗链开关：true表示开启；false表示关闭
     */
    public static final class GuardSwitchEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final GuardSwitchEnum TRUE = new GuardSwitchEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final GuardSwitchEnum FALSE = new GuardSwitchEnum("false");

        private static final Map<String, GuardSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GuardSwitchEnum> createStaticFields() {
            Map<String, GuardSwitchEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GuardSwitchEnum(String value) {
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
        public static GuardSwitchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GuardSwitchEnum(value));
        }

        public static GuardSwitchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GuardSwitchEnum) {
                return this.value.equals(((GuardSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guard_switch")

    private GuardSwitchEnum guardSwitch;

    /**
     * 是否包含referer头域：true表示包含；false表示不包含；guard_switch为true则必填
     */
    public static final class RefererConfigEmptyEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final RefererConfigEmptyEnum TRUE = new RefererConfigEmptyEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final RefererConfigEmptyEnum FALSE = new RefererConfigEmptyEnum("false");

        private static final Map<String, RefererConfigEmptyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RefererConfigEmptyEnum> createStaticFields() {
            Map<String, RefererConfigEmptyEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RefererConfigEmptyEnum(String value) {
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
        public static RefererConfigEmptyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RefererConfigEmptyEnum(value));
        }

        public static RefererConfigEmptyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RefererConfigEmptyEnum) {
                return this.value.equals(((RefererConfigEmptyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_config_empty")

    private RefererConfigEmptyEnum refererConfigEmpty;

    /**
     * 是否为referer白名单：true表示白名单；false表示黑名单；guard_switch为true则必填
     */
    public static final class RefererWhiteListEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final RefererWhiteListEnum TRUE = new RefererWhiteListEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final RefererWhiteListEnum FALSE = new RefererWhiteListEnum("false");

        private static final Map<String, RefererWhiteListEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RefererWhiteListEnum> createStaticFields() {
            Map<String, RefererWhiteListEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RefererWhiteListEnum(String value) {
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
        public static RefererWhiteListEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RefererWhiteListEnum(value));
        }

        public static RefererWhiteListEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RefererWhiteListEnum) {
                return this.value.equals(((RefererWhiteListEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_white_list")

    private RefererWhiteListEnum refererWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer_auth_list")

    private List<String> refererAuthList = null;

    public ShowRefererChainResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowRefererChainResponse withGuardSwitch(GuardSwitchEnum guardSwitch) {
        this.guardSwitch = guardSwitch;
        return this;
    }

    /**
     * referer防盗链开关：true表示开启；false表示关闭
     * @return guardSwitch
     */
    public GuardSwitchEnum getGuardSwitch() {
        return guardSwitch;
    }

    public void setGuardSwitch(GuardSwitchEnum guardSwitch) {
        this.guardSwitch = guardSwitch;
    }

    public ShowRefererChainResponse withRefererConfigEmpty(RefererConfigEmptyEnum refererConfigEmpty) {
        this.refererConfigEmpty = refererConfigEmpty;
        return this;
    }

    /**
     * 是否包含referer头域：true表示包含；false表示不包含；guard_switch为true则必填
     * @return refererConfigEmpty
     */
    public RefererConfigEmptyEnum getRefererConfigEmpty() {
        return refererConfigEmpty;
    }

    public void setRefererConfigEmpty(RefererConfigEmptyEnum refererConfigEmpty) {
        this.refererConfigEmpty = refererConfigEmpty;
    }

    public ShowRefererChainResponse withRefererWhiteList(RefererWhiteListEnum refererWhiteList) {
        this.refererWhiteList = refererWhiteList;
        return this;
    }

    /**
     * 是否为referer白名单：true表示白名单；false表示黑名单；guard_switch为true则必填
     * @return refererWhiteList
     */
    public RefererWhiteListEnum getRefererWhiteList() {
        return refererWhiteList;
    }

    public void setRefererWhiteList(RefererWhiteListEnum refererWhiteList) {
        this.refererWhiteList = refererWhiteList;
    }

    public ShowRefererChainResponse withRefererAuthList(List<String> refererAuthList) {
        this.refererAuthList = refererAuthList;
        return this;
    }

    public ShowRefererChainResponse addRefererAuthListItem(String refererAuthListItem) {
        if (this.refererAuthList == null) {
            this.refererAuthList = new ArrayList<>();
        }
        this.refererAuthList.add(refererAuthListItem);
        return this;
    }

    public ShowRefererChainResponse withRefererAuthList(Consumer<List<String>> refererAuthListSetter) {
        if (this.refererAuthList == null) {
            this.refererAuthList = new ArrayList<>();
        }
        refererAuthListSetter.accept(this.refererAuthList);
        return this;
    }

    /**
     * 域名列表，域名为正则表达式；最多支持配置100个域名，以英文“;”进行分隔；guard_switch为true则必填
     * @return refererAuthList
     */
    public List<String> getRefererAuthList() {
        return refererAuthList;
    }

    public void setRefererAuthList(List<String> refererAuthList) {
        this.refererAuthList = refererAuthList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRefererChainResponse that = (ShowRefererChainResponse) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.guardSwitch, that.guardSwitch)
            && Objects.equals(this.refererConfigEmpty, that.refererConfigEmpty)
            && Objects.equals(this.refererWhiteList, that.refererWhiteList)
            && Objects.equals(this.refererAuthList, that.refererAuthList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, guardSwitch, refererConfigEmpty, refererWhiteList, refererAuthList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefererChainResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    guardSwitch: ").append(toIndentedString(guardSwitch)).append("\n");
        sb.append("    refererConfigEmpty: ").append(toIndentedString(refererConfigEmpty)).append("\n");
        sb.append("    refererWhiteList: ").append(toIndentedString(refererWhiteList)).append("\n");
        sb.append("    refererAuthList: ").append(toIndentedString(refererAuthList)).append("\n");
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
