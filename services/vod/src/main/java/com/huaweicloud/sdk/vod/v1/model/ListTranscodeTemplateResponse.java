package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTranscodeTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_list")

    @JacksonXmlProperty(localName = "template_group_list")

    private List<TransTemplateRsp> templateGroupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListTranscodeTemplateResponse withTemplateGroupList(List<TransTemplateRsp> templateGroupList) {
        this.templateGroupList = templateGroupList;
        return this;
    }

    public ListTranscodeTemplateResponse addTemplateGroupListItem(TransTemplateRsp templateGroupListItem) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        this.templateGroupList.add(templateGroupListItem);
        return this;
    }

    public ListTranscodeTemplateResponse withTemplateGroupList(
        Consumer<List<TransTemplateRsp>> templateGroupListSetter) {
        if (this.templateGroupList == null) {
            this.templateGroupList = new ArrayList<>();
        }
        templateGroupListSetter.accept(this.templateGroupList);
        return this;
    }

    /**
     * 模板组信息<br/> 
     * @return templateGroupList
     */
    public List<TransTemplateRsp> getTemplateGroupList() {
        return templateGroupList;
    }

    public void setTemplateGroupList(List<TransTemplateRsp> templateGroupList) {
        this.templateGroupList = templateGroupList;
    }

    public ListTranscodeTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录条数<br/> 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTranscodeTemplateResponse listTranscodeTemplateResponse = (ListTranscodeTemplateResponse) o;
        return Objects.equals(this.templateGroupList, listTranscodeTemplateResponse.templateGroupList)
            && Objects.equals(this.total, listTranscodeTemplateResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateGroupList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeTemplateResponse {\n");
        sb.append("    templateGroupList: ").append(toIndentedString(templateGroupList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
