package com.huaweicloud.sdk.waf.v1.model;

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
 * Request Object
 */
public class ListEventRequest {

    /**
     * **参数解释：** 客户端IP所属地理位置展示语言，默认值为en-us **约束限制：** 不涉及 **取值范围：** - zh-cn 中文 - en-us 英文 **默认取值：** en-us
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * **参数解释：** 查询日志的时间范围，recent参数与from、to必须使用其中一个。当同时使用recent参数与from、to时，以recent参数为准 **约束限制：** 不涉及 **取值范围：**  - yesterday：昨天  - today：今天  - 3days：近3天   - 1week：近7天   - 1month：近30天  **默认取值：** 不涉及
     */
    public static final class RecentEnum {

        /**
         * Enum YESTERDAY for value: "yesterday"
         */
        public static final RecentEnum YESTERDAY = new RecentEnum("yesterday");

        /**
         * Enum TODAY for value: "today"
         */
        public static final RecentEnum TODAY = new RecentEnum("today");

        /**
         * Enum _3DAYS for value: "3days"
         */
        public static final RecentEnum _3DAYS = new RecentEnum("3days");

        /**
         * Enum _1WEEK for value: "1week"
         */
        public static final RecentEnum _1WEEK = new RecentEnum("1week");

        /**
         * Enum _1MONTH for value: "1month"
         */
        public static final RecentEnum _1MONTH = new RecentEnum("1month");

        private static final Map<String, RecentEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecentEnum> createStaticFields() {
            Map<String, RecentEnum> map = new HashMap<>();
            map.put("yesterday", YESTERDAY);
            map.put("today", TODAY);
            map.put("3days", _3DAYS);
            map.put("1week", _1WEEK);
            map.put("1month", _1MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecentEnum(String value) {
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
        public static RecentEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecentEnum(value));
        }

        public static RecentEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecentEnum) {
                return this.value.equals(((RecentEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private RecentEnum recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nids")

    private List<String> nids = null;

    /**
     * Gets or Sets attacks
     */
    public static final class AttacksEnum {

        /**
         * Enum XSS for value: "xss"
         */
        public static final AttacksEnum XSS = new AttacksEnum("xss");

        /**
         * Enum BOTM for value: "botm"
         */
        public static final AttacksEnum BOTM = new AttacksEnum("botm");

        /**
         * Enum WEBSHELL for value: "webshell"
         */
        public static final AttacksEnum WEBSHELL = new AttacksEnum("webshell");

        /**
         * Enum VULN for value: "vuln"
         */
        public static final AttacksEnum VULN = new AttacksEnum("vuln");

        /**
         * Enum SQLI for value: "sqli"
         */
        public static final AttacksEnum SQLI = new AttacksEnum("sqli");

        /**
         * Enum ROBOT for value: "robot"
         */
        public static final AttacksEnum ROBOT = new AttacksEnum("robot");

        /**
         * Enum RFI for value: "rfi"
         */
        public static final AttacksEnum RFI = new AttacksEnum("rfi");

        /**
         * Enum RCE for value: "rce"
         */
        public static final AttacksEnum RCE = new AttacksEnum("rce");

        /**
         * Enum PTR for value: "ptr"
         */
        public static final AttacksEnum PTR = new AttacksEnum("ptr");

        /**
         * Enum LFI for value: "lfi"
         */
        public static final AttacksEnum LFI = new AttacksEnum("lfi");

        /**
         * Enum ANTILEAKAGE for value: "antileakage"
         */
        public static final AttacksEnum ANTILEAKAGE = new AttacksEnum("antileakage");

        /**
         * Enum IPRANK for value: "iprank"
         */
        public static final AttacksEnum IPRANK = new AttacksEnum("iprank");

        /**
         * Enum CUSTOM_WHITEBLACKIP for value: "custom_whiteblackip"
         */
        public static final AttacksEnum CUSTOM_WHITEBLACKIP = new AttacksEnum("custom_whiteblackip");

        /**
         * Enum CUSTOM_WHITEIP for value: "custom_whiteip"
         */
        public static final AttacksEnum CUSTOM_WHITEIP = new AttacksEnum("custom_whiteip");

        /**
         * Enum CUSTOM_BLACKIP for value: "custom_blackip"
         */
        public static final AttacksEnum CUSTOM_BLACKIP = new AttacksEnum("custom_blackip");

        /**
         * Enum CUSTOM_ROBOT for value: "custom_robot"
         */
        public static final AttacksEnum CUSTOM_ROBOT = new AttacksEnum("custom_robot");

        /**
         * Enum CUSTOM_GEOIP for value: "custom_geoip"
         */
        public static final AttacksEnum CUSTOM_GEOIP = new AttacksEnum("custom_geoip");

        /**
         * Enum CUSTOM_IDC_IP for value: "custom_idc_ip"
         */
        public static final AttacksEnum CUSTOM_IDC_IP = new AttacksEnum("custom_idc_ip");

        /**
         * Enum CUSTOM_CUSTOM for value: "custom_custom"
         */
        public static final AttacksEnum CUSTOM_CUSTOM = new AttacksEnum("custom_custom");

        /**
         * Enum CMDI for value: "cmdi"
         */
        public static final AttacksEnum CMDI = new AttacksEnum("cmdi");

        /**
         * Enum CC for value: "cc"
         */
        public static final AttacksEnum CC = new AttacksEnum("cc");

        /**
         * Enum ANTITAMPER for value: "antitamper"
         */
        public static final AttacksEnum ANTITAMPER = new AttacksEnum("antitamper");

        /**
         * Enum ANTICRAWLER for value: "anticrawler"
         */
        public static final AttacksEnum ANTICRAWLER = new AttacksEnum("anticrawler");

        /**
         * Enum THIRD_BOT_RIVER for value: "third_bot_river"
         */
        public static final AttacksEnum THIRD_BOT_RIVER = new AttacksEnum("third_bot_river");

        /**
         * Enum ANTISCAN_HIGH_FREQ_SCAN for value: "antiscan_high_freq_scan"
         */
        public static final AttacksEnum ANTISCAN_HIGH_FREQ_SCAN = new AttacksEnum("antiscan_high_freq_scan");

        /**
         * Enum ANTISCAN_DIR_TRAVERSAL for value: "antiscan_dir_traversal"
         */
        public static final AttacksEnum ANTISCAN_DIR_TRAVERSAL = new AttacksEnum("antiscan_dir_traversal");

        /**
         * Enum ILLEGAL for value: "illegal"
         */
        public static final AttacksEnum ILLEGAL = new AttacksEnum("illegal");

        /**
         * Enum FOLLOWED_ACTION for value: "followed_action"
         */
        public static final AttacksEnum FOLLOWED_ACTION = new AttacksEnum("followed_action");

        /**
         * Enum ADVANCED_BOT for value: "advanced_bot"
         */
        public static final AttacksEnum ADVANCED_BOT = new AttacksEnum("advanced_bot");

        /**
         * Enum LLM_PROMPT_INJECTION for value: "llm_prompt_injection"
         */
        public static final AttacksEnum LLM_PROMPT_INJECTION = new AttacksEnum("llm_prompt_injection");

        /**
         * Enum LLM_PROMPT_SENSITIVE for value: "llm_prompt_sensitive"
         */
        public static final AttacksEnum LLM_PROMPT_SENSITIVE = new AttacksEnum("llm_prompt_sensitive");

        /**
         * Enum LLM_RESPONSE_SENSITIVE for value: "llm_response_sensitive"
         */
        public static final AttacksEnum LLM_RESPONSE_SENSITIVE = new AttacksEnum("llm_response_sensitive");

        private static final Map<String, AttacksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AttacksEnum> createStaticFields() {
            Map<String, AttacksEnum> map = new HashMap<>();
            map.put("xss", XSS);
            map.put("botm", BOTM);
            map.put("webshell", WEBSHELL);
            map.put("vuln", VULN);
            map.put("sqli", SQLI);
            map.put("robot", ROBOT);
            map.put("rfi", RFI);
            map.put("rce", RCE);
            map.put("ptr", PTR);
            map.put("lfi", LFI);
            map.put("antileakage", ANTILEAKAGE);
            map.put("iprank", IPRANK);
            map.put("custom_whiteblackip", CUSTOM_WHITEBLACKIP);
            map.put("custom_whiteip", CUSTOM_WHITEIP);
            map.put("custom_blackip", CUSTOM_BLACKIP);
            map.put("custom_robot", CUSTOM_ROBOT);
            map.put("custom_geoip", CUSTOM_GEOIP);
            map.put("custom_idc_ip", CUSTOM_IDC_IP);
            map.put("custom_custom", CUSTOM_CUSTOM);
            map.put("cmdi", CMDI);
            map.put("cc", CC);
            map.put("antitamper", ANTITAMPER);
            map.put("anticrawler", ANTICRAWLER);
            map.put("third_bot_river", THIRD_BOT_RIVER);
            map.put("antiscan_high_freq_scan", ANTISCAN_HIGH_FREQ_SCAN);
            map.put("antiscan_dir_traversal", ANTISCAN_DIR_TRAVERSAL);
            map.put("illegal", ILLEGAL);
            map.put("followed_action", FOLLOWED_ACTION);
            map.put("advanced_bot", ADVANCED_BOT);
            map.put("llm_prompt_injection", LLM_PROMPT_INJECTION);
            map.put("llm_prompt_sensitive", LLM_PROMPT_SENSITIVE);
            map.put("llm_response_sensitive", LLM_RESPONSE_SENSITIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AttacksEnum(String value) {
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
        public static AttacksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttacksEnum(value));
        }

        public static AttacksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AttacksEnum) {
                return this.value.equals(((AttacksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attacks")

    private List<AttacksEnum> attacks = null;

    /**
     * Gets or Sets nattacks
     */
    public static final class NattacksEnum {

        /**
         * Enum XSS for value: "xss"
         */
        public static final NattacksEnum XSS = new NattacksEnum("xss");

        /**
         * Enum BOTM for value: "botm"
         */
        public static final NattacksEnum BOTM = new NattacksEnum("botm");

        /**
         * Enum WEBSHELL for value: "webshell"
         */
        public static final NattacksEnum WEBSHELL = new NattacksEnum("webshell");

        /**
         * Enum VULN for value: "vuln"
         */
        public static final NattacksEnum VULN = new NattacksEnum("vuln");

        /**
         * Enum SQLI for value: "sqli"
         */
        public static final NattacksEnum SQLI = new NattacksEnum("sqli");

        /**
         * Enum ROBOT for value: "robot"
         */
        public static final NattacksEnum ROBOT = new NattacksEnum("robot");

        /**
         * Enum RFI for value: "rfi"
         */
        public static final NattacksEnum RFI = new NattacksEnum("rfi");

        /**
         * Enum RCE for value: "rce"
         */
        public static final NattacksEnum RCE = new NattacksEnum("rce");

        /**
         * Enum PTR for value: "ptr"
         */
        public static final NattacksEnum PTR = new NattacksEnum("ptr");

        /**
         * Enum LFI for value: "lfi"
         */
        public static final NattacksEnum LFI = new NattacksEnum("lfi");

        /**
         * Enum ANTILEAKAGE for value: "antileakage"
         */
        public static final NattacksEnum ANTILEAKAGE = new NattacksEnum("antileakage");

        /**
         * Enum IPRANK for value: "iprank"
         */
        public static final NattacksEnum IPRANK = new NattacksEnum("iprank");

        /**
         * Enum CUSTOM_WHITEBLACKIP for value: "custom_whiteblackip"
         */
        public static final NattacksEnum CUSTOM_WHITEBLACKIP = new NattacksEnum("custom_whiteblackip");

        /**
         * Enum CUSTOM_WHITEIP for value: "custom_whiteip"
         */
        public static final NattacksEnum CUSTOM_WHITEIP = new NattacksEnum("custom_whiteip");

        /**
         * Enum CUSTOM_BLACKIP for value: "custom_blackip"
         */
        public static final NattacksEnum CUSTOM_BLACKIP = new NattacksEnum("custom_blackip");

        /**
         * Enum CUSTOM_ROBOT for value: "custom_robot"
         */
        public static final NattacksEnum CUSTOM_ROBOT = new NattacksEnum("custom_robot");

        /**
         * Enum CUSTOM_GEOIP for value: "custom_geoip"
         */
        public static final NattacksEnum CUSTOM_GEOIP = new NattacksEnum("custom_geoip");

        /**
         * Enum CUSTOM_IDC_IP for value: "custom_idc_ip"
         */
        public static final NattacksEnum CUSTOM_IDC_IP = new NattacksEnum("custom_idc_ip");

        /**
         * Enum CUSTOM_CUSTOM for value: "custom_custom"
         */
        public static final NattacksEnum CUSTOM_CUSTOM = new NattacksEnum("custom_custom");

        /**
         * Enum CMDI for value: "cmdi"
         */
        public static final NattacksEnum CMDI = new NattacksEnum("cmdi");

        /**
         * Enum CC for value: "cc"
         */
        public static final NattacksEnum CC = new NattacksEnum("cc");

        /**
         * Enum ANTITAMPER for value: "antitamper"
         */
        public static final NattacksEnum ANTITAMPER = new NattacksEnum("antitamper");

        /**
         * Enum ANTICRAWLER for value: "anticrawler"
         */
        public static final NattacksEnum ANTICRAWLER = new NattacksEnum("anticrawler");

        /**
         * Enum THIRD_BOT_RIVER for value: "third_bot_river"
         */
        public static final NattacksEnum THIRD_BOT_RIVER = new NattacksEnum("third_bot_river");

        /**
         * Enum ANTISCAN_HIGH_FREQ_SCAN for value: "antiscan_high_freq_scan"
         */
        public static final NattacksEnum ANTISCAN_HIGH_FREQ_SCAN = new NattacksEnum("antiscan_high_freq_scan");

        /**
         * Enum ANTISCAN_DIR_TRAVERSAL for value: "antiscan_dir_traversal"
         */
        public static final NattacksEnum ANTISCAN_DIR_TRAVERSAL = new NattacksEnum("antiscan_dir_traversal");

        /**
         * Enum ILLEGAL for value: "illegal"
         */
        public static final NattacksEnum ILLEGAL = new NattacksEnum("illegal");

        /**
         * Enum FOLLOWED_ACTION for value: "followed_action"
         */
        public static final NattacksEnum FOLLOWED_ACTION = new NattacksEnum("followed_action");

        /**
         * Enum ADVANCED_BOT for value: "advanced_bot"
         */
        public static final NattacksEnum ADVANCED_BOT = new NattacksEnum("advanced_bot");

        /**
         * Enum LLM_PROMPT_INJECTION for value: "llm_prompt_injection"
         */
        public static final NattacksEnum LLM_PROMPT_INJECTION = new NattacksEnum("llm_prompt_injection");

        /**
         * Enum LLM_PROMPT_SENSITIVE for value: "llm_prompt_sensitive"
         */
        public static final NattacksEnum LLM_PROMPT_SENSITIVE = new NattacksEnum("llm_prompt_sensitive");

        /**
         * Enum LLM_RESPONSE_SENSITIVE for value: "llm_response_sensitive"
         */
        public static final NattacksEnum LLM_RESPONSE_SENSITIVE = new NattacksEnum("llm_response_sensitive");

        private static final Map<String, NattacksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NattacksEnum> createStaticFields() {
            Map<String, NattacksEnum> map = new HashMap<>();
            map.put("xss", XSS);
            map.put("botm", BOTM);
            map.put("webshell", WEBSHELL);
            map.put("vuln", VULN);
            map.put("sqli", SQLI);
            map.put("robot", ROBOT);
            map.put("rfi", RFI);
            map.put("rce", RCE);
            map.put("ptr", PTR);
            map.put("lfi", LFI);
            map.put("antileakage", ANTILEAKAGE);
            map.put("iprank", IPRANK);
            map.put("custom_whiteblackip", CUSTOM_WHITEBLACKIP);
            map.put("custom_whiteip", CUSTOM_WHITEIP);
            map.put("custom_blackip", CUSTOM_BLACKIP);
            map.put("custom_robot", CUSTOM_ROBOT);
            map.put("custom_geoip", CUSTOM_GEOIP);
            map.put("custom_idc_ip", CUSTOM_IDC_IP);
            map.put("custom_custom", CUSTOM_CUSTOM);
            map.put("cmdi", CMDI);
            map.put("cc", CC);
            map.put("antitamper", ANTITAMPER);
            map.put("anticrawler", ANTICRAWLER);
            map.put("third_bot_river", THIRD_BOT_RIVER);
            map.put("antiscan_high_freq_scan", ANTISCAN_HIGH_FREQ_SCAN);
            map.put("antiscan_dir_traversal", ANTISCAN_DIR_TRAVERSAL);
            map.put("illegal", ILLEGAL);
            map.put("followed_action", FOLLOWED_ACTION);
            map.put("advanced_bot", ADVANCED_BOT);
            map.put("llm_prompt_injection", LLM_PROMPT_INJECTION);
            map.put("llm_prompt_sensitive", LLM_PROMPT_SENSITIVE);
            map.put("llm_response_sensitive", LLM_RESPONSE_SENSITIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NattacksEnum(String value) {
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
        public static NattacksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NattacksEnum(value));
        }

        public static NattacksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NattacksEnum) {
                return this.value.equals(((NattacksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nattacks")

    private List<NattacksEnum> nattacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<String> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrules")

    private List<String> nrules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sips")

    private List<String> sips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nsips")

    private List<String> nsips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private String sip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nurls")

    private List<String> nurls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * Gets or Sets actions
     */
    public static final class ActionsEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final ActionsEnum BLOCK = new ActionsEnum("block");

        /**
         * Enum PASS for value: "pass"
         */
        public static final ActionsEnum PASS = new ActionsEnum("pass");

        /**
         * Enum LOG for value: "log"
         */
        public static final ActionsEnum LOG = new ActionsEnum("log");

        /**
         * Enum CAPTCHA for value: "captcha"
         */
        public static final ActionsEnum CAPTCHA = new ActionsEnum("captcha");

        /**
         * Enum CACHE for value: "cache"
         */
        public static final ActionsEnum CACHE = new ActionsEnum("cache");

        /**
         * Enum MASK for value: "mask"
         */
        public static final ActionsEnum MASK = new ActionsEnum("mask");

        /**
         * Enum JS_CHALLENGE for value: "js_challenge"
         */
        public static final ActionsEnum JS_CHALLENGE = new ActionsEnum("js_challenge");

        /**
         * Enum ADVANCED_CAPTCHA for value: "advanced_captcha"
         */
        public static final ActionsEnum ADVANCED_CAPTCHA = new ActionsEnum("advanced_captcha");

        /**
         * Enum ABORT_RESPONSE for value: "abort_response"
         */
        public static final ActionsEnum ABORT_RESPONSE = new ActionsEnum("abort_response");

        /**
         * Enum DESENSITIZE for value: "desensitize"
         */
        public static final ActionsEnum DESENSITIZE = new ActionsEnum("desensitize");

        private static final Map<String, ActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionsEnum> createStaticFields() {
            Map<String, ActionsEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("pass", PASS);
            map.put("log", LOG);
            map.put("captcha", CAPTCHA);
            map.put("cache", CACHE);
            map.put("mask", MASK);
            map.put("js_challenge", JS_CHALLENGE);
            map.put("advanced_captcha", ADVANCED_CAPTCHA);
            map.put("abort_response", ABORT_RESPONSE);
            map.put("desensitize", DESENSITIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionsEnum(String value) {
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
        public static ActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionsEnum(value));
        }

        public static ActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionsEnum) {
                return this.value.equals(((ActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionsEnum> actions = null;

    /**
     * Gets or Sets nactions
     */
    public static final class NactionsEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final NactionsEnum BLOCK = new NactionsEnum("block");

        /**
         * Enum PASS for value: "pass"
         */
        public static final NactionsEnum PASS = new NactionsEnum("pass");

        /**
         * Enum LOG for value: "log"
         */
        public static final NactionsEnum LOG = new NactionsEnum("log");

        /**
         * Enum CAPTCHA for value: "captcha"
         */
        public static final NactionsEnum CAPTCHA = new NactionsEnum("captcha");

        /**
         * Enum CACHE for value: "cache"
         */
        public static final NactionsEnum CACHE = new NactionsEnum("cache");

        /**
         * Enum MASK for value: "mask"
         */
        public static final NactionsEnum MASK = new NactionsEnum("mask");

        /**
         * Enum JS_CHALLENGE for value: "js_challenge"
         */
        public static final NactionsEnum JS_CHALLENGE = new NactionsEnum("js_challenge");

        /**
         * Enum ADVANCED_CAPTCHA for value: "advanced_captcha"
         */
        public static final NactionsEnum ADVANCED_CAPTCHA = new NactionsEnum("advanced_captcha");

        /**
         * Enum ABORT_RESPONSE for value: "abort_response"
         */
        public static final NactionsEnum ABORT_RESPONSE = new NactionsEnum("abort_response");

        /**
         * Enum DESENSITIZE for value: "desensitize"
         */
        public static final NactionsEnum DESENSITIZE = new NactionsEnum("desensitize");

        private static final Map<String, NactionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NactionsEnum> createStaticFields() {
            Map<String, NactionsEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("pass", PASS);
            map.put("log", LOG);
            map.put("captcha", CAPTCHA);
            map.put("cache", CACHE);
            map.put("mask", MASK);
            map.put("js_challenge", JS_CHALLENGE);
            map.put("advanced_captcha", ADVANCED_CAPTCHA);
            map.put("abort_response", ABORT_RESPONSE);
            map.put("desensitize", DESENSITIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NactionsEnum(String value) {
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
        public static NactionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NactionsEnum(value));
        }

        public static NactionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NactionsEnum) {
                return this.value.equals(((NactionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nactions")

    private List<NactionsEnum> nactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ndomain")

    private String ndomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_countries")

    private List<String> ipCountries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nip_countries")

    private List<String> nipCountries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_regions")

    private List<String> ipRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nip_regions")

    private List<String> nipRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_codes")

    private List<String> responseCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    private String payload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    /**
     * **参数解释：** 排序字段，默认attack_time，选择其他字段时，会按照指定字段和attack_time共同排序 **约束限制：** 不涉及 **取值范围：** - attack_time 攻击时间 - sort_ip 客户端IP - host 域名 - geo_str 地理位置 - component 应用组件 - rule 规则ID - attack 事件类型（攻击类型） **默认取值：** attack_time
     */
    public static final class SortKeyEnum {

        /**
         * Enum ATTACK_TIME for value: "attack_time"
         */
        public static final SortKeyEnum ATTACK_TIME = new SortKeyEnum("attack_time");

        /**
         * Enum SORT_IP for value: "sort_ip"
         */
        public static final SortKeyEnum SORT_IP = new SortKeyEnum("sort_ip");

        /**
         * Enum HOST for value: "host"
         */
        public static final SortKeyEnum HOST = new SortKeyEnum("host");

        /**
         * Enum GEO_STR for value: "geo_str"
         */
        public static final SortKeyEnum GEO_STR = new SortKeyEnum("geo_str");

        /**
         * Enum COMPONENT for value: "component"
         */
        public static final SortKeyEnum COMPONENT = new SortKeyEnum("component");

        /**
         * Enum RULE for value: "rule"
         */
        public static final SortKeyEnum RULE = new SortKeyEnum("rule");

        /**
         * Enum ATTACK for value: "attack"
         */
        public static final SortKeyEnum ATTACK = new SortKeyEnum("attack");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("attack_time", ATTACK_TIME);
            map.put("sort_ip", SORT_IP);
            map.put("host", HOST);
            map.put("geo_str", GEO_STR);
            map.put("component", COMPONENT);
            map.put("rule", RULE);
            map.put("attack", ATTACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * **参数解释：** 排序方向 **约束限制：** 不涉及 **取值范围：** - desc 降序 - asc 升序 **默认取值：** desc
     */
    public static final class SortDirectionEnum {

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirectionEnum DESC = new SortDirectionEnum("desc");

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirectionEnum ASC = new SortDirectionEnum("asc");

        private static final Map<String, SortDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirectionEnum> createStaticFields() {
            Map<String, SortDirectionEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirectionEnum(String value) {
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
        public static SortDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirectionEnum(value));
        }

        public static SortDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirectionEnum) {
                return this.value.equals(((SortDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_direction")

    private SortDirectionEnum sortDirection;

    /**
     * **参数解释：** 查询模式，仅影响参数sip、url **约束限制：** 不涉及 **取值范围：** - equal 精确查询 - include 模糊查询 **默认取值：** include
     */
    public static final class QueryModeEnum {

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final QueryModeEnum EQUAL = new QueryModeEnum("equal");

        /**
         * Enum INCLUDE for value: "include"
         */
        public static final QueryModeEnum INCLUDE = new QueryModeEnum("include");

        private static final Map<String, QueryModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryModeEnum> createStaticFields() {
            Map<String, QueryModeEnum> map = new HashMap<>();
            map.put("equal", EQUAL);
            map.put("include", INCLUDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryModeEnum(String value) {
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
        public static QueryModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryModeEnum(value));
        }

        public static QueryModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryModeEnum) {
                return this.value.equals(((QueryModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_mode")

    private QueryModeEnum queryMode;

    public ListEventRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释：** 客户端IP所属地理位置展示语言，默认值为en-us **约束限制：** 不涉及 **取值范围：** - zh-cn 中文 - en-us 英文 **默认取值：** en-us
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

    public ListEventRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListEventRequest withRecent(RecentEnum recent) {
        this.recent = recent;
        return this;
    }

    /**
     * **参数解释：** 查询日志的时间范围，recent参数与from、to必须使用其中一个。当同时使用recent参数与from、to时，以recent参数为准 **约束限制：** 不涉及 **取值范围：**  - yesterday：昨天  - today：今天  - 3days：近3天   - 1week：近7天   - 1month：近30天  **默认取值：** 不涉及
     * @return recent
     */
    public RecentEnum getRecent() {
        return recent;
    }

    public void setRecent(RecentEnum recent) {
        this.recent = recent;
    }

    public ListEventRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 起始时间(毫秒时间戳)，需要和to同时使用 **约束限制：** from <= to **取值范围：** from ~ to 最大范围30天 **默认取值：** 不涉及
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListEventRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 结束时间(毫秒时间戳)，需要和from同时使用 **约束限制：** from ~ to 最大范围30天 **取值范围：** 不能超过当天的结束时间 **默认取值：** 不涉及
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListEventRequest withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public ListEventRequest addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ListEventRequest withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释：** 防护事件id列表，支持模糊查询 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public ListEventRequest withNids(List<String> nids) {
        this.nids = nids;
        return this;
    }

    public ListEventRequest addNidsItem(String nidsItem) {
        if (this.nids == null) {
            this.nids = new ArrayList<>();
        }
        this.nids.add(nidsItem);
        return this;
    }

    public ListEventRequest withNids(Consumer<List<String>> nidsSetter) {
        if (this.nids == null) {
            this.nids = new ArrayList<>();
        }
        nidsSetter.accept(this.nids);
        return this;
    }

    /**
     * **参数解释：** 防护事件id列表（排除搜索），支持模糊查询 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nids
     */
    public List<String> getNids() {
        return nids;
    }

    public void setNids(List<String> nids) {
        this.nids = nids;
    }

    public ListEventRequest withAttacks(List<AttacksEnum> attacks) {
        this.attacks = attacks;
        return this;
    }

    public ListEventRequest addAttacksItem(AttacksEnum attacksItem) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        this.attacks.add(attacksItem);
        return this;
    }

    public ListEventRequest withAttacks(Consumer<List<AttacksEnum>> attacksSetter) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        attacksSetter.accept(this.attacks);
        return this;
    }

    /**
     * **参数解释：** 攻击类型 **约束限制：** 不涉及 **取值范围：** - xss：XSS攻击  - botm：BOT攻击 - webshell：网站木马  - vuln：其他漏洞攻击 - sqli：sql注入攻击  - robot：恶意爬虫  - rfi：远程文件包含  - rce：远程代码执行 - ptr：目录遍历 - lfi：本地文件包含 - antileakage：网站信息泄漏  - iprank：IP信誉库 - custom_whiteblackip：IP黑白名单 - custom_whiteip：白名单 - custom_blackip：黑名单 - custom_robot：扫描器爬虫 - custom_geoip：地理访问控制 - custom_idc_ip：IDC情报 - custom_custom：精准防护  - cmdi：命令注入攻击  - cc：cc攻击  - antitamper：网页防篡改  - anticrawler：网站反爬虫   - third_bot_river：第三方反爬虫 - antiscan_high_freq_scan：高频扫描封禁 - antiscan_dir_traversal：目录遍历防护 - illegal：非法请求 - followed_action：攻击惩罚 - advanced_bot：BOT管理 - llm_prompt_injection：提示词注入攻击 - llm_prompt_sensitive：提示词违规 - llm_response_sensitive：响应违规 **默认取值：** 不涉及
     * @return attacks
     */
    public List<AttacksEnum> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<AttacksEnum> attacks) {
        this.attacks = attacks;
    }

    public ListEventRequest withNattacks(List<NattacksEnum> nattacks) {
        this.nattacks = nattacks;
        return this;
    }

    public ListEventRequest addNattacksItem(NattacksEnum nattacksItem) {
        if (this.nattacks == null) {
            this.nattacks = new ArrayList<>();
        }
        this.nattacks.add(nattacksItem);
        return this;
    }

    public ListEventRequest withNattacks(Consumer<List<NattacksEnum>> nattacksSetter) {
        if (this.nattacks == null) {
            this.nattacks = new ArrayList<>();
        }
        nattacksSetter.accept(this.nattacks);
        return this;
    }

    /**
     * **参数解释：** 攻击类型（排除搜索） **约束限制：** 不涉及 **取值范围：** - xss：XSS攻击  - botm：BOT攻击 - webshell：网站木马  - vuln：其他漏洞攻击 - sqli：sql注入攻击  - robot：恶意爬虫  - rfi：远程文件包含  - rce：远程代码执行 - ptr：目录遍历 - lfi：本地文件包含 - antileakage：网站信息泄漏  - iprank：IP信誉库 - custom_whiteblackip：IP黑白名单 - custom_whiteip：白名单 - custom_blackip：黑名单 - custom_robot：扫描器爬虫 - custom_geoip：地理访问控制 - custom_idc_ip：IDC情报 - custom_custom：精准防护  - cmdi：命令注入攻击  - cc：cc攻击  - antitamper：网页防篡改  - anticrawler：网站反爬虫   - third_bot_river：第三方反爬虫 - antiscan_high_freq_scan：高频扫描封禁 - antiscan_dir_traversal：目录遍历防护 - illegal：非法请求 - followed_action：攻击惩罚 - advanced_bot：BOT管理 - llm_prompt_injection：提示词注入攻击 - llm_prompt_sensitive：提示词违规 - llm_response_sensitive：响应违规 **默认取值：** 不涉及
     * @return nattacks
     */
    public List<NattacksEnum> getNattacks() {
        return nattacks;
    }

    public void setNattacks(List<NattacksEnum> nattacks) {
        this.nattacks = nattacks;
    }

    public ListEventRequest withRules(List<String> rules) {
        this.rules = rules;
        return this;
    }

    public ListEventRequest addRulesItem(String rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ListEventRequest withRules(Consumer<List<String>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * **参数解释：** 规则id列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return rules
     */
    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public ListEventRequest withNrules(List<String> nrules) {
        this.nrules = nrules;
        return this;
    }

    public ListEventRequest addNrulesItem(String nrulesItem) {
        if (this.nrules == null) {
            this.nrules = new ArrayList<>();
        }
        this.nrules.add(nrulesItem);
        return this;
    }

    public ListEventRequest withNrules(Consumer<List<String>> nrulesSetter) {
        if (this.nrules == null) {
            this.nrules = new ArrayList<>();
        }
        nrulesSetter.accept(this.nrules);
        return this;
    }

    /**
     * **参数解释：** 规则id列表（排除搜索） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nrules
     */
    public List<String> getNrules() {
        return nrules;
    }

    public void setNrules(List<String> nrules) {
        this.nrules = nrules;
    }

    public ListEventRequest withSips(List<String> sips) {
        this.sips = sips;
        return this;
    }

    public ListEventRequest addSipsItem(String sipsItem) {
        if (this.sips == null) {
            this.sips = new ArrayList<>();
        }
        this.sips.add(sipsItem);
        return this;
    }

    public ListEventRequest withSips(Consumer<List<String>> sipsSetter) {
        if (this.sips == null) {
            this.sips = new ArrayList<>();
        }
        sipsSetter.accept(this.sips);
        return this;
    }

    /**
     * **参数解释：** 客户端IP列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sips
     */
    public List<String> getSips() {
        return sips;
    }

    public void setSips(List<String> sips) {
        this.sips = sips;
    }

    public ListEventRequest withNsips(List<String> nsips) {
        this.nsips = nsips;
        return this;
    }

    public ListEventRequest addNsipsItem(String nsipsItem) {
        if (this.nsips == null) {
            this.nsips = new ArrayList<>();
        }
        this.nsips.add(nsipsItem);
        return this;
    }

    public ListEventRequest withNsips(Consumer<List<String>> nsipsSetter) {
        if (this.nsips == null) {
            this.nsips = new ArrayList<>();
        }
        nsipsSetter.accept(this.nsips);
        return this;
    }

    /**
     * **参数解释：** 客户端IP列表（排除搜索） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nsips
     */
    public List<String> getNsips() {
        return nsips;
    }

    public void setNsips(List<String> nsips) {
        this.nsips = nsips;
    }

    public ListEventRequest withSip(String sip) {
        this.sip = sip;
        return this;
    }

    /**
     * **参数解释：** 客户端IP，当query_mode为\"equal\"时为精确查询，否则模糊查询 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sip
     */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public ListEventRequest withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public ListEventRequest addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public ListEventRequest withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * **参数解释：** url列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public ListEventRequest withNurls(List<String> nurls) {
        this.nurls = nurls;
        return this;
    }

    public ListEventRequest addNurlsItem(String nurlsItem) {
        if (this.nurls == null) {
            this.nurls = new ArrayList<>();
        }
        this.nurls.add(nurlsItem);
        return this;
    }

    public ListEventRequest withNurls(Consumer<List<String>> nurlsSetter) {
        if (this.nurls == null) {
            this.nurls = new ArrayList<>();
        }
        nurlsSetter.accept(this.nurls);
        return this;
    }

    /**
     * **参数解释：** url列表（排除搜索） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nurls
     */
    public List<String> getNurls() {
        return nurls;
    }

    public void setNurls(List<String> nurls) {
        this.nurls = nurls;
    }

    public ListEventRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** URL，当query_mode为\"equal\"时为精确查询，否则模糊查询 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ListEventRequest withActions(List<ActionsEnum> actions) {
        this.actions = actions;
        return this;
    }

    public ListEventRequest addActionsItem(ActionsEnum actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ListEventRequest withActions(Consumer<List<ActionsEnum>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 防护动作列表 **约束限制：** 不涉及 **取值范围：** - block：拦截 - pass：放行 - log：仅记录 - captcha：人机验证 - cache：不匹配 - mask：过滤 - js_challenge：JS挑战 - advanced_captcha：高级人机验证 - abort_response：中断响应 - desensitize：脱敏 **默认取值：** 不涉及
     * @return actions
     */
    public List<ActionsEnum> getActions() {
        return actions;
    }

    public void setActions(List<ActionsEnum> actions) {
        this.actions = actions;
    }

    public ListEventRequest withNactions(List<NactionsEnum> nactions) {
        this.nactions = nactions;
        return this;
    }

    public ListEventRequest addNactionsItem(NactionsEnum nactionsItem) {
        if (this.nactions == null) {
            this.nactions = new ArrayList<>();
        }
        this.nactions.add(nactionsItem);
        return this;
    }

    public ListEventRequest withNactions(Consumer<List<NactionsEnum>> nactionsSetter) {
        if (this.nactions == null) {
            this.nactions = new ArrayList<>();
        }
        nactionsSetter.accept(this.nactions);
        return this;
    }

    /**
     * **参数解释：** 防护动作列表（排除搜索） **约束限制：** 不涉及 **取值范围：** - block：拦截 - pass：放行 - log：仅记录 - captcha：人机验证 - cache：不匹配 - mask：过滤 - js_challenge：JS挑战 - advanced_captcha：高级人机验证 - abort_response：中断响应 - desensitize：脱敏 **默认取值：** 不涉及
     * @return nactions
     */
    public List<NactionsEnum> getNactions() {
        return nactions;
    }

    public void setNactions(List<NactionsEnum> nactions) {
        this.nactions = nactions;
    }

    public ListEventRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * **参数解释：** 域名，支持模糊查询 **约束限制：** domain和ndomain不可同时查询，当两个都存在时以domain为准 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListEventRequest withNdomain(String ndomain) {
        this.ndomain = ndomain;
        return this;
    }

    /**
     * **参数解释：** 域名（排除搜索），支持模糊查询 **约束限制：** domain和ndomain不可同时查询，当两个都存在时以domain为准 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ndomain
     */
    public String getNdomain() {
        return ndomain;
    }

    public void setNdomain(String ndomain) {
        this.ndomain = ndomain;
    }

    public ListEventRequest withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public ListEventRequest addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListEventRequest withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * **参数解释：** 域名列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public ListEventRequest withIpCountries(List<String> ipCountries) {
        this.ipCountries = ipCountries;
        return this;
    }

    public ListEventRequest addIpCountriesItem(String ipCountriesItem) {
        if (this.ipCountries == null) {
            this.ipCountries = new ArrayList<>();
        }
        this.ipCountries.add(ipCountriesItem);
        return this;
    }

    public ListEventRequest withIpCountries(Consumer<List<String>> ipCountriesSetter) {
        if (this.ipCountries == null) {
            this.ipCountries = new ArrayList<>();
        }
        ipCountriesSetter.accept(this.ipCountries);
        return this;
    }

    /**
     * **参数解释：** 客户端IP所属国家列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ipCountries
     */
    public List<String> getIpCountries() {
        return ipCountries;
    }

    public void setIpCountries(List<String> ipCountries) {
        this.ipCountries = ipCountries;
    }

    public ListEventRequest withNipCountries(List<String> nipCountries) {
        this.nipCountries = nipCountries;
        return this;
    }

    public ListEventRequest addNipCountriesItem(String nipCountriesItem) {
        if (this.nipCountries == null) {
            this.nipCountries = new ArrayList<>();
        }
        this.nipCountries.add(nipCountriesItem);
        return this;
    }

    public ListEventRequest withNipCountries(Consumer<List<String>> nipCountriesSetter) {
        if (this.nipCountries == null) {
            this.nipCountries = new ArrayList<>();
        }
        nipCountriesSetter.accept(this.nipCountries);
        return this;
    }

    /**
     * **参数解释：** 客户端IP所属国家列表（排除搜索） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nipCountries
     */
    public List<String> getNipCountries() {
        return nipCountries;
    }

    public void setNipCountries(List<String> nipCountries) {
        this.nipCountries = nipCountries;
    }

    public ListEventRequest withIpRegions(List<String> ipRegions) {
        this.ipRegions = ipRegions;
        return this;
    }

    public ListEventRequest addIpRegionsItem(String ipRegionsItem) {
        if (this.ipRegions == null) {
            this.ipRegions = new ArrayList<>();
        }
        this.ipRegions.add(ipRegionsItem);
        return this;
    }

    public ListEventRequest withIpRegions(Consumer<List<String>> ipRegionsSetter) {
        if (this.ipRegions == null) {
            this.ipRegions = new ArrayList<>();
        }
        ipRegionsSetter.accept(this.ipRegions);
        return this;
    }

    /**
     * **参数解释：** 客户端IP所属省份列表，仅中国省份生效 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ipRegions
     */
    public List<String> getIpRegions() {
        return ipRegions;
    }

    public void setIpRegions(List<String> ipRegions) {
        this.ipRegions = ipRegions;
    }

    public ListEventRequest withNipRegions(List<String> nipRegions) {
        this.nipRegions = nipRegions;
        return this;
    }

    public ListEventRequest addNipRegionsItem(String nipRegionsItem) {
        if (this.nipRegions == null) {
            this.nipRegions = new ArrayList<>();
        }
        this.nipRegions.add(nipRegionsItem);
        return this;
    }

    public ListEventRequest withNipRegions(Consumer<List<String>> nipRegionsSetter) {
        if (this.nipRegions == null) {
            this.nipRegions = new ArrayList<>();
        }
        nipRegionsSetter.accept(this.nipRegions);
        return this;
    }

    /**
     * **参数解释：** 客户端IP所属身份列表（排除搜索），仅中国省份生效 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nipRegions
     */
    public List<String> getNipRegions() {
        return nipRegions;
    }

    public void setNipRegions(List<String> nipRegions) {
        this.nipRegions = nipRegions;
    }

    public ListEventRequest withResponseCodes(List<String> responseCodes) {
        this.responseCodes = responseCodes;
        return this;
    }

    public ListEventRequest addResponseCodesItem(String responseCodesItem) {
        if (this.responseCodes == null) {
            this.responseCodes = new ArrayList<>();
        }
        this.responseCodes.add(responseCodesItem);
        return this;
    }

    public ListEventRequest withResponseCodes(Consumer<List<String>> responseCodesSetter) {
        if (this.responseCodes == null) {
            this.responseCodes = new ArrayList<>();
        }
        responseCodesSetter.accept(this.responseCodes);
        return this;
    }

    /**
     * **参数解释：** 响应码列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return responseCodes
     */
    public List<String> getResponseCodes() {
        return responseCodes;
    }

    public void setResponseCodes(List<String> responseCodes) {
        this.responseCodes = responseCodes;
    }

    public ListEventRequest withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * **参数解释：** 恶意负载（被WAF识别的攻击片段）： Web 基础防护(SQL注入、XSS、命令注入等)：被WAF识别的攻击片段 CC 攻击：命中规则的请求次数 精准防护、IP黑白名单、地理访问控制：空 攻击惩罚：命中攻击惩罚的用户标识 恶意爬虫：命中规则的 User-Agent 字段 网页反爬虫：JS 脚本事件：js_verified（JS 脚本验证通过事件）和 js_challenge（发送 JS 验证内容事件）。如果请求验证失败则为空。 网站信息泄露：敏感信息过滤为过滤类型，既电话号码,电子邮箱,身份证号；响应码拦截则为拦截的响应码值。 BOT攻击：命中规则的User-Agent等异常请求特征，或AI行为检测结果的评分细节 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ListEventRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListEventRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListEventRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 域名id列表，从获取防护网站列表（ListHost）接口获取域名id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListEventRequest withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public ListEventRequest addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListEventRequest withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释：** 引擎实例id列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public ListEventRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，返回第几页数据 **约束限制：** 不涉及 **取值范围：** page参数的实际有效范围取决于总数据量和pagesize的取值，不能大于总页数 **默认取值：** 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListEventRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，每页包含的结果条数 **约束限制：** 不涉及 **取值范围：** [0, 总数据量] **默认取值：** 10
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public ListEventRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释：** 排序字段，默认attack_time，选择其他字段时，会按照指定字段和attack_time共同排序 **约束限制：** 不涉及 **取值范围：** - attack_time 攻击时间 - sort_ip 客户端IP - host 域名 - geo_str 地理位置 - component 应用组件 - rule 规则ID - attack 事件类型（攻击类型） **默认取值：** attack_time
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListEventRequest withSortDirection(SortDirectionEnum sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * **参数解释：** 排序方向 **约束限制：** 不涉及 **取值范围：** - desc 降序 - asc 升序 **默认取值：** desc
     * @return sortDirection
     */
    public SortDirectionEnum getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirectionEnum sortDirection) {
        this.sortDirection = sortDirection;
    }

    public ListEventRequest withQueryMode(QueryModeEnum queryMode) {
        this.queryMode = queryMode;
        return this;
    }

    /**
     * **参数解释：** 查询模式，仅影响参数sip、url **约束限制：** 不涉及 **取值范围：** - equal 精确查询 - include 模糊查询 **默认取值：** include
     * @return queryMode
     */
    public QueryModeEnum getQueryMode() {
        return queryMode;
    }

    public void setQueryMode(QueryModeEnum queryMode) {
        this.queryMode = queryMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventRequest that = (ListEventRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.recent, that.recent) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.nids, that.nids) && Objects.equals(this.attacks, that.attacks)
            && Objects.equals(this.nattacks, that.nattacks) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.nrules, that.nrules) && Objects.equals(this.sips, that.sips)
            && Objects.equals(this.nsips, that.nsips) && Objects.equals(this.sip, that.sip)
            && Objects.equals(this.urls, that.urls) && Objects.equals(this.nurls, that.nurls)
            && Objects.equals(this.url, that.url) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.nactions, that.nactions) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.ndomain, that.ndomain) && Objects.equals(this.domains, that.domains)
            && Objects.equals(this.ipCountries, that.ipCountries)
            && Objects.equals(this.nipCountries, that.nipCountries) && Objects.equals(this.ipRegions, that.ipRegions)
            && Objects.equals(this.nipRegions, that.nipRegions)
            && Objects.equals(this.responseCodes, that.responseCodes) && Objects.equals(this.payload, that.payload)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.page, that.page) && Objects.equals(this.pagesize, that.pagesize)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDirection, that.sortDirection)
            && Objects.equals(this.queryMode, that.queryMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            enterpriseProjectId,
            recent,
            from,
            to,
            ids,
            nids,
            attacks,
            nattacks,
            rules,
            nrules,
            sips,
            nsips,
            sip,
            urls,
            nurls,
            url,
            actions,
            nactions,
            domain,
            ndomain,
            domains,
            ipCountries,
            nipCountries,
            ipRegions,
            nipRegions,
            responseCodes,
            payload,
            hosts,
            instances,
            page,
            pagesize,
            sortKey,
            sortDirection,
            queryMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    nids: ").append(toIndentedString(nids)).append("\n");
        sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
        sb.append("    nattacks: ").append(toIndentedString(nattacks)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    nrules: ").append(toIndentedString(nrules)).append("\n");
        sb.append("    sips: ").append(toIndentedString(sips)).append("\n");
        sb.append("    nsips: ").append(toIndentedString(nsips)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    nurls: ").append(toIndentedString(nurls)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    nactions: ").append(toIndentedString(nactions)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    ndomain: ").append(toIndentedString(ndomain)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    ipCountries: ").append(toIndentedString(ipCountries)).append("\n");
        sb.append("    nipCountries: ").append(toIndentedString(nipCountries)).append("\n");
        sb.append("    ipRegions: ").append(toIndentedString(ipRegions)).append("\n");
        sb.append("    nipRegions: ").append(toIndentedString(nipRegions)).append("\n");
        sb.append("    responseCodes: ").append(toIndentedString(responseCodes)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
        sb.append("    queryMode: ").append(toIndentedString(queryMode)).append("\n");
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
