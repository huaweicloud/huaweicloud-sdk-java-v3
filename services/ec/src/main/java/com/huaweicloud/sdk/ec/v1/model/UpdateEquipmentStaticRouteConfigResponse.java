package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateEquipmentStaticRouteConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_hop")

    private String nextHop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "track_nqa")

    private Boolean trackNqa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_to_cloud")

    private Boolean postToCloud;

    public UpdateEquipmentStaticRouteConfigResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 目标网络
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public UpdateEquipmentStaticRouteConfigResponse withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * 下一跳地址
     * @return nextHop
     */
    public String getNextHop() {
        return nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public UpdateEquipmentStaticRouteConfigResponse withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 接口名字
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public UpdateEquipmentStaticRouteConfigResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * minimum: 1
     * maximum: 255
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public UpdateEquipmentStaticRouteConfigResponse withTrackNqa(Boolean trackNqa) {
        this.trackNqa = trackNqa;
        return this;
    }

    /**
     * 自动检测
     * @return trackNqa
     */
    public Boolean getTrackNqa() {
        return trackNqa;
    }

    public void setTrackNqa(Boolean trackNqa) {
        this.trackNqa = trackNqa;
    }

    public UpdateEquipmentStaticRouteConfigResponse withPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
        return this;
    }

    /**
     * 发布到企业连接网络
     * @return postToCloud
     */
    public Boolean getPostToCloud() {
        return postToCloud;
    }

    public void setPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEquipmentStaticRouteConfigResponse that = (UpdateEquipmentStaticRouteConfigResponse) obj;
        return Objects.equals(this.prefix, that.prefix) && Objects.equals(this.nextHop, that.nextHop)
            && Objects.equals(this.interfaceName, that.interfaceName) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.trackNqa, that.trackNqa) && Objects.equals(this.postToCloud, that.postToCloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, nextHop, interfaceName, priority, trackNqa, postToCloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEquipmentStaticRouteConfigResponse {\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    trackNqa: ").append(toIndentedString(trackNqa)).append("\n");
        sb.append("    postToCloud: ").append(toIndentedString(postToCloud)).append("\n");
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
