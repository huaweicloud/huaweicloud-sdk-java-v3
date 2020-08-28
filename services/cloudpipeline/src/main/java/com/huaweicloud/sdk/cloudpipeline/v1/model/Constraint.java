package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务参数校验参数
 */
public class Constraint  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errormsg")
    
    private String errormsg;

    public Constraint withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 校验规则类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Constraint withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 校验规则
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Constraint withErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }

    


    /**
     * 校验失败描述
     * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Constraint constraint = (Constraint) o;
        return Objects.equals(this.type, constraint.type) &&
            Objects.equals(this.value, constraint.value) &&
            Objects.equals(this.errormsg, constraint.errormsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, value, errormsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Constraint {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    errormsg: ").append(toIndentedString(errormsg)).append("\n");
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

