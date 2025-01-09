package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchAssociateInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_dimension")

    private String assignDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop")

    private List<DesktopDimensionAttachInfo> desktop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private List<UserDimensionAttachInfo> user = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops_attach_infos")

    private List<AttachInstancesDesktopInfo> desktopsAttachInfos = null;

    public BatchAssociateInstancesResponse withAssignDimension(String assignDimension) {
        this.assignDimension = assignDimension;
        return this;
    }

    /**
     * 分配的维度，当前支持“用户为维度”、“桌面为维度”两种。
     * @return assignDimension
     */
    public String getAssignDimension() {
        return assignDimension;
    }

    public void setAssignDimension(String assignDimension) {
        this.assignDimension = assignDimension;
    }

    public BatchAssociateInstancesResponse withDesktop(List<DesktopDimensionAttachInfo> desktop) {
        this.desktop = desktop;
        return this;
    }

    public BatchAssociateInstancesResponse addDesktopItem(DesktopDimensionAttachInfo desktopItem) {
        if (this.desktop == null) {
            this.desktop = new ArrayList<>();
        }
        this.desktop.add(desktopItem);
        return this;
    }

    public BatchAssociateInstancesResponse withDesktop(Consumer<List<DesktopDimensionAttachInfo>> desktopSetter) {
        if (this.desktop == null) {
            this.desktop = new ArrayList<>();
        }
        desktopSetter.accept(this.desktop);
        return this;
    }

    /**
     * 桌面维度结果，如果assign_dimension为DEKSTOP，那么取这个结果。
     * @return desktop
     */
    public List<DesktopDimensionAttachInfo> getDesktop() {
        return desktop;
    }

    public void setDesktop(List<DesktopDimensionAttachInfo> desktop) {
        this.desktop = desktop;
    }

    public BatchAssociateInstancesResponse withUser(List<UserDimensionAttachInfo> user) {
        this.user = user;
        return this;
    }

    public BatchAssociateInstancesResponse addUserItem(UserDimensionAttachInfo userItem) {
        if (this.user == null) {
            this.user = new ArrayList<>();
        }
        this.user.add(userItem);
        return this;
    }

    public BatchAssociateInstancesResponse withUser(Consumer<List<UserDimensionAttachInfo>> userSetter) {
        if (this.user == null) {
            this.user = new ArrayList<>();
        }
        userSetter.accept(this.user);
        return this;
    }

    /**
     * 用户维度结果，如果assign_dimension为USER，那么取这个结果。
     * @return user
     */
    public List<UserDimensionAttachInfo> getUser() {
        return user;
    }

    public void setUser(List<UserDimensionAttachInfo> user) {
        this.user = user;
    }

    public BatchAssociateInstancesResponse withDesktopsAttachInfos(
        List<AttachInstancesDesktopInfo> desktopsAttachInfos) {
        this.desktopsAttachInfos = desktopsAttachInfos;
        return this;
    }

    public BatchAssociateInstancesResponse addDesktopsAttachInfosItem(
        AttachInstancesDesktopInfo desktopsAttachInfosItem) {
        if (this.desktopsAttachInfos == null) {
            this.desktopsAttachInfos = new ArrayList<>();
        }
        this.desktopsAttachInfos.add(desktopsAttachInfosItem);
        return this;
    }

    public BatchAssociateInstancesResponse withDesktopsAttachInfos(
        Consumer<List<AttachInstancesDesktopInfo>> desktopsAttachInfosSetter) {
        if (this.desktopsAttachInfos == null) {
            this.desktopsAttachInfos = new ArrayList<>();
        }
        desktopsAttachInfosSetter.accept(this.desktopsAttachInfos);
        return this;
    }

    /**
     * 桌面分配关系。
     * @return desktopsAttachInfos
     */
    public List<AttachInstancesDesktopInfo> getDesktopsAttachInfos() {
        return desktopsAttachInfos;
    }

    public void setDesktopsAttachInfos(List<AttachInstancesDesktopInfo> desktopsAttachInfos) {
        this.desktopsAttachInfos = desktopsAttachInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAssociateInstancesResponse that = (BatchAssociateInstancesResponse) obj;
        return Objects.equals(this.assignDimension, that.assignDimension) && Objects.equals(this.desktop, that.desktop)
            && Objects.equals(this.user, that.user)
            && Objects.equals(this.desktopsAttachInfos, that.desktopsAttachInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignDimension, desktop, user, desktopsAttachInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateInstancesResponse {\n");
        sb.append("    assignDimension: ").append(toIndentedString(assignDimension)).append("\n");
        sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    desktopsAttachInfos: ").append(toIndentedString(desktopsAttachInfos)).append("\n");
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
