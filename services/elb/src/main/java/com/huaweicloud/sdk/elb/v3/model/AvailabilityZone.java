package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 可用区
 */
public class AvailabilityZone  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private String state;

    public AvailabilityZone withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 可用区code。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public AvailabilityZone withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * az状态。  取值：ACTIVE
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailabilityZone availabilityZone = (AvailabilityZone) o;
        return Objects.equals(this.code, availabilityZone.code) &&
            Objects.equals(this.state, availabilityZone.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZone {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

