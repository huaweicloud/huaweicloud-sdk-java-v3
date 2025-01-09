package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 安装方式：   * &#x60;QUIET_INSTALL&#x60; - 静默安装。     安装命令(静默安装命令)，例: ${FILE_PATH} /S。   * &#x60;UNZIP_INSTALL&#x60; - 解压安装。     例: unzip ${FILE_PATH}。   * &#x60;GUI_INSTALL&#x60; - 用户通过GUI界面安装。 install_type为QUIET_INSTALL、UNZIP_INSTALL时install_command非空。 预定义变量将采用以下值: ${FILE_PATH}: 应用安装包在桌面本地的存储路径。
 */
public class InstallType {

    /**
     * Enum QUIET_INSTALL for value: "QUIET_INSTALL"
     */
    public static final InstallType QUIET_INSTALL = new InstallType("QUIET_INSTALL");

    /**
     * Enum UNZIP_INSTALL for value: "UNZIP_INSTALL"
     */
    public static final InstallType UNZIP_INSTALL = new InstallType("UNZIP_INSTALL");

    /**
     * Enum GUI_INSTALL for value: "GUI_INSTALL"
     */
    public static final InstallType GUI_INSTALL = new InstallType("GUI_INSTALL");

    private static final Map<String, InstallType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstallType> createStaticFields() {
        Map<String, InstallType> map = new HashMap<>();
        map.put("QUIET_INSTALL", QUIET_INSTALL);
        map.put("UNZIP_INSTALL", UNZIP_INSTALL);
        map.put("GUI_INSTALL", GUI_INSTALL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstallType(String value) {
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
    public static InstallType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstallType(value));
    }

    public static InstallType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstallType) {
            return this.value.equals(((InstallType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
