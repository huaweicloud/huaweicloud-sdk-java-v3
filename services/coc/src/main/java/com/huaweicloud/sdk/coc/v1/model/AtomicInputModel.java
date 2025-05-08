package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AtomicInputModel
 */
public class AtomicInputModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_key")

    private String paramKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name_zh")

    private String paramNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name_en")

    private String paramNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type")

    private String paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_len")

    private Integer minLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_len")

    private Integer maxLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    public AtomicInputModel withParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }

    /**
     * 参数变量名，执行时原子能力内引用
     * @return paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public AtomicInputModel withParamNameZh(String paramNameZh) {
        this.paramNameZh = paramNameZh;
        return this;
    }

    /**
     * 参数中文名，下拉展示时使用
     * @return paramNameZh
     */
    public String getParamNameZh() {
        return paramNameZh;
    }

    public void setParamNameZh(String paramNameZh) {
        this.paramNameZh = paramNameZh;
    }

    public AtomicInputModel withParamNameEn(String paramNameEn) {
        this.paramNameEn = paramNameEn;
        return this;
    }

    /**
     * 参数英文名，下拉展示时使用
     * @return paramNameEn
     */
    public String getParamNameEn() {
        return paramNameEn;
    }

    public void setParamNameEn(String paramNameEn) {
        this.paramNameEn = paramNameEn;
    }

    public AtomicInputModel withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public AtomicInputModel withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * 参数类型：常量/字典
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public AtomicInputModel withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public AtomicInputModel withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public AtomicInputModel withMinLen(Integer minLen) {
        this.minLen = minLen;
        return this;
    }

    /**
     * 长度最小值
     * @return minLen
     */
    public Integer getMinLen() {
        return minLen;
    }

    public void setMinLen(Integer minLen) {
        this.minLen = minLen;
    }

    public AtomicInputModel withMaxLen(Integer maxLen) {
        this.maxLen = maxLen;
        return this;
    }

    /**
     * 长度最大值
     * @return maxLen
     */
    public Integer getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(Integer maxLen) {
        this.maxLen = maxLen;
    }

    public AtomicInputModel withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 正则限制表达式
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AtomicInputModel that = (AtomicInputModel) obj;
        return Objects.equals(this.paramKey, that.paramKey) && Objects.equals(this.paramNameZh, that.paramNameZh)
            && Objects.equals(this.paramNameEn, that.paramNameEn) && Objects.equals(this.required, that.required)
            && Objects.equals(this.paramType, that.paramType) && Objects.equals(this.min, that.min)
            && Objects.equals(this.max, that.max) && Objects.equals(this.minLen, that.minLen)
            && Objects.equals(this.maxLen, that.maxLen) && Objects.equals(this.pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramKey, paramNameZh, paramNameEn, required, paramType, min, max, minLen, maxLen, pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtomicInputModel {\n");
        sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
        sb.append("    paramNameZh: ").append(toIndentedString(paramNameZh)).append("\n");
        sb.append("    paramNameEn: ").append(toIndentedString(paramNameEn)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    minLen: ").append(toIndentedString(minLen)).append("\n");
        sb.append("    maxLen: ").append(toIndentedString(maxLen)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
