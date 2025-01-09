package com.huaweicloud.sdk.workspace.v2.model;

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
 * UpdateSubnetBandwidthControlListReq
 */
public class UpdateSubnetBandwidthControlListReq {

    /**
     * 控制模式 - BLACK：黑名单控制。 - WHITE：白名单控制。
     */
    public static final class ControlModeEnum {

        /**
         * Enum BLACK for value: "BLACK"
         */
        public static final ControlModeEnum BLACK = new ControlModeEnum("BLACK");

        /**
         * Enum WHITE for value: "WHITE"
         */
        public static final ControlModeEnum WHITE = new ControlModeEnum("WHITE");

        private static final Map<String, ControlModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ControlModeEnum> createStaticFields() {
            Map<String, ControlModeEnum> map = new HashMap<>();
            map.put("BLACK", BLACK);
            map.put("WHITE", WHITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ControlModeEnum(String value) {
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
        public static ControlModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ControlModeEnum(value));
        }

        public static ControlModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ControlModeEnum) {
                return this.value.equals(((ControlModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_mode")

    private ControlModeEnum controlMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_control_list")

    private List<String> addControlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_control_list")

    private List<String> removeControlList = null;

    public UpdateSubnetBandwidthControlListReq withControlMode(ControlModeEnum controlMode) {
        this.controlMode = controlMode;
        return this;
    }

    /**
     * 控制模式 - BLACK：黑名单控制。 - WHITE：白名单控制。
     * @return controlMode
     */
    public ControlModeEnum getControlMode() {
        return controlMode;
    }

    public void setControlMode(ControlModeEnum controlMode) {
        this.controlMode = controlMode;
    }

    public UpdateSubnetBandwidthControlListReq withAddControlList(List<String> addControlList) {
        this.addControlList = addControlList;
        return this;
    }

    public UpdateSubnetBandwidthControlListReq addAddControlListItem(String addControlListItem) {
        if (this.addControlList == null) {
            this.addControlList = new ArrayList<>();
        }
        this.addControlList.add(addControlListItem);
        return this;
    }

    public UpdateSubnetBandwidthControlListReq withAddControlList(Consumer<List<String>> addControlListSetter) {
        if (this.addControlList == null) {
            this.addControlList = new ArrayList<>();
        }
        addControlListSetter.accept(this.addControlList);
        return this;
    }

    /**
     * 待添加的桌面。
     * @return addControlList
     */
    public List<String> getAddControlList() {
        return addControlList;
    }

    public void setAddControlList(List<String> addControlList) {
        this.addControlList = addControlList;
    }

    public UpdateSubnetBandwidthControlListReq withRemoveControlList(List<String> removeControlList) {
        this.removeControlList = removeControlList;
        return this;
    }

    public UpdateSubnetBandwidthControlListReq addRemoveControlListItem(String removeControlListItem) {
        if (this.removeControlList == null) {
            this.removeControlList = new ArrayList<>();
        }
        this.removeControlList.add(removeControlListItem);
        return this;
    }

    public UpdateSubnetBandwidthControlListReq withRemoveControlList(Consumer<List<String>> removeControlListSetter) {
        if (this.removeControlList == null) {
            this.removeControlList = new ArrayList<>();
        }
        removeControlListSetter.accept(this.removeControlList);
        return this;
    }

    /**
     * 待删除的桌面。
     * @return removeControlList
     */
    public List<String> getRemoveControlList() {
        return removeControlList;
    }

    public void setRemoveControlList(List<String> removeControlList) {
        this.removeControlList = removeControlList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSubnetBandwidthControlListReq that = (UpdateSubnetBandwidthControlListReq) obj;
        return Objects.equals(this.controlMode, that.controlMode)
            && Objects.equals(this.addControlList, that.addControlList)
            && Objects.equals(this.removeControlList, that.removeControlList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlMode, addControlList, removeControlList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetBandwidthControlListReq {\n");
        sb.append("    controlMode: ").append(toIndentedString(controlMode)).append("\n");
        sb.append("    addControlList: ").append(toIndentedString(addControlList)).append("\n");
        sb.append("    removeControlList: ").append(toIndentedString(removeControlList)).append("\n");
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
