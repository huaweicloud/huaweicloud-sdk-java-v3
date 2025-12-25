package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情
 */
public class ResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checksum")

    private String checksum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private LocalDate created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_state")

    private String provisioningState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private ResourceEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "department")

    private Department department;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "governance_user")

    private GovernanceUser governanceUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Properties properties;

    public ResourceDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资产id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceDetail withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 资产来源，云服务名称(云上)，线下机房（IDC）
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ResourceDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资产类型, 比如ECS/VPC/EVS/IP/URL等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceDetail withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * 资产详情校验码。
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public ResourceDetail withCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    /**
     * 资产创建时间。
     * @return created
     */
    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public ResourceDetail withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * 资产操作状态。
     * @return provisioningState
     */
    public String getProvisioningState() {
        return provisioningState;
    }

    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    public ResourceDetail withEnvironment(ResourceEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public ResourceDetail withEnvironment(Consumer<ResourceEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new ResourceEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public ResourceEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ResourceEnvironment environment) {
        this.environment = environment;
    }

    public ResourceDetail withDepartment(Department department) {
        this.department = department;
        return this;
    }

    public ResourceDetail withDepartment(Consumer<Department> departmentSetter) {
        if (this.department == null) {
            this.department = new Department();
            departmentSetter.accept(this.department);
        }

        return this;
    }

    /**
     * Get department
     * @return department
     */
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResourceDetail withGovernanceUser(GovernanceUser governanceUser) {
        this.governanceUser = governanceUser;
        return this;
    }

    public ResourceDetail withGovernanceUser(Consumer<GovernanceUser> governanceUserSetter) {
        if (this.governanceUser == null) {
            this.governanceUser = new GovernanceUser();
            governanceUserSetter.accept(this.governanceUser);
        }

        return this;
    }

    /**
     * Get governanceUser
     * @return governanceUser
     */
    public GovernanceUser getGovernanceUser() {
        return governanceUser;
    }

    public void setGovernanceUser(GovernanceUser governanceUser) {
        this.governanceUser = governanceUser;
    }

    public ResourceDetail withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 0: 测试 1： 一般   2： 关键资产
     * minimum: 0
     * maximum: 2
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ResourceDetail withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public ResourceDetail withProperties(Consumer<Properties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new Properties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDetail that = (ResourceDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.checksum, that.checksum) && Objects.equals(this.created, that.created)
            && Objects.equals(this.provisioningState, that.provisioningState)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.department, that.department)
            && Objects.equals(this.governanceUser, that.governanceUser) && Objects.equals(this.level, that.level)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            provider,
            type,
            checksum,
            created,
            provisioningState,
            environment,
            department,
            governanceUser,
            level,
            properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    governanceUser: ").append(toIndentedString(governanceUser)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
