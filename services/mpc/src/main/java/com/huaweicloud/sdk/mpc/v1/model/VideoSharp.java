package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VideoSharp
 */
public class VideoSharp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_order")
    
    private Integer executionOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private String amount;

    public VideoSharp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 锐化算法名称\"hw-sharp\"。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VideoSharp withExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
        return this;
    }

    


    /**
     * 1 表示视频处理时第一个执行，2表示第二个执行，以此类推；除不执行，各视频处理算法的执行次序不可相同。 
     * @return executionOrder
     */
    public Integer getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    

    public VideoSharp withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * 锐化的程度， 值越大，锐化越强。 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSharp videoSharp = (VideoSharp) o;
        return Objects.equals(this.name, videoSharp.name) &&
            Objects.equals(this.executionOrder, videoSharp.executionOrder) &&
            Objects.equals(this.amount, videoSharp.amount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, executionOrder, amount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSharp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

