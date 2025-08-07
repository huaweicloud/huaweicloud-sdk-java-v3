package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAssociatedResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 关联的资源类型
     */
    public static final class TypeEnum {

        /**
         * Enum ECS for value: "ecs"
         */
        public static final TypeEnum ECS = new TypeEnum("ecs");

        /**
         * Enum EIP for value: "eip"
         */
        public static final TypeEnum EIP = new TypeEnum("eip");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            map.put("eip", EIP);
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
    @JsonProperty(value = "associated_resources")

    private List<AssociatedResourceListResponse> associatedResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<ResourceErrorListResponse> errors = null;

    public ShowAssociatedResourcesResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAssociatedResourcesResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAssociatedResourcesResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 关联的资源类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowAssociatedResourcesResponse withAssociatedResources(
        List<AssociatedResourceListResponse> associatedResources) {
        this.associatedResources = associatedResources;
        return this;
    }

    public ShowAssociatedResourcesResponse addAssociatedResourcesItem(
        AssociatedResourceListResponse associatedResourcesItem) {
        if (this.associatedResources == null) {
            this.associatedResources = new ArrayList<>();
        }
        this.associatedResources.add(associatedResourcesItem);
        return this;
    }

    public ShowAssociatedResourcesResponse withAssociatedResources(
        Consumer<List<AssociatedResourceListResponse>> associatedResourcesSetter) {
        if (this.associatedResources == null) {
            this.associatedResources = new ArrayList<>();
        }
        associatedResourcesSetter.accept(this.associatedResources);
        return this;
    }

    /**
     * 关联资源列表
     * @return associatedResources
     */
    public List<AssociatedResourceListResponse> getAssociatedResources() {
        return associatedResources;
    }

    public void setAssociatedResources(List<AssociatedResourceListResponse> associatedResources) {
        this.associatedResources = associatedResources;
    }

    public ShowAssociatedResourcesResponse withErrors(List<ResourceErrorListResponse> errors) {
        this.errors = errors;
        return this;
    }

    public ShowAssociatedResourcesResponse addErrorsItem(ResourceErrorListResponse errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ShowAssociatedResourcesResponse withErrors(Consumer<List<ResourceErrorListResponse>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 错误信息列表
     * @return errors
     */
    public List<ResourceErrorListResponse> getErrors() {
        return errors;
    }

    public void setErrors(List<ResourceErrorListResponse> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAssociatedResourcesResponse that = (ShowAssociatedResourcesResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type)
            && Objects.equals(this.associatedResources, that.associatedResources)
            && Objects.equals(this.errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, associatedResources, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssociatedResourcesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    associatedResources: ").append(toIndentedString(associatedResources)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
