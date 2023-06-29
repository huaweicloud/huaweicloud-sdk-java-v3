package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DependJob
 */
public class DependJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private String jobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPeriod")

    private String dependPeriod;

    /**
     * Gets or Sets dependFailPolicy
     */
    public static final class DependFailPolicyEnum {

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final DependFailPolicyEnum FAIL = new DependFailPolicyEnum("FAIL");

        /**
         * Enum IGNORE for value: "IGNORE"
         */
        public static final DependFailPolicyEnum IGNORE = new DependFailPolicyEnum("IGNORE");

        /**
         * Enum SUSPEND for value: "SUSPEND"
         */
        public static final DependFailPolicyEnum SUSPEND = new DependFailPolicyEnum("SUSPEND");

        private static final Map<String, DependFailPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DependFailPolicyEnum> createStaticFields() {
            Map<String, DependFailPolicyEnum> map = new HashMap<>();
            map.put("FAIL", FAIL);
            map.put("IGNORE", IGNORE);
            map.put("SUSPEND", SUSPEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DependFailPolicyEnum(String value) {
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
        public static DependFailPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DependFailPolicyEnum(value));
        }

        public static DependFailPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DependFailPolicyEnum) {
                return this.value.equals(((DependFailPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependFailPolicy")

    private DependFailPolicyEnum dependFailPolicy;

    public DependJob withJobs(String jobs) {
        this.jobs = jobs;
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public DependJob withDependPeriod(String dependPeriod) {
        this.dependPeriod = dependPeriod;
        return this;
    }

    /**
     * Get dependPeriod
     * @return dependPeriod
     */
    public String getDependPeriod() {
        return dependPeriod;
    }

    public void setDependPeriod(String dependPeriod) {
        this.dependPeriod = dependPeriod;
    }

    public DependJob withDependFailPolicy(DependFailPolicyEnum dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
        return this;
    }

    /**
     * Get dependFailPolicy
     * @return dependFailPolicy
     */
    public DependFailPolicyEnum getDependFailPolicy() {
        return dependFailPolicy;
    }

    public void setDependFailPolicy(DependFailPolicyEnum dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DependJob that = (DependJob) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.dependPeriod, that.dependPeriod)
            && Objects.equals(this.dependFailPolicy, that.dependFailPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, dependPeriod, dependFailPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependJob {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    dependPeriod: ").append(toIndentedString(dependPeriod)).append("\n");
        sb.append("    dependFailPolicy: ").append(toIndentedString(dependFailPolicy)).append("\n");
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
