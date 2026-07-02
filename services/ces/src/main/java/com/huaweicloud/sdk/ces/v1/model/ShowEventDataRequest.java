package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEventDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.1")

    private String dim1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.2")

    private String dim2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.3")

    private String dim3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public ShowEventDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 服务命名空间，样例：弹性云服务器的命名空间为SYS.ECS。 各服务命名空间请参阅[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)。 **约束限制** 不涉及 **取值范围** 格式为service.item，service和item以点号拼接组成。 service和item必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_），长度为[3,32]个字符 **默认取值** 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowEventDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    /**
     * **参数解释** 指标的第一层维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.0=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim0
     */
    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ShowEventDataRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    /**
     * **参数解释** 指标的第二层维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.1=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim1
     */
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public ShowEventDataRequest withDim2(String dim2) {
        this.dim2 = dim2;
        return this;
    }

    /**
     * **参数解释** 指标的第三层维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档 **约束限制** 不涉及 **取值范围** dim.2=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim2
     */
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ShowEventDataRequest withDim3(String dim3) {
        this.dim3 = dim3;
        return this;
    }

    /**
     * **参数解释** 指标的第四层维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档 **约束限制** 不涉及 **取值范围** dim.3=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim3
     */
    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public ShowEventDataRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 事件类型 **约束限制** 不涉及 **取值范围** 必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,64]个字符 **默认取值** 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowEventDataRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释** 查询数据起始时间，UNIX时间戳，单位毫秒 **约束限制** 不涉及 **取值范围** 毫秒级时间戳，范围为[0,9999999999999] **默认取值** 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowEventDataRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释** 查询数据截止时间,UNIX时间戳，单位毫秒 **约束限制** from必须小于to **取值范围** 毫秒级时间戳，范围为[0,9999999999999] **默认取值** 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEventDataRequest that = (ShowEventDataRequest) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dim0, that.dim0)
            && Objects.equals(this.dim1, that.dim1) && Objects.equals(this.dim2, that.dim2)
            && Objects.equals(this.dim3, that.dim3) && Objects.equals(this.type, that.type)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dim0, dim1, dim2, dim3, type, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDataRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
        sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
        sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
