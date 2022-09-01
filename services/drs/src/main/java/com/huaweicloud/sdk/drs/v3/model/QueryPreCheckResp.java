package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取预检查结果返回体
 */
public class QueryPreCheckResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_id")

    @JacksonXmlProperty(localName = "precheck_id")

    private String precheckId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    @JacksonXmlProperty(localName = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_passed_rate")

    @JacksonXmlProperty(localName = "total_passed_rate")

    private String totalPassedRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_id")

    @JacksonXmlProperty(localName = "rds_instance_id")

    private String rdsInstanceId;

    /**
     * 迁移方向
     */
    public static final class JobDirectionEnum {

        /**
         * Enum UP_ for value: "up-入云 灾备场景时对应本云为备"
         */
        public static final JobDirectionEnum UP_ = new JobDirectionEnum("up-入云 灾备场景时对应本云为备");

        /**
         * Enum DOWN_ for value: "down-出云 灾备场景时对应本云为主"
         */
        public static final JobDirectionEnum DOWN_ = new JobDirectionEnum("down-出云 灾备场景时对应本云为主");

        /**
         * Enum NON_DBS_ for value: "non-dbs-自建"
         */
        public static final JobDirectionEnum NON_DBS_ = new JobDirectionEnum("non-dbs-自建");

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up-入云 灾备场景时对应本云为备", UP_);
            map.put("down-出云 灾备场景时对应本云为主", DOWN_);
            map.put("non-dbs-自建", NON_DBS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobDirectionEnum(String value) {
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
        public static JobDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobDirectionEnum(value);
            }
            return result;
        }

        public static JobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobDirectionEnum) {
                return this.value.equals(((JobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    @JacksonXmlProperty(localName = "job_direction")

    private JobDirectionEnum jobDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_result")

    @JacksonXmlProperty(localName = "precheck_result")

    private List<PrecheckResult> precheckResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    public QueryPreCheckResp withPrecheckId(String precheckId) {
        this.precheckId = precheckId;
        return this;
    }

    /**
     * 预检查id。
     * @return precheckId
     */
    public String getPrecheckId() {
        return precheckId;
    }

    public void setPrecheckId(String precheckId) {
        this.precheckId = precheckId;
    }

    public QueryPreCheckResp withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 返回的预检查结果是否通过。true表示预检查通过，通过后才可进行启动任务。
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public QueryPreCheckResp withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * 预检查进度百分比。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public QueryPreCheckResp withTotalPassedRate(String totalPassedRate) {
        this.totalPassedRate = totalPassedRate;
        return this;
    }

    /**
     * 预检查通过百分比。
     * @return totalPassedRate
     */
    public String getTotalPassedRate() {
        return totalPassedRate;
    }

    public void setTotalPassedRate(String totalPassedRate) {
        this.totalPassedRate = totalPassedRate;
    }

    public QueryPreCheckResp withRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }

    /**
     * RDS实例id。
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return rdsInstanceId;
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
    }

    public QueryPreCheckResp withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public QueryPreCheckResp withPrecheckResult(List<PrecheckResult> precheckResult) {
        this.precheckResult = precheckResult;
        return this;
    }

    public QueryPreCheckResp addPrecheckResultItem(PrecheckResult precheckResultItem) {
        if (this.precheckResult == null) {
            this.precheckResult = new ArrayList<>();
        }
        this.precheckResult.add(precheckResultItem);
        return this;
    }

    public QueryPreCheckResp withPrecheckResult(Consumer<List<PrecheckResult>> precheckResultSetter) {
        if (this.precheckResult == null) {
            this.precheckResult = new ArrayList<>();
        }
        precheckResultSetter.accept(this.precheckResult);
        return this;
    }

    /**
     * 预检查各项结果。
     * @return precheckResult
     */
    public List<PrecheckResult> getPrecheckResult() {
        return precheckResult;
    }

    public void setPrecheckResult(List<PrecheckResult> precheckResult) {
        this.precheckResult = precheckResult;
    }

    public QueryPreCheckResp withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public QueryPreCheckResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryPreCheckResp queryPreCheckResp = (QueryPreCheckResp) o;
        return Objects.equals(this.precheckId, queryPreCheckResp.precheckId)
            && Objects.equals(this.result, queryPreCheckResp.result)
            && Objects.equals(this.process, queryPreCheckResp.process)
            && Objects.equals(this.totalPassedRate, queryPreCheckResp.totalPassedRate)
            && Objects.equals(this.rdsInstanceId, queryPreCheckResp.rdsInstanceId)
            && Objects.equals(this.jobDirection, queryPreCheckResp.jobDirection)
            && Objects.equals(this.precheckResult, queryPreCheckResp.precheckResult)
            && Objects.equals(this.errorMsg, queryPreCheckResp.errorMsg)
            && Objects.equals(this.errorCode, queryPreCheckResp.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precheckId,
            result,
            process,
            totalPassedRate,
            rdsInstanceId,
            jobDirection,
            precheckResult,
            errorMsg,
            errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryPreCheckResp {\n");
        sb.append("    precheckId: ").append(toIndentedString(precheckId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    totalPassedRate: ").append(toIndentedString(totalPassedRate)).append("\n");
        sb.append("    rdsInstanceId: ").append(toIndentedString(rdsInstanceId)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    precheckResult: ").append(toIndentedString(precheckResult)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
