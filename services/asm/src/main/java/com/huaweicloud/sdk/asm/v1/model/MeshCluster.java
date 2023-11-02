package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MeshCluster
 */
public class MeshCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "injection")

    private InjectionConfig injection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installation")

    private InstallationConfig installation;

    public MeshCluster withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群ID，资源唯一标识，通过该ID查询需要添加的集群
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public MeshCluster withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 集群所在的Region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MeshCluster withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * 集群所属的projectID
     * @return projectID
     */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public MeshCluster withInjection(InjectionConfig injection) {
        this.injection = injection;
        return this;
    }

    public MeshCluster withInjection(Consumer<InjectionConfig> injectionSetter) {
        if (this.injection == null) {
            this.injection = new InjectionConfig();
            injectionSetter.accept(this.injection);
        }

        return this;
    }

    /**
     * Get injection
     * @return injection
     */
    public InjectionConfig getInjection() {
        return injection;
    }

    public void setInjection(InjectionConfig injection) {
        this.injection = injection;
    }

    public MeshCluster withInstallation(InstallationConfig installation) {
        this.installation = installation;
        return this;
    }

    public MeshCluster withInstallation(Consumer<InstallationConfig> installationSetter) {
        if (this.installation == null) {
            this.installation = new InstallationConfig();
            installationSetter.accept(this.installation);
        }

        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    public InstallationConfig getInstallation() {
        return installation;
    }

    public void setInstallation(InstallationConfig installation) {
        this.installation = installation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshCluster that = (MeshCluster) obj;
        return Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.region, that.region)
            && Objects.equals(this.projectID, that.projectID) && Objects.equals(this.injection, that.injection)
            && Objects.equals(this.installation, that.installation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, region, projectID, injection, installation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshCluster {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    injection: ").append(toIndentedString(injection)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
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
