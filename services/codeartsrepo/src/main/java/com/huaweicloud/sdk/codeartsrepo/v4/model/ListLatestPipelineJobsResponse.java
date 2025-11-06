package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLatestPipelineJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    /**
     * 流水线状态，pending为排队，running为运行中，success为成功，failed为失败，canceled为取消，skipped为跳过，timedout为超时
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StatusEnum PENDING = new StatusEnum("pending");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum CANCELED for value: "canceled"
         */
        public static final StatusEnum CANCELED = new StatusEnum("canceled");

        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final StatusEnum SKIPPED = new StatusEnum("skipped");

        /**
         * Enum TIMEDOUT for value: "timedout"
         */
        public static final StatusEnum TIMEDOUT = new StatusEnum("timedout");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("canceled", CANCELED);
            map.put("skipped", SKIPPED);
            map.put("timedout", TIMEDOUT);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "stages")

    private List<PipelineStageJobDto> stages = null;

    public ListLatestPipelineJobsResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 流水线ID
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListLatestPipelineJobsResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 流水线状态，pending为排队，running为运行中，success为成功，failed为失败，canceled为取消，skipped为跳过，timedout为超时
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListLatestPipelineJobsResponse withStages(List<PipelineStageJobDto> stages) {
        this.stages = stages;
        return this;
    }

    public ListLatestPipelineJobsResponse addStagesItem(PipelineStageJobDto stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public ListLatestPipelineJobsResponse withStages(Consumer<List<PipelineStageJobDto>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * Get stages
     * @return stages
     */
    public List<PipelineStageJobDto> getStages() {
        return stages;
    }

    public void setStages(List<PipelineStageJobDto> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLatestPipelineJobsResponse that = (ListLatestPipelineJobsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.stages, that.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, stages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLatestPipelineJobsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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
