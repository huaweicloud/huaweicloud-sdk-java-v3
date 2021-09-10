package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    /** 作业类型: - jobType=NORMAL_JOB：表示查询表/文件迁移的作业。 - jobType=BATCH_JOB：表示查询整库迁移的作业。 - jobType=SCENARIO_JOB：表示查询场景迁移的作业。 -
     * 不指定该参数时，默认只查询表/文件迁移的作业。 */
    public static final class JobTypeEnum {

        /** Enum NORMAL_JOB for value: "NORMAL_JOB" */
        public static final JobTypeEnum NORMAL_JOB = new JobTypeEnum("NORMAL_JOB");

        /** Enum BATCH_JOB for value: "BATCH_JOB" */
        public static final JobTypeEnum BATCH_JOB = new JobTypeEnum("BATCH_JOB");

        /** Enum SCENARIO_JOB for value: "SCENARIO_JOB" */
        public static final JobTypeEnum SCENARIO_JOB = new JobTypeEnum("SCENARIO_JOB");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("NORMAL_JOB", NORMAL_JOB);
            map.put("BATCH_JOB", BATCH_JOB);
            map.put("SCENARIO_JOB", SCENARIO_JOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobTypeEnum(value);
            }
            return result;
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobType")

    private JobTypeEnum jobType;

    public ShowJobsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群ID
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowJobsRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 查询多个作业用all,查询单个作业输入作业名
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowJobsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /** 当“job_name”为“all”时，此参数用于模糊过滤作业
     * 
     * @return filter */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ShowJobsRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /** 指定作业页号 minimum: 1
     * 
     * @return pageNo */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ShowJobsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页作业数，值在10-100之间 minimum: 10 maximum: 100
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowJobsRequest withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型: - jobType=NORMAL_JOB：表示查询表/文件迁移的作业。 - jobType=BATCH_JOB：表示查询整库迁移的作业。 - jobType=SCENARIO_JOB：表示查询场景迁移的作业。 -
     * 不指定该参数时，默认只查询表/文件迁移的作业。
     * 
     * @return jobType */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobsRequest showJobsRequest = (ShowJobsRequest) o;
        return Objects.equals(this.clusterId, showJobsRequest.clusterId)
            && Objects.equals(this.jobName, showJobsRequest.jobName)
            && Objects.equals(this.filter, showJobsRequest.filter)
            && Objects.equals(this.pageNo, showJobsRequest.pageNo)
            && Objects.equals(this.pageSize, showJobsRequest.pageSize)
            && Objects.equals(this.jobType, showJobsRequest.jobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, jobName, filter, pageNo, pageSize, jobType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
