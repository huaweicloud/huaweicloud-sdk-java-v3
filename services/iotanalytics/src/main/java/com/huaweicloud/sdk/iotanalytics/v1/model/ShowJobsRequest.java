package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ShowJobsRequest {

    /**
     * 接收数据类型，支持两种接收数据类型：“管道数据”、“资产数据”。管道数据：“实时分析”使用来自“数据管道”的数据进行分析，并可将数据输出到其他云服务。资产数据：“实时分析”使用来自“资产模型”的数据进行分析，并将分析后的结果返回给“资产模型”，丰富资产模型。
     */
    public static final class JobInputTypeEnum {

        /**
         * Enum ASSET_DATA for value: "ASSET_DATA"
         */
        public static final JobInputTypeEnum ASSET_DATA = new JobInputTypeEnum("ASSET_DATA");

        /**
         * Enum OLD_DATA for value: "OLD_DATA"
         */
        public static final JobInputTypeEnum OLD_DATA = new JobInputTypeEnum("OLD_DATA");

        private static final Map<String, JobInputTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobInputTypeEnum> createStaticFields() {
            Map<String, JobInputTypeEnum> map = new HashMap<>();
            map.put("ASSET_DATA", ASSET_DATA);
            map.put("OLD_DATA", OLD_DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobInputTypeEnum(String value) {
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
        public static JobInputTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobInputTypeEnum(value));
        }

        public static JobInputTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobInputTypeEnum) {
                return this.value.equals(((JobInputTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_input_type")

    private JobInputTypeEnum jobInputType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private Boolean syncStatus;

    public ShowJobsRequest withJobInputType(JobInputTypeEnum jobInputType) {
        this.jobInputType = jobInputType;
        return this;
    }

    /**
     * 接收数据类型，支持两种接收数据类型：“管道数据”、“资产数据”。管道数据：“实时分析”使用来自“数据管道”的数据进行分析，并可将数据输出到其他云服务。资产数据：“实时分析”使用来自“资产模型”的数据进行分析，并将分析后的结果返回给“资产模型”，丰富资产模型。
     * @return jobInputType
     */
    public JobInputTypeEnum getJobInputType() {
        return jobInputType;
    }

    public void setJobInputType(JobInputTypeEnum jobInputType) {
        this.jobInputType = jobInputType;
    }

    public ShowJobsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ShowJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowJobsRequest withSyncStatus(Boolean syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 立即同步作业状态，默认是false
     * @return syncStatus
     */
    public Boolean getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Boolean syncStatus) {
        this.syncStatus = syncStatus;
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
        return Objects.equals(this.jobInputType, that.jobInputType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.syncStatus, that.syncStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobInputType, offset, limit, syncStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobsRequest {\n");
        sb.append("    jobInputType: ").append(toIndentedString(jobInputType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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
