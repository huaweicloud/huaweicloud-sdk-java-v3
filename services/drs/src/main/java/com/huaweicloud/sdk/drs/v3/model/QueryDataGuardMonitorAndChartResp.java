package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryChartDataResp;
import com.huaweicloud.sdk.drs.v3.model.QueryDataGuardMonitorResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 容灾任务监控数据响应体
 */
public class QueryDataGuardMonitorAndChartResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_guard_minitor")
    
    private QueryDataGuardMonitorResponse dataGuardMinitor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conflict_count_by_day")
    
    private List<QueryChartDataResp> conflictCountByDay = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lose_conn_count_by_day")
    
    private List<QueryChartDataResp> loseConnCountByDay = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rpo_delay")
    
    private List<QueryChartDataResp> rpoDelay = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rto_delay")
    
    private List<QueryChartDataResp> rtoDelay = null;
    
    public QueryDataGuardMonitorAndChartResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryDataGuardMonitorAndChartResp withDataGuardMinitor(QueryDataGuardMonitorResponse dataGuardMinitor) {
        this.dataGuardMinitor = dataGuardMinitor;
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withDataGuardMinitor(Consumer<QueryDataGuardMonitorResponse> dataGuardMinitorSetter) {
        if(this.dataGuardMinitor == null ){
            this.dataGuardMinitor = new QueryDataGuardMonitorResponse();
            dataGuardMinitorSetter.accept(this.dataGuardMinitor);
        }
        
        return this;
    }


    /**
     * Get dataGuardMinitor
     * @return dataGuardMinitor
     */
    public QueryDataGuardMonitorResponse getDataGuardMinitor() {
        return dataGuardMinitor;
    }

    public void setDataGuardMinitor(QueryDataGuardMonitorResponse dataGuardMinitor) {
        this.dataGuardMinitor = dataGuardMinitor;
    }

    public QueryDataGuardMonitorAndChartResp withConflictCountByDay(List<QueryChartDataResp> conflictCountByDay) {
        this.conflictCountByDay = conflictCountByDay;
        return this;
    }

    
    public QueryDataGuardMonitorAndChartResp addConflictCountByDayItem(QueryChartDataResp conflictCountByDayItem) {
        if (this.conflictCountByDay == null) {
            this.conflictCountByDay = new ArrayList<>();
        }
        this.conflictCountByDay.add(conflictCountByDayItem);
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withConflictCountByDay(Consumer<List<QueryChartDataResp>> conflictCountByDaySetter) {
        if(this.conflictCountByDay == null ){
            this.conflictCountByDay = new ArrayList<>();
        }
        conflictCountByDaySetter.accept(this.conflictCountByDay);
        return this;
    }

    /**
     * 冲突行数图表数据。
     * @return conflictCountByDay
     */
    public List<QueryChartDataResp> getConflictCountByDay() {
        return conflictCountByDay;
    }

    public void setConflictCountByDay(List<QueryChartDataResp> conflictCountByDay) {
        this.conflictCountByDay = conflictCountByDay;
    }

    public QueryDataGuardMonitorAndChartResp withLoseConnCountByDay(List<QueryChartDataResp> loseConnCountByDay) {
        this.loseConnCountByDay = loseConnCountByDay;
        return this;
    }

    
    public QueryDataGuardMonitorAndChartResp addLoseConnCountByDayItem(QueryChartDataResp loseConnCountByDayItem) {
        if (this.loseConnCountByDay == null) {
            this.loseConnCountByDay = new ArrayList<>();
        }
        this.loseConnCountByDay.add(loseConnCountByDayItem);
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withLoseConnCountByDay(Consumer<List<QueryChartDataResp>> loseConnCountByDaySetter) {
        if(this.loseConnCountByDay == null ){
            this.loseConnCountByDay = new ArrayList<>();
        }
        loseConnCountByDaySetter.accept(this.loseConnCountByDay);
        return this;
    }

    /**
     * 断连次数图表数据。
     * @return loseConnCountByDay
     */
    public List<QueryChartDataResp> getLoseConnCountByDay() {
        return loseConnCountByDay;
    }

    public void setLoseConnCountByDay(List<QueryChartDataResp> loseConnCountByDay) {
        this.loseConnCountByDay = loseConnCountByDay;
    }

    public QueryDataGuardMonitorAndChartResp withRpoDelay(List<QueryChartDataResp> rpoDelay) {
        this.rpoDelay = rpoDelay;
        return this;
    }

    
    public QueryDataGuardMonitorAndChartResp addRpoDelayItem(QueryChartDataResp rpoDelayItem) {
        if (this.rpoDelay == null) {
            this.rpoDelay = new ArrayList<>();
        }
        this.rpoDelay.add(rpoDelayItem);
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withRpoDelay(Consumer<List<QueryChartDataResp>> rpoDelaySetter) {
        if(this.rpoDelay == null ){
            this.rpoDelay = new ArrayList<>();
        }
        rpoDelaySetter.accept(this.rpoDelay);
        return this;
    }

    /**
     * RPO时延图表数据。
     * @return rpoDelay
     */
    public List<QueryChartDataResp> getRpoDelay() {
        return rpoDelay;
    }

    public void setRpoDelay(List<QueryChartDataResp> rpoDelay) {
        this.rpoDelay = rpoDelay;
    }

    public QueryDataGuardMonitorAndChartResp withRtoDelay(List<QueryChartDataResp> rtoDelay) {
        this.rtoDelay = rtoDelay;
        return this;
    }

    
    public QueryDataGuardMonitorAndChartResp addRtoDelayItem(QueryChartDataResp rtoDelayItem) {
        if (this.rtoDelay == null) {
            this.rtoDelay = new ArrayList<>();
        }
        this.rtoDelay.add(rtoDelayItem);
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withRtoDelay(Consumer<List<QueryChartDataResp>> rtoDelaySetter) {
        if(this.rtoDelay == null ){
            this.rtoDelay = new ArrayList<>();
        }
        rtoDelaySetter.accept(this.rtoDelay);
        return this;
    }

    /**
     * RTO时延图表数据。
     * @return rtoDelay
     */
    public List<QueryChartDataResp> getRtoDelay() {
        return rtoDelay;
    }

    public void setRtoDelay(List<QueryChartDataResp> rtoDelay) {
        this.rtoDelay = rtoDelay;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDataGuardMonitorAndChartResp queryDataGuardMonitorAndChartResp = (QueryDataGuardMonitorAndChartResp) o;
        return Objects.equals(this.id, queryDataGuardMonitorAndChartResp.id) &&
            Objects.equals(this.dataGuardMinitor, queryDataGuardMonitorAndChartResp.dataGuardMinitor) &&
            Objects.equals(this.conflictCountByDay, queryDataGuardMonitorAndChartResp.conflictCountByDay) &&
            Objects.equals(this.loseConnCountByDay, queryDataGuardMonitorAndChartResp.loseConnCountByDay) &&
            Objects.equals(this.rpoDelay, queryDataGuardMonitorAndChartResp.rpoDelay) &&
            Objects.equals(this.rtoDelay, queryDataGuardMonitorAndChartResp.rtoDelay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, dataGuardMinitor, conflictCountByDay, loseConnCountByDay, rpoDelay, rtoDelay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDataGuardMonitorAndChartResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dataGuardMinitor: ").append(toIndentedString(dataGuardMinitor)).append("\n");
        sb.append("    conflictCountByDay: ").append(toIndentedString(conflictCountByDay)).append("\n");
        sb.append("    loseConnCountByDay: ").append(toIndentedString(loseConnCountByDay)).append("\n");
        sb.append("    rpoDelay: ").append(toIndentedString(rpoDelay)).append("\n");
        sb.append("    rtoDelay: ").append(toIndentedString(rtoDelay)).append("\n");
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

