package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class JobStatusResultResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "building")

    private Boolean building;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_result")

    private String buildResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public JobStatusResultResponseBodyResult withBuilding(Boolean building) {
        this.building = building;
        return this;
    }

    /**
     * 是否构建中
     * @return building
     */
    public Boolean getBuilding() {
        return building;
    }

    public void setBuilding(Boolean building) {
        this.building = building;
    }

    public JobStatusResultResponseBodyResult withBuildResult(String buildResult) {
        this.buildResult = buildResult;
        return this;
    }

    /**
     * 构建结果
     * @return buildResult
     */
    public String getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(String buildResult) {
        this.buildResult = buildResult;
    }

    public JobStatusResultResponseBodyResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobStatusResultResponseBodyResult that = (JobStatusResultResponseBodyResult) obj;
        return Objects.equals(this.building, that.building) && Objects.equals(this.buildResult, that.buildResult)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, buildResult, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobStatusResultResponseBodyResult {\n");
        sb.append("    building: ").append(toIndentedString(building)).append("\n");
        sb.append("    buildResult: ").append(toIndentedString(buildResult)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
