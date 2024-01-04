package com.huaweicloud.sdk.dgc.v1.model;

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
 * DependJob
 */
public class DependJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<String> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPeriod")

    private String dependPeriod;

    /**
     * 依赖作业任务执行失败处理策略
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameWorkSpaceJobs")

    private List<DependWorkSpaceJob> sameWorkSpaceJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otherWorkSpaceJobs")

    private List<DependWorkSpaceJob> otherWorkSpaceJobs = null;

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
     * 依赖的作业名称列表，必须依赖已存在的作业.
     * @return jobs
     */
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public DependJob withDependPeriod(String dependPeriod) {
        this.dependPeriod = dependPeriod;
        return this;
    }

    /**
     * 依赖周期
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
     * 依赖作业任务执行失败处理策略
     * @return dependFailPolicy
     */
    public DependFailPolicyEnum getDependFailPolicy() {
        return dependFailPolicy;
    }

    public void setDependFailPolicy(DependFailPolicyEnum dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
    }

    public DependJob withSameWorkSpaceJobs(List<DependWorkSpaceJob> sameWorkSpaceJobs) {
        this.sameWorkSpaceJobs = sameWorkSpaceJobs;
        return this;
    }

    public DependJob addSameWorkSpaceJobsItem(DependWorkSpaceJob sameWorkSpaceJobsItem) {
        if (this.sameWorkSpaceJobs == null) {
            this.sameWorkSpaceJobs = new ArrayList<>();
        }
        this.sameWorkSpaceJobs.add(sameWorkSpaceJobsItem);
        return this;
    }

    public DependJob withSameWorkSpaceJobs(Consumer<List<DependWorkSpaceJob>> sameWorkSpaceJobsSetter) {
        if (this.sameWorkSpaceJobs == null) {
            this.sameWorkSpaceJobs = new ArrayList<>();
        }
        sameWorkSpaceJobsSetter.accept(this.sameWorkSpaceJobs);
        return this;
    }

    /**
     * 依赖本工作空间的作业名称列表
     * @return sameWorkSpaceJobs
     */
    public List<DependWorkSpaceJob> getSameWorkSpaceJobs() {
        return sameWorkSpaceJobs;
    }

    public void setSameWorkSpaceJobs(List<DependWorkSpaceJob> sameWorkSpaceJobs) {
        this.sameWorkSpaceJobs = sameWorkSpaceJobs;
    }

    public DependJob withOtherWorkSpaceJobs(List<DependWorkSpaceJob> otherWorkSpaceJobs) {
        this.otherWorkSpaceJobs = otherWorkSpaceJobs;
        return this;
    }

    public DependJob addOtherWorkSpaceJobsItem(DependWorkSpaceJob otherWorkSpaceJobsItem) {
        if (this.otherWorkSpaceJobs == null) {
            this.otherWorkSpaceJobs = new ArrayList<>();
        }
        this.otherWorkSpaceJobs.add(otherWorkSpaceJobsItem);
        return this;
    }

    public DependJob withOtherWorkSpaceJobs(Consumer<List<DependWorkSpaceJob>> otherWorkSpaceJobsSetter) {
        if (this.otherWorkSpaceJobs == null) {
            this.otherWorkSpaceJobs = new ArrayList<>();
        }
        otherWorkSpaceJobsSetter.accept(this.otherWorkSpaceJobs);
        return this;
    }

    /**
     * 依赖其他工作空间的作业名称列表
     * @return otherWorkSpaceJobs
     */
    public List<DependWorkSpaceJob> getOtherWorkSpaceJobs() {
        return otherWorkSpaceJobs;
    }

    public void setOtherWorkSpaceJobs(List<DependWorkSpaceJob> otherWorkSpaceJobs) {
        this.otherWorkSpaceJobs = otherWorkSpaceJobs;
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
            && Objects.equals(this.dependFailPolicy, that.dependFailPolicy)
            && Objects.equals(this.sameWorkSpaceJobs, that.sameWorkSpaceJobs)
            && Objects.equals(this.otherWorkSpaceJobs, that.otherWorkSpaceJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, dependPeriod, dependFailPolicy, sameWorkSpaceJobs, otherWorkSpaceJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependJob {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    dependPeriod: ").append(toIndentedString(dependPeriod)).append("\n");
        sb.append("    dependFailPolicy: ").append(toIndentedString(dependFailPolicy)).append("\n");
        sb.append("    sameWorkSpaceJobs: ").append(toIndentedString(sameWorkSpaceJobs)).append("\n");
        sb.append("    otherWorkSpaceJobs: ").append(toIndentedString(otherWorkSpaceJobs)).append("\n");
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
