package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：RayServe配置。 **约束限制**：不涉及。 
 */
public class RayServeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<ServeApplication> applications = null;

    public RayServeConfig withApplications(List<ServeApplication> applications) {
        this.applications = applications;
        return this;
    }

    public RayServeConfig addApplicationsItem(ServeApplication applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public RayServeConfig withApplications(Consumer<List<ServeApplication>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * **参数解释**：Application。 **约束限制**：不涉及。 **取值范围**：[0,5]。 **默认取值**：不涉及。 
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
        RayServeConfig that = (RayServeConfig) obj;
        return Objects.equals(this.applications, that.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayServeConfig {\n");
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
