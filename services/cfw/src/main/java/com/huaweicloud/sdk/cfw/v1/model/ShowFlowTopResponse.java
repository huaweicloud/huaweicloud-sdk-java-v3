package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlowTopResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Map<String, List<ItemVO>> data = null;

    public ShowFlowTopResponse withData(Map<String, List<ItemVO>> data) {
        this.data = data;
        return this;
    }

    public ShowFlowTopResponse putDataItem(String key, List<ItemVO> dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    public ShowFlowTopResponse withData(Consumer<Map<String, List<ItemVO>>> dataSetter) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**： TOP统计信息 **取值范围**： 不涉及
     * @return data
     */
    public Map<String, List<ItemVO>> getData() {
        return data;
    }

    public void setData(Map<String, List<ItemVO>> data) {
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
        ShowFlowTopResponse that = (ShowFlowTopResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlowTopResponse {\n");
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
