package com.huaweicloud.sdk.hss.v5.model;

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
 * 批量操作智能体卫士插件请求结构体
 */
public class BatchRegisterDefenderPluginRequestBody {

    /**
     * **参数解释**: 操作类型 **约束限制**: 必填 **取值范围**: - install：安装 - uninstall：卸载  **默认取值**: 不涉及 
     */
    public static final class OptEnum {

        /**
         * Enum INSTALL for value: "install"
         */
        public static final OptEnum INSTALL = new OptEnum("install");

        /**
         * Enum UNINSTALL for value: "uninstall"
         */
        public static final OptEnum UNINSTALL = new OptEnum("uninstall");

        private static final Map<String, OptEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptEnum> createStaticFields() {
            Map<String, OptEnum> map = new HashMap<>();
            map.put("install", INSTALL);
            map.put("uninstall", UNINSTALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptEnum(String value) {
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
        public static OptEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptEnum(value));
        }

        public static OptEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptEnum) {
                return this.value.equals(((OptEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt")

    private OptEnum opt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    public BatchRegisterDefenderPluginRequestBody withOpt(OptEnum opt) {
        this.opt = opt;
        return this;
    }

    /**
     * **参数解释**: 操作类型 **约束限制**: 必填 **取值范围**: - install：安装 - uninstall：卸载  **默认取值**: 不涉及 
     * @return opt
     */
    public OptEnum getOpt() {
        return opt;
    }

    public void setOpt(OptEnum opt) {
        this.opt = opt;
    }

    public BatchRegisterDefenderPluginRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchRegisterDefenderPluginRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchRegisterDefenderPluginRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**: 智能体实例ID列表 **约束限制**: 必填 **取值范围**: 1-200个实例ID **默认取值**: 不涉及 
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRegisterDefenderPluginRequestBody that = (BatchRegisterDefenderPluginRequestBody) obj;
        return Objects.equals(this.opt, that.opt) && Objects.equals(this.instanceIds, that.instanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opt, instanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRegisterDefenderPluginRequestBody {\n");
        sb.append("    opt: ").append(toIndentedString(opt)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
