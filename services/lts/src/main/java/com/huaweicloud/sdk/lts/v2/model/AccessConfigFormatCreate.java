package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志格式
 */
public class AccessConfigFormatCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single")

    private AccessConfigFormatSingleCreate single;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi")

    private AccessConfigFormatMutilCreate multi;

    public AccessConfigFormatCreate withSingle(AccessConfigFormatSingleCreate single) {
        this.single = single;
        return this;
    }

    public AccessConfigFormatCreate withSingle(Consumer<AccessConfigFormatSingleCreate> singleSetter) {
        if (this.single == null) {
            this.single = new AccessConfigFormatSingleCreate();
            singleSetter.accept(this.single);
        }

        return this;
    }

    /**
     * Get single
     * @return single
     */
    public AccessConfigFormatSingleCreate getSingle() {
        return single;
    }

    public void setSingle(AccessConfigFormatSingleCreate single) {
        this.single = single;
    }

    public AccessConfigFormatCreate withMulti(AccessConfigFormatMutilCreate multi) {
        this.multi = multi;
        return this;
    }

    public AccessConfigFormatCreate withMulti(Consumer<AccessConfigFormatMutilCreate> multiSetter) {
        if (this.multi == null) {
            this.multi = new AccessConfigFormatMutilCreate();
            multiSetter.accept(this.multi);
        }

        return this;
    }

    /**
     * Get multi
     * @return multi
     */
    public AccessConfigFormatMutilCreate getMulti() {
        return multi;
    }

    public void setMulti(AccessConfigFormatMutilCreate multi) {
        this.multi = multi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigFormatCreate that = (AccessConfigFormatCreate) obj;
        return Objects.equals(this.single, that.single) && Objects.equals(this.multi, that.multi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(single, multi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigFormatCreate {\n");
        sb.append("    single: ").append(toIndentedString(single)).append("\n");
        sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
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
