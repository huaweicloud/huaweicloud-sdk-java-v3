package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrivilegeProjectInfoV5
 */
public class PrivilegeProjectInfoV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_num")

    private Integer repositoryNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated")

    private Boolean associated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_info")

    private List<PrivilegeProjectInfoV5> projectInfo = null;

    public PrivilegeProjectInfoV5 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  项目的序号。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrivilegeProjectInfoV5 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 项目的名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrivilegeProjectInfoV5 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 项目的状态（该参数无返回值，请忽略）。 **取值范围**： 该参数无返回值，请忽略。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PrivilegeProjectInfoV5 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PrivilegeProjectInfoV5 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**： 项目的创建时间。 **取值范围**： 格式为yyyy-MM-dd HH:mm:ss。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public PrivilegeProjectInfoV5 withRepositoryNum(Integer repositoryNum) {
        this.repositoryNum = repositoryNum;
        return this;
    }

    /**
     * **参数解释**： 仓库数量。 **取值范围**： 不涉及。
     * @return repositoryNum
     */
    public Integer getRepositoryNum() {
        return repositoryNum;
    }

    public void setRepositoryNum(Integer repositoryNum) {
        this.repositoryNum = repositoryNum;
    }

    public PrivilegeProjectInfoV5 withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 项目总数（该参数无返回值，请忽略）。 **取值范围**： 该参数无返回值，请忽略。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public PrivilegeProjectInfoV5 withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释**： 仓库ID。 **取值范围**： 不涉及。
     * @return repositoryId
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public PrivilegeProjectInfoV5 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 项目所属的区域。 **取值范围**： 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PrivilegeProjectInfoV5 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PrivilegeProjectInfoV5 withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public PrivilegeProjectInfoV5 addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public PrivilegeProjectInfoV5 withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释**： 项目的序号列表（该参数无返回值，请忽略）。 **取值范围**： 该参数无返回值，请忽略。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public PrivilegeProjectInfoV5 withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * **参数解释**： 项目总数。 **取值范围**： 不涉及。
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public PrivilegeProjectInfoV5 withAssociated(Boolean associated) {
        this.associated = associated;
        return this;
    }

    /**
     * **参数解释**： 请求参数中的仓库ID是否关联到本项目。 **取值范围**： - true：关联到本项目。 - false：未关联到本项目。
     * @return associated
     */
    public Boolean getAssociated() {
        return associated;
    }

    public void setAssociated(Boolean associated) {
        this.associated = associated;
    }

    public PrivilegeProjectInfoV5 withProjectInfo(List<PrivilegeProjectInfoV5> projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }

    public PrivilegeProjectInfoV5 addProjectInfoItem(PrivilegeProjectInfoV5 projectInfoItem) {
        if (this.projectInfo == null) {
            this.projectInfo = new ArrayList<>();
        }
        this.projectInfo.add(projectInfoItem);
        return this;
    }

    public PrivilegeProjectInfoV5 withProjectInfo(Consumer<List<PrivilegeProjectInfoV5>> projectInfoSetter) {
        if (this.projectInfo == null) {
            this.projectInfo = new ArrayList<>();
        }
        projectInfoSetter.accept(this.projectInfo);
        return this;
    }

    /**
     * **参数解释**： 项目的信息。 **取值范围**： 不涉及。
     * @return projectInfo
     */
    public List<PrivilegeProjectInfoV5> getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(List<PrivilegeProjectInfoV5> projectInfo) {
        this.projectInfo = projectInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegeProjectInfoV5 that = (PrivilegeProjectInfoV5) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.repositoryNum, that.repositoryNum) && Objects.equals(this.total, that.total)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.totalRecords, that.totalRecords) && Objects.equals(this.associated, that.associated)
            && Objects.equals(this.projectInfo, that.projectInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            projectId,
            createdTime,
            repositoryNum,
            total,
            repositoryId,
            region,
            domainId,
            ids,
            totalRecords,
            associated,
            projectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeProjectInfoV5 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    repositoryNum: ").append(toIndentedString(repositoryNum)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    associated: ").append(toIndentedString(associated)).append("\n");
        sb.append("    projectInfo: ").append(toIndentedString(projectInfo)).append("\n");
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
