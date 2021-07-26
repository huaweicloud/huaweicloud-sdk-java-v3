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
            Objects.equals(this.options, updatePolicyRequestBody.options);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, action, options);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

