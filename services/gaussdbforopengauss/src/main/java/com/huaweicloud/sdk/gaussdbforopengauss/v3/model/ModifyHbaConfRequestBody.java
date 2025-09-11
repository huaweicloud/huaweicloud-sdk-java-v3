package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyHbaConfRequestBody
 */
public class ModifyHbaConfRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_confs")

    private Object beforeConfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_confs")

    private Object afterConfs;

    public ModifyHbaConfRequestBody withBeforeConfs(Object beforeConfs) {
        this.beforeConfs = beforeConfs;
        return this;
    }

    /**
     * **参数解释**: 需要修改的hba配置信息。 **约束限制**: 不涉及。
     * @return beforeConfs
     */
    public Object getBeforeConfs() {
        return beforeConfs;
    }

    public void setBeforeConfs(Object beforeConfs) {
        this.beforeConfs = beforeConfs;
    }

    public ModifyHbaConfRequestBody withAfterConfs(Object afterConfs) {
        this.afterConfs = afterConfs;
        return this;
    }

    /**
     * **参数解释**: 修改后的hba配置信息。 **约束限制**: 不涉及。
     * @return afterConfs
     */
    public Object getAfterConfs() {
        return afterConfs;
    }

    public void setAfterConfs(Object afterConfs) {
        this.afterConfs = afterConfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyHbaConfRequestBody that = (ModifyHbaConfRequestBody) obj;
        return Objects.equals(this.beforeConfs, that.beforeConfs) && Objects.equals(this.afterConfs, that.afterConfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beforeConfs, afterConfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHbaConfRequestBody {\n");
        sb.append("    beforeConfs: ").append(toIndentedString(beforeConfs)).append("\n");
        sb.append("    afterConfs: ").append(toIndentedString(afterConfs)).append("\n");
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
