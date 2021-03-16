package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowIterationV4Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iteration_id")
    
    private Integer iterationId;

    public ShowIterationV4Request withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    


    /**
     * Get iterationId
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIterationV4Request showIterationV4Request = (ShowIterationV4Request) o;
        return Objects.equals(this.iterationId, showIterationV4Request.iterationId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(iterationId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIterationV4Request {\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
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

