package com.huaweicloud.sdk.lts.v2.model;

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
 * LtsStructTemplateInfo
 */
public class LtsStructTemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_fields")

    private List<StructFieldInfo> demoFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_fields")

    private List<TagField> tagFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    /**
     * 结构化方式
     */
    public static final class ParseTypeEnum {

        /**
         * Enum BUILT_IN for value: "built_in"
         */
        public static final ParseTypeEnum BUILT_IN = new ParseTypeEnum("built_in");

        /**
         * Enum JSON for value: "json"
         */
        public static final ParseTypeEnum JSON = new ParseTypeEnum("json");

        /**
         * Enum CUSTOM_REGEX for value: "custom_regex"
         */
        public static final ParseTypeEnum CUSTOM_REGEX = new ParseTypeEnum("custom_regex");

        /**
         * Enum SPLIT for value: "split"
         */
        public static final ParseTypeEnum SPLIT = new ParseTypeEnum("split");

        /**
         * Enum NGINX for value: "nginx"
         */
        public static final ParseTypeEnum NGINX = new ParseTypeEnum("nginx");

        private static final Map<String, ParseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ParseTypeEnum> createStaticFields() {
            Map<String, ParseTypeEnum> map = new HashMap<>();
            map.put("built_in", BUILT_IN);
            map.put("json", JSON);
            map.put("custom_regex", CUSTOM_REGEX);
            map.put("split", SPLIT);
            map.put("nginx", NGINX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ParseTypeEnum(String value) {
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
        public static ParseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ParseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ParseTypeEnum(value);
            }
            return result;
        }

        public static ParseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ParseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ParseTypeEnum) {
                return this.value.equals(((ParseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_type")

    private ParseTypeEnum parseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_rules")

    private String regexRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layers")

    private Integer layers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokenizer")

    private String tokenizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_format")

    private String logFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private List<Rule> rule = null;

    public LtsStructTemplateInfo withDemoFields(List<StructFieldInfo> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public LtsStructTemplateInfo addDemoFieldsItem(StructFieldInfo demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public LtsStructTemplateInfo withDemoFields(Consumer<List<StructFieldInfo>> demoFieldsSetter) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        demoFieldsSetter.accept(this.demoFields);
        return this;
    }

    /**
     * 结构化字段
     * @return demoFields
     */
    public List<StructFieldInfo> getDemoFields() {
        return demoFields;
    }

    public void setDemoFields(List<StructFieldInfo> demoFields) {
        this.demoFields = demoFields;
    }

    public LtsStructTemplateInfo withTagFields(List<TagField> tagFields) {
        this.tagFields = tagFields;
        return this;
    }

    public LtsStructTemplateInfo addTagFieldsItem(TagField tagFieldsItem) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        this.tagFields.add(tagFieldsItem);
        return this;
    }

    public LtsStructTemplateInfo withTagFields(Consumer<List<TagField>> tagFieldsSetter) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        tagFieldsSetter.accept(this.tagFields);
        return this;
    }

    /**
     * tag字段列表（使用tag字段解析时需要，其中系统模板不支持使用tag字段）。
     * @return tagFields
     */
    public List<TagField> getTagFields() {
        return tagFields;
    }

    public void setTagFields(List<TagField> tagFields) {
        this.tagFields = tagFields;
    }

    public LtsStructTemplateInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 示例日志
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LtsStructTemplateInfo withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsStructTemplateInfo withParseType(ParseTypeEnum parseType) {
        this.parseType = parseType;
        return this;
    }

    /**
     * 结构化方式
     * @return parseType
     */
    public ParseTypeEnum getParseType() {
        return parseType;
    }

    public void setParseType(ParseTypeEnum parseType) {
        this.parseType = parseType;
    }

    public LtsStructTemplateInfo withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LtsStructTemplateInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LtsStructTemplateInfo withRegexRules(String regexRules) {
        this.regexRules = regexRules;
        return this;
    }

    /**
     * parse_type为custom_regex类型时必填，regex提取规则
     * @return regexRules
     */
    public String getRegexRules() {
        return regexRules;
    }

    public void setRegexRules(String regexRules) {
        this.regexRules = regexRules;
    }

    public LtsStructTemplateInfo withLayers(Integer layers) {
        this.layers = layers;
        return this;
    }

    /**
     * parse_type为json类型时必填，解析层数，目前固定是3
     * @return layers
     */
    public Integer getLayers() {
        return layers;
    }

    public void setLayers(Integer layers) {
        this.layers = layers;
    }

    public LtsStructTemplateInfo withTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }

    /**
     * parse_type为split类型时必填，分隔符，分词符号
     * @return tokenizer
     */
    public String getTokenizer() {
        return tokenizer;
    }

    public void setTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
    }

    public LtsStructTemplateInfo withLogFormat(String logFormat) {
        this.logFormat = logFormat;
        return this;
    }

    /**
     * parse_type为nginx类型时必填，nginx日志格式模板
     * @return logFormat
     */
    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    public LtsStructTemplateInfo withRule(List<Rule> rule) {
        this.rule = rule;
        return this;
    }

    public LtsStructTemplateInfo addRuleItem(Rule ruleItem) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        this.rule.add(ruleItem);
        return this;
    }

    public LtsStructTemplateInfo withRule(Consumer<List<Rule>> ruleSetter) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        ruleSetter.accept(this.rule);
        return this;
    }

    /**
     * 结构化方式
     * @return rule
     */
    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LtsStructTemplateInfo ltsStructTemplateInfo = (LtsStructTemplateInfo) o;
        return Objects.equals(this.demoFields, ltsStructTemplateInfo.demoFields)
            && Objects.equals(this.tagFields, ltsStructTemplateInfo.tagFields)
            && Objects.equals(this.content, ltsStructTemplateInfo.content)
            && Objects.equals(this.logGroupId, ltsStructTemplateInfo.logGroupId)
            && Objects.equals(this.parseType, ltsStructTemplateInfo.parseType)
            && Objects.equals(this.logStreamId, ltsStructTemplateInfo.logStreamId)
            && Objects.equals(this.projectId, ltsStructTemplateInfo.projectId)
            && Objects.equals(this.regexRules, ltsStructTemplateInfo.regexRules)
            && Objects.equals(this.layers, ltsStructTemplateInfo.layers)
            && Objects.equals(this.tokenizer, ltsStructTemplateInfo.tokenizer)
            && Objects.equals(this.logFormat, ltsStructTemplateInfo.logFormat)
            && Objects.equals(this.rule, ltsStructTemplateInfo.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(demoFields,
            tagFields,
            content,
            logGroupId,
            parseType,
            logStreamId,
            projectId,
            regexRules,
            layers,
            tokenizer,
            logFormat,
            rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsStructTemplateInfo {\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    tagFields: ").append(toIndentedString(tagFields)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    parseType: ").append(toIndentedString(parseType)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regexRules: ").append(toIndentedString(regexRules)).append("\n");
        sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
        sb.append("    tokenizer: ").append(toIndentedString(tokenizer)).append("\n");
        sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
