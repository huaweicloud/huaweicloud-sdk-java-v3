package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建实例组请求体
 */
public class CreatePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreatePoolRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例组名称，用于标识实例组，便于管理和识别。 **约束限制：** 不涉及 **取值范围：** 只能由英文字母、数字、下划线、中划线和点组成，且长度为1~256个字符 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePoolRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 实例组所在的区域（Region）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreatePoolRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 实例组类型 **约束限制：** 不涉及 **取值范围：** - elb: 基础elb类型 - elb-v2: elb-v2类型 - elb-shadow: saas化elb类型 - standard-container: 反向代理独享引擎组（云内，承载租户专用） - standard-cloud: 反向代理独享引擎组（云内） - standard: 反向代理独享引擎组（云外） - detector-cloud: 旁路检测独享引擎组（云内） - detector: 旁路检测独享引擎组（云外） **默认取值：** 不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreatePoolRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 实例组关联的VPC ID（通过调用虚拟私有云ListVpcs接口获取所有的VPC列表查询VPC的ID） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreatePoolRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 实例组描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePoolRequestBody that = (CreatePoolRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.region, that.region)
            && Objects.equals(this.type, that.type) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region, type, vpcId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
