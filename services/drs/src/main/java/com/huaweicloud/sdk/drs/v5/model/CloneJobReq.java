package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 克隆任务请求体。
 */
public class CloneJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务版本号，新UX任务为2.0。默认为空，即克隆老任务。
     */
    public static final class TaskVersionEnum {

        /**
         * Enum _2_0 for value: "2.0"
         */
        public static final TaskVersionEnum _2_0 = new TaskVersionEnum("2.0");

        private static final Map<String, TaskVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskVersionEnum> createStaticFields() {
            Map<String, TaskVersionEnum> map = new HashMap<>();
            map.put("2.0", _2_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskVersionEnum(String value) {
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
        public static TaskVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskVersionEnum(value));
        }

        public static TaskVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskVersionEnum) {
                return this.value.equals(((TaskVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_version")

    private TaskVersionEnum taskVersion;

    public CloneJobReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 被克隆任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CloneJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 克隆任务名称。名称在4位到50位之间，必须以字母开头，可以包含字母、数字、中划线或下划线，不能包含其他特殊字符，任务名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloneJobReq withTaskVersion(TaskVersionEnum taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }

    /**
     * 任务版本号，新UX任务为2.0。默认为空，即克隆老任务。
     * @return taskVersion
     */
    public TaskVersionEnum getTaskVersion() {
        return taskVersion;
    }

    public void setTaskVersion(TaskVersionEnum taskVersion) {
        this.taskVersion = taskVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneJobReq that = (CloneJobReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.taskVersion, that.taskVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, name, taskVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneJobReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskVersion: ").append(toIndentedString(taskVersion)).append("\n");
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
