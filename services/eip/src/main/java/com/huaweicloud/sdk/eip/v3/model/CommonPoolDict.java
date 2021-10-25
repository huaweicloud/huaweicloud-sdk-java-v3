package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 公共池详情 */
public class CommonPoolDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_share_bandwidth_types")

    private List<String> allowShareBandwidthTypes = null;

    public CommonPoolDict withName(String name) {
        this.name = name;
        return this;
    }

    /** 公共池名字
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommonPoolDict withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CommonPoolDict withType(String type) {
        this.type = type;
        return this;
    }

    /** 公共池类型，如bgp，sbgp等
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CommonPoolDict withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /** 已经使用的ip数量 minimum: 0 maximum: 99999
     * 
     * @return used */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public CommonPoolDict withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 功能说明：表示中心站点资源或者边缘站点资源 取值范围： center、边缘站点名称 约束：publicip只能绑定该字段相同的资源
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public CommonPoolDict withId(String id) {
        this.id = id;
        return this;
    }

    /** 默认不展示，取值, 公共池ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CommonPoolDict withAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
        return this;
    }

    public CommonPoolDict addAllowShareBandwidthTypesItem(String allowShareBandwidthTypesItem) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        this.allowShareBandwidthTypes.add(allowShareBandwidthTypesItem);
        return this;
    }

    public CommonPoolDict withAllowShareBandwidthTypes(Consumer<List<String>> allowShareBandwidthTypesSetter) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        allowShareBandwidthTypesSetter.accept(this.allowShareBandwidthTypes);
        return this;
    }

    /** 功能说明：表示此publicip可以加入的共享带宽类型列表，如果为空列表，则表示该 publicip不能加入任何共享带宽 约束：publicip只能加入到有该带宽类型的共享带宽中
     * 
     * @return allowShareBandwidthTypes */
    public List<String> getAllowShareBandwidthTypes() {
        return allowShareBandwidthTypes;
    }

    public void setAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonPoolDict commonPoolDict = (CommonPoolDict) o;
        return Objects.equals(this.name, commonPoolDict.name) && Objects.equals(this.status, commonPoolDict.status)
            && Objects.equals(this.type, commonPoolDict.type) && Objects.equals(this.used, commonPoolDict.used)
            && Objects.equals(this.publicBorderGroup, commonPoolDict.publicBorderGroup)
            && Objects.equals(this.id, commonPoolDict.id)
            && Objects.equals(this.allowShareBandwidthTypes, commonPoolDict.allowShareBandwidthTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, type, used, publicBorderGroup, id, allowShareBandwidthTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonPoolDict {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    allowShareBandwidthTypes: ").append(toIndentedString(allowShareBandwidthTypes)).append("\n");
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
