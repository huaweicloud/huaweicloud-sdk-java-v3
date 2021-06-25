package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CcrulesListInfoAction;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateCcRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_num")
    
    private Integer limitNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_period")
    
    private Integer limitPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_time")
    
    private Long lockTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_type")
    
    private String tagType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_index")
    
    private String tagIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private CcrulesListInfoAction action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public UpdateCcRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * cc规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UpdateCcRuleResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 规则应用的url链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public UpdateCcRuleResponse withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    


    /**
     * 单个用户的周期内请求次数
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    

    public UpdateCcRuleResponse withLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
        return this;
    }

    


    /**
     * 限速周期
     * @return limitPeriod
     */
    public Integer getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(Integer limitPeriod) {
        this.limitPeriod = limitPeriod;
    }

    

    public UpdateCcRuleResponse withLockTime(Long lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    


    /**
     * 锁定时长
     * @return lockTime
     */
    public Long getLockTime() {
        return lockTime;
    }

    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    

    public UpdateCcRuleResponse withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    


    /**
     * 防护模式
     * @return tagType
     */
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    

    public UpdateCcRuleResponse withTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
        return this;
    }

    


    /**
     * 防护模式标签
     * @return tagIndex
     */
    public String getTagIndex() {
        return tagIndex;
    }

    public void setTagIndex(String tagIndex) {
        this.tagIndex = tagIndex;
    }

    

    public UpdateCcRuleResponse withAction(CcrulesListInfoAction action) {
        this.action = action;
        return this;
    }

    public UpdateCcRuleResponse withAction(Consumer<CcrulesListInfoAction> actionSetter) {
        if(this.action == null ){
            this.action = new CcrulesListInfoAction();
            actionSetter.accept(this.action);
        }
        
        return this;
    }


    /**
     * Get action
     * @return action
     */
    public CcrulesListInfoAction getAction() {
        return action;
    }

    public void setAction(CcrulesListInfoAction action) {
        this.action = action;
    }

    

    public UpdateCcRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCcRuleResponse updateCcRuleResponse = (UpdateCcRuleResponse) o;
        return Objects.equals(this.id, updateCcRuleResponse.id) &&
            Objects.equals(this.url, updateCcRuleResponse.url) &&
            Objects.equals(this.limitNum, updateCcRuleResponse.limitNum) &&
            Objects.equals(this.limitPeriod, updateCcRuleResponse.limitPeriod) &&
            Objects.equals(this.lockTime, updateCcRuleResponse.lockTime) &&
            Objects.equals(this.tagType, updateCcRuleResponse.tagType) &&
            Objects.equals(this.tagIndex, updateCcRuleResponse.tagIndex) &&
            Objects.equals(this.action, updateCcRuleResponse.action) &&
            Objects.equals(this.timestamp, updateCcRuleResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, url, limitNum, limitPeriod, lockTime, tagType, tagIndex, action, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCcRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    limitPeriod: ").append(toIndentedString(limitPeriod)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
        sb.append("    tagIndex: ").append(toIndentedString(tagIndex)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

