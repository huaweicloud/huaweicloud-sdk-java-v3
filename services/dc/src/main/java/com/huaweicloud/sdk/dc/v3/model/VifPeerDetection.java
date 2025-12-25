package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 虚拟接口对等体连通性探测实例
 */
public class VifPeerDetection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer_id")

    private String vifPeerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 探测状态，取值范围： - processing: 探测处理中 - complete: 探测完成 - error: 探测异常退出
     */
    public static final class StatusEnum {

        /**
         * Enum PROCESSING for value: "processing"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("processing");

        /**
         * Enum COMPLETE for value: "complete"
         */
        public static final StatusEnum COMPLETE = new StatusEnum("complete");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("processing", PROCESSING);
            map.put("complete", COMPLETE);
            map.put("error", ERROR);
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
    @JsonProperty(value = "loss_ratio")

    private Integer lossRatio;

    public VifPeerDetection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 虚拟接口对等体连通性探测实例uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VifPeerDetection withVifPeerId(String vifPeerId) {
        this.vifPeerId = vifPeerId;
        return this;
    }

    /**
     * 虚拟接口对等体实例uuid
     * @return vifPeerId
     */
    public String getVifPeerId() {
        return vifPeerId;
    }

    public void setVifPeerId(String vifPeerId) {
        this.vifPeerId = vifPeerId;
    }

    public VifPeerDetection withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public VifPeerDetection withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public VifPeerDetection withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 探测开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public VifPeerDetection withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 探测结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public VifPeerDetection withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 探测状态，取值范围： - processing: 探测处理中 - complete: 探测完成 - error: 探测异常退出
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VifPeerDetection withLossRatio(Integer lossRatio) {
        this.lossRatio = lossRatio;
        return this;
    }

    /**
     * 丢包率
     * minimum: 0
     * maximum: 100
     * @return lossRatio
     */
    public Integer getLossRatio() {
        return lossRatio;
    }

    public void setLossRatio(Integer lossRatio) {
        this.lossRatio = lossRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VifPeerDetection that = (VifPeerDetection) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vifPeerId, that.vifPeerId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.lossRatio, that.lossRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vifPeerId, projectId, domainId, startTime, endTime, status, lossRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VifPeerDetection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vifPeerId: ").append(toIndentedString(vifPeerId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lossRatio: ").append(toIndentedString(lossRatio)).append("\n");
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
