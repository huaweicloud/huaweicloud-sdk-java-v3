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
public class ShowCcRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private Integer mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unaggregation")
    
    private Boolean unaggregation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="prefix")
    
    private Boolean prefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_num")
    
    private Integer totalNum;


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
    
    private Integer lockTime;


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

    public ShowCcRuleResponse withId(String id) {
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

    

    public ShowCcRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 所属策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public ShowCcRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ShowCcRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowCcRuleResponse withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 阻断模式
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    

    public ShowCcRuleResponse withUnaggregation(Boolean unaggregation) {
        this.unaggregation = unaggregation;
        return this;
    }

    


    /**
     * 人机验证
     * @return unaggregation
     */
    public Boolean getUnaggregation() {
        return unaggregation;
    }

    public void setUnaggregation(Boolean unaggregation) {
        this.unaggregation = unaggregation;
    }

    

    public ShowCcRuleResponse withPrefix(Boolean prefix) {
        this.prefix = prefix;
        return this;
    }

    


    /**
     * 前缀包含
     * @return prefix
     */
    public Boolean getPrefix() {
        return prefix;
    }

    public void setPrefix(Boolean prefix) {
        this.prefix = prefix;
    }

    

    public ShowCcRuleResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    


    /**
     * 总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    

    public ShowCcRuleResponse withUrl(String url) {
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

    

    public ShowCcRuleResponse withLimitNum(Integer limitNum) {
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

    

    public ShowCcRuleResponse withLimitPeriod(Integer limitPeriod) {
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

    

    public ShowCcRuleResponse withLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    


    /**
     * 锁定时长
     * @return lockTime
     */
    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    

    public ShowCcRuleResponse withTagType(String tagType) {
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

    

    public ShowCcRuleResponse withTagIndex(String tagIndex) {
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

    

    public ShowCcRuleResponse withAction(CcrulesListInfoAction action) {
        this.action = action;
        return this;
    }

    public ShowCcRuleResponse withAction(Consumer<CcrulesListInfoAction> actionSetter) {
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

    

    public ShowCcRuleResponse withTimestamp(Long timestamp) {
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
        ShowCcRuleResponse showCcRuleResponse = (ShowCcRuleResponse) o;
        return Objects.equals(this.id, showCcRuleResponse.id) &&
            Objects.equals(this.policyid, showCcRuleResponse.policyid) &&
            Objects.equals(this.status, showCcRuleResponse.status) &&
            Objects.equals(this.description, showCcRuleResponse.description) &&
            Objects.equals(this.mode, showCcRuleResponse.mode) &&
            Objects.equals(this.unaggregation, showCcRuleResponse.unaggregation) &&
            Objects.equals(this.prefix, showCcRuleResponse.prefix) &&
            Objects.equals(this.totalNum, showCcRuleResponse.totalNum) &&
            Objects.equals(this.url, showCcRuleResponse.url) &&
            Objects.equals(this.limitNum, showCcRuleResponse.limitNum) &&
            Objects.equals(this.limitPeriod, showCcRuleResponse.limitPeriod) &&
            Objects.equals(this.lockTime, showCcRuleResponse.lockTime) &&
            Objects.equals(this.tagType, showCcRuleResponse.tagType) &&
            Objects.equals(this.tagIndex, showCcRuleResponse.tagIndex) &&
            Objects.equals(this.action, showCcRuleResponse.action) &&
            Objects.equals(this.timestamp, showCcRuleResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, status, description, mode, unaggregation, prefix, totalNum, url, limitNum, limitPeriod, lockTime, tagType, tagIndex, action, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCcRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    unaggregation: ").append(toIndentedString(unaggregation)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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

