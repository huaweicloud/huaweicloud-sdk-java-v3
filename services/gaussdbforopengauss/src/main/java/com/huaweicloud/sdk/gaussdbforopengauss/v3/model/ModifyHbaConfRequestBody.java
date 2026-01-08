package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyHbaConfRequestBody
 */
public class ModifyHbaConfRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_conf")

    private BeforeHbaConfOption beforeConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_conf")

    private AfterHbaConfOption afterConf;

    public ModifyHbaConfRequestBody withBeforeConf(BeforeHbaConfOption beforeConf) {
        this.beforeConf = beforeConf;
        return this;
    }

    public ModifyHbaConfRequestBody withBeforeConf(Consumer<BeforeHbaConfOption> beforeConfSetter) {
        if (this.beforeConf == null) {
            this.beforeConf = new BeforeHbaConfOption();
            beforeConfSetter.accept(this.beforeConf);
        }

        return this;
    }

    /**
     * Get beforeConf
     * @return beforeConf
     */
    public BeforeHbaConfOption getBeforeConf() {
        return beforeConf;
    }

    public void setBeforeConf(BeforeHbaConfOption beforeConf) {
        this.beforeConf = beforeConf;
    }

    public ModifyHbaConfRequestBody withAfterConf(AfterHbaConfOption afterConf) {
        this.afterConf = afterConf;
        return this;
    }

    public ModifyHbaConfRequestBody withAfterConf(Consumer<AfterHbaConfOption> afterConfSetter) {
        if (this.afterConf == null) {
            this.afterConf = new AfterHbaConfOption();
            afterConfSetter.accept(this.afterConf);
        }

        return this;
    }

    /**
     * Get afterConf
     * @return afterConf
     */
    public AfterHbaConfOption getAfterConf() {
        return afterConf;
    }

    public void setAfterConf(AfterHbaConfOption afterConf) {
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
