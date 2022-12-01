package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSystemEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemevent")

    private Event systemevent;

    public CreateSystemEventResponse withSystemevent(Event systemevent) {
        this.systemevent = systemevent;
        return this;
    }

    public CreateSystemEventResponse withSystemevent(Consumer<Event> systemeventSetter) {
        if (this.systemevent == null) {
            this.systemevent = new Event();
            systemeventSetter.accept(this.systemevent);
        }

        return this;
    }

    /**
     * Get systemevent
     * @return systemevent
     */
    public Event getSystemevent() {
        return systemevent;
    }

    public void setSystemevent(Event systemevent) {
        this.systemevent = systemevent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSystemEventResponse createSystemEventResponse = (CreateSystemEventResponse) o;
        return Objects.equals(this.systemevent, createSystemEventResponse.systemevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemevent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSystemEventResponse {\n");
        sb.append("    systemevent: ").append(toIndentedString(systemevent)).append("\n");
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
