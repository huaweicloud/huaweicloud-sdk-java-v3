package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 标注配置项对象，用于定义标签的具体枚举值及其显示名称。 **取值范围：** 不涉及。
 */
public class OpsLabelValueItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value_name")

    private String tagValueName;

    /**
     * **参数解释：** 标签项状态。 **约束限制：** 可选，必须为枚举值之一。 **取值范围：** - ACTIVE：启用 - INACTIVE：停用 **默认取值：** ACTIVE（不传默认为启用）。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    public OpsLabelValueItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 标签值的唯一标识符（ID）。 **约束限制：** 字符串长度0-100。 **取值范围：** 字符长度0-100。 **默认值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsLabelValueItem withTagValueName(String tagValueName) {
        this.tagValueName = tagValueName;
        return this;
    }

    /**
     * **参数解释：** 标签面向用户展示的名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagValueName
     */
    public String getTagValueName() {
        return tagValueName;
    }

    public void setTagValueName(String tagValueName) {
        this.tagValueName = tagValueName;
    }

    public OpsLabelValueItem withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 标签项状态。 **约束限制：** 可选，必须为枚举值之一。 **取值范围：** - ACTIVE：启用 - INACTIVE：停用 **默认取值：** ACTIVE（不传默认为启用）。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OpsLabelValueItem withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释：** 标签项展示颜色。 **约束限制：** 不涉及。 **取值范围：** 0~1000。 **默认取值：** 不涉及。
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public OpsLabelValueItem withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释：** 标签项排序序号，数值越小展示越靠前（按升序排列）。 **约束限制：** 可选，非负整数。 **取值范围：** 0~10000。 **默认取值：** 0（不传时默认为0，按添加顺序展示）。
     * minimum: 0
     * maximum: 10000
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsLabelValueItem that = (OpsLabelValueItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tagValueName, that.tagValueName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.color, that.color)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagValueName, status, color, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsLabelValueItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tagValueName: ").append(toIndentedString(tagValueName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
