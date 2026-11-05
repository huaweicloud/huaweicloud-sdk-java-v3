package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateClouddcnSubnetOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_nameservers")

    private List<String> dnsNameservers = null;

    public UpdateClouddcnSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：子网名称 取值范围：1-64，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateClouddcnSubnetOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：子网描述 取值范围：0-255个字符，不能包含\"<\"和\">\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateClouddcnSubnetOption withDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
        return this;
    }

    public UpdateClouddcnSubnetOption addDnsNameserversItem(String dnsNameserversItem) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        this.dnsNameservers.add(dnsNameserversItem);
        return this;
    }

    public UpdateClouddcnSubnetOption withDnsNameservers(Consumer<List<String>> dnsNameserversSetter) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        dnsNameserversSetter.accept(this.dnsNameservers);
        return this;
    }

    /**
     * 功能说明：子网关联的DNS服务器信息。
     * @return dnsNameservers
     */
    public List<String> getDnsNameservers() {
        return dnsNameservers;
    }

    public void setDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClouddcnSubnetOption that = (UpdateClouddcnSubnetOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dnsNameservers, that.dnsNameservers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dnsNameservers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClouddcnSubnetOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsNameservers: ").append(toIndentedString(dnsNameservers)).append("\n");
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
