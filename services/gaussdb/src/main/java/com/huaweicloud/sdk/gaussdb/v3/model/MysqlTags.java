package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 标签列表，根据标签键值对创建实例。 - {key}表示标签键，不可以为空或重复。 - {value}表示标签值，可以为空。  如果创建实例时同时使用多个标签键值对，中间使用逗号分隔开，最多包含10组。
 */
public class MysqlTags  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    
    private String value;

    public MysqlTags withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签键。最大长度36个unicode字符。key不能为空或者空字符串，不能为空格。  字符集：A-Z，a-z ，0-9，‘-’，‘_’，UNICODE字符（\\u4E00-\\u9FFF）。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public MysqlTags withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 标签值。最大长度43个unicode字符。可以为空字符串。  字符集：A-Z，a-z ，0-9，‘.’，‘-’，‘_’，UNICODE字符（\\u4E00-\\u9FFF）。
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
        MysqlTags mysqlTags = (MysqlTags) o;
        return Objects.equals(this.key, mysqlTags.key) &&
            Objects.equals(this.value, mysqlTags.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlTags {\n");
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

