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
public class ShowDomainTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temlates")

    private List<TemplateItem> temlates = null;

    public ShowDomainTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 查询域名模板总数 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowDomainTemplateResponse withTemlates(List<TemplateItem> temlates) {
        this.temlates = temlates;
        return this;
    }

    public ShowDomainTemplateResponse addTemlatesItem(TemplateItem temlatesItem) {
        if (this.temlates == null) {
            this.temlates = new ArrayList<>();
        }
        this.temlates.add(temlatesItem);
        return this;
    }

    public ShowDomainTemplateResponse withTemlates(Consumer<List<TemplateItem>> temlatesSetter) {
        if (this.temlates == null) {
            this.temlates = new ArrayList<>();
        }
        temlatesSetter.accept(this.temlates);
        return this;
    }

    /**
     * Get temlates
     * @return temlates
     */
    public List<TemplateItem> getTemlates() {
        return temlates;
    }

    public void setTemlates(List<TemplateItem> temlates) {
        this.temlates = temlates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainTemplateResponse that = (ShowDomainTemplateResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.temlates, that.temlates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, temlates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    temlates: ").append(toIndentedString(temlates)).append("\n");
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
