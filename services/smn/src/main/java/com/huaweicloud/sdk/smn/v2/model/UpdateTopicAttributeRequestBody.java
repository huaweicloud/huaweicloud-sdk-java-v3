package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateTopicAttributeRequestBody
 */
public class UpdateTopicAttributeRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public UpdateTopicAttributeRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 1. 当请求参数name为access_policy时，value为Topic属性值，最大支持30KB。  2. 当请求参数name为introduction时，value为topic简介，最大长度120B。
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
        UpdateTopicAttributeRequestBody updateTopicAttributeRequestBody = (UpdateTopicAttributeRequestBody) o;
        return Objects.equals(this.value, updateTopicAttributeRequestBody.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAttributeRequestBody {\n");
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

