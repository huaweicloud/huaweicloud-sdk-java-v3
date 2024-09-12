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
 * 自动扣绿时，不抠图的区域。
 */
public class VerifyVideoMattingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * 资源操作类型。 * RESERVED: 保留区域 * DELETE：删除区域 * NO_DEGREEN：无区域
     */
    public static final class MethodEnum {

        /**
         * Enum RESERVED for value: "RESERVED"
         */
        public static final MethodEnum RESERVED = new MethodEnum("RESERVED");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final MethodEnum DELETE = new MethodEnum("DELETE");

        /**
         * Enum NO_DEGREEN for value: "NO_DEGREEN"
         */
        public static final MethodEnum NO_DEGREEN = new MethodEnum("NO_DEGREEN");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("RESERVED", RESERVED);
            map.put("DELETE", DELETE);
            map.put("NO_DEGREEN", NO_DEGREEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodEnum(value));
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MethodEnum method;

    public VerifyVideoMattingInfo withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 区域左上角像素点的X轴位置值。
     * minimum: 0
     * maximum: 3840
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public VerifyVideoMattingInfo withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 区域左上角像素点的Y轴位置值。
     * minimum: 0
     * maximum: 3840
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public VerifyVideoMattingInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 区域宽度像素值。
     * minimum: 1
     * maximum: 7680
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VerifyVideoMattingInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 区域高度像素值。
     * minimum: 1
     * maximum: 7680
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VerifyVideoMattingInfo withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * 资源操作类型。 * RESERVED: 保留区域 * DELETE：删除区域 * NO_DEGREEN：无区域
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyVideoMattingInfo that = (VerifyVideoMattingInfo) obj;
        return Objects.equals(this.dx, that.dx) && Objects.equals(this.dy, that.dy)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.method, that.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, width, height, method);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyVideoMattingInfo {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
