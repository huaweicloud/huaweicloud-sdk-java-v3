package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.QueryMetricItemOptionParam;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 指标查询参数详情。
 */
public class MetricAPIQueryItemParam  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inventoryId")
    

    private String inventoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metricItems")
    
    private List<QueryMetricItemOptionParam> metricItems = null;
    
    public MetricAPIQueryItemParam withInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    


    /**
     * 资源编号,格式为resType_resId。其中resType部分的枚举值为：host, application, instance, container, process, network, storage, volume。当URI参数中的type取值为“inventory”时，通过该参数查询关联的指标，不再使用metricItems数组中的信息。
     * @return inventoryId
     */
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    

    public MetricAPIQueryItemParam withMetricItems(List<QueryMetricItemOptionParam> metricItems) {
        this.metricItems = metricItems;
        return this;
    }

    
    public MetricAPIQueryItemParam addMetricItemsItem(QueryMetricItemOptionParam metricItemsItem) {
        if(this.metricItems == null) {
            this.metricItems = new ArrayList<>();
        }
        this.metricItems.add(metricItemsItem);
        return this;
    }

    public MetricAPIQueryItemParam withMetricItems(Consumer<List<QueryMetricItemOptionParam>> metricItemsSetter) {
        if(this.metricItems == null) {
            this.metricItems = new ArrayList<>();
        }
        metricItemsSetter.accept(this.metricItems);
        return this;
    }

    /**
     * 当URI参数中的type取值不为“inventory”时，就通过该数组传递的参数信息进行指标查询。
     * @return metricItems
     */
    public List<QueryMetricItemOptionParam> getMetricItems() {
        return metricItems;
    }

    public void setMetricItems(List<QueryMetricItemOptionParam> metricItems) {
        this.metricItems = metricItems;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricAPIQueryItemParam metricAPIQueryItemParam = (MetricAPIQueryItemParam) o;
        return Objects.equals(this.inventoryId, metricAPIQueryItemParam.inventoryId) &&
            Objects.equals(this.metricItems, metricAPIQueryItemParam.metricItems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, metricItems);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricAPIQueryItemParam {\n");
        sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
        sb.append("    metricItems: ").append(toIndentedString(metricItems)).append("\n");
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

