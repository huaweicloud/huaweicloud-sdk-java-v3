package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowScanJobResultsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /** 资产类型 */
    public static final class TypeEnum {

        /** Enum DATABASE for value: "DATABASE" */
        public static final TypeEnum DATABASE = new TypeEnum("DATABASE");

        /** Enum OBS for value: "OBS" */
        public static final TypeEnum OBS = new TypeEnum("OBS");

        /** Enum BIGDATA for value: "BIGDATA" */
        public static final TypeEnum BIGDATA = new TypeEnum("BIGDATA");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DATABASE", DATABASE);
            map.put("OBS", OBS);
            map.put("BIGDATA", BIGDATA);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowScanJobResultsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowScanJobResultsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 页码
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ShowScanJobResultsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 分页大小
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowScanJobResultsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 资产类型
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowScanJobResultsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 预留，待启用
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowScanJobResultsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 预留，待启用
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScanJobResultsRequest showScanJobResultsRequest = (ShowScanJobResultsRequest) o;
        return Objects.equals(this.jobId, showScanJobResultsRequest.jobId)
            && Objects.equals(this.page, showScanJobResultsRequest.page)
            && Objects.equals(this.limit, showScanJobResultsRequest.limit)
            && Objects.equals(this.type, showScanJobResultsRequest.type)
            && Objects.equals(this.startTime, showScanJobResultsRequest.startTime)
            && Objects.equals(this.endTime, showScanJobResultsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, page, limit, type, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScanJobResultsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
