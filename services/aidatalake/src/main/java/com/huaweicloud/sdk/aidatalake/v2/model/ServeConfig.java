package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray Serve 应用配置。
 */
public class ServeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<ServeApplication> applications = null;

    public ServeConfig withApplications(List<ServeApplication> applications) {
        this.applications = applications;
        return this;
    }

    public ServeConfig addApplicationsItem(ServeApplication applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ServeConfig withApplications(Consumer<List<ServeApplication>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * **参数解释**：Serve 应用列表。 **约束限制**：数量不超过3个，且各应用 name 与 route_prefix 均不可重复。
     * @return applications
     */
    public List<ServeApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<ServeApplication> applications) {
        this.applications = applications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServeConfig that = (ServeConfig) obj;
        return Objects.equals(this.applications, that.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeConfig {\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
