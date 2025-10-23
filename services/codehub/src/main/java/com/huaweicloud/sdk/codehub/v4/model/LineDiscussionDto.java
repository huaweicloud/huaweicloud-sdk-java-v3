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
 * 单文件下单侧检视意见详情。
 */
public class LineDiscussionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussions")

    private List<MergeRequestBasicDiscussionDto> discussions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private Integer line;

    /**
     * **参数解释：** 所在的行的类型。 **取值范围：** old: 左侧删除行。 new: 右侧新增行。 unchanged-l: 左侧不变行。 unchanged-r: 右侧不变行。
     */
    public static final class TypeEnum {

        /**
         * Enum OLD for value: "old"
         */
        public static final TypeEnum OLD = new TypeEnum("old");

        /**
         * Enum NEW for value: "new"
         */
        public static final TypeEnum NEW = new TypeEnum("new");

        /**
         * Enum UNCHANGED_L for value: "unchanged-l"
         */
        public static final TypeEnum UNCHANGED_L = new TypeEnum("unchanged-l");

        /**
         * Enum UNCHANGED_R for value: "unchanged-r"
         */
        public static final TypeEnum UNCHANGED_R = new TypeEnum("unchanged-r");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("old", OLD);
            map.put("new", NEW);
            map.put("unchanged-l", UNCHANGED_L);
            map.put("unchanged-r", UNCHANGED_R);
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

    public LineDiscussionDto withDiscussions(List<MergeRequestBasicDiscussionDto> discussions) {
        this.discussions = discussions;
        return this;
    }

    public LineDiscussionDto addDiscussionsItem(MergeRequestBasicDiscussionDto discussionsItem) {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        this.discussions.add(discussionsItem);
        return this;
    }

    public LineDiscussionDto withDiscussions(Consumer<List<MergeRequestBasicDiscussionDto>> discussionsSetter) {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        discussionsSetter.accept(this.discussions);
        return this;
    }

    /**
     * **参数解释：** 位于某一侧某行的检视意见集合。
     * @return discussions
     */
    public List<MergeRequestBasicDiscussionDto> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(List<MergeRequestBasicDiscussionDto> discussions) {
        this.discussions = discussions;
    }

    public LineDiscussionDto withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 所在的行号。
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public LineDiscussionDto withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 所在的行的类型。 **取值范围：** old: 左侧删除行。 new: 右侧新增行。 unchanged-l: 左侧不变行。 unchanged-r: 右侧不变行。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineDiscussionDto that = (LineDiscussionDto) obj;
        return Objects.equals(this.discussions, that.discussions) && Objects.equals(this.line, that.line)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discussions, line, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineDiscussionDto {\n");
        sb.append("    discussions: ").append(toIndentedString(discussions)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
