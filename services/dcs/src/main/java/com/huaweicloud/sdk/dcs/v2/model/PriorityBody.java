package com.huaweicloud.sdk.dcs.v2.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PriorityBody
 */
public class PriorityBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slave_priority_weight")
    
    private Integer slavePriorityWeight;

    public PriorityBody withSlavePriorityWeight(Integer slavePriorityWeight) {
        this.slavePriorityWeight = slavePriorityWeight;
        return this;
    }

    


    /**
     * 副本优先级，取值范围是0到100，0为默认禁止倒换。
     * @return slavePriorityWeight
     */
    public Integer getSlavePriorityWeight() {
        return slavePriorityWeight;
    }

    public void setSlavePriorityWeight(Integer slavePriorityWeight) {
        this.slavePriorityWeight = slavePriorityWeight;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PriorityBody priorityBody = (PriorityBody) o;
        return Objects.equals(this.slavePriorityWeight, priorityBody.slavePriorityWeight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(slavePriorityWeight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriorityBody {\n");
        sb.append("    slavePriorityWeight: ").append(toIndentedString(slavePriorityWeight)).append("\n");
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

