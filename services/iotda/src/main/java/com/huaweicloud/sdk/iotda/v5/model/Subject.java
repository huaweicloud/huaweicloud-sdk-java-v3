package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建或修改订阅主题时，指定订阅资源及其范围
 */
public class Subject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource")
    
    private String resource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private String event;

    public Subject withResource(String resource) {
        this.resource = resource;
        return this;
    }

    


    /**
     * 订阅的资源名称。 - device：设备。 - device.data：设备数据。 - device.message.status：设备消息状态。 - device.message：设备消息。 - device.status：设备状态。 - batchtask.status：批量任务状态。 
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Subject withEvent(String event) {
        this.event = event;
        return this;
    }

    


    /**
     * 订阅的资源事件，取值范围：activate、update、up。 event需要与resource关联使用，具体的“resource：event”映射关系如下： - device：activate（设备激活） - device.data：update（设备数据变化） - device.message.status：update（设备消息状态） - device.message：report（设备消息上报） - device.status：update （设备状态变化） - batchtask.status：update （批量任务状态变化） 
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
        Subject subject = (Subject) o;
        return Objects.equals(this.resource, subject.resource) &&
            Objects.equals(this.event, subject.event);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resource, event);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subject {\n");
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

