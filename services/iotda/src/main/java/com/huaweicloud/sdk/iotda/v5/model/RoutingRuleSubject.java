package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建或修改规则条件时，指定资源及其范围
 */
public class RoutingRuleSubject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource")
    
    private String resource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private String event;

    public RoutingRuleSubject withResource(String resource) {
        this.resource = resource;
        return this;
    }

    


    /**
     * 资源名称。 - device：设备。 - device.property：设备属性。 - device.message：设备消息。 - device.message.status：设备消息状态。 - device.status：设备状态。 - batchtask：批量任务。 - product：产品。 - device.command.status：设备异步命令状态 
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    

    public RoutingRuleSubject withEvent(String event) {
        this.event = event;
        return this;
    }

    


    /**
     * 资源事件，取值范围：与资源有关，不同的资源，事件不同 event需要与resource关联使用，具体的“resource：event”映射关系如下： - device：create（设备添加） - device：delete（设备删除） - device：update（设备更新） - device.status：update （设备状态变更） - device.property：report（设备属性上报） - device.message：report（设备消息上报） - device.message.status：update（设备消息状态变更） - batchtask：update （批量任务状态变更） - product：create（产品添加） - product：delete（产品删除） - product：update（产品更新） - device.command.status：update（设备异步命令状态更新） 
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoutingRuleSubject routingRuleSubject = (RoutingRuleSubject) o;
        return Objects.equals(this.resource, routingRuleSubject.resource) &&
            Objects.equals(this.event, routingRuleSubject.event);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resource, event);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoutingRuleSubject {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

