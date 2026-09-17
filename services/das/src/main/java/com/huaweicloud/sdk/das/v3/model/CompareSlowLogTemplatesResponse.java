package com.huaweicloud.sdk.das.v3.model;

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
public class CompareSlowLogTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contrasts")

    private List<SlowLogTplContrast> contrasts = null;

    public CompareSlowLogTemplatesResponse withContrasts(List<SlowLogTplContrast> contrasts) {
        this.contrasts = contrasts;
        return this;
    }

    public CompareSlowLogTemplatesResponse addContrastsItem(SlowLogTplContrast contrastsItem) {
        if (this.contrasts == null) {
            this.contrasts = new ArrayList<>();
        }
        this.contrasts.add(contrastsItem);
        return this;
    }

    public CompareSlowLogTemplatesResponse withContrasts(Consumer<List<SlowLogTplContrast>> contrastsSetter) {
        if (this.contrasts == null) {
            this.contrasts = new ArrayList<>();
        }
        contrastsSetter.accept(this.contrasts);
        return this;
    }

    /**
     * 模板数据对比结果列表
     * @return contrasts
     */
    public List<SlowLogTplContrast> getContrasts() {
        return contrasts;
    }

    public void setContrasts(List<SlowLogTplContrast> contrasts) {
        this.contrasts = contrasts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareSlowLogTemplatesResponse that = (CompareSlowLogTemplatesResponse) obj;
        return Objects.equals(this.contrasts, that.contrasts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contrasts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareSlowLogTemplatesResponse {\n");
        sb.append("    contrasts: ").append(toIndentedString(contrasts)).append("\n");
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
