package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.SecurityGroupRule;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class SecurityGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rules")
    
    private List<SecurityGroupRule> securityGroupRules = new ArrayList<>();
    
    public SecurityGroup withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 安全组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 安全组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityGroup withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 安全组唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SecurityGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 安全组所在的vpc的资源标识
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public SecurityGroup withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 功能说明：企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SecurityGroup withSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    
    public SecurityGroup addSecurityGroupRulesItem(SecurityGroupRule securityGroupRulesItem) {
        this.securityGroupRules.add(securityGroupRulesItem);
        return this;
    }

    public SecurityGroup withSecurityGroupRules(Consumer<List<SecurityGroupRule>> securityGroupRulesSetter) {
        if(this.securityGroupRules == null ){
            this.securityGroupRules = new ArrayList<>();
        }
        securityGroupRulesSetter.accept(this.securityGroupRules);
        return this;
    }

    /**
     * 安全组规则
     * @return securityGroupRules
     */
    public List<SecurityGroupRule> getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroup securityGroup = (SecurityGroup) o;
        return Objects.equals(this.name, securityGroup.name) &&
            Objects.equals(this.description, securityGroup.description) &&
            Objects.equals(this.id, securityGroup.id) &&
            Objects.equals(this.vpcId, securityGroup.vpcId) &&
            Objects.equals(this.enterpriseProjectId, securityGroup.enterpriseProjectId) &&
            Objects.equals(this.securityGroupRules, securityGroup.securityGroupRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, id, vpcId, enterpriseProjectId, securityGroupRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroup {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    securityGroupRules: ").append(toIndentedString(securityGroupRules)).append("\n");
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

