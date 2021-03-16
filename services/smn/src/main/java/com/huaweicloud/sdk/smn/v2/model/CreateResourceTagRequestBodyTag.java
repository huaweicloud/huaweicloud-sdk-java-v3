package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源标签结构体。
 */
public class CreateResourceTagRequestBodyTag  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public CreateResourceTagRequestBodyTag withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 键，表示要匹配的字段。  当前key的参数值只能取“resource_name”，此时value的参数值为云服务器名称。  - key不能重复，value为匹配的值。  - 此字段为固定字典值。  - 不允许为空字符串。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public CreateResourceTagRequestBodyTag withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 值。  当前key的参数值只能取“resource_name”，此时value的参数值为云服务器名称。  - 每个值最大长度255个unicode字符。  - 不可以为空。
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
        CreateResourceTagRequestBodyTag createResourceTagRequestBodyTag = (CreateResourceTagRequestBodyTag) o;
        return Objects.equals(this.key, createResourceTagRequestBodyTag.key) &&
            Objects.equals(this.value, createResourceTagRequestBodyTag.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceTagRequestBodyTag {\n");
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

