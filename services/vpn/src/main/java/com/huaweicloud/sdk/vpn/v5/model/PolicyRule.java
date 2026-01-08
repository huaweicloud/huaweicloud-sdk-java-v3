package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyRule
 */
public class PolicyRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_index")

    private Integer ruleIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private List<String> destination = null;

    public PolicyRule withRuleIndex(Integer ruleIndex) {
        this.ruleIndex = ruleIndex;
        return this;
    }

    /**
     * 规则ID
     * @return ruleIndex
     */
    public Integer getRuleIndex() {
        return ruleIndex;
    }

    public void setRuleIndex(Integer ruleIndex) {
        this.ruleIndex = ruleIndex;
    }

    public PolicyRule withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 源地址网段
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public PolicyRule withDestination(List<String> destination) {
        this.destination = destination;
        return this;
    }

    public PolicyRule addDestinationItem(String destinationItem) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        this.destination.add(destinationItem);
        return this;
    }

    public PolicyRule withDestination(Consumer<List<String>> destinationSetter) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        destinationSetter.accept(this.destination);
        return this;
    }

    /**
     * 目的地址网段
     * @return destination
     */
    public List<String> getDestination() {
        return destination;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyRule that = (PolicyRule) obj;
        return Objects.equals(this.ruleIndex, that.ruleIndex) && Objects.equals(this.source, that.source)
            && Objects.equals(this.destination, that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIndex, source, destination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyRule {\n");
        sb.append("    ruleIndex: ").append(toIndentedString(ruleIndex)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
