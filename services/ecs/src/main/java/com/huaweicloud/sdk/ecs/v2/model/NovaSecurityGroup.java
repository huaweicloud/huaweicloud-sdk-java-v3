package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaSecurityGroupCommonRule;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class NovaSecurityGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<NovaSecurityGroupCommonRule> rules = new ArrayList<>();
    
    public NovaSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 安全组描述信息，长度0-255
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NovaSecurityGroup withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 安全组ID，UUID格式
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaSecurityGroup withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 安全组名字，长度0-255
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovaSecurityGroup withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 租户ID或项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NovaSecurityGroup withRules(List<NovaSecurityGroupCommonRule> rules) {
        this.rules = rules;
        return this;
    }

    
    public NovaSecurityGroup addRulesItem(NovaSecurityGroupCommonRule rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    public NovaSecurityGroup withRules(Consumer<List<NovaSecurityGroupCommonRule>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 安全组规则列表
     * @return rules
     */
    public List<NovaSecurityGroupCommonRule> getRules() {
        return rules;
    }

    public void setRules(List<NovaSecurityGroupCommonRule> rules) {
        this.rules = rules;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaSecurityGroup novaSecurityGroup = (NovaSecurityGroup) o;
        return Objects.equals(this.description, novaSecurityGroup.description) &&
            Objects.equals(this.id, novaSecurityGroup.id) &&
            Objects.equals(this.name, novaSecurityGroup.name) &&
            Objects.equals(this.tenantId, novaSecurityGroup.tenantId) &&
            Objects.equals(this.rules, novaSecurityGroup.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, id, name, tenantId, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaSecurityGroup {\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
            sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

