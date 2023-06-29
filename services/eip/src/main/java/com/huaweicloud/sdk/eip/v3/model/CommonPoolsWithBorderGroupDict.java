package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分组详情
 */
public class CommonPoolsWithBorderGroupDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pools")

    private List<String> publicipPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public CommonPoolsWithBorderGroupDict withPublicipPools(List<String> publicipPools) {
        this.publicipPools = publicipPools;
        return this;
    }

    public CommonPoolsWithBorderGroupDict addPublicipPoolsItem(String publicipPoolsItem) {
        if (this.publicipPools == null) {
            this.publicipPools = new ArrayList<>();
        }
        this.publicipPools.add(publicipPoolsItem);
        return this;
    }

    public CommonPoolsWithBorderGroupDict withPublicipPools(Consumer<List<String>> publicipPoolsSetter) {
        if (this.publicipPools == null) {
            this.publicipPools = new ArrayList<>();
        }
        publicipPoolsSetter.accept(this.publicipPools);
        return this;
    }

    /**
     * 同组的公共池列表
     * @return publicipPools
     */
    public List<String> getPublicipPools() {
        return publicipPools;
    }

    public void setPublicipPools(List<String> publicipPools) {
        this.publicipPools = publicipPools;
    }

    public CommonPoolsWithBorderGroupDict withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 分组：中心还是边缘
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonPoolsWithBorderGroupDict that = (CommonPoolsWithBorderGroupDict) obj;
        return Objects.equals(this.publicipPools, that.publicipPools)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipPools, publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonPoolsWithBorderGroupDict {\n");
        sb.append("    publicipPools: ").append(toIndentedString(publicipPools)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
