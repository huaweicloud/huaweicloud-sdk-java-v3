package com.huaweicloud.sdk.waf.v1.model;

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
 * 响应的检查规则
 */
public class ResponseInspectionDTO {

    /**
     * 响应中表明成功或失败的组件（JSON/STATUS_CODE）
     */
    public static final class ComponentTypeEnum {

        /**
         * Enum JSON for value: "JSON"
         */
        public static final ComponentTypeEnum JSON = new ComponentTypeEnum("JSON");

        /**
         * Enum STATUS_CODE for value: "STATUS_CODE"
         */
        public static final ComponentTypeEnum STATUS_CODE = new ComponentTypeEnum("STATUS_CODE");

        private static final Map<String, ComponentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComponentTypeEnum> createStaticFields() {
            Map<String, ComponentTypeEnum> map = new HashMap<>();
            map.put("JSON", JSON);
            map.put("STATUS_CODE", STATUS_CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComponentTypeEnum(String value) {
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
        public static ComponentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentTypeEnum(value));
        }

        public static ComponentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComponentTypeEnum) {
                return this.value.equals(((ComponentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_type")

    private ComponentTypeEnum componentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_path")

    private String jsonPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<String> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail")

    private List<String> fail = null;

    public ResponseInspectionDTO withComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 响应中表明成功或失败的组件（JSON/STATUS_CODE）
     * @return componentType
     */
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public ResponseInspectionDTO withJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    /**
     * JSON 路径（JSON时必选）
     * @return jsonPath
     */
    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public ResponseInspectionDTO withSuccess(List<String> success) {
        this.success = success;
        return this;
    }

    public ResponseInspectionDTO addSuccessItem(String successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public ResponseInspectionDTO withSuccess(Consumer<List<String>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 成功响应判定（可选）
     * @return success
     */
    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public ResponseInspectionDTO withFail(List<String> fail) {
        this.fail = fail;
        return this;
    }

    public ResponseInspectionDTO addFailItem(String failItem) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        this.fail.add(failItem);
        return this;
    }

    public ResponseInspectionDTO withFail(Consumer<List<String>> failSetter) {
        if (this.fail == null) {
            this.fail = new ArrayList<>();
        }
        failSetter.accept(this.fail);
        return this;
    }

    /**
     * 失败响应判定（可选）
     * @return fail
     */
    public List<String> getFail() {
        return fail;
    }

    public void setFail(List<String> fail) {
        this.fail = fail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseInspectionDTO that = (ResponseInspectionDTO) obj;
        return Objects.equals(this.componentType, that.componentType) && Objects.equals(this.jsonPath, that.jsonPath)
            && Objects.equals(this.success, that.success) && Objects.equals(this.fail, that.fail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentType, jsonPath, success, fail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseInspectionDTO {\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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
