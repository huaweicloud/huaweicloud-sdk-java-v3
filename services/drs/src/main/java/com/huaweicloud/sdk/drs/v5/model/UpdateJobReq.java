package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新指定ID任务请求体。
 */
public class UpdateJobReq {

    /**
     * 更新指定ID任务详情类型。  场景一：更新单个任务详情，取值： - name：更新该任务名称。 - description：更新该任务描述。 - re_create：配置中任务三天以后虚拟机删除后重建。 - expired_days：更新任务异常自动结束时间，单位为天。 - notify：更新任务异常通知信息。  场景二：更新批量异步任务详情，取值： - all：批量异步创建的任务，参数校验不通过，需要指定全部参数进行更新时。 - network：批量异步创建的任务，测试连接不通过，需要更新源库/目标库信息时。 - policy：批量异步创建的任务，需要更新任务配置时。 - db_object：批量异步创建的任务，需要更新对象信息时。 - precheck：批量异步创建的任务，需要重新预检查时。
     */
    public static final class TypeEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final TypeEnum NAME = new TypeEnum("name");

        /**
         * Enum DESCRIPTION for value: "description"
         */
        public static final TypeEnum DESCRIPTION = new TypeEnum("description");

        /**
         * Enum ALL for value: "all"
         */
        public static final TypeEnum ALL = new TypeEnum("all");

        /**
         * Enum NETWORK for value: "network"
         */
        public static final TypeEnum NETWORK = new TypeEnum("network");

        /**
         * Enum POLICY for value: "policy"
         */
        public static final TypeEnum POLICY = new TypeEnum("policy");

        /**
         * Enum DB_OBJECT for value: "db_object"
         */
        public static final TypeEnum DB_OBJECT = new TypeEnum("db_object");

        /**
         * Enum PRECHECK for value: "precheck"
         */
        public static final TypeEnum PRECHECK = new TypeEnum("precheck");

        /**
         * Enum RE_CREATE for value: "re_create"
         */
        public static final TypeEnum RE_CREATE = new TypeEnum("re_create");

        /**
         * Enum EXPIRED_DAYS for value: "expired_days"
         */
        public static final TypeEnum EXPIRED_DAYS = new TypeEnum("expired_days");

        /**
         * Enum NOTIFY for value: "notify"
         */
        public static final TypeEnum NOTIFY = new TypeEnum("notify");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("description", DESCRIPTION);
            map.put("all", ALL);
            map.put("network", NETWORK);
            map.put("policy", POLICY);
            map.put("db_object", DB_OBJECT);
            map.put("precheck", PRECHECK);
            map.put("re_create", RE_CREATE);
            map.put("expired_days", EXPIRED_DAYS);
            map.put("notify", NOTIFY);
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
    @JsonProperty(value = "params")

    private UpdateJob params;

    public UpdateJobReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 更新指定ID任务详情类型。  场景一：更新单个任务详情，取值： - name：更新该任务名称。 - description：更新该任务描述。 - re_create：配置中任务三天以后虚拟机删除后重建。 - expired_days：更新任务异常自动结束时间，单位为天。 - notify：更新任务异常通知信息。  场景二：更新批量异步任务详情，取值： - all：批量异步创建的任务，参数校验不通过，需要指定全部参数进行更新时。 - network：批量异步创建的任务，测试连接不通过，需要更新源库/目标库信息时。 - policy：批量异步创建的任务，需要更新任务配置时。 - db_object：批量异步创建的任务，需要更新对象信息时。 - precheck：批量异步创建的任务，需要重新预检查时。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateJobReq withParams(UpdateJob params) {
        this.params = params;
        return this;
    }

    public UpdateJobReq withParams(Consumer<UpdateJob> paramsSetter) {
        if (this.params == null) {
            this.params = new UpdateJob();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public UpdateJob getParams() {
        return params;
    }

    public void setParams(UpdateJob params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateJobReq that = (UpdateJobReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
