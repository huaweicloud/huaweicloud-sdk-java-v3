package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 追踪桶信息。
 */
public class DataBucketQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bucket_name")

    @JacksonXmlProperty(localName = "data_bucket_name")

    private String dataBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_enabled")

    @JacksonXmlProperty(localName = "search_enabled")

    private Boolean searchEnabled;

    /**
     * Gets or Sets dataEvent
     */
    public static final class DataEventEnum {

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final DataEventEnum WRITE = new DataEventEnum("WRITE");

        /**
         * Enum READ for value: "READ"
         */
        public static final DataEventEnum READ = new DataEventEnum("READ");

        private static final Map<String, DataEventEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataEventEnum> createStaticFields() {
            Map<String, DataEventEnum> map = new HashMap<>();
            map.put("WRITE", WRITE);
            map.put("READ", READ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataEventEnum(String value) {
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
        public static DataEventEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DataEventEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataEventEnum(value);
            }
            return result;
        }

        public static DataEventEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DataEventEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataEventEnum) {
                return this.value.equals(((DataEventEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_event")

    @JacksonXmlProperty(localName = "data_event")

    private List<DataEventEnum> dataEvent = null;

    public DataBucketQuery withDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
        return this;
    }

    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return dataBucketName
     */
    public String getDataBucketName() {
        return dataBucketName;
    }

    public void setDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
    }

    public DataBucketQuery withSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
        return this;
    }

    /**
     * 追踪桶日志是否支持搜索。
     * @return searchEnabled
     */
    public Boolean getSearchEnabled() {
        return searchEnabled;
    }

    public void setSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
    }

    public DataBucketQuery withDataEvent(List<DataEventEnum> dataEvent) {
        this.dataEvent = dataEvent;
        return this;
    }

    public DataBucketQuery addDataEventItem(DataEventEnum dataEventItem) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        this.dataEvent.add(dataEventItem);
        return this;
    }

    public DataBucketQuery withDataEvent(Consumer<List<DataEventEnum>> dataEventSetter) {
        if (this.dataEvent == null) {
            this.dataEvent = new ArrayList<>();
        }
        dataEventSetter.accept(this.dataEvent);
        return this;
    }

    /**
     * 数据类追踪器追踪对象的桶名。 - 当启用或者停用数据类追踪器时，该参数为必选。 - 管理类追踪器无此参数。 - 追踪器一旦创建追踪桶无法修改。
     * @return dataEvent
     */
    public List<DataEventEnum> getDataEvent() {
        return dataEvent;
    }

    public void setDataEvent(List<DataEventEnum> dataEvent) {
        this.dataEvent = dataEvent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBucketQuery dataBucketQuery = (DataBucketQuery) o;
        return Objects.equals(this.dataBucketName, dataBucketQuery.dataBucketName)
            && Objects.equals(this.searchEnabled, dataBucketQuery.searchEnabled)
            && Objects.equals(this.dataEvent, dataBucketQuery.dataEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataBucketName, searchEnabled, dataEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBucketQuery {\n");
        sb.append("    dataBucketName: ").append(toIndentedString(dataBucketName)).append("\n");
        sb.append("    searchEnabled: ").append(toIndentedString(searchEnabled)).append("\n");
        sb.append("    dataEvent: ").append(toIndentedString(dataEvent)).append("\n");
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
