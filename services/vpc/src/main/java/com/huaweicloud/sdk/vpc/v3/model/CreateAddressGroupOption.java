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
public class CreateAddressGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_set")

    private List<String> ipSet = null;

    public CreateAddressGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 功能说明：地址组名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAddressGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 功能说明：地址组描述信息 取值范围：0-255个字符，不能包含“<”和“>”。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAddressGroupOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** 功能说明：地址组ip版本 取值范围：4, 表示ipv4地址组；6，表示ipv6地址组
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateAddressGroupOption withIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
        return this;
    }

    public CreateAddressGroupOption addIpSetItem(String ipSetItem) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        this.ipSet.add(ipSetItem);
        return this;
    }

    public CreateAddressGroupOption withIpSet(Consumer<List<String>> ipSetSetter) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        ipSetSetter.accept(this.ipSet);
        return this;
    }

    /** 功能说明：地址组可包含地址集 取值范围：可以是单个ip地址，ip地址范围，ip地址cidr 约束：当前一个地址组ip_set数量限制默认值为20，即配置的ip地址、ip地址范围或ip地址cidr的总数默认限制20
     * 
     * @return ipSet */
    public List<String> getIpSet() {
        return ipSet;
    }

    public void setIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAddressGroupOption createAddressGroupOption = (CreateAddressGroupOption) o;
        return Objects.equals(this.name, createAddressGroupOption.name)
            && Objects.equals(this.description, createAddressGroupOption.description)
            && Objects.equals(this.ipVersion, createAddressGroupOption.ipVersion)
            && Objects.equals(this.ipSet, createAddressGroupOption.ipSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, ipVersion, ipSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAddressGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipSet: ").append(toIndentedString(ipSet)).append("\n");
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
