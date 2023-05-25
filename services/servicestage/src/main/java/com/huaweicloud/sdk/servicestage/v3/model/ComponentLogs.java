package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ComponentLogs
 */
public class ComponentLogs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_path")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    private String rotate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_path")

    private String hostPath;

    /**
     * 主机扩展路径
     */
    public static final class HostExtendPathEnum {

        /**
         * Enum NONE for value: "None"
         */
        public static final HostExtendPathEnum NONE = new HostExtendPathEnum("None");

        /**
         * Enum PODUID for value: "PodUID"
         */
        public static final HostExtendPathEnum PODUID = new HostExtendPathEnum("PodUID");

        /**
         * Enum PODNAME for value: "PodName"
         */
        public static final HostExtendPathEnum PODNAME = new HostExtendPathEnum("PodName");

        /**
         * Enum PODUID_CONTAINERNAME for value: "PodUID/ContainerName"
         */
        public static final HostExtendPathEnum PODUID_CONTAINERNAME = new HostExtendPathEnum("PodUID/ContainerName");

        /**
         * Enum PODNAME_CONTAINERNAME for value: "PodName/ContainerName"
         */
        public static final HostExtendPathEnum PODNAME_CONTAINERNAME = new HostExtendPathEnum("PodName/ContainerName");

        private static final Map<String, HostExtendPathEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostExtendPathEnum> createStaticFields() {
            Map<String, HostExtendPathEnum> map = new HashMap<>();
            map.put("None", NONE);
            map.put("PodUID", PODUID);
            map.put("PodName", PODNAME);
            map.put("PodUID/ContainerName", PODUID_CONTAINERNAME);
            map.put("PodName/ContainerName", PODNAME_CONTAINERNAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostExtendPathEnum(String value) {
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
        public static HostExtendPathEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            HostExtendPathEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostExtendPathEnum(value);
            }
            return result;
        }

        public static HostExtendPathEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HostExtendPathEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostExtendPathEnum) {
                return this.value.equals(((HostExtendPathEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_extend_path")

    private HostExtendPathEnum hostExtendPath;

    public ComponentLogs withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 容器中日志路径
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public ComponentLogs withRotate(String rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * 日志转储周期
     * @return rotate
     */
    public String getRotate() {
        return rotate;
    }

    public void setRotate(String rotate) {
        this.rotate = rotate;
    }

    public ComponentLogs withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * 挂载的主机路径
     * @return hostPath
     */
    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    public ComponentLogs withHostExtendPath(HostExtendPathEnum hostExtendPath) {
        this.hostExtendPath = hostExtendPath;
        return this;
    }

    /**
     * 主机扩展路径
     * @return hostExtendPath
     */
    public HostExtendPathEnum getHostExtendPath() {
        return hostExtendPath;
    }

    public void setHostExtendPath(HostExtendPathEnum hostExtendPath) {
        this.hostExtendPath = hostExtendPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentLogs componentLogs = (ComponentLogs) o;
        return Objects.equals(this.logPath, componentLogs.logPath) && Objects.equals(this.rotate, componentLogs.rotate)
            && Objects.equals(this.hostPath, componentLogs.hostPath)
            && Objects.equals(this.hostExtendPath, componentLogs.hostExtendPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logPath, rotate, hostPath, hostExtendPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentLogs {\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
        sb.append("    hostExtendPath: ").append(toIndentedString(hostExtendPath)).append("\n");
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
