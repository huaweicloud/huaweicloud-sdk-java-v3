package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ServiceCommandPara;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 事件服务对象。
 */
public class ServiceEvent  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_type")
    
    private String eventType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paras")
    
    private List<ServiceCommandPara> paras = null;
    
    public ServiceEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    


    /**
     * 设备事件类型。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    

    public ServiceEvent withParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
        return this;
    }

    
    public ServiceEvent addParasItem(ServiceCommandPara parasItem) {
        this.paras.add(parasItem);
        return this;
    }

    public ServiceEvent withParas(Consumer<List<ServiceCommandPara>> parasSetter) {
        if(this.paras == null ){
            this.paras = new ArrayList<>();
        }
        parasSetter.accept(this.paras);
        return this;
    }

    /**
     * 设备事件的参数列表。
     * @return paras
     */
    public List<ServiceCommandPara> getParas() {
        return paras;
    }

    public void setParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceEvent serviceEvent = (ServiceEvent) o;
        return Objects.equals(this.eventType, serviceEvent.eventType) &&
            Objects.equals(this.paras, serviceEvent.paras);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eventType, paras);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceEvent {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
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

