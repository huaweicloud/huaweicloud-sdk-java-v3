package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TextToImageInference
 */
public class TextToImageInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed")

    private Integer seed;

    /**
     * 生成图片分辨率，限定字符串\"512\\*768\",\"768\\*512\",\"512\\*512\"，默认\"512\\*512\"
     */
    public static final class ResolutionEnum {

        /**
         * Enum _512_768 for value: "512*768"
         */
        public static final ResolutionEnum _512_768 = new ResolutionEnum("512*768");

        /**
         * Enum _768_512 for value: "768*512"
         */
        public static final ResolutionEnum _768_512 = new ResolutionEnum("768*512");

        /**
         * Enum _512_512 for value: "512*512"
         */
        public static final ResolutionEnum _512_512 = new ResolutionEnum("512*512");

        private static final Map<String, ResolutionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResolutionEnum> createStaticFields() {
            Map<String, ResolutionEnum> map = new HashMap<>();
            map.put("512*768", _512_768);
            map.put("768*512", _768_512);
            map.put("512*512", _512_512);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResolutionEnum(String value) {
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
        public static ResolutionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResolutionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResolutionEnum(value);
            }
            return result;
        }

        public static ResolutionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResolutionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResolutionEnum) {
                return this.value.equals(((ResolutionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private ResolutionEnum resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_nums")

    private Integer imageNums;

    public TextToImageInference withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 文生图引导词
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public TextToImageInference withSeed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * 随机数种子
     * minimum: -2147483648
     * maximum: 2147483647
     * @return seed
     */
    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public TextToImageInference withResolution(ResolutionEnum resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 生成图片分辨率，限定字符串\"512\\*768\",\"768\\*512\",\"512\\*512\"，默认\"512\\*512\"
     * @return resolution
     */
    public ResolutionEnum getResolution() {
        return resolution;
    }

    public void setResolution(ResolutionEnum resolution) {
        this.resolution = resolution;
    }

    public TextToImageInference withImageNums(Integer imageNums) {
        this.imageNums = imageNums;
        return this;
    }

    /**
     * 生成图片数量，支持1-4张，默认为1
     * minimum: 1
     * maximum: 4
     * @return imageNums
     */
    public Integer getImageNums() {
        return imageNums;
    }

    public void setImageNums(Integer imageNums) {
        this.imageNums = imageNums;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextToImageInference textToImageInference = (TextToImageInference) o;
        return Objects.equals(this.prompt, textToImageInference.prompt)
            && Objects.equals(this.seed, textToImageInference.seed)
            && Objects.equals(this.resolution, textToImageInference.resolution)
            && Objects.equals(this.imageNums, textToImageInference.imageNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prompt, seed, resolution, imageNums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextToImageInference {\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    imageNums: ").append(toIndentedString(imageNums)).append("\n");
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
