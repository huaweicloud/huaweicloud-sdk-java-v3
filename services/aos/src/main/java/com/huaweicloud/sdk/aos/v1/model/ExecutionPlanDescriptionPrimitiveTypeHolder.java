package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExecutionPlanDescriptionPrimitiveTypeHolder
 */
public class ExecutionPlanDescriptionPrimitiveTypeHolder  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    public ExecutionPlanDescriptionPrimitiveTypeHolder withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 执行计划的描述。可用于客户识别自己的执行计划。
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
        ExecutionPlanDescriptionPrimitiveTypeHolder executionPlanDescriptionPrimitiveTypeHolder = (ExecutionPlanDescriptionPrimitiveTypeHolder) o;
        return Objects.equals(this.description, executionPlanDescriptionPrimitiveTypeHolder.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanDescriptionPrimitiveTypeHolder {\n");
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

