package com.huaweicloud.sdk.roma.v2.model;

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
 * MultiTaskUpdateBody
 */
public class MultiTaskUpdateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_tag")

    private String taskTag;

    /**
     * Gets or Sets operationTypes
     */
    public static final class OperationTypesEnum {

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final OperationTypesEnum INSERT = new OperationTypesEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final OperationTypesEnum UPDATE = new OperationTypesEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final OperationTypesEnum DELETE = new OperationTypesEnum("DELETE");

        private static final Map<String, OperationTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypesEnum> createStaticFields() {
            Map<String, OperationTypesEnum> map = new HashMap<>();
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypesEnum(String value) {
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
        public static OperationTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationTypesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypesEnum(value);
            }
            return result;
        }

        public static OperationTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypesEnum) {
                return this.value.equals(((OperationTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    private List<OperationTypesEnum> operationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repulling_snapshot")

    private Boolean repullingSnapshot;

    public MultiTaskUpdateBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultiTaskUpdateBody withTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }

    /**
     * 任务标签,只能包含字母、数字、中划线、下划线
     * @return taskTag
     */
    public String getTaskTag() {
        return taskTag;
    }

    public void setTaskTag(String taskTag) {
        this.taskTag = taskTag;
    }

    public MultiTaskUpdateBody withOperationTypes(List<OperationTypesEnum> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    public MultiTaskUpdateBody addOperationTypesItem(OperationTypesEnum operationTypesItem) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        this.operationTypes.add(operationTypesItem);
        return this;
    }

    public MultiTaskUpdateBody withOperationTypes(Consumer<List<OperationTypesEnum>> operationTypesSetter) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        operationTypesSetter.accept(this.operationTypes);
        return this;
    }

    /**
     * 需要支持的操作类型，支持多选，至少需要选择以下一种： - INSERT - UPDATE - DELETE
     * @return operationTypes
     */
    public List<OperationTypesEnum> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<OperationTypesEnum> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public MultiTaskUpdateBody withRepullingSnapshot(Boolean repullingSnapshot) {
        this.repullingSnapshot = repullingSnapshot;
        return this;
    }

    /**
     * 是否同步已有数据，仅在编辑任务时生效
     * @return repullingSnapshot
     */
    public Boolean getRepullingSnapshot() {
        return repullingSnapshot;
    }

    public void setRepullingSnapshot(Boolean repullingSnapshot) {
        this.repullingSnapshot = repullingSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskUpdateBody multiTaskUpdateBody = (MultiTaskUpdateBody) o;
        return Objects.equals(this.description, multiTaskUpdateBody.description)
            && Objects.equals(this.taskTag, multiTaskUpdateBody.taskTag)
            && Objects.equals(this.operationTypes, multiTaskUpdateBody.operationTypes)
            && Objects.equals(this.repullingSnapshot, multiTaskUpdateBody.repullingSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, taskTag, operationTypes, repullingSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskUpdateBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
        sb.append("    repullingSnapshot: ").append(toIndentedString(repullingSnapshot)).append("\n");
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
