package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateParametersReq
 */
public class UpdateParametersReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private Object values;

    public UpdateParametersReq withValues(Object values) {
        this.values = values;
        return this;
    }

    


    /**
     * 需要修改的DDM实例参数的集合。
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
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
        UpdateParametersReq updateParametersReq = (UpdateParametersReq) o;
        return Objects.equals(this.values, updateParametersReq.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParametersReq {\n");
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

