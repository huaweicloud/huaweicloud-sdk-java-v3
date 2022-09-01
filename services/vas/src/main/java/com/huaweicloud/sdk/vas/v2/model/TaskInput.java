package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的输入配置，必填。
 */
public class TaskInput {

    /**
     * 作业的输入类型，必填。可选类型有obs（对象存储服务存储的文件），vis（视频接入服务的视频流），url（指定的文件地址或取流地址），edgecamera（绑定在IEF的边缘摄像头），edgerestful（从自定义的流媒体服务器通过Restful接口获取取流地址），vcn（VCN设备）。
     */
    public static final class TypeEnum {

        /**
         * Enum OBS for value: "obs"
         */
        public static final TypeEnum OBS = new TypeEnum("obs");

        /**
         * Enum VIS for value: "vis"
         */
        public static final TypeEnum VIS = new TypeEnum("vis");

        /**
         * Enum URL for value: "url"
         */
        public static final TypeEnum URL = new TypeEnum("url");

        /**
         * Enum EDGECAMERA for value: "edgecamera"
         */
        public static final TypeEnum EDGECAMERA = new TypeEnum("edgecamera");

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
            map.put("vis", VIS);
            map.put("url", URL);
            map.put("edgecamera", EDGECAMERA);
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private List<TaskInputData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcn")

    @JacksonXmlProperty(localName = "vcn")

    private TaskInputVcn vcn;

    public TaskInput withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 作业的输入类型，必填。可选类型有obs（对象存储服务存储的文件），vis（视频接入服务的视频流），url（指定的文件地址或取流地址），edgecamera（绑定在IEF的边缘摄像头），edgerestful（从自定义的流媒体服务器通过Restful接口获取取流地址），vcn（VCN设备）。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TaskInput withData(List<TaskInputData> data) {
        this.data = data;
        return this;
    }

    public TaskInput addDataItem(TaskInputData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public TaskInput withData(Consumer<List<TaskInputData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 作业的输入详情，必填。针对不同的输入类型有不同的配置。创建时允许填写多路输入，但更新时只允许填写一路输入。
     * @return data
     */
    public List<TaskInputData> getData() {
        return data;
    }

    public void setData(List<TaskInputData> data) {
        this.data = data;
    }

    public TaskInput withVcn(TaskInputVcn vcn) {
        this.vcn = vcn;
        return this;
    }

    public TaskInput withVcn(Consumer<TaskInputVcn> vcnSetter) {
        if (this.vcn == null) {
            this.vcn = new TaskInputVcn();
            vcnSetter.accept(this.vcn);
        }

        return this;
    }

    /**
     * Get vcn
     * @return vcn
     */
    public TaskInputVcn getVcn() {
        return vcn;
    }

    public void setVcn(TaskInputVcn vcn) {
        this.vcn = vcn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInput taskInput = (TaskInput) o;
        return Objects.equals(this.type, taskInput.type) && Objects.equals(this.data, taskInput.data)
            && Objects.equals(this.vcn, taskInput.vcn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data, vcn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInput {\n");
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
