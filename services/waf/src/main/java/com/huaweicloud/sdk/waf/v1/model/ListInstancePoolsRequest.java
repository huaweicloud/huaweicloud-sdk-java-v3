package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListInstancePoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Boolean detail;

    public ListInstancePoolsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目ID。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。 **约束限制：** 不涉及 **取值范围：**  - 0：代表default企业项目  - all_granted_eps：代表所有企业项目  - 其它企业项目ID：长度为36个字符 **默认取值：** 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInstancePoolsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，返回第几页数据 **约束限制：** 不涉及 **取值范围：** page参数的实际有效范围取决于总数据量和pagesize的取值，不能大于总页数 **默认取值：** 1
     * minimum: 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListInstancePoolsRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，每页包含的结果条数 **约束限制：** 不涉及 **取值范围：** [0,100] **默认取值：** 10
     * minimum: 1
     * maximum: 100
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public ListInstancePoolsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 模糊查询，实例组名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancePoolsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListInstancePoolsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListInstancePoolsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释：** 实例组类型 **约束限制：** 不涉及 **取值范围：** - elb 基础elb类型 - elb-v2 elb-v2类型 - elb-container -容器化elb类型 - elb-shadow saas化elb类型 - standard-container 反向代理独享引擎组（云内，承载租户专用） - standard-cloud 反向代理独享引擎组（云内） - standard 反向代理独享引擎组（云外） - detector-cloud 旁路检测独享引擎组（云内） - detector 旁路检测独享引擎组（云外） - standard-maf-cloud 大模型防火墙实例组类型 **默认取值：** 不涉及
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListInstancePoolsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 实例组关联的vpc_id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListInstancePoolsRequest withDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释：** 是否查询实例组详细信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return detail
     */
    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancePoolsRequest that = (ListInstancePoolsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.page, that.page) && Objects.equals(this.pagesize, that.pagesize)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, page, pagesize, name, type, vpcId, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancePoolsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
