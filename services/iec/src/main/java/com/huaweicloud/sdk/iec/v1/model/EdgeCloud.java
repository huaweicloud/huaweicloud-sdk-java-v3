package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 边缘业务对象 */
public class EdgeCloud {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    private CoverageResp coverage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_regions")

    private Integer edgeRegions;

    public EdgeCloud withId(String id) {
        this.id = id;
        return this;
    }

    /** 边缘业务ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeCloud withName(String name) {
        this.name = name;
        return this;
    }

    /** 边缘业务名称。 取值范围：只能由中文字符、大小写英文字母、数字及中划线、下划线组成，且长度为[1-32]个字符。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeCloud withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 边缘业务描述。最大支持255字节。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeCloud withCoverage(CoverageResp coverage) {
        this.coverage = coverage;
        return this;
    }

    public EdgeCloud withCoverage(Consumer<CoverageResp> coverageSetter) {
        if (this.coverage == null) {
            this.coverage = new CoverageResp();
            coverageSetter.accept(this.coverage);
        }

        return this;
    }

    /** Get coverage
     * 
     * @return coverage */
    public CoverageResp getCoverage() {
        return coverage;
    }

    public void setCoverage(CoverageResp coverage) {
        this.coverage = coverage;
    }

    public EdgeCloud withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /** 创建失败的虚拟机
     * 
     * @return failedNum */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public EdgeCloud withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 边缘业务状态，现存状态有： - creating/scheduling/updating：部署中 - inService：运行中 - failed：创建失败 - deleting：删除中 - delFailed：删除失败
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EdgeCloud withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /** 成功创建的虚拟机
     * 
     * @return successNum */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public EdgeCloud withEdgeRegions(Integer edgeRegions) {
        this.edgeRegions = edgeRegions;
        return this;
    }

    /** 边缘业务支持的边缘区域数目。
     * 
     * @return edgeRegions */
    public Integer getEdgeRegions() {
        return edgeRegions;
    }

    public void setEdgeRegions(Integer edgeRegions) {
        this.edgeRegions = edgeRegions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeCloud edgeCloud = (EdgeCloud) o;
        return Objects.equals(this.id, edgeCloud.id) && Objects.equals(this.name, edgeCloud.name)
            && Objects.equals(this.description, edgeCloud.description)
            && Objects.equals(this.coverage, edgeCloud.coverage) && Objects.equals(this.failedNum, edgeCloud.failedNum)
            && Objects.equals(this.status, edgeCloud.status) && Objects.equals(this.successNum, edgeCloud.successNum)
            && Objects.equals(this.edgeRegions, edgeCloud.edgeRegions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, coverage, failedNum, status, successNum, edgeRegions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeCloud {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    edgeRegions: ").append(toIndentedString(edgeRegions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
