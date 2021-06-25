package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.PolicyAction;
import com.huaweicloud.sdk.waf.v1.model.PolicyOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdatePolicyRequestBody
 */
public class UpdatePolicyRequestBody  {



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

    public UpdatePolicyRequestBody withName(String name) {
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

    

    public UpdatePolicyRequestBody withAction(PolicyAction action) {
        this.action = action;
        return this;
    }

    public UpdatePolicyRequestBody withAction(Consumer<PolicyAction> actionSetter) {
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

    

    public UpdatePolicyRequestBody withOptions(PolicyOption options) {
        this.options = options;
        return this;
    }

    public UpdatePolicyRequestBody withOptions(Consumer<PolicyOption> optionsSetter) {
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

    

    public UpdatePolicyRequestBody withLevel(Integer level) {
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

    

    public UpdatePolicyRequestBody withFullDetection(Boolean fullDetection) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyRequestBody updatePolicyRequestBody = (UpdatePolicyRequestBody) o;
        return Objects.equals(this.name, updatePolicyRequestBody.name) &&
            Objects.equals(this.action, updatePolicyRequestBody.action) &&
            Objects.equals(this.options, updatePolicyRequestBody.options) &&
            Objects.equals(this.level, updatePolicyRequestBody.level) &&
            Objects.equals(this.fullDetection, updatePolicyRequestBody.fullDetection);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, action, options, level, fullDetection);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    fullDetection: ").append(toIndentedString(fullDetection)).append("\n");
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

