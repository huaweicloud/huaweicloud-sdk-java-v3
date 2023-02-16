package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProjectResourceTagResponseTags
 */
public class ProjectResourceTagResponseTags  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    
    private List<String> values = null;
    
    public ProjectResourceTagResponseTags withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 键。最大长度128个字符。 key满足3.1 KEY字符集规范。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ProjectResourceTagResponseTags withValues(List<String> values) {
        this.values = values;
        return this;
    }

    
    public ProjectResourceTagResponseTags addValuesItem(String valuesItem) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ProjectResourceTagResponseTags withValues(Consumer<List<String>> valuesSetter) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值列表。每个值最大长度255个字符。 value满足3.2 VALUE字符集规范。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectResourceTagResponseTags projectResourceTagResponseTags = (ProjectResourceTagResponseTags) o;
        return Objects.equals(this.key, projectResourceTagResponseTags.key) &&
            Objects.equals(this.values, projectResourceTagResponseTags.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectResourceTagResponseTags {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

