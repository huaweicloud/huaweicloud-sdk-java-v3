package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一条IP黑名单的导入信息，包括文件名称、生效范围、导入状态、导入时间和导入失败的错误信息。
 */
public class IpBlacklistVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_scope")

    private List<Integer> effectScope = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_status")

    private Integer importStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_time")

    private Long importTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public IpBlacklistVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * IP黑名单的文件名，对应导出时的文件名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpBlacklistVO withEffectScope(List<Integer> effectScope) {
        this.effectScope = effectScope;
        return this;
    }

    public IpBlacklistVO addEffectScopeItem(Integer effectScopeItem) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        this.effectScope.add(effectScopeItem);
        return this;
    }

    public IpBlacklistVO withEffectScope(Consumer<List<Integer>> effectScopeSetter) {
        if (this.effectScope == null) {
            this.effectScope = new ArrayList<>();
        }
        effectScopeSetter.accept(this.effectScope);
        return this;
    }

    /**
     * IP黑名单的生效范围，1表示EIP，2表示NAT
     * @return effectScope
     */
    public List<Integer> getEffectScope() {
        return effectScope;
    }

    public void setEffectScope(List<Integer> effectScope) {
        this.effectScope = effectScope;
    }

    public IpBlacklistVO withImportStatus(Integer importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * IP黑名单的导入状态，有三种状态：2：生成中、1：成功、0：失败。
     * @return importStatus
     */
    public Integer getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(Integer importStatus) {
        this.importStatus = importStatus;
    }

    public IpBlacklistVO withImportTime(Long importTime) {
        this.importTime = importTime;
        return this;
    }

    /**
     * IP黑名单的导入时间
     * @return importTime
     */
    public Long getImportTime() {
        return importTime;
    }

    public void setImportTime(Long importTime) {
        this.importTime = importTime;
    }

    public IpBlacklistVO withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 导入失败的错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpBlacklistVO that = (IpBlacklistVO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.effectScope, that.effectScope)
            && Objects.equals(this.importStatus, that.importStatus) && Objects.equals(this.importTime, that.importTime)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, effectScope, importStatus, importTime, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpBlacklistVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    effectScope: ").append(toIndentedString(effectScope)).append("\n");
        sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
        sb.append("    importTime: ").append(toIndentedString(importTime)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
