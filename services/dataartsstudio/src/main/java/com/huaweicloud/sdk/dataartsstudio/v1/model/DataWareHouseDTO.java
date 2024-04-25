package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * DataWareHouseDTO
 */
public class DataWareHouseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    /**
     * 数据连接类型：   * HIVE数据源   * DWS数据源   * SPARK数据源
     */
    public static final class DwTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DwTypeEnum HIVE = new DwTypeEnum("HIVE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DwTypeEnum DWS = new DwTypeEnum("DWS");

        /**
         * Enum SPARK for value: "SPARK"
         */
        public static final DwTypeEnum SPARK = new DwTypeEnum("SPARK");

        private static final Map<String, DwTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DwTypeEnum> createStaticFields() {
            Map<String, DwTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("DWS", DWS);
            map.put("SPARK", SPARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DwTypeEnum(String value) {
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
        public static DwTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DwTypeEnum(value));
        }

        public static DwTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DwTypeEnum) {
                return this.value.equals(((DwTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private DwTypeEnum dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_config")

    private DataWareHouseDTODwConfig dwConfig;

    public DataWareHouseDTO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接ID
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public DataWareHouseDTO withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名称
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public DataWareHouseDTO withDwType(DwTypeEnum dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型：   * HIVE数据源   * DWS数据源   * SPARK数据源
     * @return dwType
     */
    public DwTypeEnum getDwType() {
        return dwType;
    }

    public void setDwType(DwTypeEnum dwType) {
        this.dwType = dwType;
    }

    public DataWareHouseDTO withDwConfig(DataWareHouseDTODwConfig dwConfig) {
        this.dwConfig = dwConfig;
        return this;
    }

    public DataWareHouseDTO withDwConfig(Consumer<DataWareHouseDTODwConfig> dwConfigSetter) {
        if (this.dwConfig == null) {
            this.dwConfig = new DataWareHouseDTODwConfig();
            dwConfigSetter.accept(this.dwConfig);
        }

        return this;
    }

    /**
     * Get dwConfig
     * @return dwConfig
     */
    public DataWareHouseDTODwConfig getDwConfig() {
        return dwConfig;
    }

    public void setDwConfig(DataWareHouseDTODwConfig dwConfig) {
        this.dwConfig = dwConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataWareHouseDTO that = (DataWareHouseDTO) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.dwName, that.dwName)
            && Objects.equals(this.dwType, that.dwType) && Objects.equals(this.dwConfig, that.dwConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId, dwName, dwType, dwConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataWareHouseDTO {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    dwConfig: ").append(toIndentedString(dwConfig)).append("\n");
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
