package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AreaTimeValue
 */
public class AreaTimeValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<TimeValue> data = null;

    public AreaTimeValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 各个大区下的具体省份、区域、国家的名称。  中国内地返回结果为省份/直辖市的中文名称，比如：广东、上海； 海外大区下的地区/国家对应关系请参考[地区/国家代码对照表](live_03_0049.xml)。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaTimeValue withData(List<TimeValue> data) {
        this.data = data;
        return this;
    }

    public AreaTimeValue addDataItem(TimeValue dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public AreaTimeValue withData(Consumer<List<TimeValue>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 当前时间返回指定指标的值
     * @return data
     */
    public List<TimeValue> getData() {
        return data;
    }

    public void setData(List<TimeValue> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AreaTimeValue that = (AreaTimeValue) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaTimeValue {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
