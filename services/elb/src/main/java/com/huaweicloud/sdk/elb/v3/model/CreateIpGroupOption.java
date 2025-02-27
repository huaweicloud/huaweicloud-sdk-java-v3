package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建IP地址组请求参数。
 */
public class CreateIpGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<CreateIpGroupIpOption> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateIpGroupOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 参数解释：IP地址组所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateIpGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数解释：IP地址组的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateIpGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：IP地址组的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIpGroupOption withIpList(List<CreateIpGroupIpOption> ipList) {
        this.ipList = ipList;
        return this;
    }

    public CreateIpGroupOption addIpListItem(CreateIpGroupIpOption ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public CreateIpGroupOption withIpList(Consumer<List<CreateIpGroupIpOption>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 参数解释：IP地址组中包含的IP或网段列表。[]表示任意IP。
     * @return ipList
     */
    public List<CreateIpGroupIpOption> getIpList() {
        return ipList;
    }

    public void setIpList(List<CreateIpGroupIpOption> ipList) {
        this.ipList = ipList;
    }

    public CreateIpGroupOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 参数解释：IP地址组所在的企业项目ID。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIpGroupOption that = (CreateIpGroupOption) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.ipList, that.ipList)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, description, name, ipList, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpGroupOption {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
