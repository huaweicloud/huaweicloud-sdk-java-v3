package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新网络ACL参数。
 */
public class UpdateFirewallOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<FirewallSubnetOption> subnets = null;

    public UpdateFirewallOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网络ACL名称。更新时name不能为空。  中文字符、字母、数字、中划线和下划线组成，长度为1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateFirewallOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 网络ACL的使能开关。  取值范围：true（开启），false（关闭） 
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateFirewallOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网络ACL描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateFirewallOption withSubnets(List<FirewallSubnetOption> subnets) {
        this.subnets = subnets;
        return this;
    }

    public UpdateFirewallOption addSubnetsItem(FirewallSubnetOption subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public UpdateFirewallOption withSubnets(Consumer<List<FirewallSubnetOption>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 关联子网列表。
     * @return subnets
     */
    public List<FirewallSubnetOption> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<FirewallSubnetOption> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFirewallOption updateFirewallOption = (UpdateFirewallOption) o;
        return Objects.equals(this.name, updateFirewallOption.name)
            && Objects.equals(this.adminStateUp, updateFirewallOption.adminStateUp)
            && Objects.equals(this.description, updateFirewallOption.description)
            && Objects.equals(this.subnets, updateFirewallOption.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, description, subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
