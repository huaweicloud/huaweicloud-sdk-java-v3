package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowInspectionStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     */
    public static final class InspectionTypeEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final InspectionTypeEnum STANDARD = new InspectionTypeEnum("STANDARD");

        /**
         * Enum DEEP for value: "DEEP"
         */
        public static final InspectionTypeEnum DEEP = new InspectionTypeEnum("DEEP");

        private static final Map<String, InspectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InspectionTypeEnum> createStaticFields() {
            Map<String, InspectionTypeEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("DEEP", DEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InspectionTypeEnum(String value) {
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
        public static InspectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionTypeEnum(value));
        }

        public static InspectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InspectionTypeEnum) {
                return this.value.equals(((InspectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_type")

    private InspectionTypeEnum inspectionType;

    public ShowInspectionStatisticsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：作业ID。 **约束限制**：不涉及。 **取值范围**：长度为32的英文字符、数字的组合。 **默认取值**：不涉及。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowInspectionStatisticsRequest withInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    /**
     * **参数解释**：巡检类型。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 **默认取值**：不涉及。 
     * @return inspectionType
     */
    public InspectionTypeEnum getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionTypeEnum inspectionType) {
        this.inspectionType = inspectionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInspectionStatisticsRequest that = (ShowInspectionStatisticsRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.inspectionType, that.inspectionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, inspectionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInspectionStatisticsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    inspectionType: ").append(toIndentedString(inspectionType)).append("\n");
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
