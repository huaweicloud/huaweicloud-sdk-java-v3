package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowDiagnosisNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 诊断步骤编码
     */
    public static final class CodeEnum {

        /**
         * Enum HOLMESINSTALL for value: "holmesInstall"
         */
        public static final CodeEnum HOLMESINSTALL = new CodeEnum("holmesInstall");

        /**
         * Enum DATACOLLECTION for value: "dataCollection"
         */
        public static final CodeEnum DATACOLLECTION = new CodeEnum("dataCollection");

        /**
         * Enum DIAGNOSISFAULT for value: "diagnosisFault"
         */
        public static final CodeEnum DIAGNOSISFAULT = new CodeEnum("diagnosisFault");

        /**
         * Enum HOLMESUNINSTALL for value: "holmesUnInstall"
         */
        public static final CodeEnum HOLMESUNINSTALL = new CodeEnum("holmesUnInstall");

        /**
         * Enum RDSDIAGNOSIS for value: "rdsDiagnosis"
         */
        public static final CodeEnum RDSDIAGNOSIS = new CodeEnum("rdsDiagnosis");

        /**
         * Enum DCSDIAGNOSIS for value: "dcsDiagnosis"
         */
        public static final CodeEnum DCSDIAGNOSIS = new CodeEnum("dcsDiagnosis");

        /**
         * Enum DMSDIAGNOSIS for value: "dmsDiagnosis"
         */
        public static final CodeEnum DMSDIAGNOSIS = new CodeEnum("dmsDiagnosis");

        /**
         * Enum ELBDIAGNOSIS for value: "elbDiagnosis"
         */
        public static final CodeEnum ELBDIAGNOSIS = new CodeEnum("elbDiagnosis");

        private static final Map<String, CodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeEnum> createStaticFields() {
            Map<String, CodeEnum> map = new HashMap<>();
            map.put("holmesInstall", HOLMESINSTALL);
            map.put("dataCollection", DATACOLLECTION);
            map.put("diagnosisFault", DIAGNOSISFAULT);
            map.put("holmesUnInstall", HOLMESUNINSTALL);
            map.put("rdsDiagnosis", RDSDIAGNOSIS);
            map.put("dcsDiagnosis", DCSDIAGNOSIS);
            map.put("dmsDiagnosis", DMSDIAGNOSIS);
            map.put("elbDiagnosis", ELBDIAGNOSIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodeEnum(String value) {
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
        public static CodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodeEnum(value));
        }

        public static CodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodeEnum) {
                return this.value.equals(((CodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private CodeEnum code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public ShowDiagnosisNodeRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 诊断工单ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowDiagnosisNodeRequest withCode(CodeEnum code) {
        this.code = code;
        return this;
    }

    /**
     * 诊断步骤编码
     * @return code
     */
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public ShowDiagnosisNodeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 被诊断实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDiagnosisNodeRequest that = (ShowDiagnosisNodeRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.code, that.code)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, code, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiagnosisNodeRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
