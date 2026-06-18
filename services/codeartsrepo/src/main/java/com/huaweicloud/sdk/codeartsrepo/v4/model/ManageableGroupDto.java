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
 * ManageableGroupDto
 */
public class ManageableGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    /**
     * **参数解释：** 可见性。 **取值范围：** private public。
     */
    public static final class VisibilityEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("public");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("private");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    public ManageableGroupDto withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * **参数解释：** 代码组全名。
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ManageableGroupDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 代码组id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ManageableGroupDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代码组名。 **取值范围：** 字符串长度不少于0，不超过256。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManageableGroupDto withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * **参数解释：** 全路径。 **取值范围：** 字符串长度不少于0，不超过1000。
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public ManageableGroupDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 路径。 **取值范围：** 字符串长度不少于0，不超过1000。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ManageableGroupDto withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 可见性。 **取值范围：** private public。
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManageableGroupDto that = (ManageableGroupDto) obj;
        return Objects.equals(this.fullName, that.fullName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.path, that.path) && Objects.equals(this.visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, name, fullPath, path, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManageableGroupDto {\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
