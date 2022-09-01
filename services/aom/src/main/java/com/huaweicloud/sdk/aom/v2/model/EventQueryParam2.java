package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventQueryParam2Sort;
import com.huaweicloud.sdk.aom.v2.model.RelationModel;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询事件或者告警信息 。
 */
public class EventQueryParam2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_range")
    
    @JacksonXmlProperty(localName = "time_range")
    
    private String timeRange;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    @JacksonXmlProperty(localName = "step")
    
    private Long step;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    @JacksonXmlProperty(localName = "search")
    
    private String search;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort")
    
    @JacksonXmlProperty(localName = "sort")
    
    private EventQueryParam2Sort sort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_relation")
    
    @JacksonXmlProperty(localName = "metadata_relation")
    
    private List<RelationModel> metadataRelation = null;
    
    public EventQueryParam2 withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    


    /**
     * 查询时间范围。 格式：开始时间UTC毫秒.结束时间UTC毫秒.时间范围分钟数。开始和结束时间为-1时，表示最近N分钟，N为时间范围分钟取值。查询时间段，如最近五分钟可以表示为-1.-1.5，固定的时间范围（2017-08-01 08:00:00到2017-08-02 08:00:00）可以表示为1501545600000.1501632000000.1440。
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

