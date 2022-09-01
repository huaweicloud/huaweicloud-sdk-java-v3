package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunQueryAudioModerationJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    /**
     * 作业状态，可取值有： running: 正在运行 succeeded: 运行成功 failed: 运行失败
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SUCCEEDED for value: "succeeded"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("succeeded");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("succeeded", SUCCEEDED);
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private AudioModerationResultResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_params")

    @JacksonXmlProperty(localName = "request_params")

    private AudioModerationResultRequestParams requestParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    public RunQueryAudioModerationJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RunQueryAudioModerationJobResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态，可取值有： running: 正在运行 succeeded: 运行成功 failed: 运行失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RunQueryAudioModerationJobResponse withResult(AudioModerationResultResult result) {
        this.result = result;
        return this;
    }

    public RunQueryAudioModerationJobResponse withResult(Consumer<AudioModerationResultResult> resultSetter) {
        if (this.result == null) {
            this.result = new AudioModerationResultResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public AudioModerationResultResult getResult() {
        return result;
    }

    public void setResult(AudioModerationResultResult result) {
        this.result = result;
    }

    public RunQueryAudioModerationJobResponse withRequestParams(AudioModerationResultRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    public RunQueryAudioModerationJobResponse withRequestParams(
        Consumer<AudioModerationResultRequestParams> requestParamsSetter) {
        if (this.requestParams == null) {
            this.requestParams = new AudioModerationResultRequestParams();
            requestParamsSetter.accept(this.requestParams);
        }

        return this;
    }

    /**
     * Get requestParams
     * @return requestParams
     */
    public AudioModerationResultRequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(AudioModerationResultRequestParams requestParams) {
        this.requestParams = requestParams;
    }

    public RunQueryAudioModerationJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RunQueryAudioModerationJobResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 作业更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public RunQueryAudioModerationJobResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的唯⼀标识，⽤于问题排查，建议保存。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunQueryAudioModerationJobResponse runQueryAudioModerationJobResponse = (RunQueryAudioModerationJobResponse) o;
        return Objects.equals(this.jobId, runQueryAudioModerationJobResponse.jobId)
            && Objects.equals(this.status, runQueryAudioModerationJobResponse.status)
            && Objects.equals(this.result, runQueryAudioModerationJobResponse.result)
            && Objects.equals(this.requestParams, runQueryAudioModerationJobResponse.requestParams)
            && Objects.equals(this.createTime, runQueryAudioModerationJobResponse.createTime)
            && Objects.equals(this.updateTime, runQueryAudioModerationJobResponse.updateTime)
            && Objects.equals(this.requestId, runQueryAudioModerationJobResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, result, requestParams, createTime, updateTime, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunQueryAudioModerationJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
