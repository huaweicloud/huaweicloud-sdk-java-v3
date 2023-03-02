package com.huaweicloud.sdk.image.v2.model;

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
 * ImageHighresolutionMattingInference
 */
public class ImageHighresolutionMattingInference {

    /**
     * 是否只返回处理结果的alpha通道，\"foreground\"代表返回带alpha通道的前景图片，\"alpha\"字符串代表仅返回alpha通道
     */
    public static final class ReturnTypeEnum {

        /**
         * Enum FOREGROUND for value: "foreground"
         */
        public static final ReturnTypeEnum FOREGROUND = new ReturnTypeEnum("foreground");

        /**
         * Enum ALPHA for value: "alpha"
         */
        public static final ReturnTypeEnum ALPHA = new ReturnTypeEnum("alpha");

        private static final Map<String, ReturnTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReturnTypeEnum> createStaticFields() {
            Map<String, ReturnTypeEnum> map = new HashMap<>();
            map.put("foreground", FOREGROUND);
            map.put("alpha", ALPHA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReturnTypeEnum(String value) {
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
        public static ReturnTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReturnTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReturnTypeEnum(value);
            }
            return result;
        }

        public static ReturnTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReturnTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReturnTypeEnum) {
                return this.value.equals(((ReturnTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_type")

    private ReturnTypeEnum returnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coord")

    private List<Integer> coord = null;

    public ImageHighresolutionMattingInference withReturnType(ReturnTypeEnum returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * 是否只返回处理结果的alpha通道，\"foreground\"代表返回带alpha通道的前景图片，\"alpha\"字符串代表仅返回alpha通道
     * @return returnType
     */
    public ReturnTypeEnum getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnTypeEnum returnType) {
        this.returnType = returnType;
    }

    public ImageHighresolutionMattingInference withCoord(List<Integer> coord) {
        this.coord = coord;
        return this;
    }

    public ImageHighresolutionMattingInference addCoordItem(Integer coordItem) {
        if (this.coord == null) {
            this.coord = new ArrayList<>();
        }
        this.coord.add(coordItem);
        return this;
    }

    public ImageHighresolutionMattingInference withCoord(Consumer<List<Integer>> coordSetter) {
        if (this.coord == null) {
            this.coord = new ArrayList<>();
        }
        coordSetter.accept(this.coord);
        return this;
    }

    /**
     * 指定抠图区域坐标，默认全图，示例：[x_min,y_min,x_max,y_max]
     * @return coord
     */
    public List<Integer> getCoord() {
        return coord;
    }

    public void setCoord(List<Integer> coord) {
        this.coord = coord;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageHighresolutionMattingInference imageHighresolutionMattingInference =
            (ImageHighresolutionMattingInference) o;
        return Objects.equals(this.returnType, imageHighresolutionMattingInference.returnType)
            && Objects.equals(this.coord, imageHighresolutionMattingInference.coord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnType, coord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageHighresolutionMattingInference {\n");
        sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
        sb.append("    coord: ").append(toIndentedString(coord)).append("\n");
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
