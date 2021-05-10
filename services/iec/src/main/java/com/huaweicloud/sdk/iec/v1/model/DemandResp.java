package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 租户需求
 */
public class DemandResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="demand_count")
    
    private Integer demandCount;

    public DemandResp withDemandCount(Integer demandCount) {
        this.demandCount = demandCount;
        return this;
    }

    


    /**
     * 站点需要发放的资源(组)总数。  > 实际发放实例数量为count*demand_count。
     * minimum: 1
     * maximum: 10
     * @return demandCount
     */
    public Integer getDemandCount() {
        return demandCount;
    }

    public void setDemandCount(Integer demandCount) {
        this.demandCount = demandCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandResp demandResp = (DemandResp) o;
        return Objects.equals(this.demandCount, demandResp.demandCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(demandCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandResp {\n");
        sb.append("    demandCount: ").append(toIndentedString(demandCount)).append("\n");
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

