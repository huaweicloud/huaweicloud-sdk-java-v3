package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ServicePolicy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ServicePolicyRoleOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description_cn")
    
    private String descriptionCn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy")
    
    private ServicePolicy policy = null;

    public ServicePolicyRoleOption withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 自定义策略展示名。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ServicePolicyRoleOption withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 自定义策略的显示模式。   > - AX表示在domain层显示。   > - XA表示在project层显示。   > - 自定义策略的显示模式只能为AX或者XA，不能在domain层和project层都显示（AA），或者在domain层和project层都不显示（XX）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServicePolicyRoleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 自定义策略的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServicePolicyRoleOption withDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
        return this;
    }

    


    /**
     * 自定义策略的中文描述信息。
     * @return descriptionCn
     */
    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public ServicePolicyRoleOption withPolicy(ServicePolicy policy) {
        this.policy = policy;
        return this;
    }

    public ServicePolicyRoleOption withPolicy(Consumer<ServicePolicy> policySetter) {
        if(this.policy == null ){
            this.policy = new ServicePolicy();
            policySetter.accept(this.policy);
        }
        
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public ServicePolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ServicePolicy policy) {
        this.policy = policy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServicePolicyRoleOption servicePolicyRoleOption = (ServicePolicyRoleOption) o;
        return Objects.equals(this.displayName, servicePolicyRoleOption.displayName) &&
            Objects.equals(this.type, servicePolicyRoleOption.type) &&
            Objects.equals(this.description, servicePolicyRoleOption.description) &&
            Objects.equals(this.descriptionCn, servicePolicyRoleOption.descriptionCn) &&
            Objects.equals(this.policy, servicePolicyRoleOption.policy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(displayName, type, description, descriptionCn, policy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePolicyRoleOption {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionCn: ").append(toIndentedString(descriptionCn)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

