package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class RunCheckTaskJobsRequest {

    /** 图像内容审核任务处理状态如下： - created 已创建 - running 正在处理 - finish 已完成 - failed 处理失败 */
    public static final class StatusEnum {

        /** Enum CREATED for value: "created" */
        public static final StatusEnum CREATED = new StatusEnum("created");

        /** Enum RUNNING for value: "running" */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /** Enum FINISH for value: "finish" */
        public static final StatusEnum FINISH = new StatusEnum("finish");

        /** Enum FAILED for value: "failed" */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("created", CREATED);
            map.put("running", RUNNING);
            map.put("finish", FINISH);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public RunCheckTaskJobsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 图像内容审核任务处理状态如下： - created 已创建 - running 正在处理 - finish 已完成 - failed 处理失败
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RunCheckTaskJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量， 默认为0。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public RunCheckTaskJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 指定每一页返回的最大条目数，默认为符合查询条件的总任务数量。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCheckTaskJobsRequest runCheckTaskJobsRequest = (RunCheckTaskJobsRequest) o;
        return Objects.equals(this.status, runCheckTaskJobsRequest.status)
            && Objects.equals(this.offset, runCheckTaskJobsRequest.offset)
            && Objects.equals(this.limit, runCheckTaskJobsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckTaskJobsRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
