package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.StatSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatSummaryResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="summary")
    
    private List<StatSummary> summary = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Float total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stat_type")
    
    private String statType;

    public ListStatSummaryResponse withSummary(List<StatSummary> summary) {
        this.summary = summary;
        return this;
    }

    
    public ListStatSummaryResponse addSummaryItem(StatSummary summaryItem) {
        if (this.summary == null) {
            this.summary = new ArrayList<>();
        }
        this.summary.add(summaryItem);
        return this;
    }

    public ListStatSummaryResponse withSummary(Consumer<List<StatSummary>> summarySetter) {
        if(this.summary == null ){
            this.summary = new ArrayList<>();
        }
        summarySetter.accept(this.summary);
        return this;
    }

    /**
     * 统计概览信息
     * @return summary
     */
    public List<StatSummary> getSummary() {
        return summary;
    }

    public void setSummary(List<StatSummary> summary) {
        this.summary = summary;
    }

    public ListStatSummaryResponse withTotal(Float total) {
        this.total = total;
        return this;
    }

    


    /**
     * 该指标的总值，单位：GB,精确到小数点后两位。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public ListStatSummaryResponse withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    


    /**
     * 统计类型
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatSummaryResponse listStatSummaryResponse = (ListStatSummaryResponse) o;
        return Objects.equals(this.summary, listStatSummaryResponse.summary) &&
            Objects.equals(this.total, listStatSummaryResponse.total) &&
            Objects.equals(this.statType, listStatSummaryResponse.statType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(summary, total, statType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatSummaryResponse {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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

