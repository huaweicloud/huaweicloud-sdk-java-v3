package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IP白名单 约束：只有企业版实例的APP_HTTPS协议支持配置IP白名单。 
 */
public class IPWhiteList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_list")

    private List<IpAllowList> allowList = null;

    public IPWhiteList withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数说明**：启用Ip白名单访问控制。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public IPWhiteList withAllowList(List<IpAllowList> allowList) {
        this.allowList = allowList;
        return this;
    }

    public IPWhiteList addAllowListItem(IpAllowList allowListItem) {
        if (this.allowList == null) {
            this.allowList = new ArrayList<>();
        }
        this.allowList.add(allowListItem);
        return this;
    }

    public IPWhiteList withAllowList(Consumer<List<IpAllowList>> allowListSetter) {
        if (this.allowList == null) {
            this.allowList = new ArrayList<>();
        }
        allowListSetter.accept(this.allowList);
        return this;
    }

    /**
     * **参数说明**：允许访问企业版实例的IP地址列表。 
     * @return allowList
     */
    public List<IpAllowList> getAllowList() {
        return allowList;
    }

    public void setAllowList(List<IpAllowList> allowList) {
        this.allowList = allowList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IPWhiteList that = (IPWhiteList) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.allowList, that.allowList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, allowList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IPWhiteList {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
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
