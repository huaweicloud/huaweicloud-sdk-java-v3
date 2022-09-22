package com.huaweicloud.sdk.meeting.v1.model;

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
public class SearchQosParticipantsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    /**
     * 会议类别。 * online：在线会议，正在召开的会议 * history：历史会议，已结束的会议
     */
    public static final class ConfTypeEnum {

        /**
         * Enum ONLINE for value: "online"
         */
        public static final ConfTypeEnum ONLINE = new ConfTypeEnum("online");

        /**
         * Enum HISTORY for value: "history"
         */
        public static final ConfTypeEnum HISTORY = new ConfTypeEnum("history");

        private static final Map<String, ConfTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfTypeEnum> createStaticFields() {
            Map<String, ConfTypeEnum> map = new HashMap<>();
            map.put("online", ONLINE);
            map.put("history", HISTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfTypeEnum(String value) {
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
        public static ConfTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConfTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfTypeEnum(value);
            }
            return result;
        }

        public static ConfTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConfTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfTypeEnum) {
                return this.value.equals(((ConfTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confType")

    private ConfTypeEnum confType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    private String searchKey;

    public SearchQosParticipantsRequest withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 会议UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public SearchQosParticipantsRequest withConfType(ConfTypeEnum confType) {
        this.confType = confType;
        return this;
    }

    /**
     * 会议类别。 * online：在线会议，正在召开的会议 * history：历史会议，已结束的会议
     * @return confType
     */
    public ConfTypeEnum getConfType() {
        return confType;
    }

    public void setConfType(ConfTypeEnum confType) {
        this.confType = confType;
    }

    public SearchQosParticipantsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量。 * 取值：大于等于0，默认值为0。 * 大于等于最大条目数量，则返回最后一页的数据。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchQosParticipantsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的条目数量。 * 取值：1-500，默认值为20。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchQosParticipantsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 查询条件。与会者名称可作为搜索内容。长度限制为1-512个字符。
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchQosParticipantsRequest searchQosParticipantsRequest = (SearchQosParticipantsRequest) o;
        return Objects.equals(this.confUUID, searchQosParticipantsRequest.confUUID)
            && Objects.equals(this.confType, searchQosParticipantsRequest.confType)
            && Objects.equals(this.offset, searchQosParticipantsRequest.offset)
            && Objects.equals(this.limit, searchQosParticipantsRequest.limit)
            && Objects.equals(this.searchKey, searchQosParticipantsRequest.searchKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUID, confType, offset, limit, searchKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQosParticipantsRequest {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    confType: ").append(toIndentedString(confType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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
