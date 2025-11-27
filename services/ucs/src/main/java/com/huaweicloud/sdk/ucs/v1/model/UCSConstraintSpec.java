package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UCSConstraintSpec
 */
public class UCSConstraintSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint")

    private Constraint constraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraintTemplateID")

    private String constraintTemplateID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainID")

    private String domainID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetScope")

    private String targetScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetID")

    private String targetID;

    public UCSConstraintSpec withConstraint(Constraint constraint) {
        this.constraint = constraint;
        return this;
    }

    public UCSConstraintSpec withConstraint(Consumer<Constraint> constraintSetter) {
        if (this.constraint == null) {
            this.constraint = new Constraint();
            constraintSetter.accept(this.constraint);
        }

        return this;
    }

    /**
     * Get constraint
     * @return constraint
     */
    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    public UCSConstraintSpec withConstraintTemplateID(String constraintTemplateID) {
        this.constraintTemplateID = constraintTemplateID;
        return this;
    }

    /**
     * 约束模板ID
     * @return constraintTemplateID
     */
    public String getConstraintTemplateID() {
        return constraintTemplateID;
    }

    public void setConstraintTemplateID(String constraintTemplateID) {
        this.constraintTemplateID = constraintTemplateID;
    }

    public UCSConstraintSpec withDomainID(String domainID) {
        this.domainID = domainID;
        return this;
    }

    /**
     * 用户的domainID
     * @return domainID
     */
    public String getDomainID() {
        return domainID;
    }

    public void setDomainID(String domainID) {
        this.domainID = domainID;
    }

    public UCSConstraintSpec withTargetScope(String targetScope) {
        this.targetScope = targetScope;
        return this;
    }

    /**
     * 策略实例下发范围，当前cluster和fleet二选一
     * @return targetScope
     */
    public String getTargetScope() {
        return targetScope;
    }

    public void setTargetScope(String targetScope) {
        this.targetScope = targetScope;
    }

    public UCSConstraintSpec withTargetID(String targetID) {
        this.targetID = targetID;
        return this;
    }

    /**
     * 策略实例下发对象，当前为clusterID或clustergroupID
     * @return targetID
     */
    public String getTargetID() {
        return targetID;
    }

    public void setTargetID(String targetID) {
        this.targetID = targetID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSConstraintSpec that = (UCSConstraintSpec) obj;
        return Objects.equals(this.constraint, that.constraint)
            && Objects.equals(this.constraintTemplateID, that.constraintTemplateID)
            && Objects.equals(this.domainID, that.domainID) && Objects.equals(this.targetScope, that.targetScope)
            && Objects.equals(this.targetID, that.targetID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraint, constraintTemplateID, domainID, targetScope, targetID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSConstraintSpec {\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
        sb.append("    constraintTemplateID: ").append(toIndentedString(constraintTemplateID)).append("\n");
        sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
        sb.append("    targetScope: ").append(toIndentedString(targetScope)).append("\n");
        sb.append("    targetID: ").append(toIndentedString(targetID)).append("\n");
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
