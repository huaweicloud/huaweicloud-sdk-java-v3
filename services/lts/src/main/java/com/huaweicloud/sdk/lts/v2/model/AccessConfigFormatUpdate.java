package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessConfigFormatUpdate
 */
public class AccessConfigFormatUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single")

    private AccessConfigFormatSingle single;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi")

    private AccessConfigFormatMutil multi;

    public AccessConfigFormatUpdate withSingle(AccessConfigFormatSingle single) {
        this.single = single;
        return this;
    }

    public AccessConfigFormatUpdate withSingle(Consumer<AccessConfigFormatSingle> singleSetter) {
        if (this.single == null) {
            this.single = new AccessConfigFormatSingle();
            singleSetter.accept(this.single);
        }

        return this;
    }

    /**
     * Get single
     * @return single
     */
    public AccessConfigFormatSingle getSingle() {
        return single;
    }

    public void setSingle(AccessConfigFormatSingle single) {
        this.single = single;
    }

    public AccessConfigFormatUpdate withMulti(AccessConfigFormatMutil multi) {
        this.multi = multi;
        return this;
    }

    public AccessConfigFormatUpdate withMulti(Consumer<AccessConfigFormatMutil> multiSetter) {
        if (this.multi == null) {
            this.multi = new AccessConfigFormatMutil();
            multiSetter.accept(this.multi);
        }

        return this;
    }

    /**
     * Get multi
     * @return multi
     */
    public AccessConfigFormatMutil getMulti() {
        return multi;
    }

    public void setMulti(AccessConfigFormatMutil multi) {
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
        AccessConfigFormatUpdate that = (AccessConfigFormatUpdate) obj;
        return Objects.equals(this.single, that.single) && Objects.equals(this.multi, that.multi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(single, multi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigFormatUpdate {\n");
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
