package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompareUserInfo
 */
public class CompareUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_user_name")

    private String srcUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tar_user_name")

    private String tarUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_privileges")

    private String srcPrivileges;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tar_privileges")

    private String tarPrivileges;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_target_existed")

    private Boolean isTargetExisted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private Integer compareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public CompareUserInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompareUserInfo withSrcUserName(String srcUserName) {
        this.srcUserName = srcUserName;
        return this;
    }

    /**
     * 源数据库账号名称
     * @return srcUserName
     */
    public String getSrcUserName() {
        return srcUserName;
    }

    public void setSrcUserName(String srcUserName) {
        this.srcUserName = srcUserName;
    }

    public CompareUserInfo withTarUserName(String tarUserName) {
        this.tarUserName = tarUserName;
        return this;
    }

    /**
     * 目标数据库账号名称
     * @return tarUserName
     */
    public String getTarUserName() {
        return tarUserName;
    }

    public void setTarUserName(String tarUserName) {
        this.tarUserName = tarUserName;
    }

    public CompareUserInfo withSrcPrivileges(String srcPrivileges) {
        this.srcPrivileges = srcPrivileges;
        return this;
    }

    /**
     * 源数据库账号权限
     * @return srcPrivileges
     */
    public String getSrcPrivileges() {
        return srcPrivileges;
    }

    public void setSrcPrivileges(String srcPrivileges) {
        this.srcPrivileges = srcPrivileges;
    }

    public CompareUserInfo withTarPrivileges(String tarPrivileges) {
        this.tarPrivileges = tarPrivileges;
        return this;
    }

    /**
     * 目标数据库账号权限
     * @return tarPrivileges
     */
    public String getTarPrivileges() {
        return tarPrivileges;
    }

    public void setTarPrivileges(String tarPrivileges) {
        this.tarPrivileges = tarPrivileges;
    }

    public CompareUserInfo withIsTargetExisted(Boolean isTargetExisted) {
        this.isTargetExisted = isTargetExisted;
        return this;
    }

    /**
     * 目标端是否存在，取值： - false：不存在 - true：存在
     * @return isTargetExisted
     */
    public Boolean getIsTargetExisted() {
        return isTargetExisted;
    }

    public void setIsTargetExisted(Boolean isTargetExisted) {
        this.isTargetExisted = isTargetExisted;
    }

    public CompareUserInfo withCompareResult(Integer compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    /**
     * 对比结果，取值： - INCONSISTENT：不一致 - UNABLE_TO_COMPARE：无法比对 - CONSISTENT：一致 - TARGET_SCHEMA_NOT_EXIST：目标库不存在 - COMPARE_FAILED：比对失败 - COMPARING：比对中 - WAITING_COMPARE：等待比对 - UNKNOWN：未知错误
     * @return compareResult
     */
    public Integer getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(Integer compareResult) {
        this.compareResult = compareResult;
    }

    public CompareUserInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CompareUserInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareUserInfo that = (CompareUserInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.srcUserName, that.srcUserName)
            && Objects.equals(this.tarUserName, that.tarUserName)
            && Objects.equals(this.srcPrivileges, that.srcPrivileges)
            && Objects.equals(this.tarPrivileges, that.tarPrivileges)
            && Objects.equals(this.isTargetExisted, that.isTargetExisted)
            && Objects.equals(this.compareResult, that.compareResult) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            srcUserName,
            tarUserName,
            srcPrivileges,
            tarPrivileges,
            isTargetExisted,
            compareResult,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareUserInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    srcUserName: ").append(toIndentedString(srcUserName)).append("\n");
        sb.append("    tarUserName: ").append(toIndentedString(tarUserName)).append("\n");
        sb.append("    srcPrivileges: ").append(toIndentedString(srcPrivileges)).append("\n");
        sb.append("    tarPrivileges: ").append(toIndentedString(tarPrivileges)).append("\n");
        sb.append("    isTargetExisted: ").append(toIndentedString(isTargetExisted)).append("\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
