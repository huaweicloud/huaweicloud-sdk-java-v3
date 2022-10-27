package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新主页响应体。
 */
public class UpdatePortalInfoResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal")

    private PortalModel portal;

    public UpdatePortalInfoResponseModel withPortal(PortalModel portal) {
        this.portal = portal;
        return this;
    }

    public UpdatePortalInfoResponseModel withPortal(Consumer<PortalModel> portalSetter) {
        if (this.portal == null) {
            this.portal = new PortalModel();
            portalSetter.accept(this.portal);
        }

        return this;
    }

    /**
     * Get portal
     * @return portal
     */
    public PortalModel getPortal() {
        return portal;
    }

    public void setPortal(PortalModel portal) {
        this.portal = portal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePortalInfoResponseModel updatePortalInfoResponseModel = (UpdatePortalInfoResponseModel) o;
        return Objects.equals(this.portal, updatePortalInfoResponseModel.portal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortalInfoResponseModel {\n");
        sb.append("    portal: ").append(toIndentedString(portal)).append("\n");
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
