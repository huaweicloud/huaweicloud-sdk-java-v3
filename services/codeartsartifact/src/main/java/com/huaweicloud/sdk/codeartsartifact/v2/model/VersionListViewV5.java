package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VersionListViewV5
 */
public class VersionListViewV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_version")

    private String buildVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files_count")

    private Integer filesCount;

    public VersionListViewV5 withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 发布库版本的状态。 **取值范围**： - test：测试包。 - prod：发布包。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public VersionListViewV5 withBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }

    /**
     * **参数解释**： 发布库版本的名称。 **取值范围**： 不涉及。
     * @return buildVersion
     */
    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public VersionListViewV5 withFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
     * **参数解释**： 版本下的文件个数。 **取值范围**： 不涉及。
     * @return filesCount
     */
    public Integer getFilesCount() {
        return filesCount;
    }

    public void setFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionListViewV5 that = (VersionListViewV5) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.buildVersion, that.buildVersion)
            && Objects.equals(this.filesCount, that.filesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, buildVersion, filesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionListViewV5 {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
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
