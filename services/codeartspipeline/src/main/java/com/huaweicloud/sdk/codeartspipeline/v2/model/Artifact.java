package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产物
 */
public class Artifact {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_version")

    private String artifactVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_target")

    private String uploadTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_package_type")

    private String artifactPackageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_uri")

    private String artifactUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_download_url_with_id")

    private String artifactDownloadUrlWithId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type")

    private String artifactType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_code")

    private List<ArtifactHashCode> hashCode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    public Artifact withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID，获取方式请参见[获取项目ID](https://support.huaweicloud.com/api-codeartsrepo/codehub_api_0014.html)。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Artifact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 产物名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artifact withArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }

    /**
     * **参数解释**： 产物版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifactVersion
     */
    public String getArtifactVersion() {
        return artifactVersion;
    }

    public void setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
    }

    public Artifact withUploadTarget(String uploadTarget) {
        this.uploadTarget = uploadTarget;
        return this;
    }

    /**
     * **参数解释**： 产物存放平台。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return uploadTarget
     */
    public String getUploadTarget() {
        return uploadTarget;
    }

    public void setUploadTarget(String uploadTarget) {
        this.uploadTarget = uploadTarget;
    }

    public Artifact withArtifactPackageType(String artifactPackageType) {
        this.artifactPackageType = artifactPackageType;
        return this;
    }

    /**
     * **参数解释**： 产物包类型，例如jar。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifactPackageType
     */
    public String getArtifactPackageType() {
        return artifactPackageType;
    }

    public void setArtifactPackageType(String artifactPackageType) {
        this.artifactPackageType = artifactPackageType;
    }

    public Artifact withArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
    }

    /**
     * **参数解释**： 制品仓文件存放路径。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifactUri
     */
    public String getArtifactUri() {
        return artifactUri;
    }

    public void setArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
    }

    public Artifact withArtifactDownloadUrlWithId(String artifactDownloadUrlWithId) {
        this.artifactDownloadUrlWithId = artifactDownloadUrlWithId;
        return this;
    }

    /**
     * **参数解释**： 制品仓下载链接。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifactDownloadUrlWithId
     */
    public String getArtifactDownloadUrlWithId() {
        return artifactDownloadUrlWithId;
    }

    public void setArtifactDownloadUrlWithId(String artifactDownloadUrlWithId) {
        this.artifactDownloadUrlWithId = artifactDownloadUrlWithId;
    }

    public Artifact withArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * **参数解释**： 产物类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public Artifact withHashCode(List<ArtifactHashCode> hashCode) {
        this.hashCode = hashCode;
        return this;
    }

    public Artifact addHashCodeItem(ArtifactHashCode hashCodeItem) {
        if (this.hashCode == null) {
            this.hashCode = new ArrayList<>();
        }
        this.hashCode.add(hashCodeItem);
        return this;
    }

    public Artifact withHashCode(Consumer<List<ArtifactHashCode>> hashCodeSetter) {
        if (this.hashCode == null) {
            this.hashCode = new ArrayList<>();
        }
        hashCodeSetter.accept(this.hashCode);
        return this;
    }

    /**
     * **参数解释**： 产物哈希码。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return hashCode
     */
    public List<ArtifactHashCode> getHashCode() {
        return hashCode;
    }

    public void setHashCode(List<ArtifactHashCode> hashCode) {
        this.hashCode = hashCode;
    }

    public Artifact withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 构建任务ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Artifact withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * **参数解释**： 构建任务编号。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public Artifact withDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
        return this;
    }

    /**
     * **参数解释**： 构建任务序号。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return dailyBuildNumber
     */
    public String getDailyBuildNumber() {
        return dailyBuildNumber;
    }

    public void setDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
    }

    public Artifact withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**： 产物大小。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Artifact that = (Artifact) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.artifactVersion, that.artifactVersion)
            && Objects.equals(this.uploadTarget, that.uploadTarget)
            && Objects.equals(this.artifactPackageType, that.artifactPackageType)
            && Objects.equals(this.artifactUri, that.artifactUri)
            && Objects.equals(this.artifactDownloadUrlWithId, that.artifactDownloadUrlWithId)
            && Objects.equals(this.artifactType, that.artifactType) && Objects.equals(this.hashCode, that.hashCode)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber)
            && Objects.equals(this.fileSize, that.fileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            name,
            artifactVersion,
            uploadTarget,
            artifactPackageType,
            artifactUri,
            artifactDownloadUrlWithId,
            artifactType,
            hashCode,
            jobId,
            buildNo,
            dailyBuildNumber,
            fileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Artifact {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    artifactVersion: ").append(toIndentedString(artifactVersion)).append("\n");
        sb.append("    uploadTarget: ").append(toIndentedString(uploadTarget)).append("\n");
        sb.append("    artifactPackageType: ").append(toIndentedString(artifactPackageType)).append("\n");
        sb.append("    artifactUri: ").append(toIndentedString(artifactUri)).append("\n");
        sb.append("    artifactDownloadUrlWithId: ").append(toIndentedString(artifactDownloadUrlWithId)).append("\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
        sb.append("    hashCode: ").append(toIndentedString(hashCode)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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
