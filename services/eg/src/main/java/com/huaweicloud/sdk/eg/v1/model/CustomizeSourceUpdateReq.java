package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomizeSourceUpdateReq
 */
public class CustomizeSourceUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private RocketMqDetail detail;

    public CustomizeSourceUpdateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomizeSourceUpdateReq withDetail(RocketMqDetail detail) {
        this.detail = detail;
        return this;
    }

    public CustomizeSourceUpdateReq withDetail(Consumer<RocketMqDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new RocketMqDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public RocketMqDetail getDetail() {
        return detail;
    }

    public void setDetail(RocketMqDetail detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomizeSourceUpdateReq that = (CustomizeSourceUpdateReq) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSourceUpdateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
