package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FailoverStrategyRequest
 */
public class FailoverStrategyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repairStrategy")
    
    private String repairStrategy;

    public FailoverStrategyRequest withRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
        return this;
    }

    


    /**
     * 可用性策略
     * @return repairStrategy
     */
    public String getRepairStrategy() {
        return repairStrategy;
    }

    public void setRepairStrategy(String repairStrategy) {
        this.repairStrategy = repairStrategy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailoverStrategyRequest failoverStrategyRequest = (FailoverStrategyRequest) o;
        return Objects.equals(this.repairStrategy, failoverStrategyRequest.repairStrategy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repairStrategy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailoverStrategyRequest {\n");
        sb.append("    repairStrategy: ").append(toIndentedString(repairStrategy)).append("\n");
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

