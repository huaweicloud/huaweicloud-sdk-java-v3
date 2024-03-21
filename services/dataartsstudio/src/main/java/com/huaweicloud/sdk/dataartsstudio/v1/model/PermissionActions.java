package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * HIVE数据源支持权限操作类型：   * &#x60;ALL&#x60; - 所有执行权限   * &#x60;SELECT&#x60; - 查询权限   * &#x60;UPDATE&#x60; - 更新权限   * &#x60;CREATE&#x60; - 创建权限   * &#x60;DROP&#x60; - drop操作权限   * &#x60;ALTER&#x60; - alter操作权限   * &#x60;INDEX&#x60; - 索引操作权限   * &#x60;READ&#x60; - 可读权限   * &#x60;WRITE&#x60; - 可写权限  DLI数据源支持权限操作类型：   * &#x60;SELECT&#x60; - 查询权限   * &#x60;DROP&#x60; - drop操作权限   * &#x60;ALTER&#x60; - alter操作权限   * &#x60;INSERT&#x60; - 插入数据权限   * &#x60;CREATE_TABLE&#x60; - 创建表权限  DWS数据源支持权限操作类型：   * &#x60;ALL&#x60; - 所有执行权限   * &#x60;SELECT&#x60; - 查询权限   * &#x60;UPDATE&#x60; - 更新权限   * &#x60;DROP&#x60; - drop操作权限   * &#x60;ALTER&#x60; - alter操作权限   * &#x60;INSERT&#x60; - 插入数据权限   * &#x60;CREATE_TABLE&#x60; - 创建表权限   * &#x60;DELETE&#x60; - 删除数据权限   * &#x60;CREATE_SCHEMA&#x60; - 创建schema权限
 */
public class PermissionActions {

    /**
     * Enum ALL for value: "ALL"
     */
    public static final PermissionActions ALL = new PermissionActions("ALL");

    /**
     * Enum SELECT for value: "SELECT"
     */
    public static final PermissionActions SELECT = new PermissionActions("SELECT");

    /**
     * Enum UPDATE for value: "UPDATE"
     */
    public static final PermissionActions UPDATE = new PermissionActions("UPDATE");

    /**
     * Enum CREATE for value: "CREATE"
     */
    public static final PermissionActions CREATE = new PermissionActions("CREATE");

    /**
     * Enum DROP for value: "DROP"
     */
    public static final PermissionActions DROP = new PermissionActions("DROP");

    /**
     * Enum ALTER for value: "ALTER"
     */
    public static final PermissionActions ALTER = new PermissionActions("ALTER");

    /**
     * Enum INDEX for value: "INDEX"
     */
    public static final PermissionActions INDEX = new PermissionActions("INDEX");

    /**
     * Enum READ for value: "READ"
     */
    public static final PermissionActions READ = new PermissionActions("READ");

    /**
     * Enum WRITE for value: "WRITE"
     */
    public static final PermissionActions WRITE = new PermissionActions("WRITE");

    /**
     * Enum INSERT for value: "INSERT"
     */
    public static final PermissionActions INSERT = new PermissionActions("INSERT");

    /**
     * Enum CREATE_TABLE for value: "CREATE_TABLE"
     */
    public static final PermissionActions CREATE_TABLE = new PermissionActions("CREATE_TABLE");

    /**
     * Enum DELETE for value: "DELETE"
     */
    public static final PermissionActions DELETE = new PermissionActions("DELETE");

    /**
     * Enum CREATE_SCHEMA for value: "CREATE_SCHEMA"
     */
    public static final PermissionActions CREATE_SCHEMA = new PermissionActions("CREATE_SCHEMA");

    private static final Map<String, PermissionActions> STATIC_FIELDS = createStaticFields();

    private static Map<String, PermissionActions> createStaticFields() {
        Map<String, PermissionActions> map = new HashMap<>();
        map.put("ALL", ALL);
        map.put("SELECT", SELECT);
        map.put("UPDATE", UPDATE);
        map.put("CREATE", CREATE);
        map.put("DROP", DROP);
        map.put("ALTER", ALTER);
        map.put("INDEX", INDEX);
        map.put("READ", READ);
        map.put("WRITE", WRITE);
        map.put("INSERT", INSERT);
        map.put("CREATE_TABLE", CREATE_TABLE);
        map.put("DELETE", DELETE);
        map.put("CREATE_SCHEMA", CREATE_SCHEMA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PermissionActions(String value) {
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
    public static PermissionActions fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionActions(value));
    }

    public static PermissionActions valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PermissionActions) {
            return this.value.equals(((PermissionActions) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
