package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ResourceInfo
 */
public class ResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    /**
     * 历史开启备份状态，通过筛选可用服务器的error_message或者status判断，如果error_message为空，则没有开启备份，该字段为closed；若不为空，则为opened
     */
    public static final class HistoryBackupStatusEnum {

        /**
         * Enum OPENED for value: "opened"
         */
        public static final HistoryBackupStatusEnum OPENED = new HistoryBackupStatusEnum("opened");

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final HistoryBackupStatusEnum CLOSED = new HistoryBackupStatusEnum("closed");

        private static final Map<String, HistoryBackupStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HistoryBackupStatusEnum> createStaticFields() {
            Map<String, HistoryBackupStatusEnum> map = new HashMap<>();
            map.put("opened", OPENED);
            map.put("closed", CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HistoryBackupStatusEnum(String value) {
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
        public static HistoryBackupStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HistoryBackupStatusEnum(value));
        }

        public static HistoryBackupStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HistoryBackupStatusEnum) {
                return this.value.equals(((HistoryBackupStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_backup_status")

    private HistoryBackupStatusEnum historyBackupStatus;

    public ResourceInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ResourceInfo withHistoryBackupStatus(HistoryBackupStatusEnum historyBackupStatus) {
        this.historyBackupStatus = historyBackupStatus;
        return this;
    }

    /**
     * 历史开启备份状态，通过筛选可用服务器的error_message或者status判断，如果error_message为空，则没有开启备份，该字段为closed；若不为空，则为opened
     * @return historyBackupStatus
     */
    public HistoryBackupStatusEnum getHistoryBackupStatus() {
        return historyBackupStatus;
    }

    public void setHistoryBackupStatus(HistoryBackupStatusEnum historyBackupStatus) {
        this.historyBackupStatus = historyBackupStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInfo that = (ResourceInfo) obj;
        return Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.historyBackupStatus, that.historyBackupStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, historyBackupStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    historyBackupStatus: ").append(toIndentedString(historyBackupStatus)).append("\n");
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
