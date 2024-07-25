package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateWorkspaceResponseBodyWorkspaceAgencyList
 */
public class CreateWorkspaceResponseBodyWorkspaceAgencyList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * THIS_ACCOUNT:本账号空间,CROSS_ACCOUNT:跨账号空间
     */
    public static final class WorkspaceAttributionEnum {

        /**
         * Enum THIS_ACCOUNT for value: "THIS_ACCOUNT"
         */
        public static final WorkspaceAttributionEnum THIS_ACCOUNT = new WorkspaceAttributionEnum("THIS_ACCOUNT");

        /**
         * Enum CROSS_ACCOUNT for value: "CROSS_ACCOUNT"
         */
        public static final WorkspaceAttributionEnum CROSS_ACCOUNT = new WorkspaceAttributionEnum("CROSS_ACCOUNT");

        private static final Map<String, WorkspaceAttributionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WorkspaceAttributionEnum> createStaticFields() {
            Map<String, WorkspaceAttributionEnum> map = new HashMap<>();
            map.put("THIS_ACCOUNT", THIS_ACCOUNT);
            map.put("CROSS_ACCOUNT", CROSS_ACCOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WorkspaceAttributionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static WorkspaceAttributionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WorkspaceAttributionEnum(value));
        }

        public static WorkspaceAttributionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WorkspaceAttributionEnum) {
                return this.value.equals(((WorkspaceAttributionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_attribution")

    private WorkspaceAttributionEnum workspaceAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_version")

    private String agencyVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_agency_id")

    private String iamAgencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_agency_name")

    private String iamAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private List<String> resourceSpecCode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private Boolean selected;

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 委托空间所属项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 空间委托id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 空间委托名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 委托空间所属region id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withWorkspaceAttribution(
        WorkspaceAttributionEnum workspaceAttribution) {
        this.workspaceAttribution = workspaceAttribution;
        return this;
    }

    /**
     * THIS_ACCOUNT:本账号空间,CROSS_ACCOUNT:跨账号空间
     * @return workspaceAttribution
     */
    public WorkspaceAttributionEnum getWorkspaceAttribution() {
        return workspaceAttribution;
    }

    public void setWorkspaceAttribution(WorkspaceAttributionEnum workspaceAttribution) {
        this.workspaceAttribution = workspaceAttribution;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withAgencyVersion(String agencyVersion) {
        this.agencyVersion = agencyVersion;
        return this;
    }

    /**
     * 用户创建托管空间时使用的IAM委托版本，V3或者V5
     * @return agencyVersion
     */
    public String getAgencyVersion() {
        return agencyVersion;
    }

    public void setAgencyVersion(String agencyVersion) {
        this.agencyVersion = agencyVersion;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 委托租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 委托租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withIamAgencyId(String iamAgencyId) {
        this.iamAgencyId = iamAgencyId;
        return this;
    }

    /**
     * iam委托id
     * @return iamAgencyId
     */
    public String getIamAgencyId() {
        return iamAgencyId;
    }

    public void setIamAgencyId(String iamAgencyId) {
        this.iamAgencyId = iamAgencyId;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
        return this;
    }

    /**
     * iam委托名称
     * @return iamAgencyName
     */
    public String getIamAgencyName() {
        return iamAgencyName;
    }

    public void setIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withResourceSpecCode(List<String> resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList addResourceSpecCodeItem(String resourceSpecCodeItem) {
        if (this.resourceSpecCode == null) {
            this.resourceSpecCode = new ArrayList<>();
        }
        this.resourceSpecCode.add(resourceSpecCodeItem);
        return this;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withResourceSpecCode(
        Consumer<List<String>> resourceSpecCodeSetter) {
        if (this.resourceSpecCode == null) {
            this.resourceSpecCode = new ArrayList<>();
        }
        resourceSpecCodeSetter.accept(this.resourceSpecCode);
        return this;
    }

    /**
     * 委托空间购买版本
     * @return resourceSpecCode
     */
    public List<String> getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(List<String> resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public CreateWorkspaceResponseBodyWorkspaceAgencyList withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * 是否被视图选中
     * @return selected
     */
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkspaceResponseBodyWorkspaceAgencyList that = (CreateWorkspaceResponseBodyWorkspaceAgencyList) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.workspaceAttribution, that.workspaceAttribution)
            && Objects.equals(this.agencyVersion, that.agencyVersion) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.iamAgencyId, that.iamAgencyId)
            && Objects.equals(this.iamAgencyName, that.iamAgencyName)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.selected, that.selected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            id,
            name,
            regionId,
            workspaceAttribution,
            agencyVersion,
            domainId,
            domainName,
            iamAgencyId,
            iamAgencyName,
            resourceSpecCode,
            selected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkspaceResponseBodyWorkspaceAgencyList {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    workspaceAttribution: ").append(toIndentedString(workspaceAttribution)).append("\n");
        sb.append("    agencyVersion: ").append(toIndentedString(agencyVersion)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    iamAgencyId: ").append(toIndentedString(iamAgencyId)).append("\n");
        sb.append("    iamAgencyName: ").append(toIndentedString(iamAgencyName)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
