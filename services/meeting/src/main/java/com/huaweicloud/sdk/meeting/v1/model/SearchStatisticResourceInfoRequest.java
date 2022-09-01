package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class SearchStatisticResourceInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    /**
     * 查询时间维度，取值： * D: 按日查询 * M: 按月查询。
     */
    public static final class TimeUnitEnum {

        /**
         * Enum D for value: "D"
         */
        public static final TimeUnitEnum D = new TimeUnitEnum("D");

        /**
         * Enum M for value: "M"
         */
        public static final TimeUnitEnum M = new TimeUnitEnum("M");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("D", D);
            map.put("M", M);
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
    @JsonProperty(value = "timeUnit")

    @JacksonXmlProperty(localName = "timeUnit")

    private TimeUnitEnum timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    @JacksonXmlProperty(localName = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    @JacksonXmlProperty(localName = "endTime")

    private String endTime;

    /**
     * 查询分类，取值： * used_vmr_info: 已购VMR资源使用统计数据 * used_live_info: 已购直播端口资源使用统计数据 * used_record_info: 已购录播资源使用统计数据 * used_pstn_info: 已购电话外呼资源使用统计数据
     */
    public static final class CategoryEnum {

        /**
         * Enum USED_VMR_INFO for value: "used_vmr_info"
         */
        public static final CategoryEnum USED_VMR_INFO = new CategoryEnum("used_vmr_info");

        /**
         * Enum USED_LIVE_INFO for value: "used_live_info"
         */
        public static final CategoryEnum USED_LIVE_INFO = new CategoryEnum("used_live_info");

        /**
         * Enum USED_RECORD_INFO for value: "used_record_info"
         */
        public static final CategoryEnum USED_RECORD_INFO = new CategoryEnum("used_record_info");

        /**
         * Enum USED_PSTN_INFO for value: "used_pstn_info"
         */
        public static final CategoryEnum USED_PSTN_INFO = new CategoryEnum("used_pstn_info");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("used_vmr_info", USED_VMR_INFO);
            map.put("used_live_info", USED_LIVE_INFO);
            map.put("used_record_info", USED_RECORD_INFO);
            map.put("used_pstn_info", USED_PSTN_INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private CategoryEnum category;

    public SearchStatisticResourceInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量。 * 取值：大于等于0，默认值为0。 * 小于最小值0时，系统设置为0。 * 大于等于最大条目数量，则返回最后一页数据，页数根据总条目数和limit计算得出。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchStatisticResourceInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的条目数量。 * 取值：1-500，默认值为20。 * 小于最小值1时，系统设置为1。 * 大于最大值500时，系统设置为500。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchStatisticResourceInfoRequest withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 查询时间维度，取值： * D: 按日查询 * M: 按月查询。
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public SearchStatisticResourceInfoRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询时间范围的开始时间，格式根据timeUnit的取值而定。 * timeUnit = D，格式：yyyy-MM-dd，此情况下startTime与endTime间隔最多31日。 * timeUnit = M，格式：yyyy-MM，此情况下startTime与endTime间隔最多12个月。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SearchStatisticResourceInfoRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询时间范围的结束时间，格式根据timeUnit的取值而定。 * timeUnit = D，格式：yyyy-MM-dd，此情况下startTime与endTime间隔最多31日。 * timeUnit = M，格式：yyyy-MM，此情况下startTime与endTime间隔最多12个月。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SearchStatisticResourceInfoRequest withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 查询分类，取值： * used_vmr_info: 已购VMR资源使用统计数据 * used_live_info: 已购直播端口资源使用统计数据 * used_record_info: 已购录播资源使用统计数据 * used_pstn_info: 已购电话外呼资源使用统计数据
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchStatisticResourceInfoRequest searchStatisticResourceInfoRequest = (SearchStatisticResourceInfoRequest) o;
        return Objects.equals(this.offset, searchStatisticResourceInfoRequest.offset)
            && Objects.equals(this.limit, searchStatisticResourceInfoRequest.limit)
            && Objects.equals(this.timeUnit, searchStatisticResourceInfoRequest.timeUnit)
            && Objects.equals(this.startTime, searchStatisticResourceInfoRequest.startTime)
            && Objects.equals(this.endTime, searchStatisticResourceInfoRequest.endTime)
            && Objects.equals(this.category, searchStatisticResourceInfoRequest.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, timeUnit, startTime, endTime, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchStatisticResourceInfoRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
