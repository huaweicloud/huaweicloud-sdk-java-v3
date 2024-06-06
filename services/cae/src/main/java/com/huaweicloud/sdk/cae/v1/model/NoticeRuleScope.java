package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoticeRuleScope
 */
public class NoticeRuleScope {

    /**
     * 生效范围的类型。包括environments（对指定环境下所有组件生效），applications（对指定应用下所有组件生效），components（对指定的组件生效）。
     */
    public static final class TypeEnum {

        /**
         * Enum ENVIRONMENTS for value: "environments"
         */
        public static final TypeEnum ENVIRONMENTS = new TypeEnum("environments");

        /**
         * Enum APPLICATIONS for value: "applications"
         */
        public static final TypeEnum APPLICATIONS = new TypeEnum("applications");

        /**
         * Enum COMPONENTS for value: "components"
         */
        public static final TypeEnum COMPONENTS = new TypeEnum("components");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("environments", ENVIRONMENTS);
            map.put("applications", APPLICATIONS);
            map.put("components", COMPONENTS);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private List<String> environments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<String> applications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<String> components = null;

    public NoticeRuleScope withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 生效范围的类型。包括environments（对指定环境下所有组件生效），applications（对指定应用下所有组件生效），components（对指定的组件生效）。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NoticeRuleScope withEnvironments(List<String> environments) {
        this.environments = environments;
        return this;
    }

    public NoticeRuleScope addEnvironmentsItem(String environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    public NoticeRuleScope withEnvironments(Consumer<List<String>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * 生效的环境id列表。
     * @return environments
     */
    public List<String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<String> environments) {
        this.environments = environments;
    }

    public NoticeRuleScope withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

    public NoticeRuleScope addApplicationsItem(String applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public NoticeRuleScope withApplications(Consumer<List<String>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 生效的应用id列表。
     * @return applications
     */
    public List<String> getApplications() {
        return applications;
    }

    public void setApplications(List<String> applications) {
        this.applications = applications;
    }

    public NoticeRuleScope withComponents(List<String> components) {
        this.components = components;
        return this;
    }

    public NoticeRuleScope addComponentsItem(String componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public NoticeRuleScope withComponents(Consumer<List<String>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 生效的组件id列表。
     * @return components
     */
    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoticeRuleScope that = (NoticeRuleScope) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.environments, that.environments)
            && Objects.equals(this.applications, that.applications) && Objects.equals(this.components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, environments, applications, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoticeRuleScope {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
