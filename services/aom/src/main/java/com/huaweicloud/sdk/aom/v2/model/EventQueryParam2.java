package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventQueryParam2Sort;
import com.huaweicloud.sdk.aom.v2.model.RelationModel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询事件或者告警信息 。
 */
public class EventQueryParam2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_range")
    
    
    private String timeRange;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    
    private Long step;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    
    private String search;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort")
    
    
    private EventQueryParam2Sort sort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_relation")
    
    
    private List<RelationModel> metadataRelation = null;
    
    public EventQueryParam2 withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    


    /**
     * timeRange用于指标查询时间范围，主要用于解决客户端时间和服务端时间不一致情况下，查询最近N分钟的数据。另可用于精确查询某一段时间的数据。  如：  - -1.-1.60(表示最近60分钟)，不管当前客户端是什么时间，都以服务端时间为准查询最近60分钟。 - 1650852000000.1650852300000.5(表示北京时间2022-04-25 10:00:00至2022-04-25 10:05:00指定的5分钟)  格式：  startTimeInMillis.endTimeInMillis.durationInMinutes  参数解释：  - startTimeInMillis: 查询的开始时间，格式为UTC毫秒，如果指定为-1，服务端将按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如-1.1650852300000.5，则相当于1650852000000.1650852300000.5 - endTimeInMillis: 查询的结束时间，格式为UTC毫秒，如果指定为-1，服务端将按(startTimeInMillis + durationInMinutes * 60 * 1000)计算结束时间，如果计算出的结束时间大于当前系统时间，则使用当前系统时间。如1650852000000.-1.5，则相当于1650852000000.1650852300000.5 - durationInMinutes：查询时间的跨度分钟数。 取值范围大于0并且大于等于(endTimeInMillis - startTimeInMillis) / (60 * 1000) - 1。当开始时间与结束时间都设置为-1时，系统会将结束时间设置为当前时间UTC毫秒值，并按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如：-1.-1.60(表示最近60分钟)  约束：  单次请求中，查询时长与周期需要满足以下条件: durationInMinutes * 60 / period <= 1440
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    

    public EventQueryParam2 withStep(Long step) {
        this.step = step;
        return this;
    }

    


    /**
     * 统计步长。毫秒数，例如一分钟则填写为60000。
     * @return step
     */
    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }

    

    public EventQueryParam2 withSearch(String search) {
        this.search = search;
        return this;
    }

    


    /**
     * 模糊查询匹配字段，可以为空。如果值不为空，可以模糊匹配。metadata字段为必选字段。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    

    public EventQueryParam2 withSort(EventQueryParam2Sort sort) {
        this.sort = sort;
        return this;
    }

    public EventQueryParam2 withSort(Consumer<EventQueryParam2Sort> sortSetter) {
        if(this.sort == null ){
            this.sort = new EventQueryParam2Sort();
            sortSetter.accept(this.sort);
        }
        
        return this;
    }


    /**
     * Get sort
     * @return sort
     */
    public EventQueryParam2Sort getSort() {
        return sort;
    }

    public void setSort(EventQueryParam2Sort sort) {
        this.sort = sort;
    }

    

    public EventQueryParam2 withMetadataRelation(List<RelationModel> metadataRelation) {
        this.metadataRelation = metadataRelation;
        return this;
    }

    
    public EventQueryParam2 addMetadataRelationItem(RelationModel metadataRelationItem) {
        if(this.metadataRelation == null) {
            this.metadataRelation = new ArrayList<>();
        }
        this.metadataRelation.add(metadataRelationItem);
        return this;
    }

    public EventQueryParam2 withMetadataRelation(Consumer<List<RelationModel>> metadataRelationSetter) {
        if(this.metadataRelation == null) {
            this.metadataRelation = new ArrayList<>();
        }
        metadataRelationSetter.accept(this.metadataRelation);
        return this;
    }

    /**
     * 查询条件组合，可以为空。
     * @return metadataRelation
     */
    public List<RelationModel> getMetadataRelation() {
        return metadataRelation;
    }

    public void setMetadataRelation(List<RelationModel> metadataRelation) {
        this.metadataRelation = metadataRelation;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventQueryParam2 eventQueryParam2 = (EventQueryParam2) o;
        return Objects.equals(this.timeRange, eventQueryParam2.timeRange) &&
            Objects.equals(this.step, eventQueryParam2.step) &&
            Objects.equals(this.search, eventQueryParam2.search) &&
            Objects.equals(this.sort, eventQueryParam2.sort) &&
            Objects.equals(this.metadataRelation, eventQueryParam2.metadataRelation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(timeRange, step, search, sort, metadataRelation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventQueryParam2 {\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    metadataRelation: ").append(toIndentedString(metadataRelation)).append("\n");
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

