package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 流水线资源信息
 */
public class PipelineBasic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * 流水线最后一次运行状态,success:成功,failed:失败,running:运行中
     */
    public static final class LastRunningStatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final LastRunningStatusEnum SUCCESS = new LastRunningStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final LastRunningStatusEnum FAILED = new LastRunningStatusEnum("failed");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final LastRunningStatusEnum RUNNING = new LastRunningStatusEnum("running");

        private static final Map<String, LastRunningStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LastRunningStatusEnum> createStaticFields() {
            Map<String, LastRunningStatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("running", RUNNING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LastRunningStatusEnum(String value) {
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
        public static LastRunningStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LastRunningStatusEnum(value));
        }

        public static LastRunningStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LastRunningStatusEnum) {
                return this.value.equals(((LastRunningStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_running_status")

    private LastRunningStatusEnum lastRunningStatus;

    public PipelineBasic withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * DevStar系统生成的流水线UUID
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public PipelineBasic withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CloudPipeline系统对应流水线ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PipelineBasic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流水线名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineBasic withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 流水线地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PipelineBasic withLastRunningStatus(LastRunningStatusEnum lastRunningStatus) {
        this.lastRunningStatus = lastRunningStatus;
        return this;
    }

    /**
     * 流水线最后一次运行状态,success:成功,failed:失败,running:运行中
     * @return lastRunningStatus
     */
    public LastRunningStatusEnum getLastRunningStatus() {
        return lastRunningStatus;
    }

    public void setLastRunningStatus(LastRunningStatusEnum lastRunningStatus) {
        this.lastRunningStatus = lastRunningStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineBasic that = (PipelineBasic) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.url, that.url)
            && Objects.equals(this.lastRunningStatus, that.lastRunningStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, id, name, url, lastRunningStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBasic {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    lastRunningStatus: ").append(toIndentedString(lastRunningStatus)).append("\n");
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
