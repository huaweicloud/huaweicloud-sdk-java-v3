package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CancelAsyncInvocationRequestBody
 */
public class CancelAsyncInvocationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    /**
     * 停止的类型 支持recursive, force。 recursive: 停止正在调用的子函数。 force: 直接杀死runtime。
     */
    public static final class TypeEnum {

        /**
         * Enum FORCE for value: "force"
         */
        public static final TypeEnum FORCE = new TypeEnum("force");

        /**
         * Enum RECURSIVE for value: "recursive"
         */
        public static final TypeEnum RECURSIVE = new TypeEnum("recursive");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("force", FORCE);
            map.put("recursive", RECURSIVE);
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

    public CancelAsyncInvocationRequestBody withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 被停止的请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CancelAsyncInvocationRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 停止的类型 支持recursive, force。 recursive: 停止正在调用的子函数。 force: 直接杀死runtime。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelAsyncInvocationRequestBody cancelAsyncInvocationRequestBody = (CancelAsyncInvocationRequestBody) o;
        return Objects.equals(this.requestId, cancelAsyncInvocationRequestBody.requestId)
            && Objects.equals(this.type, cancelAsyncInvocationRequestBody.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelAsyncInvocationRequestBody {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
