package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RecyclePolicyRequestBody
 */
public class RecyclePolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recycle_policy")
    
    private Object recyclePolicy;

    public RecyclePolicyRequestBody withRecyclePolicy(Object recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
        return this;
    }

    


    /**
     * 每个元素都是与回收站相关信息。
     * @return recyclePolicy
     */
    public Object getRecyclePolicy() {
        return recyclePolicy;
    }

    public void setRecyclePolicy(Object recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicyRequestBody recyclePolicyRequestBody = (RecyclePolicyRequestBody) o;
        return Objects.equals(this.recyclePolicy, recyclePolicyRequestBody.recyclePolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recyclePolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicyRequestBody {\n");
        sb.append("    recyclePolicy: ").append(toIndentedString(recyclePolicy)).append("\n");
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

