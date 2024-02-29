package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeployPackagesResponseDeployPackageDetails
 */
public class DeployPackagesResponseDeployPackageDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asy_subtask_num")

    private Integer asySubtaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asy_task_id")

    private String asyTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private Long packageId;

    public DeployPackagesResponseDeployPackageDetails withAsySubtaskNum(Integer asySubtaskNum) {
        this.asySubtaskNum = asySubtaskNum;
        return this;
    }

    /**
     * 总的异步执行的子任务个数
     * @return asySubtaskNum
     */
    public Integer getAsySubtaskNum() {
        return asySubtaskNum;
    }

    public void setAsySubtaskNum(Integer asySubtaskNum) {
        this.asySubtaskNum = asySubtaskNum;
    }

    public DeployPackagesResponseDeployPackageDetails withAsyTaskId(String asyTaskId) {
        this.asyTaskId = asyTaskId;
        return this;
    }

    /**
     * 异步作业id，返回给前台轮询结果
     * @return asyTaskId
     */
    public String getAsyTaskId() {
        return asyTaskId;
    }

    public void setAsyTaskId(String asyTaskId) {
        this.asyTaskId = asyTaskId;
    }

    public DeployPackagesResponseDeployPackageDetails withPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 发布包ID
     * @return packageId
     */
    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployPackagesResponseDeployPackageDetails that = (DeployPackagesResponseDeployPackageDetails) obj;
        return Objects.equals(this.asySubtaskNum, that.asySubtaskNum) && Objects.equals(this.asyTaskId, that.asyTaskId)
            && Objects.equals(this.packageId, that.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asySubtaskNum, asyTaskId, packageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployPackagesResponseDeployPackageDetails {\n");
        sb.append("    asySubtaskNum: ").append(toIndentedString(asySubtaskNum)).append("\n");
        sb.append("    asyTaskId: ").append(toIndentedString(asyTaskId)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
