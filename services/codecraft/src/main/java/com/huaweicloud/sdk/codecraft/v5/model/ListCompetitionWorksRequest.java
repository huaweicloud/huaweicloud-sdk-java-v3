package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListCompetitionWorksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "competition_id")

    private Integer competitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private Integer stageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_time")

    private String readTime;

    /** 查询的时间范围。day表示以read_time作为结束时间,前一天内作为查询范围,hour表示以read_time作为结束时间,前一小内时作为查询范围。 */
    public static final class TimeUnitEnum {

        /** Enum DAY for value: "day" */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("day");

        /** Enum HOUR for value: "hour" */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("hour");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("day", DAY);
            map.put("hour", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TimeUnitEnum(value);
            }
            return result;
        }

        public static TimeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private TimeUnitEnum timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    /** 排序类型，支持asc|desc，默认为asc升序 */
    public static final class SortDirEnum {

        /** Enum ASC for value: "asc" */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /** Enum DESC for value: "desc" */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    public ListCompetitionWorksRequest withCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
        return this;
    }

    /** 要查询的大赛ID，由大赛平台提供 minimum: 1 maximum: 2147483647
     * 
     * @return competitionId */
    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public ListCompetitionWorksRequest withStageId(Integer stageId) {
        this.stageId = stageId;
        return this;
    }

    /** 要查询的大赛阶段ID，由大赛平台提供 minimum: 1 maximum: 2147483647
     * 
     * @return stageId */
    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public ListCompetitionWorksRequest withReadTime(String readTime) {
        this.readTime = readTime;
        return this;
    }

    /** 查询的截止时间
     * 
     * @return readTime */
    public String getReadTime() {
        return readTime;
    }

    public void setReadTime(String readTime) {
        this.readTime = readTime;
    }

    public ListCompetitionWorksRequest withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /** 查询的时间范围。day表示以read_time作为结束时间,前一天内作为查询范围,hour表示以read_time作为结束时间,前一小内时作为查询范围。
     * 
     * @return timeUnit */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ListCompetitionWorksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 作品记录的起始编号,如果不传默认从0开始,offset为0时表示从第一条记录开始 minimum: 0 maximum: 2147483647
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCompetitionWorksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页包含的作品记录数,如果不传默认返回100条，并且返回最大条数为100 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCompetitionWorksRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /** 需要排序的字段，只支持works_id字段,如果不传则不进行排序
     * 
     * @return sortKey */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListCompetitionWorksRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 排序类型，支持asc|desc，默认为asc升序
     * 
     * @return sortDir */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCompetitionWorksRequest listCompetitionWorksRequest = (ListCompetitionWorksRequest) o;
        return Objects.equals(this.competitionId, listCompetitionWorksRequest.competitionId)
            && Objects.equals(this.stageId, listCompetitionWorksRequest.stageId)
            && Objects.equals(this.readTime, listCompetitionWorksRequest.readTime)
            && Objects.equals(this.timeUnit, listCompetitionWorksRequest.timeUnit)
            && Objects.equals(this.offset, listCompetitionWorksRequest.offset)
            && Objects.equals(this.limit, listCompetitionWorksRequest.limit)
            && Objects.equals(this.sortKey, listCompetitionWorksRequest.sortKey)
            && Objects.equals(this.sortDir, listCompetitionWorksRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitionId, stageId, readTime, timeUnit, offset, limit, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCompetitionWorksRequest {\n");
        sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    readTime: ").append(toIndentedString(readTime)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
