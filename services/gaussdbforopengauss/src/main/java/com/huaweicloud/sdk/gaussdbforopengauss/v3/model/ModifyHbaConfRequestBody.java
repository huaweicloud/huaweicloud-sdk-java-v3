package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyHbaConfRequestBody
 */
public class ModifyHbaConfRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_conf")

    private Object beforeConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_conf")

    private Object afterConf;

    public ModifyHbaConfRequestBody withBeforeConf(Object beforeConf) {
        this.beforeConf = beforeConf;
        return this;
    }

    /**
     * **参数解释**: 需要修改的hba配置信息。 **约束限制**: 不涉及。
     * @return beforeConf
     */
    public Object getBeforeConf() {
        return beforeConf;
    }

    public void setBeforeConf(Object beforeConf) {
        this.beforeConf = beforeConf;
    }

    public ModifyHbaConfRequestBody withAfterConf(Object afterConf) {
        this.afterConf = afterConf;
        return this;
    }

    /**
     * **参数解释**: 修改后的hba配置信息。 **约束限制**: 不涉及。
     * @return afterConf
     */
    public Object getAfterConf() {
        return afterConf;
    }

    public void setAfterConf(Object afterConf) {
        this.afterConf = afterConf;
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
        return Objects.equals(this.beforeConf, that.beforeConf) && Objects.equals(this.afterConf, that.afterConf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beforeConf, afterConf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHbaConfRequestBody {\n");
        sb.append("    beforeConf: ").append(toIndentedString(beforeConf)).append("\n");
        sb.append("    afterConf: ").append(toIndentedString(afterConf)).append("\n");
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
