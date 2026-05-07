package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VersionInfosResult
 */
public class VersionInfosResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend")

    private Boolean recommend;

    public VersionInfosResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 引擎版本号。 **取值范围**: 不涉及 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionInfosResult withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * **参数解释**: 内核引擎版本号。 **取值范围**: 不涉及 
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public VersionInfosResult withRecommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }

    /**
     * **参数解释**: 是否为推荐版本。 **取值范围**: - true：推荐版本 - flase: 非推荐版本 
     * @return recommend
     */
    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionInfosResult that = (VersionInfosResult) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.recommend, that.recommend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, kernelVersion, recommend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionInfosResult {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
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
