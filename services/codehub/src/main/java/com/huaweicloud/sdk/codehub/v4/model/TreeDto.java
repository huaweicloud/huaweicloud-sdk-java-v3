package com.huaweicloud.sdk.codehub.v4.model;

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
 * TreeDto
 */
public class TreeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 文件结构。 **取值范围：** - commit, 子模块。 - tree, 目录。 - blob, 文件
     */
    public static final class TypeEnum {

        /**
         * Enum COMMIT for value: "commit"
         */
        public static final TypeEnum COMMIT = new TypeEnum("commit");

        /**
         * Enum TREE for value: "tree"
         */
        public static final TypeEnum TREE = new TypeEnum("tree");

        /**
         * Enum BLOB for value: "blob"
         */
        public static final TypeEnum BLOB = new TypeEnum("blob");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("commit", COMMIT);
            map.put("tree", TREE);
            map.put("blob", BLOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isShownDropDown")

    private Boolean isShownDropDown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder")

    private Boolean folder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<TreeDto> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_link")

    private String submoduleLink;

    public TreeDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 提交ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TreeDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 文件名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeDto withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 文件结构。 **取值范围：** - commit, 子模块。 - tree, 目录。 - blob, 文件
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TreeDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 不涉及
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TreeDto withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：** 当前所在目录层级。 **取值范围：** 不涉及
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public TreeDto withIsShownDropDown(Boolean isShownDropDown) {
        this.isShownDropDown = isShownDropDown;
        return this;
    }

    /**
     * **参数解释：** 是否下拉。 **取值范围：** - false, 不下拉。 - true, 下拉
     * @return isShownDropDown
     */
    public Boolean getIsShownDropDown() {
        return isShownDropDown;
    }

    public void setIsShownDropDown(Boolean isShownDropDown) {
        this.isShownDropDown = isShownDropDown;
    }

    public TreeDto withFolder(Boolean folder) {
        this.folder = folder;
        return this;
    }

    /**
     * **参数解释：** 是否折叠。 **取值范围：** - false, 不折叠。 - true, 折叠。
     * @return folder
     */
    public Boolean getFolder() {
        return folder;
    }

    public void setFolder(Boolean folder) {
        this.folder = folder;
    }

    public TreeDto withChildren(List<TreeDto> children) {
        this.children = children;
        return this;
    }

    public TreeDto addChildrenItem(TreeDto childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public TreeDto withChildren(Consumer<List<TreeDto>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子节点
     * @return children
     */
    public List<TreeDto> getChildren() {
        return children;
    }

    public void setChildren(List<TreeDto> children) {
        this.children = children;
    }

    public TreeDto withSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
        return this;
    }

    /**
     * **参数解释：** 子模块连接。 **取值范围：** 不涉及。
     * @return submoduleLink
     */
    public String getSubmoduleLink() {
        return submoduleLink;
    }

    public void setSubmoduleLink(String submoduleLink) {
        this.submoduleLink = submoduleLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TreeDto that = (TreeDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.path, that.path)
            && Objects.equals(this.level, that.level) && Objects.equals(this.isShownDropDown, that.isShownDropDown)
            && Objects.equals(this.folder, that.folder) && Objects.equals(this.children, that.children)
            && Objects.equals(this.submoduleLink, that.submoduleLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, path, level, isShownDropDown, folder, children, submoduleLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TreeDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    isShownDropDown: ").append(toIndentedString(isShownDropDown)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    submoduleLink: ").append(toIndentedString(submoduleLink)).append("\n");
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
