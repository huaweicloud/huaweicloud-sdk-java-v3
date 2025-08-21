package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ApplyDomainTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<ApplyTmlDetail> detail = null;

    public ApplyDomainTemplateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 操作ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplyDomainTemplateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 应用模板状态（任务粒度） **约束限制：** 不涉及 **取值范围：** - success: 应用模板成功 - fail: 应用模板失败 **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApplyDomainTemplateResponse withDetail(List<ApplyTmlDetail> detail) {
        this.detail = detail;
        return this;
    }

    public ApplyDomainTemplateResponse addDetailItem(ApplyTmlDetail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public ApplyDomainTemplateResponse withDetail(Consumer<List<ApplyTmlDetail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public List<ApplyTmlDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<ApplyTmlDetail> detail) {
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
        ApplyDomainTemplateResponse that = (ApplyDomainTemplateResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyDomainTemplateResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
