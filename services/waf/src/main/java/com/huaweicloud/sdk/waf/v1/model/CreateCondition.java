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
 * 条件列表参数较为复杂，存在级联关系，建议同时使用控制台上的添加误报屏蔽规则，单击F12键查看路径后缀为/ignore，方法为POST的请求参数，便于理解参数的填写
 */
public class CreateCondition {

    /**
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：** - url: 路径 - custom_geoip: 客户端IP所属的地理位置 - robot: 已知特征爬虫 - user-agent: User Agent - ip: IPv4 - ipv6: IPv6 - params: Params - cookie: Cookie - referer: Referer - header: Header - method: Method - request_line: Request Line - request: Request - protocol: Protocol - request_body: Request Body  **默认取值：** 不涉及
     */
    public static final class CategoryEnum {

        /**
         * Enum URL for value: "url"
         */
        public static final CategoryEnum URL = new CategoryEnum("url");

        /**
         * Enum CUSTOM_GEO for value: "custom_geo"
         */
        public static final CategoryEnum CUSTOM_GEO = new CategoryEnum("custom_geo");

        /**
         * Enum ROBOT for value: "robot"
         */
        public static final CategoryEnum ROBOT = new CategoryEnum("robot");

        /**
         * Enum USER_AGENT for value: "user-agent"
         */
        public static final CategoryEnum USER_AGENT = new CategoryEnum("user-agent");

        /**
         * Enum IP for value: "ip"
         */
        public static final CategoryEnum IP = new CategoryEnum("ip");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final CategoryEnum IPV6 = new CategoryEnum("ipv6");

        /**
         * Enum PARAMS for value: "params"
         */
        public static final CategoryEnum PARAMS = new CategoryEnum("params");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final CategoryEnum COOKIE = new CategoryEnum("cookie");

        /**
         * Enum REFERER for value: "referer"
         */
        public static final CategoryEnum REFERER = new CategoryEnum("referer");

        /**
         * Enum HEADER for value: "header"
         */
        public static final CategoryEnum HEADER = new CategoryEnum("header");

        /**
         * Enum METHOD for value: "method"
         */
        public static final CategoryEnum METHOD = new CategoryEnum("method");

        /**
         * Enum REQUEST_LINE for value: "request_line"
         */
        public static final CategoryEnum REQUEST_LINE = new CategoryEnum("request_line");

        /**
         * Enum REQUEST for value: "request"
         */
        public static final CategoryEnum REQUEST = new CategoryEnum("request");

        /**
         * Enum PROTOCOL for value: "protocol"
         */
        public static final CategoryEnum PROTOCOL = new CategoryEnum("protocol");

        /**
         * Enum REQUEST_BODY for value: "request_body"
         */
        public static final CategoryEnum REQUEST_BODY = new CategoryEnum("request_body");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("custom_geo", CUSTOM_GEO);
            map.put("robot", ROBOT);
            map.put("user-agent", USER_AGENT);
            map.put("ip", IP);
            map.put("ipv6", IPV6);
            map.put("params", PARAMS);
            map.put("cookie", COOKIE);
            map.put("referer", REFERER);
            map.put("header", HEADER);
            map.put("method", METHOD);
            map.put("request_line", REQUEST_LINE);
            map.put("request", REQUEST);
            map.put("protocol", PROTOCOL);
            map.put("request_body", REQUEST_BODY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    /**
     * **参数解释：** 匹配逻辑 **约束限制：** 匹配逻辑根据字段类型变化 **取值范围：** - url/user-agent/referer:    - contain_any: 包含任意一个   - not_contain_all: 不包含全部   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - prefix_any: 前缀匹配任意一个   - not_prefix_all: 前缀不匹配全部   - suffix_any: 后缀匹配任意一个   - not_suffix_all: 后缀不匹配全部   - contain: 包含   - not_contain: 不包含   - equal: 等于   - not_equal: 不等于   - prefix: 前缀匹配   - not_prefix: 前缀不匹配   - suffix: 后缀匹配   - not_suffix: 后缀不匹配   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - custom_geoip:    - belong: 属于   - not_belong: 不属于 - robot:    - match: 匹配   - not_match: 不匹配 - ip/ipv6:   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - equal: 等于   - not_equal: 不等于 - params/cookie/header:   - contain_any: 包含任意一个   - not_contain_all: 不包含全部   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - prefix_any: 前缀匹配任意一个   - not_prefix_all: 前缀不匹配全部   - suffix_any: 后缀匹配任意一个   - not_suffix_all: 后缀不匹配全部   - contain: 包含   - not_contain: 不包含   - equal: 等于   - not_equal: 不等于   - prefix: 前缀匹配   - not_prefix: 前缀不匹配   - suffix: 后缀匹配   - not_suffix: 后缀不匹配   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - num_equal: 数字等于   - num_not_equal: 数字不等于   - num_greater: 数字大于   - num_less: 数字小于   - exist: 存在   - not_exist: 不存在   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - method/protocol:   - equal: 等于   - not_equal: 不等于 - request_line:   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于 - request:   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - request_body:   - contain: 包含   - contain_any: 包含任意一个   - not_contain: 不包含   - not_contain_all: 不包含全部   - regular_match: 正则匹配   - regular_not_match: 正则不匹配  **默认取值：** 不涉及
     */
    public static final class LogicOperationEnum {

        /**
         * Enum LEN_EQUAL for value: "len_equal"
         */
        public static final LogicOperationEnum LEN_EQUAL = new LogicOperationEnum("len_equal");

        /**
         * Enum LEN_NOT_EQUAL for value: "len_not_equal"
         */
        public static final LogicOperationEnum LEN_NOT_EQUAL = new LogicOperationEnum("len_not_equal");

        /**
         * Enum LEN_GREATER for value: "len_greater"
         */
        public static final LogicOperationEnum LEN_GREATER = new LogicOperationEnum("len_greater");

        /**
         * Enum LEN_LESS for value: "len_less"
         */
        public static final LogicOperationEnum LEN_LESS = new LogicOperationEnum("len_less");

        /**
         * Enum LEN_GREATER_EQUAL for value: "len_greater_equal"
         */
        public static final LogicOperationEnum LEN_GREATER_EQUAL = new LogicOperationEnum("len_greater_equal");

        /**
         * Enum LEN_LESS_EQUAL for value: "len_less_equal"
         */
        public static final LogicOperationEnum LEN_LESS_EQUAL = new LogicOperationEnum("len_less_equal");

        /**
         * Enum REGULAR_MATCH for value: "regular_match"
         */
        public static final LogicOperationEnum REGULAR_MATCH = new LogicOperationEnum("regular_match");

        /**
         * Enum REGULAR_NOT_MATCH for value: "regular_not_match"
         */
        public static final LogicOperationEnum REGULAR_NOT_MATCH = new LogicOperationEnum("regular_not_match");

        /**
         * Enum MATCH for value: "match"
         */
        public static final LogicOperationEnum MATCH = new LogicOperationEnum("match");

        /**
         * Enum NOT_MATCH for value: "not_match"
         */
        public static final LogicOperationEnum NOT_MATCH = new LogicOperationEnum("not_match");

        /**
         * Enum NUM_EQUAL for value: "num_equal"
         */
        public static final LogicOperationEnum NUM_EQUAL = new LogicOperationEnum("num_equal");

        /**
         * Enum NUM_NOT_EQUAL for value: "num_not_equal"
         */
        public static final LogicOperationEnum NUM_NOT_EQUAL = new LogicOperationEnum("num_not_equal");

        /**
         * Enum NUM_GREATER for value: "num_greater"
         */
        public static final LogicOperationEnum NUM_GREATER = new LogicOperationEnum("num_greater");

        /**
         * Enum NUM_LESS for value: "num_less"
         */
        public static final LogicOperationEnum NUM_LESS = new LogicOperationEnum("num_less");

        /**
         * Enum EXIST for value: "exist"
         */
        public static final LogicOperationEnum EXIST = new LogicOperationEnum("exist");

        /**
         * Enum NOT_EXIST for value: "not_exist"
         */
        public static final LogicOperationEnum NOT_EXIST = new LogicOperationEnum("not_exist");

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final LogicOperationEnum EQUAL = new LogicOperationEnum("equal");

        /**
         * Enum NOT_EQUAL for value: "not_equal"
         */
        public static final LogicOperationEnum NOT_EQUAL = new LogicOperationEnum("not_equal");

        /**
         * Enum EQUAL_ANY for value: "equal_any"
         */
        public static final LogicOperationEnum EQUAL_ANY = new LogicOperationEnum("equal_any");

        /**
         * Enum NOT_EQUAL_ALL for value: "not_equal_all"
         */
        public static final LogicOperationEnum NOT_EQUAL_ALL = new LogicOperationEnum("not_equal_all");

        /**
         * Enum PREFIX for value: "prefix"
         */
        public static final LogicOperationEnum PREFIX = new LogicOperationEnum("prefix");

        /**
         * Enum PREFIX_ANY for value: "prefix_any"
         */
        public static final LogicOperationEnum PREFIX_ANY = new LogicOperationEnum("prefix_any");

        /**
         * Enum NOT_PREFIX for value: "not_prefix"
         */
        public static final LogicOperationEnum NOT_PREFIX = new LogicOperationEnum("not_prefix");

        /**
         * Enum NOT_PREFIX_ALL for value: "not_prefix_all"
         */
        public static final LogicOperationEnum NOT_PREFIX_ALL = new LogicOperationEnum("not_prefix_all");

        /**
         * Enum SUFFIX for value: "suffix"
         */
        public static final LogicOperationEnum SUFFIX = new LogicOperationEnum("suffix");

        /**
         * Enum SUFFIX_ANY for value: "suffix_any"
         */
        public static final LogicOperationEnum SUFFIX_ANY = new LogicOperationEnum("suffix_any");

        /**
         * Enum NOT_SUFFIX for value: "not_suffix"
         */
        public static final LogicOperationEnum NOT_SUFFIX = new LogicOperationEnum("not_suffix");

        /**
         * Enum NOT_SUFFIX_ALL for value: "not_suffix_all"
         */
        public static final LogicOperationEnum NOT_SUFFIX_ALL = new LogicOperationEnum("not_suffix_all");

        /**
         * Enum CONTAIN for value: "contain"
         */
        public static final LogicOperationEnum CONTAIN = new LogicOperationEnum("contain");

        /**
         * Enum CONTAIN_ANY for value: "contain_any"
         */
        public static final LogicOperationEnum CONTAIN_ANY = new LogicOperationEnum("contain_any");

        /**
         * Enum NOT_CONTAIN for value: "not_contain"
         */
        public static final LogicOperationEnum NOT_CONTAIN = new LogicOperationEnum("not_contain");

        /**
         * Enum NOT_CONTAIN_ALL for value: "not_contain_all"
         */
        public static final LogicOperationEnum NOT_CONTAIN_ALL = new LogicOperationEnum("not_contain_all");

        private static final Map<String, LogicOperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogicOperationEnum> createStaticFields() {
            Map<String, LogicOperationEnum> map = new HashMap<>();
            map.put("len_equal", LEN_EQUAL);
            map.put("len_not_equal", LEN_NOT_EQUAL);
            map.put("len_greater", LEN_GREATER);
            map.put("len_less", LEN_LESS);
            map.put("len_greater_equal", LEN_GREATER_EQUAL);
            map.put("len_less_equal", LEN_LESS_EQUAL);
            map.put("regular_match", REGULAR_MATCH);
            map.put("regular_not_match", REGULAR_NOT_MATCH);
            map.put("match", MATCH);
            map.put("not_match", NOT_MATCH);
            map.put("num_equal", NUM_EQUAL);
            map.put("num_not_equal", NUM_NOT_EQUAL);
            map.put("num_greater", NUM_GREATER);
            map.put("num_less", NUM_LESS);
            map.put("exist", EXIST);
            map.put("not_exist", NOT_EXIST);
            map.put("equal", EQUAL);
            map.put("not_equal", NOT_EQUAL);
            map.put("equal_any", EQUAL_ANY);
            map.put("not_equal_all", NOT_EQUAL_ALL);
            map.put("prefix", PREFIX);
            map.put("prefix_any", PREFIX_ANY);
            map.put("not_prefix", NOT_PREFIX);
            map.put("not_prefix_all", NOT_PREFIX_ALL);
            map.put("suffix", SUFFIX);
            map.put("suffix_any", SUFFIX_ANY);
            map.put("not_suffix", NOT_SUFFIX);
            map.put("not_suffix_all", NOT_SUFFIX_ALL);
            map.put("contain", CONTAIN);
            map.put("contain_any", CONTAIN_ANY);
            map.put("not_contain", NOT_CONTAIN);
            map.put("not_contain_all", NOT_CONTAIN_ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogicOperationEnum(String value) {
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
        public static LogicOperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogicOperationEnum(value));
        }

        public static LogicOperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogicOperationEnum) {
                return this.value.equals(((LogicOperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private LogicOperationEnum logicOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_indexes_logic")

    private Integer checkAllIndexesLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_id")

    private String valueListId;

    public CreateCondition withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：** - url: 路径 - custom_geoip: 客户端IP所属的地理位置 - robot: 已知特征爬虫 - user-agent: User Agent - ip: IPv4 - ipv6: IPv6 - params: Params - cookie: Cookie - referer: Referer - header: Header - method: Method - request_line: Request Line - request: Request - protocol: Protocol - request_body: Request Body  **默认取值：** 不涉及
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CreateCondition withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * **参数解释：** 子字段 **约束限制：** 随字段类型变化 **取值范围：** - custom_geoip:    - v4：ipv4   - v6：ipv6   - any：ipv4或ipv6 - ip/ipv6:    - null：客户端IP   - x-forwarded-for：请求header中X-Forwarded-For记录的IP   - $remote_addr：TCP连接IP   - $remote_sockaddr：3层源IP - params/cookie/header：   - check_all_indexes_logic为null： 可自定义子字段名称   - check_all_indexes_logic不为null：必须为null - 其他字段类型：不支持，默认为null  **默认取值：** 不涉及
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public CreateCondition withLogicOperation(LogicOperationEnum logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * **参数解释：** 匹配逻辑 **约束限制：** 匹配逻辑根据字段类型变化 **取值范围：** - url/user-agent/referer:    - contain_any: 包含任意一个   - not_contain_all: 不包含全部   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - prefix_any: 前缀匹配任意一个   - not_prefix_all: 前缀不匹配全部   - suffix_any: 后缀匹配任意一个   - not_suffix_all: 后缀不匹配全部   - contain: 包含   - not_contain: 不包含   - equal: 等于   - not_equal: 不等于   - prefix: 前缀匹配   - not_prefix: 前缀不匹配   - suffix: 后缀匹配   - not_suffix: 后缀不匹配   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - custom_geoip:    - belong: 属于   - not_belong: 不属于 - robot:    - match: 匹配   - not_match: 不匹配 - ip/ipv6:   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - equal: 等于   - not_equal: 不等于 - params/cookie/header:   - contain_any: 包含任意一个   - not_contain_all: 不包含全部   - equal_any: 等于任意一个   - not_equal_all: 不等于全部   - prefix_any: 前缀匹配任意一个   - not_prefix_all: 前缀不匹配全部   - suffix_any: 后缀匹配任意一个   - not_suffix_all: 后缀不匹配全部   - contain: 包含   - not_contain: 不包含   - equal: 等于   - not_equal: 不等于   - prefix: 前缀匹配   - not_prefix: 前缀不匹配   - suffix: 后缀匹配   - not_suffix: 后缀不匹配   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - num_equal: 数字等于   - num_not_equal: 数字不等于   - num_greater: 数字大于   - num_less: 数字小于   - exist: 存在   - not_exist: 不存在   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - method/protocol:   - equal: 等于   - not_equal: 不等于 - request_line:   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于 - request:   - len_equal: 长度等于   - len_not_equal: 长度不等于   - len_greater: 长度大于   - len_less: 长度小于   - len_greater_equal: 长度大于等于   - len_less_equal: 长度小于等于   - regular_match: 正则匹配   - regular_not_match: 正则不匹配 - request_body:   - contain: 包含   - contain_any: 包含任意一个   - not_contain: 不包含   - not_contain_all: 不包含全部   - regular_match: 正则匹配   - regular_not_match: 正则不匹配  **默认取值：** 不涉及
     * @return logicOperation
     */
    public LogicOperationEnum getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(LogicOperationEnum logicOperation) {
        this.logicOperation = logicOperation;
    }

    public CreateCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public CreateCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CreateCondition withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * **参数解释：** 条件列表逻辑匹配内容 **约束限制：** 当logic_operation参数不以any或者all结尾时，需要传该参数 **取值范围：** 匹配内容字符串长度范围：[1, 4096] 内容格式根据参数category和logic_operation变化： - logic_operation为数值比较类型：纯数字 - url: URL格式；仅支持单个匹配内容 - custom_geoip: 客户端IP所属国家或省份，多个位置以|分隔，比如：\"BJ|SH\" - robot: 已知特征爬虫列表，可选择多个   - crawler_engine：搜索引擎   - crawler_scanner：扫描器   - crawler_script：脚本工具   - crawler_other：其他爬虫 - ip: IPv4 - ipv6: IPv6 - referer: 例如：http://test.com - params：不包含& - user-agent/cookie/header/request_body: 无限制 - method: HTTP协议支持的method，字母大写 - protocol:    - http   - https  **默认取值：** 不涉及
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public CreateCondition withCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
        return this;
    }

    /**
     * **参数解释：** 需要检查所有子字段或检查任意子字段时传此参数 **约束限制：** 仅当category为params/cookie/header时支持 **取值范围：** - 1：所有子字段 - 2：任意子字段  **默认取值：** 不涉及
     * @return checkAllIndexesLogic
     */
    public Integer getCheckAllIndexesLogic() {
        return checkAllIndexesLogic;
    }

    public void setCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
    }

    public CreateCondition withValueListId(String valueListId) {
        this.valueListId = valueListId;
        return this;
    }

    /**
     * **参数解释：** 引用表ID **约束限制：** 当logic_operation参数以any或者all结尾时，需要传该参数；引用表类型要与category类型保持一致 **取值范围：** 通过ListValueList接口获取引用表ID  **默认取值：** 不涉及
     * @return valueListId
     */
    public String getValueListId() {
        return valueListId;
    }

    public void setValueListId(String valueListId) {
        this.valueListId = valueListId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCondition that = (CreateCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.index, that.index)
            && Objects.equals(this.logicOperation, that.logicOperation) && Objects.equals(this.contents, that.contents)
            && Objects.equals(this.checkAllIndexesLogic, that.checkAllIndexesLogic)
            && Objects.equals(this.valueListId, that.valueListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, index, logicOperation, contents, checkAllIndexesLogic, valueListId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    checkAllIndexesLogic: ").append(toIndentedString(checkAllIndexesLogic)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
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
