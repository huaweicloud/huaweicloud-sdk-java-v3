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

/**
 * 视频数据的输入列表，目前只支持以下输入类型，且只支持一路输入，不支持多个OBS文件或URL： - obs：从华为云OBS中读取视频数据。 - url：从指定的URL地址中读取视频数据。 - edgecamera：表示从指定的边缘摄像头读取数据。 - vis：从视频接入服务中读取视频数据。 - edgerestful：表示从客户自定义的流媒体服务器读取数据。 - vcn ：表示从华为云VCN中读取视频数据。 
 */
public class CreateVideoJobReqInput {

    /**
     * 视频数据的输入类型：  obs：表示从华为云OBS中读取视频数据。 url：表示从指定的URL地址中读取视频数据。 edgecamera：表示从指定的边缘摄像头读取数据。 vis：从视频接入服务中读取视频数据。 edgerestful：表示从客户自定义的流媒体服务器读取数据。 vcn ：表示从华为云VCN中读取视频数据。 
     */
    public static final class TypeEnum {

        /**
         * Enum OBS for value: "obs"
         */
        public static final TypeEnum OBS = new TypeEnum("obs");

        /**
         * Enum URL for value: "url"
         */
        public static final TypeEnum URL = new TypeEnum("url");

        /**
         * Enum EDGECAMERA for value: "edgecamera"
         */
        public static final TypeEnum EDGECAMERA = new TypeEnum("edgecamera");

        /**
         * Enum VIS for value: "vis"
         */
        public static final TypeEnum VIS = new TypeEnum("vis");

        /**
         * Enum EDGERESTFUL for value: "edgerestful"
         */
        public static final TypeEnum EDGERESTFUL = new TypeEnum("edgerestful");

        /**
         * Enum VCN for value: "vcn"
         */
        public static final TypeEnum VCN = new TypeEnum("vcn");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("obs", OBS);
            map.put("url", URL);
            map.put("edgecamera", EDGECAMERA);
            map.put("vis", VIS);
            map.put("edgerestful", EDGERESTFUL);
            map.put("vcn", VCN);
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
    @JsonProperty(value = "data")

    private List<InputData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcn")

    private InputVcn vcn;

    public CreateVideoJobReqInput withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 视频数据的输入类型：  obs：表示从华为云OBS中读取视频数据。 url：表示从指定的URL地址中读取视频数据。 edgecamera：表示从指定的边缘摄像头读取数据。 vis：从视频接入服务中读取视频数据。 edgerestful：表示从客户自定义的流媒体服务器读取数据。 vcn ：表示从华为云VCN中读取视频数据。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateVideoJobReqInput withData(List<InputData> data) {
        this.data = data;
        return this;
    }

    public CreateVideoJobReqInput addDataItem(InputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CreateVideoJobReqInput withData(Consumer<List<InputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 数据输入内容
     * @return data
     */
    public List<InputData> getData() {
        return data;
    }

    public void setData(List<InputData> data) {
        this.data = data;
    }

    public CreateVideoJobReqInput withVcn(InputVcn vcn) {
        this.vcn = vcn;
        return this;
    }

    public CreateVideoJobReqInput withVcn(Consumer<InputVcn> vcnSetter) {
        if (this.vcn == null) {
            this.vcn = new InputVcn();
            vcnSetter.accept(this.vcn);
        }

        return this;
    }

    /**
     * Get vcn
     * @return vcn
     */
    public InputVcn getVcn() {
        return vcn;
    }

    public void setVcn(InputVcn vcn) {
        this.vcn = vcn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVideoJobReqInput that = (CreateVideoJobReqInput) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.data, that.data)
            && Objects.equals(this.vcn, that.vcn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data, vcn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoJobReqInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    vcn: ").append(toIndentedString(vcn)).append("\n");
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
