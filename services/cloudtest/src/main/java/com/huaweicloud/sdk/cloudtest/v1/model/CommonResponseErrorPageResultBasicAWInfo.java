package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommonResponseErrorPageResultBasicAWInfo
 */
public class CommonResponseErrorPageResultBasicAWInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private PageResultBasicAWInfo detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public CommonResponseErrorPageResultBasicAWInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CommonResponseErrorPageResultBasicAWInfo withDetail(PageResultBasicAWInfo detail) {
        this.detail = detail;
        return this;
    }

    public CommonResponseErrorPageResultBasicAWInfo withDetail(Consumer<PageResultBasicAWInfo> detailSetter) {
        if (this.detail == null) {
            this.detail = new PageResultBasicAWInfo();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public PageResultBasicAWInfo getDetail() {
        return detail;
    }

    public void setDetail(PageResultBasicAWInfo detail) {
        this.detail = detail;
    }

    public CommonResponseErrorPageResultBasicAWInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 错误原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonResponseErrorPageResultBasicAWInfo that = (CommonResponseErrorPageResultBasicAWInfo) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonResponseErrorPageResultBasicAWInfo {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
