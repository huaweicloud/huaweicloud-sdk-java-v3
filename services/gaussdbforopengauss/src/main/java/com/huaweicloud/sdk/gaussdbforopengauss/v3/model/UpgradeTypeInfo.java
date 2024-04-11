package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * 升级类型信息
 */
public class UpgradeTypeInfo {

    /**
     * 升级类型,grey=灰度升级,inplace=就地升级,hotfix=热补丁升级
     */
    public static final class UpgradeTypeEnum {

        /**
         * Enum GREY for value: "grey"
         */
        public static final UpgradeTypeEnum GREY = new UpgradeTypeEnum("grey");

        /**
         * Enum INPLACE for value: "inplace"
         */
        public static final UpgradeTypeEnum INPLACE = new UpgradeTypeEnum("inplace");

        /**
         * Enum HOTFIX for value: "hotfix"
         */
        public static final UpgradeTypeEnum HOTFIX = new UpgradeTypeEnum("hotfix");

        private static final Map<String, UpgradeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpgradeTypeEnum> createStaticFields() {
            Map<String, UpgradeTypeEnum> map = new HashMap<>();
            map.put("grey", GREY);
            map.put("inplace", INPLACE);
            map.put("hotfix", HOTFIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpgradeTypeEnum(String value) {
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
        public static UpgradeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeTypeEnum(value));
        }

        public static UpgradeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradeTypeEnum) {
                return this.value.equals(((UpgradeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_type")

    private UpgradeTypeEnum upgradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_action_list")

    private List<UpgradeActionInfo> upgradeActionList = null;

    public UpgradeTypeInfo withUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * 升级类型,grey=灰度升级,inplace=就地升级,hotfix=热补丁升级
     * @return upgradeType
     */
    public UpgradeTypeEnum getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(UpgradeTypeEnum upgradeType) {
        this.upgradeType = upgradeType;
    }

    public UpgradeTypeInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 可用，不可用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpgradeTypeInfo withUpgradeActionList(List<UpgradeActionInfo> upgradeActionList) {
        this.upgradeActionList = upgradeActionList;
        return this;
    }

    public UpgradeTypeInfo addUpgradeActionListItem(UpgradeActionInfo upgradeActionListItem) {
        if (this.upgradeActionList == null) {
            this.upgradeActionList = new ArrayList<>();
        }
        this.upgradeActionList.add(upgradeActionListItem);
        return this;
    }

    public UpgradeTypeInfo withUpgradeActionList(Consumer<List<UpgradeActionInfo>> upgradeActionListSetter) {
        if (this.upgradeActionList == null) {
            this.upgradeActionList = new ArrayList<>();
        }
        upgradeActionListSetter.accept(this.upgradeActionList);
        return this;
    }

    /**
     * 升级操作列表
     * @return upgradeActionList
     */
    public List<UpgradeActionInfo> getUpgradeActionList() {
        return upgradeActionList;
    }

    public void setUpgradeActionList(List<UpgradeActionInfo> upgradeActionList) {
        this.upgradeActionList = upgradeActionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeTypeInfo that = (UpgradeTypeInfo) obj;
        return Objects.equals(this.upgradeType, that.upgradeType) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.upgradeActionList, that.upgradeActionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeType, enable, upgradeActionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeTypeInfo {\n");
        sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    upgradeActionList: ").append(toIndentedString(upgradeActionList)).append("\n");
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
