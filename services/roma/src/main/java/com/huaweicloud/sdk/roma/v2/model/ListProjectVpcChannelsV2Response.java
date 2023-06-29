package com.huaweicloud.sdk.roma.v2.model;

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
public class ListProjectVpcChannelsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_vpc_channels")

    private List<ProjectVpcChannelInfo> projectVpcChannels = null;

    public ListProjectVpcChannelsV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListProjectVpcChannelsV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListProjectVpcChannelsV2Response withProjectVpcChannels(List<ProjectVpcChannelInfo> projectVpcChannels) {
        this.projectVpcChannels = projectVpcChannels;
        return this;
    }

    public ListProjectVpcChannelsV2Response addProjectVpcChannelsItem(ProjectVpcChannelInfo projectVpcChannelsItem) {
        if (this.projectVpcChannels == null) {
            this.projectVpcChannels = new ArrayList<>();
        }
        this.projectVpcChannels.add(projectVpcChannelsItem);
        return this;
    }

    public ListProjectVpcChannelsV2Response withProjectVpcChannels(
        Consumer<List<ProjectVpcChannelInfo>> projectVpcChannelsSetter) {
        if (this.projectVpcChannels == null) {
            this.projectVpcChannels = new ArrayList<>();
        }
        projectVpcChannelsSetter.accept(this.projectVpcChannels);
        return this;
    }

    /**
     * 本次查询到的实例VPC通道列表
     * @return projectVpcChannels
     */
    public List<ProjectVpcChannelInfo> getProjectVpcChannels() {
        return projectVpcChannels;
    }

    public void setProjectVpcChannels(List<ProjectVpcChannelInfo> projectVpcChannels) {
        this.projectVpcChannels = projectVpcChannels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectVpcChannelsV2Response that = (ListProjectVpcChannelsV2Response) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.projectVpcChannels, that.projectVpcChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, projectVpcChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectVpcChannelsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    projectVpcChannels: ").append(toIndentedString(projectVpcChannels)).append("\n");
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
