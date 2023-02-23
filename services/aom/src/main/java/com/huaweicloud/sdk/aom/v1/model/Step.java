package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建作业时的步骤参数
 */
@JacksonXmlRootElement(localName = "Step")
public class Step  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    @JacksonXmlProperty(localName = "input")
    private Map<String, String> input = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ignore_error")
    
    @JacksonXmlProperty(localName = "ignore_error")

    private Boolean ignoreError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")

    private String description;

    public Step withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 步骤id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Step withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 步骤名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Step withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 步骤类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Step withInput(Map<String, String> input) {
        this.input = input;
        return this;
    }

    

    public Step putInputItem(String key, String inputItem) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        this.input.put(key, inputItem);
        return this;
    }

    public Step withInput(Consumer<Map<String, String>> inputSetter) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        inputSetter.accept(this.input);
        return this;
    }
    /**
     * 步骤参数。
     * @return input
     */
    public Map<String, String> getInput() {
        return input;
    }

    public void setInput(Map<String, String> input) {
        this.input = input;
    }

    

    public Step withIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
        return this;
    }

    


    /**
     * 是否自动忽略错误。
     * @return ignoreError
     */
    public Boolean getIgnoreError() {
        return ignoreError;
    }

    public void setIgnoreError(Boolean ignoreError) {
        this.ignoreError = ignoreError;
    }

    

    public Step withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 步骤说明。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Step step = (Step) o;
        return Objects.equals(this.id, step.id) &&
            Objects.equals(this.name, step.name) &&
            Objects.equals(this.type, step.type) &&
            Objects.equals(this.input, step.input) &&
            Objects.equals(this.ignoreError, step.ignoreError) &&
            Objects.equals(this.description, step.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, input, ignoreError, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Step {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    ignoreError: ").append(toIndentedString(ignoreError)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

