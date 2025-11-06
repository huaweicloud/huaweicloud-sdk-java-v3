package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowRepositoryInheritSettingSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    /**
     * **参数解释：** 设置名称。 **约束限制：** 不涉及。 **取值范围：** - protected_branches，保护分支。 - protected_tags，保护Tag。 **默认取值：** 不涉及。
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

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("protected_branches", PROTECTED_BRANCHES);
            map.put("protected_tags", PROTECTED_TAGS);
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

    public ShowRepositoryInheritSettingSourceRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowRepositoryInheritSettingSourceRequest withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 设置名称。 **约束限制：** 不涉及。 **取值范围：** - protected_branches，保护分支。 - protected_tags，保护Tag。 **默认取值：** 不涉及。
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryInheritSettingSourceRequest that = (ShowRepositoryInheritSettingSourceRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryInheritSettingSourceRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
