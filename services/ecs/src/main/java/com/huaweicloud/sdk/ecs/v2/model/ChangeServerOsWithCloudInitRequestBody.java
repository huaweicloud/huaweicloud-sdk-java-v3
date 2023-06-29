package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ChangeServerOsWithCloudInitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-change")

    private ChangeServerOsWithCloudInitOption osChange;

    public ChangeServerOsWithCloudInitRequestBody withOsChange(ChangeServerOsWithCloudInitOption osChange) {
        this.osChange = osChange;
        return this;
    }

    public ChangeServerOsWithCloudInitRequestBody withOsChange(
        Consumer<ChangeServerOsWithCloudInitOption> osChangeSetter) {
        if (this.osChange == null) {
            this.osChange = new ChangeServerOsWithCloudInitOption();
            osChangeSetter.accept(this.osChange);
        }

        return this;
    }

    /**
     * Get osChange
     * @return osChange
     */
    public ChangeServerOsWithCloudInitOption getOsChange() {
        return osChange;
    }

    public void setOsChange(ChangeServerOsWithCloudInitOption osChange) {
        this.osChange = osChange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeServerOsWithCloudInitRequestBody that = (ChangeServerOsWithCloudInitRequestBody) obj;
        return Objects.equals(this.osChange, that.osChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithCloudInitRequestBody {\n");
        sb.append("    osChange: ").append(toIndentedString(osChange)).append("\n");
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
