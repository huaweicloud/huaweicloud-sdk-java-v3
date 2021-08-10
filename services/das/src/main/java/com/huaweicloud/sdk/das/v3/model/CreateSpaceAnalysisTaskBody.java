package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CreateSpaceAnalysisTaskBody */
public class CreateSpaceAnalysisTaskBody {

    /** 操作类型 */
    public static final class OperateEnum {

        /** Enum REANALYSIS for value: "reanalysis" */
        public static final OperateEnum REANALYSIS = new OperateEnum("reanalysis");

        private static final Map<String, OperateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateEnum> createStaticFields() {
            Map<String, OperateEnum> map = new HashMap<>();
            map.put("reanalysis", REANALYSIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateEnum(String value) {
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
        public static OperateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperateEnum(value);
            }
            return result;
        }

        public static OperateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateEnum) {
                return this.value.equals(((OperateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private OperateEnum operate;

    /** 引擎类型 */
    public static final class DatastoreTypeEnum {

        /** Enum MYSQL for value: "MySQL" */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        /** Enum GAUSSDB_FOR_MYSQL_ for value: "GaussDB(for MySQL)" */
        public static final DatastoreTypeEnum GAUSSDB_FOR_MYSQL_ = new DatastoreTypeEnum("GaussDB(for MySQL)");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("GaussDB(for MySQL)", GAUSSDB_FOR_MYSQL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatastoreTypeEnum(value);
            }
            return result;
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    public CreateSpaceAnalysisTaskBody withOperate(OperateEnum operate) {
        this.operate = operate;
        return this;
    }

    /** 操作类型
     * 
     * @return operate */
    public OperateEnum getOperate() {
        return operate;
    }

    public void setOperate(OperateEnum operate) {
        this.operate = operate;
    }

    public CreateSpaceAnalysisTaskBody withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /** 引擎类型
     * 
     * @return datastoreType */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSpaceAnalysisTaskBody createSpaceAnalysisTaskBody = (CreateSpaceAnalysisTaskBody) o;
        return Objects.equals(this.operate, createSpaceAnalysisTaskBody.operate)
            && Objects.equals(this.datastoreType, createSpaceAnalysisTaskBody.datastoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operate, datastoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpaceAnalysisTaskBody {\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
