package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CollectKeyWordsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    @JacksonXmlProperty(localName = "qabot_id")
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    @JacksonXmlProperty(localName = "start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    @JacksonXmlProperty(localName = "end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    
    @JacksonXmlProperty(localName = "top")
    
    private Integer top;

    public CollectKeyWordsRequest withQabotId(String qabotId) {
        this.qabotId = qabotId;
        return this;
    }

    


    /**
     * qabot编号，UUID格式。
     * @return qabotId
     */
    public String getQabotId() {
        return qabotId;
    }

    public void setQabotId(String qabotId) {
        this.qabotId = qabotId;
    }

    

    public CollectKeyWordsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 查询的起始时间，long，UTC时间，默认值为0。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public CollectKeyWordsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 查询的结束时间，long，UTC时间，默认值为当前时间的毫秒数。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public CollectKeyWordsRequest withTop(Integer top) {
        this.top = top;
        return this;
    }

    


    /**
     * 关键词最多显示的个数，默认值为10，取值范围0-50。
     * minimum: 0
     * maximum: 50
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectKeyWordsRequest collectKeyWordsRequest = (CollectKeyWordsRequest) o;
        return Objects.equals(this.qabotId, collectKeyWordsRequest.qabotId) &&
            Objects.equals(this.startTime, collectKeyWordsRequest.startTime) &&
            Objects.equals(this.endTime, collectKeyWordsRequest.endTime) &&
            Objects.equals(this.top, collectKeyWordsRequest.top);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, startTime, endTime, top);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectKeyWordsRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
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

