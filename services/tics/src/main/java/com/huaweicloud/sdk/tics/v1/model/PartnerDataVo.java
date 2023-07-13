package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PartnerDataVo
 */
public class PartnerDataVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private List<TicsDatasetColumn> columnList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    /**
     * 数据类型，DWS.DWS类型数据集，LOCAL_CSV.本地文件类型数集据，MRS.HIVE类型数据集，MYSQL.MySql类型数据集，ORACLE.Oracle类型数据集，RDS.RDS类型数据集
     */
    public static final class DataTypeEnum {

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DataTypeEnum DWS = new DataTypeEnum("DWS");

        /**
         * Enum LOCAL_CSV for value: "LOCAL_CSV"
         */
        public static final DataTypeEnum LOCAL_CSV = new DataTypeEnum("LOCAL_CSV");

        /**
         * Enum MRS for value: "MRS"
         */
        public static final DataTypeEnum MRS = new DataTypeEnum("MRS");

        /**
         * Enum MYSQL for value: "MYSQL"
         */
        public static final DataTypeEnum MYSQL = new DataTypeEnum("MYSQL");

        /**
         * Enum ORACLE for value: "ORACLE"
         */
        public static final DataTypeEnum ORACLE = new DataTypeEnum("ORACLE");

        /**
         * Enum RDS for value: "RDS"
         */
        public static final DataTypeEnum RDS = new DataTypeEnum("RDS");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("LOCAL_CSV", LOCAL_CSV);
            map.put("MRS", MRS);
            map.put("MYSQL", MYSQL);
            map.put("ORACLE", ORACLE);
            map.put("RDS", RDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataTypeEnum(value));
        }

        public static DataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataTypeEnum) {
                return this.value.equals(((DataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private DataTypeEnum dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_name")

    private String partnerDomainName;

    public PartnerDataVo withColumnList(List<TicsDatasetColumn> columnList) {
        this.columnList = columnList;
        return this;
    }

    public PartnerDataVo addColumnListItem(TicsDatasetColumn columnListItem) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        this.columnList.add(columnListItem);
        return this;
    }

    public PartnerDataVo withColumnList(Consumer<List<TicsDatasetColumn>> columnListSetter) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        columnListSetter.accept(this.columnList);
        return this;
    }

    /**
     * 字段信息集合
     * @return columnList
     */
    public List<TicsDatasetColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<TicsDatasetColumn> columnList) {
        this.columnList = columnList;
    }

    public PartnerDataVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public PartnerDataVo withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型，DWS.DWS类型数据集，LOCAL_CSV.本地文件类型数集据，MRS.HIVE类型数据集，MYSQL.MySql类型数据集，ORACLE.Oracle类型数据集，RDS.RDS类型数据集
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public PartnerDataVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PartnerDataVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据集id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PartnerDataVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据集名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartnerDataVo withPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
        return this;
    }

    /**
     * 参与方租户名称
     * @return partnerDomainName
     */
    public String getPartnerDomainName() {
        return partnerDomainName;
    }

    public void setPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartnerDataVo that = (PartnerDataVo) obj;
        return Objects.equals(this.columnList, that.columnList) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.partnerDomainName, that.partnerDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnList, createTime, dataType, description, id, name, partnerDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartnerDataVo {\n");
        sb.append("    columnList: ").append(toIndentedString(columnList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partnerDomainName: ").append(toIndentedString(partnerDomainName)).append("\n");
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
