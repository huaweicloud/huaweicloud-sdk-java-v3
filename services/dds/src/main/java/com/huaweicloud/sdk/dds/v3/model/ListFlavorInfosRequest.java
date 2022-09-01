package com.huaweicloud.sdk.dds.v3.model;

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
public class ListFlavorInfosRequest {

    /**
     * 数据库版本类型。取值为“DDS-Community”。
     */
    public static final class EngineNameEnum {

        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final EngineNameEnum DDS_COMMUNITY = new EngineNameEnum("DDS-Community");

        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final EngineNameEnum DDS_ENHANCED = new EngineNameEnum("DDS-Enhanced");

        private static final Map<String, EngineNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineNameEnum> createStaticFields() {
            Map<String, EngineNameEnum> map = new HashMap<>();
            map.put("DDS-Community", DDS_COMMUNITY);
            map.put("DDS-Enhanced", DDS_ENHANCED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineNameEnum(String value) {
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
        public static EngineNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EngineNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineNameEnum(value);
            }
            return result;
        }

        public static EngineNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EngineNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineNameEnum) {
                return this.value.equals(((EngineNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    @JacksonXmlProperty(localName = "engine_name")

    private EngineNameEnum engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    @JacksonXmlProperty(localName = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListFlavorInfosRequest withEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 数据库版本类型。取值为“DDS-Community”。
     * @return engineName
     */
    public EngineNameEnum getEngineName() {
        return engineName;
    }

    public void setEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
    }

    public ListFlavorInfosRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 数据库版本号。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ListFlavorInfosRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。   - 从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询）。   - 取值必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFlavorInfosRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询规格信息上限值。   - 取值范围: 1~100。   - 不传该参数时，默认查询前100条规格信息。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorInfosRequest listFlavorInfosRequest = (ListFlavorInfosRequest) o;
        return Objects.equals(this.engineName, listFlavorInfosRequest.engineName)
            && Objects.equals(this.engineVersion, listFlavorInfosRequest.engineVersion)
            && Objects.equals(this.offset, listFlavorInfosRequest.offset)
            && Objects.equals(this.limit, listFlavorInfosRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, engineVersion, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorInfosRequest {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
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
