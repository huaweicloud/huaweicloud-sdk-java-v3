package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateProjectVpcChannelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_vpc_channels")

    private List<ProjectVpcChannelInfo> projectVpcChannels = null;

    public CreateProjectVpcChannelResponse withProjectVpcChannels(List<ProjectVpcChannelInfo> projectVpcChannels) {
        this.projectVpcChannels = projectVpcChannels;
        return this;
    }

    public CreateProjectVpcChannelResponse addProjectVpcChannelsItem(ProjectVpcChannelInfo projectVpcChannelsItem) {
        if (this.projectVpcChannels == null) {
            this.projectVpcChannels = new ArrayList<>();
        }
        this.projectVpcChannels.add(projectVpcChannelsItem);
        return this;
    }

    public CreateProjectVpcChannelResponse withProjectVpcChannels(
        Consumer<List<ProjectVpcChannelInfo>> projectVpcChannelsSetter) {
        if (this.projectVpcChannels == null) {
            this.projectVpcChannels = new ArrayList<>();
        }
        projectVpcChannelsSetter.accept(this.projectVpcChannels);
        return this;
    }

    /** 项目VPC通道列表
     * 
     * @return projectVpcChannels */
    public List<ProjectVpcChannelInfo> getProjectVpcChannels() {
        return projectVpcChannels;
    }

    public void setProjectVpcChannels(List<ProjectVpcChannelInfo> projectVpcChannels) {
        this.projectVpcChannels = projectVpcChannels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProjectVpcChannelResponse createProjectVpcChannelResponse = (CreateProjectVpcChannelResponse) o;
        return Objects.equals(this.projectVpcChannels, createProjectVpcChannelResponse.projectVpcChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectVpcChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProjectVpcChannelResponse {\n");
        sb.append("    projectVpcChannels: ").append(toIndentedString(projectVpcChannels)).append("\n");
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
