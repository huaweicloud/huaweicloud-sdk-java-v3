package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupIpOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建IP地址组请求参数对象
 */
public class CreateIpGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_list")
    
    private List<CreateIpGroupIpOption> ipList = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public CreateIpGroupOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * IP地址组的租户id
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
     * IP地址组的描述信息
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
     * IP地址组的名称
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
        this.ipList.add(ipListItem);
        return this;
    }

    public CreateIpGroupOption withIpList(Consumer<List<CreateIpGroupIpOption>> ipListSetter) {
        if(this.ipList == null ){
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * IP地址组中包含的ip或网段列表。 []，表示不放通或不禁止任何ip。 单ipgroup下的ip或网段总和不超过300个。
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
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIpGroupOption createIpGroupOption = (CreateIpGroupOption) o;
        return Objects.equals(this.projectId, createIpGroupOption.projectId) &&
            Objects.equals(this.description, createIpGroupOption.description) &&
            Objects.equals(this.name, createIpGroupOption.name) &&
            Objects.equals(this.ipList, createIpGroupOption.ipList) &&
            Objects.equals(this.enterpriseProjectId, createIpGroupOption.enterpriseProjectId);
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

