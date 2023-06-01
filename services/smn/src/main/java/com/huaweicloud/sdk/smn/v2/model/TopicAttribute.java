package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopicAttribute
 */
public class TopicAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private AccessPolicy accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "introduction")

    private String introduction;

    public TopicAttribute withAccessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    public TopicAttribute withAccessPolicy(Consumer<AccessPolicy> accessPolicySetter) {
        if (this.accessPolicy == null) {
            this.accessPolicy = new AccessPolicy();
            accessPolicySetter.accept(this.accessPolicy);
        }

        return this;
    }

    /**
     * Get accessPolicy
     * @return accessPolicy
     */
    public AccessPolicy getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public TopicAttribute withIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    /**
     * topic的简介
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicAttribute topicAttribute = (TopicAttribute) o;
        return Objects.equals(this.accessPolicy, topicAttribute.accessPolicy)
            && Objects.equals(this.introduction, topicAttribute.introduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicy, introduction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicAttribute {\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
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
