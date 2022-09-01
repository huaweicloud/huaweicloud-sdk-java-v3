package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class ShowSumTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    @JacksonXmlProperty(localName = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_list")

    @JacksonXmlProperty(localName = "row_list")

    private List<FrontRow> rowList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_data_Time")

    @JacksonXmlProperty(localName = "latest_data_Time")

    private Long latestDataTime;

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向
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
            TableDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TableDirectionEnum(value);
            }
            return result;
        }

        public static TableDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TableDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "table_direction")

    private TableDirectionEnum tableDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_start_time")

    @JacksonXmlProperty(localName = "real_start_time")

    private Long realStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_end_time")

    @JacksonXmlProperty(localName = "real_end_time")

    private Long realEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_msg")

    @JacksonXmlProperty(localName = "notice_msg")

    private String noticeMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    public ShowSumTableResponse withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * 结果的ID信息，分页查询的时候带过来
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public ShowSumTableResponse withRowList(List<FrontRow> rowList) {
        this.rowList = rowList;
        return this;
    }

    public ShowSumTableResponse addRowListItem(FrontRow rowListItem) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        this.rowList.add(rowListItem);
        return this;
    }

    public ShowSumTableResponse withRowList(Consumer<List<FrontRow>> rowListSetter) {
        if (this.rowList == null) {
            this.rowList = new ArrayList<>();
        }
        rowListSetter.accept(this.rowList);
        return this;
    }

    /**
     * 数据行列表
     * @return rowList
     */
    public List<FrontRow> getRowList() {
        return rowList;
    }

    public void setRowList(List<FrontRow> rowList) {
        this.rowList = rowList;
    }

    public ShowSumTableResponse withLatestDataTime(Long latestDataTime) {
        this.latestDataTime = latestDataTime;
        return this;
    }

    /**
     * 最近一笔数据的时间
     * @return latestDataTime
     */
    public Long getLatestDataTime() {
        return latestDataTime;
    }

    public void setLatestDataTime(Long latestDataTime) {
        this.latestDataTime = latestDataTime;
    }

    public ShowSumTableResponse withTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
        return this;
    }

    /**
     * 表格的方向，H：默认，表头横向，V：表头纵向
     * @return tableDirection
     */
    public TableDirectionEnum getTableDirection() {
        return tableDirection;
    }

    public void setTableDirection(TableDirectionEnum tableDirection) {
        this.tableDirection = tableDirection;
    }

    public ShowSumTableResponse withRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
        return this;
    }

    /**
     * 实际开始的时间
     * @return realStartTime
     */
    public Long getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
    }

    public ShowSumTableResponse withRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
        return this;
    }

    /**
     * 实际结束的时间
     * @return realEndTime
     */
    public Long getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
    }

    public ShowSumTableResponse withNoticeMsg(String noticeMsg) {
        this.noticeMsg = noticeMsg;
        return this;
    }

    /**
     * 提示信息
     * @return noticeMsg
     */
    public String getNoticeMsg() {
        return noticeMsg;
    }

    public void setNoticeMsg(String noticeMsg) {
        this.noticeMsg = noticeMsg;
    }

    public ShowSumTableResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSumTableResponse showSumTableResponse = (ShowSumTableResponse) o;
        return Objects.equals(this.resultId, showSumTableResponse.resultId)
            && Objects.equals(this.rowList, showSumTableResponse.rowList)
            && Objects.equals(this.latestDataTime, showSumTableResponse.latestDataTime)
            && Objects.equals(this.tableDirection, showSumTableResponse.tableDirection)
            && Objects.equals(this.realStartTime, showSumTableResponse.realStartTime)
            && Objects.equals(this.realEndTime, showSumTableResponse.realEndTime)
            && Objects.equals(this.noticeMsg, showSumTableResponse.noticeMsg)
            && Objects.equals(this.totalCount, showSumTableResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(resultId, rowList, latestDataTime, tableDirection, realStartTime, realEndTime, noticeMsg, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSumTableResponse {\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    rowList: ").append(toIndentedString(rowList)).append("\n");
        sb.append("    latestDataTime: ").append(toIndentedString(latestDataTime)).append("\n");
        sb.append("    tableDirection: ").append(toIndentedString(tableDirection)).append("\n");
        sb.append("    realStartTime: ").append(toIndentedString(realStartTime)).append("\n");
        sb.append("    realEndTime: ").append(toIndentedString(realEndTime)).append("\n");
        sb.append("    noticeMsg: ").append(toIndentedString(noticeMsg)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
