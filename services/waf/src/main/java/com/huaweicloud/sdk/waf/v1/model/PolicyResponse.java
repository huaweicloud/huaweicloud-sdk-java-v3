package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.BindHost;
import com.huaweicloud.sdk.waf.v1.model.PolicyAction;
import com.huaweicloud.sdk.waf.v1.model.PolicyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PolicyResponse
 */
public class PolicyResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private PolicyAction action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="options")
    
    private PolicyOption options;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    private Integer level;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="full_detection")
    
    private Boolean fullDetection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_host")
    
    private List<BindHost> bindHost = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend")
    
    private Map<String, String> extend = null;
    
    public PolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 防护策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 防护策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public PolicyResponse withAction(PolicyAction action) {
        this.action = action;
        return this;
    }

    public PolicyResponse withAction(Consumer<PolicyAction> actionSetter) {
        if(this.action == null ){
            this.action = new PolicyAction();
            actionSetter.accept(this.action);
        }
        
        return this;
    }


    /**
     * Get action
     * @return action
     */
    public PolicyAction getAction() {
        return action;
    }

    public void setAction(PolicyAction action) {
        this.action = action;
    }

    

    public PolicyResponse withOptions(PolicyOption options) {
        this.options = options;
        return this;
    }

    public PolicyResponse withOptions(Consumer<PolicyOption> optionsSetter) {
        if(this.options == null ){
            this.options = new PolicyOption();
            optionsSetter.accept(this.options);
        }
        
        return this;
    }


    /**
     * Get options
     * @return options
     */
    public PolicyOption getOptions() {
        return options;
    }

    public void setOptions(PolicyOption options) {
        this.options = options;
    }

    

    public PolicyResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    


    /**
     * 防护等级
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    

    public PolicyResponse withFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
        return this;
    }

    


    /**
     * 精准防护中的检测模式
     * @return fullDetection
     */
    public Boolean getFullDetection() {
        return fullDetection;
    }

    public void setFullDetection(Boolean fullDetection) {
        this.fullDetection = fullDetection;
    }

    

    public PolicyResponse withBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
        return this;
    }

    
    public PolicyResponse addBindHostItem(BindHost bindHostItem) {
        if(this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        this.bindHost.add(bindHostItem);
        return this;
    }

    public PolicyResponse withBindHost(Consumer<List<BindHost>> bindHostSetter) {
        if(this.bindHost == null) {
            this.bindHost = new ArrayList<>();
        }
        bindHostSetter.accept(this.bindHost);
        return this;
    }

    /**
     * 防护域名的信息
     * @return bindHost
     */
    public List<BindHost> getBindHost() {
        return bindHost;
    }

    public void setBindHost(List<BindHost> bindHost) {
        this.bindHost = bindHost;
    }

    

    public PolicyResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 创建防护策略的时间
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    public PolicyResponse withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    

    public PolicyResponse putExtendItem(String key, String extendItem) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public PolicyResponse withExtend(Consumer<Map<String, String>> extendSetter) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }
    /**
     * 扩展字段
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyResponse policyResponse = (PolicyResponse) o;
        return Objects.equals(this.id, policyResponse.id) &&
            Objects.equals(this.name, policyResponse.name) &&
            Objects.equals(this.action, policyResponse.action) &&
            Objects.equals(this.options, policyResponse.options) &&
            Objects.equals(this.level, policyResponse.level) &&
            Objects.equals(this.fullDetection, policyResponse.fullDetection) &&
            Objects.equals(this.bindHost, policyResponse.bindHost) &&
            Objects.equals(this.timestamp, policyResponse.timestamp) &&
            Objects.equals(this.extend, policyResponse.extend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, action, options, level, fullDetection, bindHost, timestamp, extend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
        sb.append("    bindHost: ").append(toIndentedString(bindHost)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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

