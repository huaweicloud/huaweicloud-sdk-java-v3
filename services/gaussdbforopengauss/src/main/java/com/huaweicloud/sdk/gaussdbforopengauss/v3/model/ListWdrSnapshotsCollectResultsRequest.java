package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListWdrSnapshotsCollectResultsRequest {

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_end_time")

    private String jobEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_start_time")

    private String jobStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wdr_type")

    private String wdrType;

    public ListWdrSnapshotsCollectResultsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListWdrSnapshotsCollectResultsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID，此参数是用户创建实例的唯一标识。 **约束限制**: 不涉及。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListWdrSnapshotsCollectResultsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 索引位置，偏移量。 **约束限制**:   不涉及。 **取值范围**:   必须为数字，不能为负数。 **默认取值**:   默认为0。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWdrSnapshotsCollectResultsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**:   查询记录数。， **约束限制**:   不涉及。 **取值范围**:   不能为负数，最小值为1，最大值为100。 **默认取值**:   默认为10。
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

    public ListWdrSnapshotsCollectResultsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**:   查询开始时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始，Z指时区偏移量，时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。   例如北京时间偏移显示为+0800，start_time=2024-03-15T17:20:33+0800传参时编码为start_time=2024-03-15T17:20:33%2B0800。 **约束限制**:   不涉及。 **取值范围**:   不涉及。 **默认取值**:   不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListWdrSnapshotsCollectResultsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**:   查询结束时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始，Z指时区偏移量，时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。   例如北京时间偏移显示为+0800，end_time=2024-03-16T17:20:33+0800传参时编码为end_time=2024-03-16T17:20:33%2B0800。 **约束限制**:   不涉及。 **取值范围**:   不涉及。 **默认取值**:   不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListWdrSnapshotsCollectResultsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**:   任务ID。正确填写后，可查询指定任务对应的快照报告采集结果。不支持模糊匹配，需填写完整的任务ID。 **约束限制**:   不涉及。 **取值范围**:   不涉及。 **默认取值**:   不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListWdrSnapshotsCollectResultsRequest withJobEndTime(String jobEndTime) {
        this.jobEndTime = jobEndTime;
        return this;
    }

    /**
     * **参数解释**:   采集任务创建时间终点。可查询任务创建时间小于等于该时间终点的任务结果。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。例如，北京时间偏移显示为+0800，job_end_time=2024-03-16T17:20:33+0800，传参时编码为job_end_time=2024-03-16T17:20:33%2B0800。 **约束限制**:   不涉及。 **取值范围**:   不涉及。 **默认取值**:   不涉及。
     * @return jobEndTime
     */
    public String getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(String jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    public ListWdrSnapshotsCollectResultsRequest withJobStartTime(String jobStartTime) {
        this.jobStartTime = jobStartTime;
        return this;
    }

    /**
     * **参数解释**:   采集任务创建时间起点。可查询任务创建时间大于等于该时间起点的任务结果。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。例如，北京时间偏移显示为+0800，job_start_time=2024-03-15T17:20:33+0800传参时编码为job_start_time=2024-03-15T17:20:33%2B0800。 **约束限制**:   不涉及。 **取值范围**:   不涉及。 **默认取值**:   不涉及。
     * @return jobStartTime
     */
    public String getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(String jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    public ListWdrSnapshotsCollectResultsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 任务采集状态。填写后，可查询对应采集状态的任务结果。 **约束限制**: 不支持模糊匹配，区分大小写，请填写完整的合法状态值。 **取值范围**: - EXPORTING：采集中。 - SUCCESS：采集成功。 - FAILED：采集失败。  **默认取值**:   不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListWdrSnapshotsCollectResultsRequest withWdrType(String wdrType) {
        this.wdrType = wdrType;
        return this;
    }

    /**
     * **参数解释**: 填写后，可查询对应采集类型的任务结果。 **约束限制**: 不支持模糊匹配，区分大小写，请填写完整的合法枚举值。 **取值范围**: - cluster：实例级。 - component：组件级。 - pdb：租户级。  **默认取值**:   不涉及。
     * @return wdrType
     */
    public String getWdrType() {
        return wdrType;
    }

    public void setWdrType(String wdrType) {
        this.wdrType = wdrType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWdrSnapshotsCollectResultsRequest that = (ListWdrSnapshotsCollectResultsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobEndTime, that.jobEndTime)
            && Objects.equals(this.jobStartTime, that.jobStartTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.wdrType, that.wdrType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage,
            instanceId,
            offset,
            limit,
            startTime,
            endTime,
            jobId,
            jobEndTime,
            jobStartTime,
            status,
            wdrType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWdrSnapshotsCollectResultsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobEndTime: ").append(toIndentedString(jobEndTime)).append("\n");
        sb.append("    jobStartTime: ").append(toIndentedString(jobStartTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    wdrType: ").append(toIndentedString(wdrType)).append("\n");
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
