package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowInstanceArtifactAdditionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private String reference;

    /**
     * 制品附加信息
     */
    public static final class AdditionEnum {

        /**
         * Enum BUILD_HISTORY for value: "build_history"
         */
        public static final AdditionEnum BUILD_HISTORY = new AdditionEnum("build_history");

        private static final Map<String, AdditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdditionEnum> createStaticFields() {
            Map<String, AdditionEnum> map = new HashMap<>();
            map.put("build_history", BUILD_HISTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdditionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AdditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdditionEnum(value));
        }

        public static AdditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdditionEnum) {
                return this.value.equals(((AdditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addition")

    private AdditionEnum addition;

    public ShowInstanceArtifactAdditionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceArtifactAdditionRequest withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public ShowInstanceArtifactAdditionRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 仓库名称
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ShowInstanceArtifactAdditionRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 制品摘要
     * @return reference
     */
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public ShowInstanceArtifactAdditionRequest withAddition(AdditionEnum addition) {
        this.addition = addition;
        return this;
    }

    /**
     * 制品附加信息
     * @return addition
     */
    public AdditionEnum getAddition() {
        return addition;
    }

    public void setAddition(AdditionEnum addition) {
        this.addition = addition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceArtifactAdditionRequest that = (ShowInstanceArtifactAdditionRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.reference, that.reference) && Objects.equals(this.addition, that.addition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, namespaceName, repositoryName, reference, addition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceArtifactAdditionRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
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
