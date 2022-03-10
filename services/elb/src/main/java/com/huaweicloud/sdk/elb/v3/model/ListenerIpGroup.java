package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** listener对象中的ipgroup信息 */
public class ListenerIpGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipgroup")

    private Boolean enableIpgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ListenerIpGroup withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /** 监听器关联的访问控制组的id。 创建时必选，更新时非必选。 指定的ipgroup必须已存在，不能指定为null，否则与enable_ipgroup冲突。
     * 
     * @return ipgroupId */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public ListenerIpGroup withEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
        return this;
    }

    /** 访问控制组的状态。 True:开启访问控制； False：关闭访问控制； 开启访问控制的监听器，允许直接删除。
     * 
     * @return enableIpgroup */
    public Boolean getEnableIpgroup() {
        return enableIpgroup;
    }

    public void setEnableIpgroup(Boolean enableIpgroup) {
        this.enableIpgroup = enableIpgroup;
    }

    public ListenerIpGroup withType(String type) {
        this.type = type;
        return this;
    }

    /** 访问控制组的类型。 white:白名单，只允许指定ip访问； black:黑名单，不允许指定ip访问；
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListenerIpGroup listenerIpGroup = (ListenerIpGroup) o;
        return Objects.equals(this.ipgroupId, listenerIpGroup.ipgroupId)
            && Objects.equals(this.enableIpgroup, listenerIpGroup.enableIpgroup)
            && Objects.equals(this.type, listenerIpGroup.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, enableIpgroup, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerIpGroup {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
        sb.append("    enableIpgroup: ").append(toIndentedString(enableIpgroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
