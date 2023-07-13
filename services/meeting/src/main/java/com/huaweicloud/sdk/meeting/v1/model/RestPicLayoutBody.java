package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子画面信息。
 */
public class RestPicLayoutBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restPicLayout")

    private RestPicLayout restPicLayout;

    public RestPicLayoutBody withRestPicLayout(RestPicLayout restPicLayout) {
        this.restPicLayout = restPicLayout;
        return this;
    }

    public RestPicLayoutBody withRestPicLayout(Consumer<RestPicLayout> restPicLayoutSetter) {
        if (this.restPicLayout == null) {
            this.restPicLayout = new RestPicLayout();
            restPicLayoutSetter.accept(this.restPicLayout);
        }

        return this;
    }

    /**
     * Get restPicLayout
     * @return restPicLayout
     */
    public RestPicLayout getRestPicLayout() {
        return restPicLayout;
    }

    public void setRestPicLayout(RestPicLayout restPicLayout) {
        this.restPicLayout = restPicLayout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestPicLayoutBody that = (RestPicLayoutBody) obj;
        return Objects.equals(this.restPicLayout, that.restPicLayout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restPicLayout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestPicLayoutBody {\n");
        sb.append("    restPicLayout: ").append(toIndentedString(restPicLayout)).append("\n");
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
