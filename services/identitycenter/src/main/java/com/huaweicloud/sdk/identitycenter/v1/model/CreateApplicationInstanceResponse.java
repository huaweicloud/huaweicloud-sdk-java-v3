package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateApplicationInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_instance")

    private ApplicationInstanceDto applicationInstance;

    public CreateApplicationInstanceResponse withApplicationInstance(ApplicationInstanceDto applicationInstance) {
        this.applicationInstance = applicationInstance;
        return this;
    }

    public CreateApplicationInstanceResponse withApplicationInstance(
        Consumer<ApplicationInstanceDto> applicationInstanceSetter) {
        if (this.applicationInstance == null) {
            this.applicationInstance = new ApplicationInstanceDto();
            applicationInstanceSetter.accept(this.applicationInstance);
        }

        return this;
    }

    /**
     * Get applicationInstance
     * @return applicationInstance
     */
    public ApplicationInstanceDto getApplicationInstance() {
        return applicationInstance;
    }

    public void setApplicationInstance(ApplicationInstanceDto applicationInstance) {
        this.applicationInstance = applicationInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateApplicationInstanceResponse that = (CreateApplicationInstanceResponse) obj;
        return Objects.equals(this.applicationInstance, that.applicationInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationInstanceResponse {\n");
        sb.append("    applicationInstance: ").append(toIndentedString(applicationInstance)).append("\n");
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
