package com.huaweicloud.sdk.as.v1.model;

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
 * 资源标签键
 */
public class TagsSingleValue  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public TagsSingleValue withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 资源标签键。最大长度36个Unicode字符，不能为空，不能包含非打印字符ASCII(0-31)，“=”,“*”,“<”,“>”,“\\”,“,”,“|”,“/”。同一资源的key值不能重复。action为delete时，不校验标签字符集，最大长度127个Unicode字符。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagsSingleValue withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 资源标签值。每个值最大长度43个Unicode字符，可以为空字符串，不能包含非打印字符ASCII(0-31), “=”,“*”,“<”,“>”,“\\”,“,”,“|”,“/”。action为delete时，不校验标签字符集，每个值最大长度255个Unicode字符。如果value有值按照key/value删除，如果value没值，则按照key删除。
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
        TagsSingleValue tagsSingleValue = (TagsSingleValue) o;
        return Objects.equals(this.key, tagsSingleValue.key) &&
            Objects.equals(this.value, tagsSingleValue.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsSingleValue {\n");
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

