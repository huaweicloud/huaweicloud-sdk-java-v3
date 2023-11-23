package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConnectionManagement
 */
public class ConnectionManagement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_management")

    private DriverManagement driverManagement;

    public ConnectionManagement withDriverManagement(DriverManagement driverManagement) {
        this.driverManagement = driverManagement;
        return this;
    }

    public ConnectionManagement withDriverManagement(Consumer<DriverManagement> driverManagementSetter) {
        if (this.driverManagement == null) {
            this.driverManagement = new DriverManagement();
            driverManagementSetter.accept(this.driverManagement);
        }

        return this;
    }

    /**
     * Get driverManagement
     * @return driverManagement
     */
    public DriverManagement getDriverManagement() {
        return driverManagement;
    }

    public void setDriverManagement(DriverManagement driverManagement) {
        this.driverManagement = driverManagement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionManagement that = (ConnectionManagement) obj;
        return Objects.equals(this.driverManagement, that.driverManagement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverManagement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionManagement {\n");
        sb.append("    driverManagement: ").append(toIndentedString(driverManagement)).append("\n");
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
