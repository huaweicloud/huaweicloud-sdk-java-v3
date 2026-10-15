package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 列信息
 */
public class ColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private String keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_mapped_name")

    private String columnMappedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Boolean partition;

    /**
     * 列的脱敏算法类型（主键和唯一键不支持）。取值： - NAME ：姓名中间遮盖。 - PHONE ：电话中间遮盖。 - IDENTITY_CARD ：证件号码中间遮盖。  - BANK_CARD ：银行卡号中间遮盖。 - EMAIL ：邮箱前缀首字母后遮盖。 - ADDRESS ：地址后缀遮盖。  - DATE ：仅保留年代日期替换为1月1日。  - NUMERIC ：数字变0。 - SECRET_CONTENT ：大段文本全替换。
     */
    public static final class DesensitizationAlgorithmEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final DesensitizationAlgorithmEnum NAME = new DesensitizationAlgorithmEnum("name");

        /**
         * Enum PHONE for value: "phone"
         */
        public static final DesensitizationAlgorithmEnum PHONE = new DesensitizationAlgorithmEnum("phone");

        /**
         * Enum IDENTITY_CARD for value: "identity_card"
         */
        public static final DesensitizationAlgorithmEnum IDENTITY_CARD =
            new DesensitizationAlgorithmEnum("identity_card");

        /**
         * Enum BANK_CARD for value: "bank_card"
         */
        public static final DesensitizationAlgorithmEnum BANK_CARD = new DesensitizationAlgorithmEnum("bank_card");

        /**
         * Enum EMAIL for value: "email"
         */
        public static final DesensitizationAlgorithmEnum EMAIL = new DesensitizationAlgorithmEnum("email");

        /**
         * Enum ADDRESS for value: "address"
         */
        public static final DesensitizationAlgorithmEnum ADDRESS = new DesensitizationAlgorithmEnum("address");

        /**
         * Enum DATE for value: "date"
         */
        public static final DesensitizationAlgorithmEnum DATE = new DesensitizationAlgorithmEnum("date");

        /**
         * Enum NUMERIC for value: "numeric"
         */
        public static final DesensitizationAlgorithmEnum NUMERIC = new DesensitizationAlgorithmEnum("numeric");

        /**
         * Enum SECRET_CONTENT for value: "secret_content"
         */
        public static final DesensitizationAlgorithmEnum SECRET_CONTENT =
            new DesensitizationAlgorithmEnum("secret_content");

        private static final Map<String, DesensitizationAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesensitizationAlgorithmEnum> createStaticFields() {
            Map<String, DesensitizationAlgorithmEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("phone", PHONE);
            map.put("identity_card", IDENTITY_CARD);
            map.put("bank_card", BANK_CARD);
            map.put("email", EMAIL);
            map.put("address", ADDRESS);
            map.put("date", DATE);
            map.put("numeric", NUMERIC);
            map.put("secret_content", SECRET_CONTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DesensitizationAlgorithmEnum(String value) {
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
        public static DesensitizationAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new DesensitizationAlgorithmEnum(value));
        }

        public static DesensitizationAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DesensitizationAlgorithmEnum) {
                return this.value.equals(((DesensitizationAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desensitization_algorithm")

    private DesensitizationAlgorithmEnum desensitizationAlgorithm;

    public ColumnInfo withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ColumnInfo withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 列类型
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public ColumnInfo withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * 列的键类型。
     * @return keyType
     */
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public ColumnInfo withColumnMappedName(String columnMappedName) {
        this.columnMappedName = columnMappedName;
        return this;
    }

    /**
     * 列映射后的名称
     * @return columnMappedName
     */
    public String getColumnMappedName() {
        return columnMappedName;
    }

    public void setColumnMappedName(String columnMappedName) {
        this.columnMappedName = columnMappedName;
    }

    public ColumnInfo withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 该列是否过滤
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ColumnInfo withPartition(Boolean partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 该列是否partitionKey
     * @return partition
     */
    public Boolean getPartition() {
        return partition;
    }

    public void setPartition(Boolean partition) {
        this.partition = partition;
    }

    public ColumnInfo withDesensitizationAlgorithm(DesensitizationAlgorithmEnum desensitizationAlgorithm) {
        this.desensitizationAlgorithm = desensitizationAlgorithm;
        return this;
    }

    /**
     * 列的脱敏算法类型（主键和唯一键不支持）。取值： - NAME ：姓名中间遮盖。 - PHONE ：电话中间遮盖。 - IDENTITY_CARD ：证件号码中间遮盖。  - BANK_CARD ：银行卡号中间遮盖。 - EMAIL ：邮箱前缀首字母后遮盖。 - ADDRESS ：地址后缀遮盖。  - DATE ：仅保留年代日期替换为1月1日。  - NUMERIC ：数字变0。 - SECRET_CONTENT ：大段文本全替换。
     * @return desensitizationAlgorithm
     */
    public DesensitizationAlgorithmEnum getDesensitizationAlgorithm() {
        return desensitizationAlgorithm;
    }

    public void setDesensitizationAlgorithm(DesensitizationAlgorithmEnum desensitizationAlgorithm) {
        this.desensitizationAlgorithm = desensitizationAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnInfo that = (ColumnInfo) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.keyType, that.keyType)
            && Objects.equals(this.columnMappedName, that.columnMappedName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.desensitizationAlgorithm, that.desensitizationAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(columnName, columnType, keyType, columnMappedName, status, partition, desensitizationAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    columnMappedName: ").append(toIndentedString(columnMappedName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    desensitizationAlgorithm: ").append(toIndentedString(desensitizationAlgorithm)).append("\n");
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
