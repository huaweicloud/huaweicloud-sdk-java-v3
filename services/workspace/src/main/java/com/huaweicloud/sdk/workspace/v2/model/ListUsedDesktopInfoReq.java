package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询使用桌面时长请求。
 */
public class ListUsedDesktopInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 统计方式，不传则默认按天。可选值为： - DAY: 按天。 - HOUR: 按小时。
     */
    public static final class GroupByTypeEnum {

        /**
         * Enum DAY for value: "DAY"
         */
        public static final GroupByTypeEnum DAY = new GroupByTypeEnum("DAY");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final GroupByTypeEnum HOUR = new GroupByTypeEnum("HOUR");

        private static final Map<String, GroupByTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupByTypeEnum> createStaticFields() {
            Map<String, GroupByTypeEnum> map = new HashMap<>();
            map.put("DAY", DAY);
            map.put("HOUR", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupByTypeEnum(String value) {
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
        public static GroupByTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupByTypeEnum(value));
        }

        public static GroupByTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupByTypeEnum) {
                return this.value.equals(((GroupByTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_type")

    private GroupByTypeEnum groupByType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_username")

    private String desktopUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListUsedDesktopInfoReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public ListUsedDesktopInfoReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public ListUsedDesktopInfoReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 桌面id集合。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public ListUsedDesktopInfoReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式：yyyy-MM-dd（UTC时间，不传查默认最近15天）最多查31天数据。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListUsedDesktopInfoReq withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式：yyyy-MM-dd（UTC时间，不传查默认最近15天）最多查31天数据。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListUsedDesktopInfoReq withGroupByType(GroupByTypeEnum groupByType) {
        this.groupByType = groupByType;
        return this;
    }

    /**
     * 统计方式，不传则默认按天。可选值为： - DAY: 按天。 - HOUR: 按小时。
     * @return groupByType
     */
    public GroupByTypeEnum getGroupByType() {
        return groupByType;
    }

    public void setGroupByType(GroupByTypeEnum groupByType) {
        this.groupByType = groupByType;
    }

    public ListUsedDesktopInfoReq withDesktopUsername(String desktopUsername) {
        this.desktopUsername = desktopUsername;
        return this;
    }

    /**
     * 若传桌面的用户名，则查询使用时间只有该用户的使用时间。
     * @return desktopUsername
     */
    public String getDesktopUsername() {
        return desktopUsername;
    }

    public void setDesktopUsername(String desktopUsername) {
        this.desktopUsername = desktopUsername;
    }

    public ListUsedDesktopInfoReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 从查询结果中的第几条数据开始返回,用于分页查询，取值范围0-2147483647，默认从0开始。
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

    public ListUsedDesktopInfoReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询结果中想要返回的信息条目数量,用于分页查询，取值范围0-100，默认值100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsedDesktopInfoReq that = (ListUsedDesktopInfoReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.groupByType, that.groupByType)
            && Objects.equals(this.desktopUsername, that.desktopUsername) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, startTime, endTime, groupByType, desktopUsername, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsedDesktopInfoReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    groupByType: ").append(toIndentedString(groupByType)).append("\n");
        sb.append("    desktopUsername: ").append(toIndentedString(desktopUsername)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
