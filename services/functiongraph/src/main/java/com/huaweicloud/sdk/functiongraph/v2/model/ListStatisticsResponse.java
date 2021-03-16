package com.huaweicloud.sdk.functiongraph.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsResponseBody;
import com.huaweicloud.sdk.functiongraph.v2.model.MonthUsed;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatisticsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private List<MonthUsed> count = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gbs")
    
    private List<MonthUsed> gbs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    private ListFunctionStatisticsResponseBody statistics;

    public ListStatisticsResponse withCount(List<MonthUsed> count) {
        this.count = count;
        return this;
    }

    
    public ListStatisticsResponse addCountItem(MonthUsed countItem) {
        this.count.add(countItem);
        return this;
    }

    public ListStatisticsResponse withCount(Consumer<List<MonthUsed>> countSetter) {
        if(this.count == null ){
            this.count = new ArrayList<>();
        }
        countSetter.accept(this.count);
        return this;
    }

    /**
     * 月度调用次数
     * @return count
     */
    public List<MonthUsed> getCount() {
        return count;
    }

    public void setCount(List<MonthUsed> count) {
        this.count = count;
    }

    

    public ListStatisticsResponse withGbs(List<MonthUsed> gbs) {
        this.gbs = gbs;
        return this;
    }

    
    public ListStatisticsResponse addGbsItem(MonthUsed gbsItem) {
        this.gbs.add(gbsItem);
        return this;
    }

    public ListStatisticsResponse withGbs(Consumer<List<MonthUsed>> gbsSetter) {
        if(this.gbs == null ){
            this.gbs = new ArrayList<>();
        }
        gbsSetter.accept(this.gbs);
        return this;
    }

    /**
     * 月度资源用量
     * @return gbs
     */
    public List<MonthUsed> getGbs() {
        return gbs;
    }

    public void setGbs(List<MonthUsed> gbs) {
        this.gbs = gbs;
    }

    

    public ListStatisticsResponse withStatistics(ListFunctionStatisticsResponseBody statistics) {
        this.statistics = statistics;
        return this;
    }

    public ListStatisticsResponse withStatistics(Consumer<ListFunctionStatisticsResponseBody> statisticsSetter) {
        if(this.statistics == null ){
            this.statistics = new ListFunctionStatisticsResponseBody();
            statisticsSetter.accept(this.statistics);
        }
        
        return this;
    }


    /**
     * Get statistics
     * @return statistics
     */
    public ListFunctionStatisticsResponseBody getStatistics() {
        return statistics;
    }

    public void setStatistics(ListFunctionStatisticsResponseBody statistics) {
        this.statistics = statistics;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsResponse listStatisticsResponse = (ListStatisticsResponse) o;
        return Objects.equals(this.count, listStatisticsResponse.count) &&
            Objects.equals(this.gbs, listStatisticsResponse.gbs) &&
            Objects.equals(this.statistics, listStatisticsResponse.statistics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, gbs, statistics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    gbs: ").append(toIndentedString(gbs)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

