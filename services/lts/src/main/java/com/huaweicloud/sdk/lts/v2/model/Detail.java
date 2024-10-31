package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Detail
 */
public class Detail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_key")

    private String sourceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<String> keys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_line_regex")

    private String multiLineRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_source")

    private Boolean keepSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_source_if_parse_error")

    private Boolean keepSourceIfParseError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "split_sep")

    private String splitSep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "split_type")

    private String splitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private Map<String, String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop_keys")

    private List<String> dropKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_keys")

    private List<String> sourceKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_keys")

    private List<String> destKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_depth")

    private Integer expandDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_connector")

    private String expandConnector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_format")

    private String sourceFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_value")

    private String sourceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_time")

    private Boolean setTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include")

    private Map<String, String> include = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude")

    private Map<String, String> exclude = null;

    public Detail withSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }

    /**
     * 自定义时间key字段名称
     * @return sourceKey
     */
    public String getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    public Detail withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * 正则解析正则表达式 单行完全正则，多行完全正则需填此字段
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public Detail withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    public Detail addKeysItem(String keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public Detail withKeys(Consumer<List<String>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    /**
     * 字段名称列表 与field_name字段保持一致
     * @return keys
     */
    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public Detail withMultiLineRegex(String multiLineRegex) {
        this.multiLineRegex = multiLineRegex;
        return this;
    }

    /**
     * 首行正则表达式
     * @return multiLineRegex
     */
    public String getMultiLineRegex() {
        return multiLineRegex;
    }

    public void setMultiLineRegex(String multiLineRegex) {
        this.multiLineRegex = multiLineRegex;
    }

    public Detail withKeepSource(Boolean keepSource) {
        this.keepSource = keepSource;
        return this;
    }

    /**
     * 是否上传原始日志
     * @return keepSource
     */
    public Boolean getKeepSource() {
        return keepSource;
    }

    public void setKeepSource(Boolean keepSource) {
        this.keepSource = keepSource;
    }

    public Detail withKeepSourceIfParseError(Boolean keepSourceIfParseError) {
        this.keepSourceIfParseError = keepSourceIfParseError;
        return this;
    }

    /**
     * 是否上传解析失败日志
     * @return keepSourceIfParseError
     */
    public Boolean getKeepSourceIfParseError() {
        return keepSourceIfParseError;
    }

    public void setKeepSourceIfParseError(Boolean keepSourceIfParseError) {
        this.keepSourceIfParseError = keepSourceIfParseError;
    }

    public Detail withSplitSep(String splitSep) {
        this.splitSep = splitSep;
        return this;
    }

    /**
     * 分隔符 自定义字符最大长度10，自定义字符串最大长度30
     * @return splitSep
     */
    public String getSplitSep() {
        return splitSep;
    }

    public void setSplitSep(String splitSep) {
        this.splitSep = splitSep;
    }

    public Detail withSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }

    /**
     * 分隔符类型：char-自定义字符；special_char-不可见字符；string-自定义字符串
     * @return splitType
     */
    public String getSplitType() {
        return splitType;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    public Detail withFields(Map<String, String> fields) {
        this.fields = fields;
        return this;
    }

    public Detail putFieldsItem(String key, String fieldsItem) {
        if (this.fields == null) {
            this.fields = new HashMap<>();
        }
        this.fields.put(key, fieldsItem);
        return this;
    }

    public Detail withFields(Consumer<Map<String, String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new HashMap<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 添加的字段列表：<字段名称 : 字段内容>
     * @return fields
     */
    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    public Detail withDropKeys(List<String> dropKeys) {
        this.dropKeys = dropKeys;
        return this;
    }

    public Detail addDropKeysItem(String dropKeysItem) {
        if (this.dropKeys == null) {
            this.dropKeys = new ArrayList<>();
        }
        this.dropKeys.add(dropKeysItem);
        return this;
    }

    public Detail withDropKeys(Consumer<List<String>> dropKeysSetter) {
        if (this.dropKeys == null) {
            this.dropKeys = new ArrayList<>();
        }
        dropKeysSetter.accept(this.dropKeys);
        return this;
    }

    /**
     * 删除的字段列表
     * @return dropKeys
     */
    public List<String> getDropKeys() {
        return dropKeys;
    }

    public void setDropKeys(List<String> dropKeys) {
        this.dropKeys = dropKeys;
    }

    public Detail withSourceKeys(List<String> sourceKeys) {
        this.sourceKeys = sourceKeys;
        return this;
    }

    public Detail addSourceKeysItem(String sourceKeysItem) {
        if (this.sourceKeys == null) {
            this.sourceKeys = new ArrayList<>();
        }
        this.sourceKeys.add(sourceKeysItem);
        return this;
    }

    public Detail withSourceKeys(Consumer<List<String>> sourceKeysSetter) {
        if (this.sourceKeys == null) {
            this.sourceKeys = new ArrayList<>();
        }
        sourceKeysSetter.accept(this.sourceKeys);
        return this;
    }

    /**
     * 字段重命名源字段名称列表
     * @return sourceKeys
     */
    public List<String> getSourceKeys() {
        return sourceKeys;
    }

    public void setSourceKeys(List<String> sourceKeys) {
        this.sourceKeys = sourceKeys;
    }

    public Detail withDestKeys(List<String> destKeys) {
        this.destKeys = destKeys;
        return this;
    }

    public Detail addDestKeysItem(String destKeysItem) {
        if (this.destKeys == null) {
            this.destKeys = new ArrayList<>();
        }
        this.destKeys.add(destKeysItem);
        return this;
    }

    public Detail withDestKeys(Consumer<List<String>> destKeysSetter) {
        if (this.destKeys == null) {
            this.destKeys = new ArrayList<>();
        }
        destKeysSetter.accept(this.destKeys);
        return this;
    }

    /**
     * 字段重命名替换的字段名称列表
     * @return destKeys
     */
    public List<String> getDestKeys() {
        return destKeys;
    }

    public void setDestKeys(List<String> destKeys) {
        this.destKeys = destKeys;
    }

    public Detail withExpandDepth(Integer expandDepth) {
        this.expandDepth = expandDepth;
        return this;
    }

    /**
     * json解析深度，默认为1层最大4层
     * @return expandDepth
     */
    public Integer getExpandDepth() {
        return expandDepth;
    }

    public void setExpandDepth(Integer expandDepth) {
        this.expandDepth = expandDepth;
    }

    public Detail withExpandConnector(String expandConnector) {
        this.expandConnector = expandConnector;
        return this;
    }

    /**
     * json解析字段名称连接符
     * @return expandConnector
     */
    public String getExpandConnector() {
        return expandConnector;
    }

    public void setExpandConnector(String expandConnector) {
        this.expandConnector = expandConnector;
    }

    public Detail withSourceFormat(String sourceFormat) {
        this.sourceFormat = sourceFormat;
        return this;
    }

    /**
     * 自定义时间时间格式
     * @return sourceFormat
     */
    public String getSourceFormat() {
        return sourceFormat;
    }

    public void setSourceFormat(String sourceFormat) {
        this.sourceFormat = sourceFormat;
    }

    public Detail withSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
        return this;
    }

    /**
     * 自定义时间字段value
     * @return sourceValue
     */
    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }

    public Detail withSetTime(Boolean setTime) {
        this.setTime = setTime;
        return this;
    }

    /**
     * 是否开启自定义时间的开关
     * @return setTime
     */
    public Boolean getSetTime() {
        return setTime;
    }

    public void setSetTime(Boolean setTime) {
        this.setTime = setTime;
    }

    public Detail withInclude(Map<String, String> include) {
        this.include = include;
        return this;
    }

    public Detail putIncludeItem(String key, String includeItem) {
        if (this.include == null) {
            this.include = new HashMap<>();
        }
        this.include.put(key, includeItem);
        return this;
    }

    public Detail withInclude(Consumer<Map<String, String>> includeSetter) {
        if (this.include == null) {
            this.include = new HashMap<>();
        }
        includeSetter.accept(this.include);
        return this;
    }

    /**
     * 日志过滤白名单规则 key长度最大为256，value最大长度为128，key不可以重复
     * @return include
     */
    public Map<String, String> getInclude() {
        return include;
    }

    public void setInclude(Map<String, String> include) {
        this.include = include;
    }

    public Detail withExclude(Map<String, String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public Detail putExcludeItem(String key, String excludeItem) {
        if (this.exclude == null) {
            this.exclude = new HashMap<>();
        }
        this.exclude.put(key, excludeItem);
        return this;
    }

    public Detail withExclude(Consumer<Map<String, String>> excludeSetter) {
        if (this.exclude == null) {
            this.exclude = new HashMap<>();
        }
        excludeSetter.accept(this.exclude);
        return this;
    }

    /**
     * 日志过滤白名单规则 key长度最大为256，value最大长度为128，key不可以重复
     * @return exclude
     */
    public Map<String, String> getExclude() {
        return exclude;
    }

    public void setExclude(Map<String, String> exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Detail that = (Detail) obj;
        return Objects.equals(this.sourceKey, that.sourceKey) && Objects.equals(this.regex, that.regex)
            && Objects.equals(this.keys, that.keys) && Objects.equals(this.multiLineRegex, that.multiLineRegex)
            && Objects.equals(this.keepSource, that.keepSource)
            && Objects.equals(this.keepSourceIfParseError, that.keepSourceIfParseError)
            && Objects.equals(this.splitSep, that.splitSep) && Objects.equals(this.splitType, that.splitType)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.dropKeys, that.dropKeys)
            && Objects.equals(this.sourceKeys, that.sourceKeys) && Objects.equals(this.destKeys, that.destKeys)
            && Objects.equals(this.expandDepth, that.expandDepth)
            && Objects.equals(this.expandConnector, that.expandConnector)
            && Objects.equals(this.sourceFormat, that.sourceFormat)
            && Objects.equals(this.sourceValue, that.sourceValue) && Objects.equals(this.setTime, that.setTime)
            && Objects.equals(this.include, that.include) && Objects.equals(this.exclude, that.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceKey,
            regex,
            keys,
            multiLineRegex,
            keepSource,
            keepSourceIfParseError,
            splitSep,
            splitType,
            fields,
            dropKeys,
            sourceKeys,
            destKeys,
            expandDepth,
            expandConnector,
            sourceFormat,
            sourceValue,
            setTime,
            include,
            exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Detail {\n");
        sb.append("    sourceKey: ").append(toIndentedString(sourceKey)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    multiLineRegex: ").append(toIndentedString(multiLineRegex)).append("\n");
        sb.append("    keepSource: ").append(toIndentedString(keepSource)).append("\n");
        sb.append("    keepSourceIfParseError: ").append(toIndentedString(keepSourceIfParseError)).append("\n");
        sb.append("    splitSep: ").append(toIndentedString(splitSep)).append("\n");
        sb.append("    splitType: ").append(toIndentedString(splitType)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    dropKeys: ").append(toIndentedString(dropKeys)).append("\n");
        sb.append("    sourceKeys: ").append(toIndentedString(sourceKeys)).append("\n");
        sb.append("    destKeys: ").append(toIndentedString(destKeys)).append("\n");
        sb.append("    expandDepth: ").append(toIndentedString(expandDepth)).append("\n");
        sb.append("    expandConnector: ").append(toIndentedString(expandConnector)).append("\n");
        sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
        sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
        sb.append("    setTime: ").append(toIndentedString(setTime)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
