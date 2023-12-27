package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * 依赖作业列表
 */
public class DependJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<String> jobs = null;

    /**
     * 依赖周期： - SAME_PERIOD：依赖被依赖作业的同周期任务的执行结果。 - PRE_PERIOD：依赖被依赖作业的前一周期任务的执行结果。
     */
    public static final class DependPeriodEnum {

        /**
         * Enum SAME_PERIOD for value: "SAME_PERIOD"
         */
        public static final DependPeriodEnum SAME_PERIOD = new DependPeriodEnum("SAME_PERIOD");

        /**
         * Enum PRE_PERIOD for value: "PRE_PERIOD"
         */
        public static final DependPeriodEnum PRE_PERIOD = new DependPeriodEnum("PRE_PERIOD");

        private static final Map<String, DependPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DependPeriodEnum> createStaticFields() {
            Map<String, DependPeriodEnum> map = new HashMap<>();
            map.put("SAME_PERIOD", SAME_PERIOD);
            map.put("PRE_PERIOD", PRE_PERIOD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DependPeriodEnum(String value) {
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
        public static DependPeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DependPeriodEnum(value));
        }

        public static DependPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DependPeriodEnum) {
                return this.value.equals(((DependPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_period")

    private DependPeriodEnum dependPeriod;

    /**
     * 依赖作业任务执行失败处理策略: - FAIL：停止作业，设置作业为失败状态。 - IGNORE：继续执行作业。 - SUSPEND： 挂起作业。
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
    @JsonProperty(value = "depend_fail_policy")

    private DependFailPolicyEnum dependFailPolicy;

    public DependJob withJobs(List<String> jobs) {
        this.jobs = jobs;
        return this;
    }

    public DependJob addJobsItem(String jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public DependJob withJobs(Consumer<List<String>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 依赖的作业名称列表，必须依赖已存在的作业。
     * @return jobs
     */
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public DependJob withDependPeriod(DependPeriodEnum dependPeriod) {
        this.dependPeriod = dependPeriod;
        return this;
    }

    /**
     * 依赖周期： - SAME_PERIOD：依赖被依赖作业的同周期任务的执行结果。 - PRE_PERIOD：依赖被依赖作业的前一周期任务的执行结果。
     * @return dependPeriod
     */
    public DependPeriodEnum getDependPeriod() {
        return dependPeriod;
    }

    public void setDependPeriod(DependPeriodEnum dependPeriod) {
        this.dependPeriod = dependPeriod;
    }

    public DependJob withDependFailPolicy(DependFailPolicyEnum dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
        return this;
    }

    /**
     * 依赖作业任务执行失败处理策略: - FAIL：停止作业，设置作业为失败状态。 - IGNORE：继续执行作业。 - SUSPEND： 挂起作业。
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
