package com.huaweicloud.sdk.apm.v1.model;

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
public class ShowRawTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_list")

    private List<FrontRow> rowList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_data_Time")

    private String latestDataTime;

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向。
     */
    public static final class TableDirectionEnum {

        /**
         * Enum H for value: "H"
         */
        public static final TableDirectionEnum H = new TableDirectionEnum("H");

        /**
         * Enum V for value: "V"
         */
        public static final TableDirectionEnum V = new TableDirectionEnum("V");

        private static final Map<String, TableDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableDirectionEnum> createStaticFields() {
            Map<String, TableDirectionEnum> map = new HashMap<>();
            map.put("H", H);
            map.put("V", V);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableDirectionEnum(String value) {
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
        public static TableDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableDirectionEnum(value));
        }

        public static TableDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableDirectionEnum) {
                return this.value.equals(((TableDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_direction")

    private TableDirectionEnum tableDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_start_time")

    private Long realStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_end_time")

    private Long realEndTime;

    public ShowRawTableResponse withRowList(List<FrontRow> rowList) {
        this.rowList = rowList;
        return this;
    }

    public ShowRawTableResponse addRowListItem(FrontRow rowListItem) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        this.rowList.add(rowListItem);
        return this;
    }

    public ShowRawTableResponse withRowList(Consumer<List<FrontRow>> rowListSetter) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        rowListSetter.accept(this.rowList);
        return this;
    }

    /**
     * Get rowList
     * @return rowList
     */
    public List<FrontRow> getRowList() {
        return rowList;
    }

    public void setRowList(List<FrontRow> rowList) {
        this.rowList = rowList;
    }

    public ShowRawTableResponse withLatestDataTime(String latestDataTime) {
        this.latestDataTime = latestDataTime;
        return this;
    }

    /**
     * 最近一笔数据的时间。
     * @return latestDataTime
     */
    public String getLatestDataTime() {
        return latestDataTime;
    }

    public void setLatestDataTime(String latestDataTime) {
        this.latestDataTime = latestDataTime;
    }

    public ShowRawTableResponse withTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
        return this;
    }

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向。
     * @return tableDirection
     */
    public TableDirectionEnum getTableDirection() {
        return tableDirection;
    }

    public void setTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
    }

    public ShowRawTableResponse withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * 上次请求id。
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public ShowRawTableResponse withRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
        return this;
    }

    /**
     * 实际开始的时间，主要用于下一次调用，特别是分页调用的时候传的参数。
     * @return realStartTime
     */
    public Long getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
    }

    public ShowRawTableResponse withRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
        return this;
    }

    /**
     * 实际结束的时间。
     * @return realEndTime
     */
    public Long getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRawTableResponse that = (ShowRawTableResponse) obj;
        return Objects.equals(this.rowList, that.rowList) && Objects.equals(this.latestDataTime, that.latestDataTime)
            && Objects.equals(this.tableDirection, that.tableDirection) && Objects.equals(this.resultId, that.resultId)
            && Objects.equals(this.realStartTime, that.realStartTime)
            && Objects.equals(this.realEndTime, that.realEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowList, latestDataTime, tableDirection, resultId, realStartTime, realEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRawTableResponse {\n");
        sb.append("    rowList: ").append(toIndentedString(rowList)).append("\n");
        sb.append("    latestDataTime: ").append(toIndentedString(latestDataTime)).append("\n");
        sb.append("    tableDirection: ").append(toIndentedString(tableDirection)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    realStartTime: ").append(toIndentedString(realStartTime)).append("\n");
        sb.append("    realEndTime: ").append(toIndentedString(realEndTime)).append("\n");
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
