package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 分身数字人在背景图片位置。
 */
public class HumanPosition2D {

    /**
     * 分身数字人在背景图片中的位置。 * LEFT： 左 * MIDDLE： 中 * RIGHT： 右 > 当position_x和position_y参数值存在时，position不生效
     */
    public static final class PositionEnum {

        /**
         * Enum LEFT for value: "LEFT"
         */
        public static final PositionEnum LEFT = new PositionEnum("LEFT");

        /**
         * Enum MIDDLE for value: "MIDDLE"
         */
        public static final PositionEnum MIDDLE = new PositionEnum("MIDDLE");

        /**
         * Enum RIGHT for value: "RIGHT"
         */
        public static final PositionEnum RIGHT = new PositionEnum("RIGHT");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("LEFT", LEFT);
            map.put("MIDDLE", MIDDLE);
            map.put("RIGHT", RIGHT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
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
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PositionEnum(value));
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionEnum position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_x")

    private Integer positionX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_y")

    private Integer positionY;

    public HumanPosition2D withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 分身数字人在背景图片中的位置。 * LEFT： 左 * MIDDLE： 中 * RIGHT： 右 > 当position_x和position_y参数值存在时，position不生效
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public HumanPosition2D withPositionX(Integer positionX) {
        this.positionX = positionX;
        return this;
    }

    /**
     * 分身数字人X轴位置，即分身数字图片底边中心点像素的X轴的像素值。 > 横屏（16:9）背景图片像素为1920*1080；竖屏（9:16）背景图片像素为1080*1920。
     * minimum: -1920
     * maximum: 3840
     * @return positionX
     */
    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public HumanPosition2D withPositionY(Integer positionY) {
        this.positionY = positionY;
        return this;
    }

    /**
     * 分身数字Y轴位置，即分身数字图片底边中心点像素的Y轴的像素值。 > 横屏（16:9）背景图片像素为1920*1080；竖屏（9:16）背景图片像素为1080*1920。
     * minimum: -1920
     * maximum: 3840
     * @return positionY
     */
    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HumanPosition2D that = (HumanPosition2D) obj;
        return Objects.equals(this.position, that.position) && Objects.equals(this.positionX, that.positionX)
            && Objects.equals(this.positionY, that.positionY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, positionX, positionY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HumanPosition2D {\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
        sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
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
