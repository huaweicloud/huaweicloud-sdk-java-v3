package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObjectReference
 */
public class ObjectReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceVersion")

    private String resourceVersion;

    public ObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： 资源对象的API类型，例如，DaemonSet、Deployment 等。 **取值范围**： 不涉及。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ObjectReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： 资源对象的API版本。 **取值范围**： 不涉及。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ObjectReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 资源对象的命名空间。 **取值范围**： 不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ObjectReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 资源对象的名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**： 资源对象的唯一标识符（UID）。 **取值范围**： 不涉及。
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ObjectReference withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * **参数解释**： 资源对象的当前版本。 **取值范围**： 不涉及。
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectReference that = (ObjectReference) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.resourceVersion, that.resourceVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, namespace, name, uid, resourceVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectReference {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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
