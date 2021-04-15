package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.PropertyFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 条件中设备数据类型的信息，自定义结构。
 */
public class DeviceDataCondition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filters")
    
    private List<PropertyFilter> filters = null;
    
    public DeviceDataCondition withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备ID，用于唯一标识一个设备，在注册设备时由物联网平台分配获得。当rule_type为DEVICE_LINKAGE时，该参数值和product_id不能同时为空。如果该参数和product_id同时存在时，以该参数值对应的设备进行条件过滤。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public DeviceDataCondition withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。当rule_type为DEVICE_LINKAGE时，该参数值和device_id不能同时为空。如果该参数和device_id同时存在时，以device_id参数值对应的设备进行条件过滤。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public DeviceDataCondition withFilters(List<PropertyFilter> filters) {
        this.filters = filters;
        return this;
    }

    
    public DeviceDataCondition addFiltersItem(PropertyFilter filtersItem) {
        if(this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public DeviceDataCondition withFilters(Consumer<List<PropertyFilter>> filtersSetter) {
        if(this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 数据过滤条件
     * @return filters
     */
    public List<PropertyFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<PropertyFilter> filters) {
        this.filters = filters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceDataCondition deviceDataCondition = (DeviceDataCondition) o;
        return Objects.equals(this.deviceId, deviceDataCondition.deviceId) &&
            Objects.equals(this.productId, deviceDataCondition.productId) &&
            Objects.equals(this.filters, deviceDataCondition.filters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, productId, filters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceDataCondition {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

