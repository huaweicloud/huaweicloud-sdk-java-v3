package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 自定义参数列表checkParamList的map格式，比如含有自定义参数key为param1，值为value1，则checkParamMap含有字段param1，值为value1。
 */
public class TaskBasicInfoV3CheckParamMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param1")

    private String param1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param2")

    private String param2;

    public TaskBasicInfoV3CheckParamMap withParam1(String param1) {
        this.param1 = param1;
        return this;
    }

    /**
     * **参数解释：** 字段的name为自定义参数的Key，字段的值为自定义参数的Value。 **取值范围：** 长度为[1~8192]个字符。
     * @return param1
     */
    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public TaskBasicInfoV3CheckParamMap withParam2(String param2) {
        this.param2 = param2;
        return this;
    }

    /**
     * **参数解释：** 字段的name为自定义参数的Key，字段的值为自定义参数的Value。 **取值范围：** 长度为[1~8192]个字符。
     * @return param2
     */
    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskBasicInfoV3CheckParamMap that = (TaskBasicInfoV3CheckParamMap) obj;
        return Objects.equals(this.param1, that.param1) && Objects.equals(this.param2, that.param2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(param1, param2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicInfoV3CheckParamMap {\n");
        sb.append("    param1: ").append(toIndentedString(param1)).append("\n");
        sb.append("    param2: ").append(toIndentedString(param2)).append("\n");
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
