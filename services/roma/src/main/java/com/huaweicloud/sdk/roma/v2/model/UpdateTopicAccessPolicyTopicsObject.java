package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTopicAccessPolicyTopicsObject
 */
public class UpdateTopicAccessPolicyTopicsObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    @JacksonXmlProperty(localName = "policies")

    private List<UpdateTopicAccessPolicyPoliciesObject> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_word")

    @JacksonXmlProperty(localName = "sensitive_word")

    private String sensitiveWord;

    public UpdateTopicAccessPolicyTopicsObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTopicAccessPolicyTopicsObject withPolicies(List<UpdateTopicAccessPolicyPoliciesObject> policies) {
        this.policies = policies;
        return this;
    }

    public UpdateTopicAccessPolicyTopicsObject addPoliciesItem(UpdateTopicAccessPolicyPoliciesObject policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public UpdateTopicAccessPolicyTopicsObject withPolicies(
        Consumer<List<UpdateTopicAccessPolicyPoliciesObject>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 权限列表。
     * @return policies
     */
    public List<UpdateTopicAccessPolicyPoliciesObject> getPolicies() {
        return policies;
    }

    public void setPolicies(List<UpdateTopicAccessPolicyPoliciesObject> policies) {
        this.policies = policies;
    }

    public UpdateTopicAccessPolicyTopicsObject withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTopicAccessPolicyTopicsObject withSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
        return this;
    }

    /**
     * 敏感字段。
     * @return sensitiveWord
     */
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicAccessPolicyTopicsObject updateTopicAccessPolicyTopicsObject =
            (UpdateTopicAccessPolicyTopicsObject) o;
        return Objects.equals(this.name, updateTopicAccessPolicyTopicsObject.name)
            && Objects.equals(this.policies, updateTopicAccessPolicyTopicsObject.policies)
            && Objects.equals(this.description, updateTopicAccessPolicyTopicsObject.description)
            && Objects.equals(this.sensitiveWord, updateTopicAccessPolicyTopicsObject.sensitiveWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, policies, description, sensitiveWord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAccessPolicyTopicsObject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sensitiveWord: ").append(toIndentedString(sensitiveWord)).append("\n");
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
