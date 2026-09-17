package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 节点池同步场景磁盘配置
 */
public class VolumeConfig {

    /**
     * **参数解释**： 节点重置时磁盘数据的保留策略。 不传或该字段为空时，默认使用reset_managed_volumes策略清空由CCE管理的数据盘。 **约束限制**： 当保留自定义挂载卷时，挂载到指定目录与作为持久存储卷的高级配置不允许修改。 **取值范围**： - reset_managed_volumes：清空由CCE管理的数据盘。 - retain_custom_volumes：保留用户自定义挂载卷（包括挂载到指定目录的卷和用作本地持久卷的卷），集群版本需为v1.29.15-r90、v1.30.14-r90、v1.31.14-r50、v1.32.13-r20、v1.33.12-r0、v1.34.8-r0、v1.35.5-r0、v1.36.1-r10或以上版本。  **默认取值**： reset_managed_volumes
     */
    public static final class VolumeResetPolicyEnum {

        /**
         * Enum RESET_MANAGED_VOLUMES for value: "reset_managed_volumes"
         */
        public static final VolumeResetPolicyEnum RESET_MANAGED_VOLUMES =
            new VolumeResetPolicyEnum("reset_managed_volumes");

        /**
         * Enum RETAIN_CUSTOM_VOLUMES for value: "retain_custom_volumes"
         */
        public static final VolumeResetPolicyEnum RETAIN_CUSTOM_VOLUMES =
            new VolumeResetPolicyEnum("retain_custom_volumes");

        private static final Map<String, VolumeResetPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeResetPolicyEnum> createStaticFields() {
            Map<String, VolumeResetPolicyEnum> map = new HashMap<>();
            map.put("reset_managed_volumes", RESET_MANAGED_VOLUMES);
            map.put("retain_custom_volumes", RETAIN_CUSTOM_VOLUMES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeResetPolicyEnum(String value) {
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
        public static VolumeResetPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VolumeResetPolicyEnum(value));
        }

        public static VolumeResetPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeResetPolicyEnum) {
                return this.value.equals(((VolumeResetPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeResetPolicy")

    private VolumeResetPolicyEnum volumeResetPolicy;

    public VolumeConfig withVolumeResetPolicy(VolumeResetPolicyEnum volumeResetPolicy) {
        this.volumeResetPolicy = volumeResetPolicy;
        return this;
    }

    /**
     * **参数解释**： 节点重置时磁盘数据的保留策略。 不传或该字段为空时，默认使用reset_managed_volumes策略清空由CCE管理的数据盘。 **约束限制**： 当保留自定义挂载卷时，挂载到指定目录与作为持久存储卷的高级配置不允许修改。 **取值范围**： - reset_managed_volumes：清空由CCE管理的数据盘。 - retain_custom_volumes：保留用户自定义挂载卷（包括挂载到指定目录的卷和用作本地持久卷的卷），集群版本需为v1.29.15-r90、v1.30.14-r90、v1.31.14-r50、v1.32.13-r20、v1.33.12-r0、v1.34.8-r0、v1.35.5-r0、v1.36.1-r10或以上版本。  **默认取值**： reset_managed_volumes
     * @return volumeResetPolicy
     */
    public VolumeResetPolicyEnum getVolumeResetPolicy() {
        return volumeResetPolicy;
    }

    public void setVolumeResetPolicy(VolumeResetPolicyEnum volumeResetPolicy) {
        this.volumeResetPolicy = volumeResetPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeConfig that = (VolumeConfig) obj;
        return Objects.equals(this.volumeResetPolicy, that.volumeResetPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeResetPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeConfig {\n");
        sb.append("    volumeResetPolicy: ").append(toIndentedString(volumeResetPolicy)).append("\n");
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
