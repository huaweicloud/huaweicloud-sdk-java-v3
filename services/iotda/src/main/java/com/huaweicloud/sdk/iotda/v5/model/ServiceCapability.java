package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ServiceCapability结构体。 */
public class ServiceCapability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<ServiceProperty> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<ServiceCommand> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<ServiceEvent> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private String option;

    public ServiceCapability withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /** **参数说明**：设备的服务ID。注：产品内不允许重复。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_?'#().,&%@!-$等字符的组合。
     * 
     * @return serviceId */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ServiceCapability withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /** **参数说明**：设备的服务类型。 **取值范围**：长度不超过32，只允许中文、字母、数字、以及_?'#().,&%@!-$等字符的组合。
     * 
     * @return serviceType */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceCapability withProperties(List<ServiceProperty> properties) {
        this.properties = properties;
        return this;
    }

    public ServiceCapability addPropertiesItem(ServiceProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ServiceCapability withProperties(Consumer<List<ServiceProperty>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** **参数说明**：设备服务支持的属性列表。 **取值范围**：数组长度大小不超过500。
     * 
     * @return properties */
    public List<ServiceProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ServiceProperty> properties) {
        this.properties = properties;
    }

    public ServiceCapability withCommands(List<ServiceCommand> commands) {
        this.commands = commands;
        return this;
    }

    public ServiceCapability addCommandsItem(ServiceCommand commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public ServiceCapability withCommands(Consumer<List<ServiceCommand>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /** **参数说明**：设备服务支持的命令列表。 **取值范围**：数组长度大小不超过500。
     * 
     * @return commands */
    public List<ServiceCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<ServiceCommand> commands) {
        this.commands = commands;
    }

    public ServiceCapability withEvents(List<ServiceEvent> events) {
        this.events = events;
        return this;
    }

    public ServiceCapability addEventsItem(ServiceEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ServiceCapability withEvents(Consumer<List<ServiceEvent>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /** **参数说明**：设备服务支持的事件列表。 **取值范围**：数组长度大小不超过500。
     * 
     * @return events */
    public List<ServiceEvent> getEvents() {
        return events;
    }

    public void setEvents(List<ServiceEvent> events) {
        this.events = events;
    }

    public ServiceCapability withDescription(String description) {
        this.description = description;
        return this;
    }

    /** **参数说明**：设备服务的描述信息。 **取值范围**：长度不超过128，只允许中文、字母、数字、空白字符、以及_?'#().,;&%@!- ，、：；。/等字符的组合。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceCapability withOption(String option) {
        this.option = option;
        return this;
    }

    /** **参数说明**：指定设备服务是否必选。目前本字段为非功能性字段，仅起到标识作用。 **取值范围**： - Master：主服务 - Mandatory：必选服务 - Optional：可选服务 默认值为Optional。
     * 
     * @return option */
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceCapability serviceCapability = (ServiceCapability) o;
        return Objects.equals(this.serviceId, serviceCapability.serviceId)
            && Objects.equals(this.serviceType, serviceCapability.serviceType)
            && Objects.equals(this.properties, serviceCapability.properties)
            && Objects.equals(this.commands, serviceCapability.commands)
            && Objects.equals(this.events, serviceCapability.events)
            && Objects.equals(this.description, serviceCapability.description)
            && Objects.equals(this.option, serviceCapability.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceType, properties, commands, events, description, option);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCapability {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
