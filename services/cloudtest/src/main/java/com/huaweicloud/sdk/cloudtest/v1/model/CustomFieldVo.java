package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义字段信息
 */
public class CustomFieldVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_param")

    private String customFieldParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public CustomFieldVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字段类型（单行文本text、多行文本textArea、单选框radio、多选框checkBox、日期date、数字number、单选用户user）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomFieldVo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 测试用例自定义字段值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomFieldVo withCustomFieldParam(String customFieldParam) {
        this.customFieldParam = customFieldParam;
        return this;
    }

    /**
     * 项目用例自定义字段入参或者返回参数名称
     * @return customFieldParam
     */
    public String getCustomFieldParam() {
        return customFieldParam;
    }

    public void setCustomFieldParam(String customFieldParam) {
        this.customFieldParam = customFieldParam;
    }

    public CustomFieldVo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * user类型测试用例自定义字段对应用户名，其它类型字段不返回
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomFieldVo that = (CustomFieldVo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.customFieldParam, that.customFieldParam)
            && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, customFieldParam, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomFieldVo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    customFieldParam: ").append(toIndentedString(customFieldParam)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
