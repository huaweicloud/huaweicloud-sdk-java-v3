package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 电源状态： - power on：正常开启电源 - power off：正常关闭电源 - rebooting：重启
 */
public class PowerAction {

    /**
     * 电源操作
     */
    public static final class ActionEnum {

        /**
         * Enum POWER_ON for value: "power on"
         */
        public static final ActionEnum POWER_ON = new ActionEnum("power on");

        /**
         * Enum POWER_OFF for value: "power off"
         */
        public static final ActionEnum POWER_OFF = new ActionEnum("power off");

        /**
         * Enum REBOOTING for value: "rebooting"
         */
        public static final ActionEnum REBOOTING = new ActionEnum("rebooting");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("power on", POWER_ON);
            map.put("power off", POWER_OFF);
            map.put("rebooting", REBOOTING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id_set")

    private List<String> serverIdSet = null;

    public PowerAction withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 电源操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public PowerAction withServerIdSet(List<String> serverIdSet) {
        this.serverIdSet = serverIdSet;
        return this;
    }

    public PowerAction addServerIdSetItem(String serverIdSetItem) {
        if (this.serverIdSet == null) {
            this.serverIdSet = new ArrayList<>();
        }
        this.serverIdSet.add(serverIdSetItem);
        return this;
    }

    public PowerAction withServerIdSet(Consumer<List<String>> serverIdSetSetter) {
        if (this.serverIdSet == null) {
            this.serverIdSet = new ArrayList<>();
        }
        serverIdSetSetter.accept(this.serverIdSet);
        return this;
    }

    /**
     * server id set
     * @return serverIdSet
     */
    public List<String> getServerIdSet() {
        return serverIdSet;
    }

    public void setServerIdSet(List<String> serverIdSet) {
        this.serverIdSet = serverIdSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PowerAction that = (PowerAction) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.serverIdSet, that.serverIdSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, serverIdSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    serverIdSet: ").append(toIndentedString(serverIdSet)).append("\n");
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
