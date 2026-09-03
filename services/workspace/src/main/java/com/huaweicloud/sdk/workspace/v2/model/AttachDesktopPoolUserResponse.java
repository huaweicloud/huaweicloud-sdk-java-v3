package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class AttachDesktopPoolUserResponse extends SdkResponse {

    /**
     * CREATING：桌面创建中；WAITING：动态池排队等待；EXCEEDED：静态池已达最大值；ASSIGNING：有空闲桌面，分配中；RESETTING 重置中。
     */
    public static final class TypeEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final TypeEnum CREATING = new TypeEnum("CREATING");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final TypeEnum WAITING = new TypeEnum("WAITING");

        /**
         * Enum EXCEEDED for value: "EXCEEDED"
         */
        public static final TypeEnum EXCEEDED = new TypeEnum("EXCEEDED");

        /**
         * Enum ASSIGNING for value: "ASSIGNING"
         */
        public static final TypeEnum ASSIGNING = new TypeEnum("ASSIGNING");

        /**
         * Enum RESETTING for value: "RESETTING"
         */
        public static final TypeEnum RESETTING = new TypeEnum("RESETTING");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("WAITING", WAITING);
            map.put("EXCEEDED", EXCEEDED);
            map.put("ASSIGNING", ASSIGNING);
            map.put("RESETTING", RESETTING);
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
    @JsonProperty(value = "job_id")

    private String jobId;

    public AttachDesktopPoolUserResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * CREATING：桌面创建中；WAITING：动态池排队等待；EXCEEDED：静态池已达最大值；ASSIGNING：有空闲桌面，分配中；RESETTING 重置中。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AttachDesktopPoolUserResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachDesktopPoolUserResponse that = (AttachDesktopPoolUserResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachDesktopPoolUserResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
