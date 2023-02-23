package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateIaConfigRequestDTO
 */
public class UpdateIaConfigRequestDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    public UpdateIaConfigRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 配置项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateIaConfigRequestDTO withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 配置项详情，长度2MB以内
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public UpdateIaConfigRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 配置项描述
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
        UpdateIaConfigRequestDTO updateIaConfigRequestDTO = (UpdateIaConfigRequestDTO) o;
        return Objects.equals(this.name, updateIaConfigRequestDTO.name) &&
            Objects.equals(this.value, updateIaConfigRequestDTO.value) &&
            Objects.equals(this.description, updateIaConfigRequestDTO.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, value, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIaConfigRequestDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

