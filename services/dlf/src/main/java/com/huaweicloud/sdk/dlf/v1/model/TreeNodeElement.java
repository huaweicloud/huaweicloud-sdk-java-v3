package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TreeNodeElement
 */
public class TreeNodeElement {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum JOB for value: "job"
         */
        public static final TypeEnum JOB = new TypeEnum("job");

        /**
         * Enum SCRIPT for value: "script"
         */
        public static final TypeEnum SCRIPT = new TypeEnum("script");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("job", JOB);
            map.put("script", SCRIPT);
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
    @JsonProperty(value = "parent_directory_id")

    private String parentDirectoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "element_id")

    private String elementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_type")

    private String processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_single_node_job")

    private Boolean isSingleNodeJob;

    public TreeNodeElement withType(TypeEnum type) {
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

    public TreeNodeElement withParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }

    /**
     * Get parentDirectoryId
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return parentDirectoryId;
    }

    public void setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
    }

    public TreeNodeElement withName(String name) {
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

    public TreeNodeElement withElementId(String elementId) {
        this.elementId = elementId;
        return this;
    }

    /**
     * Get elementId
     * @return elementId
     */
    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public TreeNodeElement withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TreeNodeElement withProcessType(String processType) {
        this.processType = processType;
        return this;
    }

    /**
     * Get processType
     * @return processType
     */
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public TreeNodeElement withIsSingleNodeJob(Boolean isSingleNodeJob) {
        this.isSingleNodeJob = isSingleNodeJob;
        return this;
    }

    /**
     * Get isSingleNodeJob
     * @return isSingleNodeJob
     */
    public Boolean getIsSingleNodeJob() {
        return isSingleNodeJob;
    }

    public void setIsSingleNodeJob(Boolean isSingleNodeJob) {
        this.isSingleNodeJob = isSingleNodeJob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TreeNodeElement that = (TreeNodeElement) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.parentDirectoryId, that.parentDirectoryId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.elementId, that.elementId)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.processType, that.processType)
            && Objects.equals(this.isSingleNodeJob, that.isSingleNodeJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parentDirectoryId, name, elementId, owner, processType, isSingleNodeJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TreeNodeElement {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parentDirectoryId: ").append(toIndentedString(parentDirectoryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    isSingleNodeJob: ").append(toIndentedString(isSingleNodeJob)).append("\n");
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
