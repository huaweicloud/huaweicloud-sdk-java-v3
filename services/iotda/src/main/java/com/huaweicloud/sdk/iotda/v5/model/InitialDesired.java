package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设备初始配置数据结构体。
 */
public class InitialDesired  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desired")
    
    private Object desired = null;

    public InitialDesired withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 设备的服务ID，在设备关联的产品模型中定义。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public InitialDesired withDesired(Object desired) {
        this.desired = desired;
        return this;
    }

    


    /**
     * 设备初始配置属性数据，Json格式，里面是一个个键值对，每个键都是产品模型中属性的参数名(property_name)，目前如样例所示只支持一层结构；这里设置的属性值与产品中对应属性的默认值比对，如果不同，则将以该字段中设置的属性值为准写入到设备影子中；如果想要删除整个desired可以填写空object(例如\"desired\":{})，如果想要删除某一个属性期望值可以将属性置位null(例如{\"temperature\":null})
     * @return desired
     */
    public Object getDesired() {
        return desired;
    }

    public void setDesired(Object desired) {
        this.desired = desired;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InitialDesired initialDesired = (InitialDesired) o;
        return Objects.equals(this.serviceId, initialDesired.serviceId) &&
            Objects.equals(this.desired, initialDesired.desired);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, desired);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InitialDesired {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
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

