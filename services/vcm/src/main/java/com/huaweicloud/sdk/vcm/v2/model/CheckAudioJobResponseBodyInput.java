package com.huaweicloud.sdk.vcm.v2.model;

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

/** 音频数据的输入列表 */
public class CheckAudioJobResponseBodyInput {

    /** 视频数据的输入类型： - obs：表示从华为云 OBS 中读取视频数据。 - url：表示从指定的 URL 地址中读取视频数据。 */
    public static final class TypeEnum {

        /** Enum OBS for value: "obs" */
        public static final TypeEnum OBS = new TypeEnum("obs");

        /** Enum URL for value: "url" */
        public static final TypeEnum URL = new TypeEnum("url");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("obs", OBS);
            map.put("url", URL);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "data")

    private List<AudioInputData> data = null;

    public CheckAudioJobResponseBodyInput withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 视频数据的输入类型： - obs：表示从华为云 OBS 中读取视频数据。 - url：表示从指定的 URL 地址中读取视频数据。
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CheckAudioJobResponseBodyInput withData(List<AudioInputData> data) {
        this.data = data;
        return this;
    }

    public CheckAudioJobResponseBodyInput addDataItem(AudioInputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CheckAudioJobResponseBodyInput withData(Consumer<List<AudioInputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** 数据输入内容
     * 
     * @return data */
    public List<AudioInputData> getData() {
        return data;
    }

    public void setData(List<AudioInputData> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckAudioJobResponseBodyInput checkAudioJobResponseBodyInput = (CheckAudioJobResponseBodyInput) o;
        return Objects.equals(this.type, checkAudioJobResponseBodyInput.type)
            && Objects.equals(this.data, checkAudioJobResponseBodyInput.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAudioJobResponseBodyInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
