package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DataConnector
 */
public class DataConnector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_name")

    private String connectorName;

    /**
     * 数据连接类型。 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     */
    public static final class SourceTypeEnum {

        /**
         * Enum RDS_MYSQL for value: "RDS_MYSQL"
         */
        public static final SourceTypeEnum RDS_MYSQL = new SourceTypeEnum("RDS_MYSQL");

        /**
         * Enum RDS_POSTGRES for value: "RDS_POSTGRES"
         */
        public static final SourceTypeEnum RDS_POSTGRES = new SourceTypeEnum("RDS_POSTGRES");

        /**
         * Enum GAUSSDB_MYSQL for value: "gaussdb-mysql"
         */
        public static final SourceTypeEnum GAUSSDB_MYSQL = new SourceTypeEnum("gaussdb-mysql");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("RDS_MYSQL", RDS_MYSQL);
            map.put("RDS_POSTGRES", RDS_POSTGRES);
            map.put("gaussdb-mysql", GAUSSDB_MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_info")

    private String sourceInfo;

    public DataConnector withConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * 数据连接名称。
     * @return connectorName
     */
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public DataConnector withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 数据连接类型。 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public DataConnector withSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * 数据源信息，为json格式，不同数据连接有不同的信息，各数据源的source_info请求内容可参见示例。
     * @return sourceInfo
     */
    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataConnector that = (DataConnector) obj;
        return Objects.equals(this.connectorName, that.connectorName)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceInfo, that.sourceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorName, sourceType, sourceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConnector {\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
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
