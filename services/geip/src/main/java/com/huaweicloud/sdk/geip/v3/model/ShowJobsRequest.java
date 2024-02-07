package com.huaweicloud.sdk.geip.v3.model;

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
 * Request Object
 */
public class ShowJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * Gets or Sets fields
     */
    public static final class FieldsEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final FieldsEnum ID = new FieldsEnum("id");

        /**
         * Enum ACTION for value: "action"
         */
        public static final FieldsEnum ACTION = new FieldsEnum("action");

        /**
         * Enum STATUS for value: "status"
         */
        public static final FieldsEnum STATUS = new FieldsEnum("status");

        /**
         * Enum ERROR_TASK for value: "error_task"
         */
        public static final FieldsEnum ERROR_TASK = new FieldsEnum("error_task");

        /**
         * Enum ERROR_CODE for value: "error_code"
         */
        public static final FieldsEnum ERROR_CODE = new FieldsEnum("error_code");

        /**
         * Enum ERROR_MESSAGE for value: "error_message"
         */
        public static final FieldsEnum ERROR_MESSAGE = new FieldsEnum("error_message");

        /**
         * Enum START_TIME for value: "start_time"
         */
        public static final FieldsEnum START_TIME = new FieldsEnum("start_time");

        /**
         * Enum END_TIME for value: "end_time"
         */
        public static final FieldsEnum END_TIME = new FieldsEnum("end_time");

        private static final Map<String, FieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FieldsEnum> createStaticFields() {
            Map<String, FieldsEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("action", ACTION);
            map.put("status", STATUS);
            map.put("error_task", ERROR_TASK);
            map.put("error_code", ERROR_CODE);
            map.put("error_message", ERROR_MESSAGE);
            map.put("start_time", START_TIME);
            map.put("end_time", END_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FieldsEnum(String value) {
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
        public static FieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FieldsEnum(value));
        }

        public static FieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FieldsEnum) {
                return this.value.equals(((FieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldsEnum> fields = null;

    public ShowJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * job_id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobsRequest withFields(List<FieldsEnum> fields) {
        this.fields = fields;
        return this;
    }

    public ShowJobsRequest addFieldsItem(FieldsEnum fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowJobsRequest withFields(Consumer<List<FieldsEnum>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 只显示指定的字段
     * @return fields
     */
    public List<FieldsEnum> getFields() {
        return fields;
    }

    public void setFields(List<FieldsEnum> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobsRequest that = (ShowJobsRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
