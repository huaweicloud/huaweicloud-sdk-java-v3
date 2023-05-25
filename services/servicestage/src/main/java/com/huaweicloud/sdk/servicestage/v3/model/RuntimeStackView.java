package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RuntimeStackView
 */
public class RuntimeStackView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * Gets or Sets deployMode
     */
    public static final class DeployModeEnum {

        /**
         * Enum CONTAINER for value: "container"
         */
        public static final DeployModeEnum CONTAINER = new DeployModeEnum("container");

        /**
         * Enum VIRTUALMACHINE for value: "virtualmachine"
         */
        public static final DeployModeEnum VIRTUALMACHINE = new DeployModeEnum("virtualmachine");

        private static final Map<String, DeployModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployModeEnum> createStaticFields() {
            Map<String, DeployModeEnum> map = new HashMap<>();
            map.put("container", CONTAINER);
            map.put("virtualmachine", VIRTUALMACHINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployModeEnum(String value) {
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
        public static DeployModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeployModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeployModeEnum(value);
            }
            return result;
        }

        public static DeployModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeployModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployModeEnum) {
                return this.value.equals(((DeployModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private DeployModeEnum deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum NODEJS for value: "Nodejs"
         */
        public static final TypeEnum NODEJS = new TypeEnum("Nodejs");

        /**
         * Enum JAVA for value: "Java"
         */
        public static final TypeEnum JAVA = new TypeEnum("Java");

        /**
         * Enum TOMCAT for value: "Tomcat"
         */
        public static final TypeEnum TOMCAT = new TypeEnum("Tomcat");

        /**
         * Enum DOCKER for value: "Docker"
         */
        public static final TypeEnum DOCKER = new TypeEnum("Docker");

        /**
         * Enum PHP for value: "Php"
         */
        public static final TypeEnum PHP = new TypeEnum("Php");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Nodejs", NODEJS);
            map.put("Java", JAVA);
            map.put("Tomcat", TOMCAT);
            map.put("Docker", DOCKER);
            map.put("Php", PHP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum SUPPORTED for value: "Supported"
         */
        public static final StatusEnum SUPPORTED = new StatusEnum("Supported");

        /**
         * Enum DEPRECATED for value: "Deprecated"
         */
        public static final StatusEnum DEPRECATED = new StatusEnum("Deprecated");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Supported", SUPPORTED);
            map.put("Deprecated", DEPRECATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public RuntimeStackView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuntimeStackView withDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * Get deployMode
     * @return deployMode
     */
    public DeployModeEnum getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(DeployModeEnum deployMode) {
        this.deployMode = deployMode;
    }

    public RuntimeStackView withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RuntimeStackView withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RuntimeStackView withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeStackView runtimeStackView = (RuntimeStackView) o;
        return Objects.equals(this.name, runtimeStackView.name)
            && Objects.equals(this.deployMode, runtimeStackView.deployMode)
            && Objects.equals(this.version, runtimeStackView.version)
            && Objects.equals(this.type, runtimeStackView.type) && Objects.equals(this.status, runtimeStackView.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deployMode, version, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeStackView {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
