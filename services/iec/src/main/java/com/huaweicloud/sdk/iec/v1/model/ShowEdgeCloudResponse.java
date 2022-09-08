package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEdgeCloudResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stacks")

    private List<Stack> stacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    private CoverageResp coverage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private FailReason failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_regions")

    private Integer edgeRegions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public ShowEdgeCloudResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘业务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowEdgeCloudResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘业务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowEdgeCloudResponse withStacks(List<Stack> stacks) {
        this.stacks = stacks;
        return this;
    }

    public ShowEdgeCloudResponse addStacksItem(Stack stacksItem) {
        if (this.stacks == null) {
            this.stacks = new ArrayList<>();
        }
        this.stacks.add(stacksItem);
        return this;
    }

    public ShowEdgeCloudResponse withStacks(Consumer<List<Stack>> stacksSetter) {
        if (this.stacks == null) {
            this.stacks = new ArrayList<>();
        }
        stacksSetter.accept(this.stacks);
        return this;
    }

    /**
     * 边缘业务资源组。
     * @return stacks
     */
    public List<Stack> getStacks() {
        return stacks;
    }

    public void setStacks(List<Stack> stacks) {
        this.stacks = stacks;
    }

    public ShowEdgeCloudResponse withCoverage(CoverageResp coverage) {
        this.coverage = coverage;
        return this;
    }

    public ShowEdgeCloudResponse withCoverage(Consumer<CoverageResp> coverageSetter) {
        if (this.coverage == null) {
            this.coverage = new CoverageResp();
            coverageSetter.accept(this.coverage);
        }

        return this;
    }

    /**
     * Get coverage
     * @return coverage
     */
    public CoverageResp getCoverage() {
        return coverage;
    }

    public void setCoverage(CoverageResp coverage) {
        this.coverage = coverage;
    }

    public ShowEdgeCloudResponse withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 边缘业务成功创建的虚拟机数量。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ShowEdgeCloudResponse withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 边缘业务创建失败的虚拟机数量。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ShowEdgeCloudResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 边缘业务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowEdgeCloudResponse withFailReason(FailReason failReason) {
        this.failReason = failReason;
        return this;
    }

    public ShowEdgeCloudResponse withFailReason(Consumer<FailReason> failReasonSetter) {
        if (this.failReason == null) {
            this.failReason = new FailReason();
            failReasonSetter.accept(this.failReason);
        }

        return this;
    }

    /**
     * Get failReason
     * @return failReason
     */
    public FailReason getFailReason() {
        return failReason;
    }

    public void setFailReason(FailReason failReason) {
        this.failReason = failReason;
    }

    public ShowEdgeCloudResponse withEdgeRegions(Integer edgeRegions) {
        this.edgeRegions = edgeRegions;
        return this;
    }

    /**
     * 边缘业务支持的边缘区域数目，等同于边缘业务下所有实例的区域数目总和
     * @return edgeRegions
     */
    public Integer getEdgeRegions() {
        return edgeRegions;
    }

    public void setEdgeRegions(Integer edgeRegions) {
        this.edgeRegions = edgeRegions;
    }

    public ShowEdgeCloudResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowEdgeCloudResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ShowEdgeCloudResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 修改时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEdgeCloudResponse showEdgeCloudResponse = (ShowEdgeCloudResponse) o;
        return Objects.equals(this.id, showEdgeCloudResponse.id)
            && Objects.equals(this.name, showEdgeCloudResponse.name)
            && Objects.equals(this.stacks, showEdgeCloudResponse.stacks)
            && Objects.equals(this.coverage, showEdgeCloudResponse.coverage)
            && Objects.equals(this.successNum, showEdgeCloudResponse.successNum)
            && Objects.equals(this.failedNum, showEdgeCloudResponse.failedNum)
            && Objects.equals(this.status, showEdgeCloudResponse.status)
            && Objects.equals(this.failReason, showEdgeCloudResponse.failReason)
            && Objects.equals(this.edgeRegions, showEdgeCloudResponse.edgeRegions)
            && Objects.equals(this.description, showEdgeCloudResponse.description)
            && Objects.equals(this.createAt, showEdgeCloudResponse.createAt)
            && Objects.equals(this.updateAt, showEdgeCloudResponse.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            stacks,
            coverage,
            successNum,
            failedNum,
            status,
            failReason,
            edgeRegions,
            description,
            createAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeCloudResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    edgeRegions: ").append(toIndentedString(edgeRegions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
