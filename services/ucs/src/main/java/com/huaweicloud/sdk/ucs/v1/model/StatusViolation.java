package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatusViolation
 */
public class StatusViolation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enforcementAction")

    private String enforcementAction;

    public StatusViolation withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 违规资源类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public StatusViolation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 违规资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusViolation withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 违规资源所在命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public StatusViolation withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 详细违规信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StatusViolation withEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
        return this;
    }

    /**
     * 审计行为
     * @return enforcementAction
     */
    public String getEnforcementAction() {
        return enforcementAction;
    }

    public void setEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusViolation that = (StatusViolation) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.message, that.message)
            && Objects.equals(this.enforcementAction, that.enforcementAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name, namespace, message, enforcementAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusViolation {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    enforcementAction: ").append(toIndentedString(enforcementAction)).append("\n");
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
