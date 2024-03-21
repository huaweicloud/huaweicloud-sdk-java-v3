package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ShowPlaybookMonitorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 统计剧本版本类型（ALL:全部，VALID:有效的，DELETED:已删除）
     */
    public static final class VersionQueryTypeEnum {

        /**
         * Enum ALL_VALID_DELETED_ for value: "ALL:全部，VALID:有效的，DELETED:已删除"
         */
        public static final VersionQueryTypeEnum ALL_VALID_DELETED_ =
            new VersionQueryTypeEnum("ALL:全部，VALID:有效的，DELETED:已删除");

        private static final Map<String, VersionQueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionQueryTypeEnum> createStaticFields() {
            Map<String, VersionQueryTypeEnum> map = new HashMap<>();
            map.put("ALL:全部，VALID:有效的，DELETED:已删除", ALL_VALID_DELETED_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionQueryTypeEnum(String value) {
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
        public static VersionQueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionQueryTypeEnum(value));
        }

        public static VersionQueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionQueryTypeEnum) {
                return this.value.equals(((VersionQueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_query_type")

    private VersionQueryTypeEnum versionQueryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowPlaybookMonitorsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowPlaybookMonitorsRequest withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * 剧本ID
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public ShowPlaybookMonitorsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。例如：2021-01-30T23:00:00Z+0800。时区信息为剧本实例产生的时区，无法解析时区的时间，默认时区填东八区。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowPlaybookMonitorsRequest withVersionQueryType(VersionQueryTypeEnum versionQueryType) {
        this.versionQueryType = versionQueryType;
        return this;
    }

    /**
     * 统计剧本版本类型（ALL:全部，VALID:有效的，DELETED:已删除）
     * @return versionQueryType
     */
    public VersionQueryTypeEnum getVersionQueryType() {
        return versionQueryType;
    }

    public void setVersionQueryType(VersionQueryTypeEnum versionQueryType) {
        this.versionQueryType = versionQueryType;
    }

    public ShowPlaybookMonitorsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。例如：2021-01-30T23:00:00Z+0800。时区信息为剧本实例产生的时区，无法解析时区的时间，默认时区填东八区。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPlaybookMonitorsRequest that = (ShowPlaybookMonitorsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.playbookId, that.playbookId)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.versionQueryType, that.versionQueryType)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, playbookId, startTime, versionQueryType, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlaybookMonitorsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    versionQueryType: ").append(toIndentedString(versionQueryType)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
