package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 源数据库信息。
 */
public class SourceDBInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_string")

    private String connectionString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    /**
     * 数据库类型。
     */
    public static final class SourceDbTypeEnum {

        /**
         * Enum ORACLE for value: "ORACLE"
         */
        public static final SourceDbTypeEnum ORACLE = new SourceDbTypeEnum("ORACLE");

        private static final Map<String, SourceDbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceDbTypeEnum> createStaticFields() {
            Map<String, SourceDbTypeEnum> map = new HashMap<>();
            map.put("ORACLE", ORACLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceDbTypeEnum(String value) {
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
        public static SourceDbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceDbTypeEnum(value));
        }

        public static SourceDbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceDbTypeEnum) {
                return this.value.equals(((SourceDbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_type")

    private SourceDbTypeEnum sourceDbType;

    /**
     * 数据库版本。 （注意：该字段的值是数据库类型source_db_type对应的版本，当前支持以下组合： ORACLE-11g； ORACLE-12c； ORACLE-18c； ORACLE-19c。）
     */
    public static final class SourceDbVersionEnum {

        /**
         * Enum _11G for value: "11g"
         */
        public static final SourceDbVersionEnum _11G = new SourceDbVersionEnum("11g");

        /**
         * Enum _12C for value: "12c"
         */
        public static final SourceDbVersionEnum _12C = new SourceDbVersionEnum("12c");

        /**
         * Enum _18C for value: "18c"
         */
        public static final SourceDbVersionEnum _18C = new SourceDbVersionEnum("18c");

        /**
         * Enum _19C for value: "19c"
         */
        public static final SourceDbVersionEnum _19C = new SourceDbVersionEnum("19c");

        private static final Map<String, SourceDbVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceDbVersionEnum> createStaticFields() {
            Map<String, SourceDbVersionEnum> map = new HashMap<>();
            map.put("11g", _11G);
            map.put("12c", _12C);
            map.put("18c", _18C);
            map.put("19c", _19C);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceDbVersionEnum(String value) {
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
        public static SourceDbVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceDbVersionEnum(value));
        }

        public static SourceDbVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceDbVersionEnum) {
                return this.value.equals(((SourceDbVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_version")

    private SourceDbVersionEnum sourceDbVersion;

    public SourceDBInfo withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * 连接字符串。
     * @return connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public SourceDBInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SourceDBInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SourceDBInfo withSourceDbType(SourceDbTypeEnum sourceDbType) {
        this.sourceDbType = sourceDbType;
        return this;
    }

    /**
     * 数据库类型。
     * @return sourceDbType
     */
    public SourceDbTypeEnum getSourceDbType() {
        return sourceDbType;
    }

    public void setSourceDbType(SourceDbTypeEnum sourceDbType) {
        this.sourceDbType = sourceDbType;
    }

    public SourceDBInfo withSourceDbVersion(SourceDbVersionEnum sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
        return this;
    }

    /**
     * 数据库版本。 （注意：该字段的值是数据库类型source_db_type对应的版本，当前支持以下组合： ORACLE-11g； ORACLE-12c； ORACLE-18c； ORACLE-19c。）
     * @return sourceDbVersion
     */
    public SourceDbVersionEnum getSourceDbVersion() {
        return sourceDbVersion;
    }

    public void setSourceDbVersion(SourceDbVersionEnum sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceDBInfo that = (SourceDBInfo) obj;
        return Objects.equals(this.connectionString, that.connectionString)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.password, that.password)
            && Objects.equals(this.sourceDbType, that.sourceDbType)
            && Objects.equals(this.sourceDbVersion, that.sourceDbVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionString, userName, password, sourceDbType, sourceDbVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceDBInfo {\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    sourceDbType: ").append(toIndentedString(sourceDbType)).append("\n");
        sb.append("    sourceDbVersion: ").append(toIndentedString(sourceDbVersion)).append("\n");
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
