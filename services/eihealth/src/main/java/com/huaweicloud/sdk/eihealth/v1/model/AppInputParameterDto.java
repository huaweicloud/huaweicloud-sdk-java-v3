package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用输入参数
 */
public class AppInputParameterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent")

    private String concurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum")

    private List<String> _enum = null;

    public AppInputParameterDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称，单个应用内唯一。取值范围：长度为[1,32]，以小写字母开头，允许出现中划线(-)、小写字母和数字，且必须以小写字母或数字结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppInputParameterDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述。取值范围：[0-255]
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppInputParameterDto withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 参数是否必须
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public AppInputParameterDto withConcurrent(String concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    /**
     * 参数是否开启并发。当前支持vars_iter并发类型，不填表示未开启并发。
     * @return concurrent
     */
    public String getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(String concurrent) {
        this.concurrent = concurrent;
    }

    public AppInputParameterDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型。取值：[STRING，FILE，DIRECTORY，ENUM]
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AppInputParameterDto withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 提示用户参数填写的格式，取值范围：[0-64]。对于STRING类型，匹配字符串内容，比如后缀约束.fastq；对于ENUM类型，可以提示一定要在param_enum列表范围内取值；对于FILE类型，约束文件后缀类型；对于DIRECTORY类型，提示xxx；
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public AppInputParameterDto withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public AppInputParameterDto addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public AppInputParameterDto withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 参数取值 如填写，只支持填一项，根据参数类型进行不同的校验
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public AppInputParameterDto withEnum(List<String> _enum) {
        this._enum = _enum;
        return this;
    }

    public AppInputParameterDto addEnumItem(String _enumItem) {
        if (this._enum == null) {
            this._enum = new ArrayList<>();
        }
        this._enum.add(_enumItem);
        return this;
    }

    public AppInputParameterDto withEnum(Consumer<List<String>> _enumSetter) {
        if (this._enum == null) {
            this._enum = new ArrayList<>();
        }
        _enumSetter.accept(this._enum);
        return this;
    }

    /**
     * 枚举参数的取值列表，列表最大长度20，每一项字符串最长128。参数类型为ENUM时需要填此字段
     * @return _enum
     */
    public List<String> getEnum() {
        return _enum;
    }

    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppInputParameterDto appInputParameterDto = (AppInputParameterDto) o;
        return Objects.equals(this.name, appInputParameterDto.name)
            && Objects.equals(this.description, appInputParameterDto.description)
            && Objects.equals(this.required, appInputParameterDto.required)
            && Objects.equals(this.concurrent, appInputParameterDto.concurrent)
            && Objects.equals(this.type, appInputParameterDto.type)
            && Objects.equals(this.pattern, appInputParameterDto.pattern)
            && Objects.equals(this.values, appInputParameterDto.values)
            && Objects.equals(this._enum, appInputParameterDto._enum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, required, concurrent, type, pattern, values, _enum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInputParameterDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    concurrent: ").append(toIndentedString(concurrent)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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
