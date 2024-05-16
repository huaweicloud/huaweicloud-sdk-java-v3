package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlameLineTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<String> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods")

    private List<String> methods = null;

    public ShowFlameLineTreeResponse withData(List<String> data) {
        this.data = data;
        return this;
    }

    public ShowFlameLineTreeResponse addDataItem(String dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ShowFlameLineTreeResponse withData(Consumer<List<String>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 火焰图的数据，是个二维数组 data[0][0]: self time，方法自己消耗的cpu毫秒时间，不包括方法内部调用其他方法的时间 data[0][1]: total time, 方法消耗的cpu毫秒时间，包括方法内部调用其他方法的时间 data[0][2]: 方法的index,对应methods中的数组下标 data[0][3]: 行号 data[0][4]: 方法的子节点，就是方法中调用的其他方法
     * @return data
     */
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public ShowFlameLineTreeResponse withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public ShowFlameLineTreeResponse addMethodsItem(String methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public ShowFlameLineTreeResponse withMethods(Consumer<List<String>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 调用栈上的方法信息，是个二维数组 method[0][0]: 方法的唯一id method[0][1]: 方法的package包名 method[0][2]: 方法的class name 类名 method[0][3]: 方法名 method[0][4]: 方法的参数列表 method[0][5]: 方法是否为用户的方法 method[0][6]: 方法是否为native方法
     * @return methods
     */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlameLineTreeResponse that = (ShowFlameLineTreeResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.methods, that.methods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, methods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlameLineTreeResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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
