package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConstraintSpec
 */
public class ConstraintSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enforcementAction")

    private String enforcementAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private Match match;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    public ConstraintSpec withEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
        return this;
    }

    /**
     * 策略执行行为，当前支持warn和deny
     * @return enforcementAction
     */
    public String getEnforcementAction() {
        return enforcementAction;
    }

    public void setEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
    }

    public ConstraintSpec withMatch(Match match) {
        this.match = match;
        return this;
    }

    public ConstraintSpec withMatch(Consumer<Match> matchSetter) {
        if (this.match == null) {
            this.match = new Match();
            matchSetter.accept(this.match);
        }

        return this;
    }

    /**
     * Get match
     * @return match
     */
    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public ConstraintSpec withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 可变参数
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConstraintSpec that = (ConstraintSpec) obj;
        return Objects.equals(this.enforcementAction, that.enforcementAction) && Objects.equals(this.match, that.match)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enforcementAction, match, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstraintSpec {\n");
        sb.append("    enforcementAction: ").append(toIndentedString(enforcementAction)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
