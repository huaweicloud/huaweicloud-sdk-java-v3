package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CollectHotQuestionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    
    
    private Integer top;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exclude")
    
    
    private Boolean exclude;

    public CollectHotQuestionsRequest withQabotId(String qabotId) {
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

    

    public CollectHotQuestionsRequest withStartTime(String startTime) {
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

    

    public CollectHotQuestionsRequest withEndTime(String endTime) {
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

    

    public CollectHotQuestionsRequest withTop(Integer top) {
        this.top = top;
        return this;
    }

    


    /**
     * 热点问题最多显示的个数，默认值为10，取值范围1-20。
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    

    public CollectHotQuestionsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 热点问题所属的领域。如果指定领域为非空字符串则从指定领域中查询热点问题，否则从所有标准问题中查询热点问题。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public CollectHotQuestionsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 统计的目标问题类别id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public CollectHotQuestionsRequest withExclude(Boolean exclude) {
        this.exclude = exclude;
        return this;
    }

    


    /**
     * true:根据问答对信息展示热点问题（如：热点问题对应的问答对“你好”发生了修改，变成了 “你好啊”，此时热点问题也将返回 “你好啊”；但是如果这个问题对被删除，则“你好”不会被展示在热点问中） false: 不根据问答对信息展示热点问题。
     * @return exclude
     */
    public Boolean getExclude() {
        return exclude;
    }

    public void setExclude(Boolean exclude) {
        this.exclude = exclude;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectHotQuestionsRequest collectHotQuestionsRequest = (CollectHotQuestionsRequest) o;
        return Objects.equals(this.qabotId, collectHotQuestionsRequest.qabotId) &&
            Objects.equals(this.startTime, collectHotQuestionsRequest.startTime) &&
            Objects.equals(this.endTime, collectHotQuestionsRequest.endTime) &&
            Objects.equals(this.top, collectHotQuestionsRequest.top) &&
            Objects.equals(this.domain, collectHotQuestionsRequest.domain) &&
            Objects.equals(this.domainId, collectHotQuestionsRequest.domainId) &&
            Objects.equals(this.exclude, collectHotQuestionsRequest.exclude);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, startTime, endTime, top, domain, domainId, exclude);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectHotQuestionsRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

