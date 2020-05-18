package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * BatchCreateInstanceTagsOption
 */
public class BatchCreateInstanceTagsOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public BatchCreateInstanceTagsOption withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签键。最大长度36个unicode字符，不能为null或者空字符串，不能为空格，校验和使用之前会自动过滤掉前后空格。 字符集：0-9，A-Z，a-z，“_”，“-”，中文。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BatchCreateInstanceTagsOption withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 标签值。最大长度43个unicode字符，可以为空字符串，不能为空格，校验和使用之前会自动过滤掉前后空格。 字符集：0-9，A-Z，a-z，“_”，“.”，“-”，中文。 - “action”值为“create”时，该参数必选。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateInstanceTagsOption batchCreateInstanceTagsOption = (BatchCreateInstanceTagsOption) o;
        return Objects.equals(this.key, batchCreateInstanceTagsOption.key) &&
            Objects.equals(this.value, batchCreateInstanceTagsOption.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateInstanceTagsOption {\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

