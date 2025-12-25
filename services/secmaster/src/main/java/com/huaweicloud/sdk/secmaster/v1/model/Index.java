package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Index
 */
public class Index {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private Map<String, KeyIndex> mapping = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    /**
     * 索引状态；open 开启，closed 关闭
     */
    public static final class StatusEnum {

        /**
         * Enum OPEN for value: "open"
         */
        public static final StatusEnum OPEN = new StatusEnum("open");

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final StatusEnum CLOSED = new StatusEnum("closed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("open", OPEN);
            map.put("closed", CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_field")

    private String timestampField;

    public Index withMapping(Map<String, KeyIndex> mapping) {
        this.mapping = mapping;
        return this;
    }

    public Index putMappingItem(String key, KeyIndex mappingItem) {
        if (this.mapping == null) {
            this.mapping = new HashMap<>();
        }
        this.mapping.put(key, mappingItem);
        return this;
    }

    public Index withMapping(Consumer<Map<String, KeyIndex>> mappingSetter) {
        if (this.mapping == null) {
            this.mapping = new HashMap<>();
        }
        mappingSetter.accept(this.mapping);
        return this;
    }

    /**
     * 索引映射信息
     * @return mapping
     */
    public Map<String, KeyIndex> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, KeyIndex> mapping) {
        this.mapping = mapping;
    }

    public Index withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * 数据管道ID
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public Index withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 索引状态；open 开启，closed 关闭
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Index withTimestampField(String timestampField) {
        this.timestampField = timestampField;
        return this;
    }

    /**
     * 时间戳字段名称
     * @return timestampField
     */
    public String getTimestampField() {
        return timestampField;
    }

    public void setTimestampField(String timestampField) {
        this.timestampField = timestampField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Index that = (Index) obj;
        return Objects.equals(this.mapping, that.mapping) && Objects.equals(this.pipeId, that.pipeId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.timestampField, that.timestampField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapping, pipeId, status, timestampField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Index {\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timestampField: ").append(toIndentedString(timestampField)).append("\n");
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
