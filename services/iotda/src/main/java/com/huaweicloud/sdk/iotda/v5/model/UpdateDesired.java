package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改设备影子预期数据结构体。
 */
public class UpdateDesired  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desired")
    
    private Object desired;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private Long version;

    public UpdateDesired withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * **参数说明**：设备的服务ID，在设备关联的产品模型中定义。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    

    public UpdateDesired withDesired(Object desired) {
        this.desired = desired;
        return this;
    }

    


    /**
     * **参数说明**：设备影子期望属性数据，Json格式，里面是一个个键值对，每个键都是产品模型中属性的参数名(property_name)，目前如样例所示只支持一层结构；如果想要删除整个desired可以填写空Object(例如\"desired\":{})，如果想要删除某一个属性期望值可以将属性置位null(例如{\"temperature\":null})
     * @return desired
     */
    public Object getDesired() {
        return desired;
    }

    public void setDesired(Object desired) {
        this.desired = desired;
    }

    

    public UpdateDesired withVersion(Long version) {
        this.version = version;
        return this;
    }

    


    /**
     * **参数说明**：设备影子的版本，携带该参数时平台会校验值必须等于当前影子版本，初始从0开始。
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDesired updateDesired = (UpdateDesired) o;
        return Objects.equals(this.serviceId, updateDesired.serviceId) &&
            Objects.equals(this.desired, updateDesired.desired) &&
            Objects.equals(this.version, updateDesired.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, desired, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesired {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

