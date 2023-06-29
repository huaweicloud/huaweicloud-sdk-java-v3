package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityContext
 */
public class SecurityContext {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_as_user")

    private Integer runAsUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_as_group")

    private Integer runAsGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capabilities")

    private SecurityContextCapabilities capabilities;

    public SecurityContext withRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * Get runAsUser
     * @return runAsUser
     */
    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SecurityContext withRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    /**
     * Get runAsGroup
     * @return runAsGroup
     */
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public SecurityContext withCapabilities(SecurityContextCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public SecurityContext withCapabilities(Consumer<SecurityContextCapabilities> capabilitiesSetter) {
        if (this.capabilities == null) {
            this.capabilities = new SecurityContextCapabilities();
            capabilitiesSetter.accept(this.capabilities);
        }

        return this;
    }

    /**
     * Get capabilities
     * @return capabilities
     */
    public SecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(SecurityContextCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityContext that = (SecurityContext) obj;
        return Objects.equals(this.runAsUser, that.runAsUser) && Objects.equals(this.runAsGroup, that.runAsGroup)
            && Objects.equals(this.capabilities, that.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runAsUser, runAsGroup, capabilities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityContext {\n");
        sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
        sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
