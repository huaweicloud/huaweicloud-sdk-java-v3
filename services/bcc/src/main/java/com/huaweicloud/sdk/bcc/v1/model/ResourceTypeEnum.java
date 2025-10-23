package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Server：云服务器 Volume：云硬盘 Sfs-Turbo：高性能文件系统 Workspace：云桌面 MySQL：云数据库RDS(MySQL) PostgreSQL：云数据库RDS(PostgreSQL) SQLServer：云数据库RDS(SQLServer) MariaDB：云数据库RDS(MariaDB) GaussDB：云数据库GaussDB
 */
public class ResourceTypeEnum {

    /**
     * Enum SERVER for value: "Server"
     */
    public static final ResourceTypeEnum SERVER = new ResourceTypeEnum("Server");

    /**
     * Enum VOLUME for value: "Volume"
     */
    public static final ResourceTypeEnum VOLUME = new ResourceTypeEnum("Volume");

    /**
     * Enum SFS_TURBO for value: "Sfs-Turbo"
     */
    public static final ResourceTypeEnum SFS_TURBO = new ResourceTypeEnum("Sfs-Turbo");

    /**
     * Enum WORKSPACE for value: "Workspace"
     */
    public static final ResourceTypeEnum WORKSPACE = new ResourceTypeEnum("Workspace");

    /**
     * Enum MYSQL for value: "MySQL"
     */
    public static final ResourceTypeEnum MYSQL = new ResourceTypeEnum("MySQL");

    /**
     * Enum POSTGRESQL for value: "PostgreSQL"
     */
    public static final ResourceTypeEnum POSTGRESQL = new ResourceTypeEnum("PostgreSQL");

    /**
     * Enum SQLSERVER for value: "SQLServer"
     */
    public static final ResourceTypeEnum SQLSERVER = new ResourceTypeEnum("SQLServer");

    /**
     * Enum MARIADB for value: "MariaDB"
     */
    public static final ResourceTypeEnum MARIADB = new ResourceTypeEnum("MariaDB");

    /**
     * Enum GAUSSDB for value: "GaussDB"
     */
    public static final ResourceTypeEnum GAUSSDB = new ResourceTypeEnum("GaussDB");

    private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceTypeEnum> createStaticFields() {
        Map<String, ResourceTypeEnum> map = new HashMap<>();
        map.put("Server", SERVER);
        map.put("Volume", VOLUME);
        map.put("Sfs-Turbo", SFS_TURBO);
        map.put("Workspace", WORKSPACE);
        map.put("MySQL", MYSQL);
        map.put("PostgreSQL", POSTGRESQL);
        map.put("SQLServer", SQLSERVER);
        map.put("MariaDB", MARIADB);
        map.put("GaussDB", GAUSSDB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceTypeEnum(String value) {
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
    public static ResourceTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
    }

    public static ResourceTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceTypeEnum) {
            return this.value.equals(((ResourceTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
