package com.huaweicloud.sdk.live.v1.model;

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
public class ListWatermarkTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_infos")

    private List<WatermarkTemplate> templateInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListWatermarkTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWatermarkTemplateResponse withTemplateInfos(List<WatermarkTemplate> templateInfos) {
        this.templateInfos = templateInfos;
        return this;
    }

    public ListWatermarkTemplateResponse addTemplateInfosItem(WatermarkTemplate templateInfosItem) {
        if (this.templateInfos == null) {
            this.templateInfos = new ArrayList<>();
        }
        this.templateInfos.add(templateInfosItem);
        return this;
    }

    public ListWatermarkTemplateResponse withTemplateInfos(Consumer<List<WatermarkTemplate>> templateInfosSetter) {
        if (this.templateInfos == null) {
            this.templateInfos = new ArrayList<>();
        }
        templateInfosSetter.accept(this.templateInfos);
        return this;
    }

    /**
     * 响应数据
     * @return templateInfos
     */
    public List<WatermarkTemplate> getTemplateInfos() {
        return templateInfos;
    }

    public void setTemplateInfos(List<WatermarkTemplate> templateInfos) {
        this.templateInfos = templateInfos;
    }

    public ListWatermarkTemplateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWatermarkTemplateResponse that = (ListWatermarkTemplateResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.templateInfos, that.templateInfos)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, templateInfos, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    templateInfos: ").append(toIndentedString(templateInfos)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
