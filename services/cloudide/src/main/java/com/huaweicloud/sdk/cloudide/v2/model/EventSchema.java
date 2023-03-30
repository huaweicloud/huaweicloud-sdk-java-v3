package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * the request body of event
 */
public class EventSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verb")

    private String verb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public EventSchema withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * the component of the codearts snap
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public EventSchema withVerb(String verb) {
        this.verb = verb;
        return this;
    }

    /**
     * the verb of the action
     * @return verb
     */
    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public EventSchema withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * the the object of the verb
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public EventSchema withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * the data of the event
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventSchema eventSchema = (EventSchema) o;
        return Objects.equals(this.component, eventSchema.component) && Objects.equals(this.verb, eventSchema.verb)
            && Objects.equals(this._object, eventSchema._object) && Objects.equals(this.data, eventSchema.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, verb, _object, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSchema {\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
