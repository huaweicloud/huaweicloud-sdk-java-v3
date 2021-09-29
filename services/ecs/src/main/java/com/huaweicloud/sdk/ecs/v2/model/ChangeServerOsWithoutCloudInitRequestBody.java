package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class ChangeServerOsWithoutCloudInitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-change")

    private ChangeServerOsWithoutCloudInitOption osChange;

    public ChangeServerOsWithoutCloudInitRequestBody withOsChange(ChangeServerOsWithoutCloudInitOption osChange) {
        this.osChange = osChange;
        return this;
    }

    public ChangeServerOsWithoutCloudInitRequestBody withOsChange(
        Consumer<ChangeServerOsWithoutCloudInitOption> osChangeSetter) {
        if (this.osChange == null) {
            this.osChange = new ChangeServerOsWithoutCloudInitOption();
            osChangeSetter.accept(this.osChange);
        }

        return this;
    }

    /** Get osChange
     * 
     * @return osChange */
    public ChangeServerOsWithoutCloudInitOption getOsChange() {
        return osChange;
    }

    public void setOsChange(ChangeServerOsWithoutCloudInitOption osChange) {
        this.osChange = osChange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeServerOsWithoutCloudInitRequestBody changeServerOsWithoutCloudInitRequestBody =
            (ChangeServerOsWithoutCloudInitRequestBody) o;
        return Objects.equals(this.osChange, changeServerOsWithoutCloudInitRequestBody.osChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithoutCloudInitRequestBody {\n");
        sb.append("    osChange: ").append(toIndentedString(osChange)).append("\n");
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
