package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 云存储配置挂载信息。
 */
public class VolumeConfigurationMountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_path")

    private String subPath;

    /**
     * 读写权限，支持读写、只读。
     */
    public static final class AccessModeEnum {

        /**
         * Enum READWRITEMANY for value: "ReadWriteMany"
         */
        public static final AccessModeEnum READWRITEMANY = new AccessModeEnum("ReadWriteMany");

        /**
         * Enum READONLYMANY for value: "ReadOnlyMany"
         */
        public static final AccessModeEnum READONLYMANY = new AccessModeEnum("ReadOnlyMany");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("ReadWriteMany", READWRITEMANY);
            map.put("ReadOnlyMany", READONLYMANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
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
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    public VolumeConfigurationMountInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 容器挂载路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VolumeConfigurationMountInfo withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * 子路径。
     * @return subPath
     */
    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public VolumeConfigurationMountInfo withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 读写权限，支持读写、只读。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeConfigurationMountInfo that = (VolumeConfigurationMountInfo) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.subPath, that.subPath)
            && Objects.equals(this.accessMode, that.accessMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, subPath, accessMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeConfigurationMountInfo {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
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
