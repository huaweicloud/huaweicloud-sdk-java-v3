package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RepositoryInheritSettingDto
 */
public class RepositoryInheritSettingDto {

    /**
     * **参数解释：** 设置源类型。 **取值范围：** - protected_branches，保护分支设置。 - protected_tags，保护Tag设置。 - repository_settings，仓库设置。 - push_rules，提交规则设置。 - merge_requests，合并请求设置。 - e2e_settings，E2E设置。 - watermark，水印设置。
     */
    public static final class NameEnum {

        /**
         * Enum PROTECTED_BRANCHES for value: "protected_branches"
         */
        public static final NameEnum PROTECTED_BRANCHES = new NameEnum("protected_branches");

        /**
         * Enum PROTECTED_TAGS for value: "protected_tags"
         */
        public static final NameEnum PROTECTED_TAGS = new NameEnum("protected_tags");

        /**
         * Enum REPOSITORY_SETTINGS for value: "repository_settings"
         */
        public static final NameEnum REPOSITORY_SETTINGS = new NameEnum("repository_settings");

        /**
         * Enum PUSH_RULES for value: "push_rules"
         */
        public static final NameEnum PUSH_RULES = new NameEnum("push_rules");

        /**
         * Enum MERGE_REQUESTS for value: "merge_requests"
         */
        public static final NameEnum MERGE_REQUESTS = new NameEnum("merge_requests");

        /**
         * Enum E2E_SETTINGS for value: "e2e_settings"
         */
        public static final NameEnum E2E_SETTINGS = new NameEnum("e2e_settings");

        /**
         * Enum WATERMARK for value: "watermark"
         */
        public static final NameEnum WATERMARK = new NameEnum("watermark");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("protected_branches", PROTECTED_BRANCHES);
            map.put("protected_tags", PROTECTED_TAGS);
            map.put("repository_settings", REPOSITORY_SETTINGS);
            map.put("push_rules", PUSH_RULES);
            map.put("merge_requests", MERGE_REQUESTS);
            map.put("e2e_settings", E2E_SETTINGS);
            map.put("watermark", WATERMARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    /**
     * **参数解释：** 继承设置。 **取值范围：** - inherit，继承上级配置。 - custom，使用当前仓库配置。 - force_inherit，强制继承上级配置。
     */
    public static final class InheritModEnum {

        /**
         * Enum INHERIT for value: "inherit"
         */
        public static final InheritModEnum INHERIT = new InheritModEnum("inherit");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final InheritModEnum CUSTOM = new InheritModEnum("custom");

        /**
         * Enum FORCE_INHERIT for value: "force_inherit"
         */
        public static final InheritModEnum FORCE_INHERIT = new InheritModEnum("force_inherit");

        private static final Map<String, InheritModEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InheritModEnum> createStaticFields() {
            Map<String, InheritModEnum> map = new HashMap<>();
            map.put("inherit", INHERIT);
            map.put("custom", CUSTOM);
            map.put("force_inherit", FORCE_INHERIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InheritModEnum(String value) {
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
        public static InheritModEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InheritModEnum(value));
        }

        public static InheritModEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InheritModEnum) {
                return this.value.equals(((InheritModEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_mod")

    private InheritModEnum inheritMod;

    public RepositoryInheritSettingDto withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 设置源类型。 **取值范围：** - protected_branches，保护分支设置。 - protected_tags，保护Tag设置。 - repository_settings，仓库设置。 - push_rules，提交规则设置。 - merge_requests，合并请求设置。 - e2e_settings，E2E设置。 - watermark，水印设置。
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public RepositoryInheritSettingDto withInheritMod(InheritModEnum inheritMod) {
        this.inheritMod = inheritMod;
        return this;
    }

    /**
     * **参数解释：** 继承设置。 **取值范围：** - inherit，继承上级配置。 - custom，使用当前仓库配置。 - force_inherit，强制继承上级配置。
     * @return inheritMod
     */
    public InheritModEnum getInheritMod() {
        return inheritMod;
    }

    public void setInheritMod(InheritModEnum inheritMod) {
        this.inheritMod = inheritMod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryInheritSettingDto that = (RepositoryInheritSettingDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.inheritMod, that.inheritMod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inheritMod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryInheritSettingDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inheritMod: ").append(toIndentedString(inheritMod)).append("\n");
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
