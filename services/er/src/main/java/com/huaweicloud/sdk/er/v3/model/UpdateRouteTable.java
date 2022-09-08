package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新路由表请求体
 */
public class UpdateRouteTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_options")

    private BgpOptions bgpOptions;

    public UpdateRouteTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 路由器表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRouteTable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由器表描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRouteTable withBgpOptions(BgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
        return this;
    }

    public UpdateRouteTable withBgpOptions(Consumer<BgpOptions> bgpOptionsSetter) {
        if (this.bgpOptions == null) {
            this.bgpOptions = new BgpOptions();
            bgpOptionsSetter.accept(this.bgpOptions);
        }

        return this;
    }

    /**
     * Get bgpOptions
     * @return bgpOptions
     */
    public BgpOptions getBgpOptions() {
        return bgpOptions;
    }

    public void setBgpOptions(BgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteTable updateRouteTable = (UpdateRouteTable) o;
        return Objects.equals(this.name, updateRouteTable.name)
            && Objects.equals(this.description, updateRouteTable.description)
            && Objects.equals(this.bgpOptions, updateRouteTable.bgpOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bgpOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTable {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bgpOptions: ").append(toIndentedString(bgpOptions)).append("\n");
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
