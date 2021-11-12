package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ParallelEdge  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ignoreLabel")
    
    
    private Boolean ignoreLabel;

    public ParallelEdge withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 处理方式，取值为allow，ignore和override，默认为allow。 - allow表示允许重复边。 - ignore表示忽略之后的重复边。 - override表示覆盖之前的重复边。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ParallelEdge withIgnoreLabel(Boolean ignoreLabel) {
        this.ignoreLabel = ignoreLabel;
        return this;
    }

    


    /**
     * 重复边的定义，是否忽略Label。取值为true或者false，默认取true。 - true 表示重复边定义不包含Label，即用<源点，终点>标记一条边，不包含Label。 - false 表示重复边定义包含Label，即用<源点，终点，Label>标记一条边。
     * @return ignoreLabel
     */
    public Boolean getIgnoreLabel() {
        return ignoreLabel;
    }

    public void setIgnoreLabel(Boolean ignoreLabel) {
        this.ignoreLabel = ignoreLabel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParallelEdge parallelEdge = (ParallelEdge) o;
        return Objects.equals(this.action, parallelEdge.action) &&
            Objects.equals(this.ignoreLabel, parallelEdge.ignoreLabel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, ignoreLabel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParallelEdge {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    ignoreLabel: ").append(toIndentedString(ignoreLabel)).append("\n");
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

