package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSubscribeReportRequestBody
 */
public class BatchSubscribeReportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe")

    private Boolean subscribe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_template_id_list")

    private List<Integer> emailTemplateIdList = null;

    public BatchSubscribeReportRequestBody withSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    /**
     * 是否订阅（true-订阅，false-取消订阅）
     * @return subscribe
     */
    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public BatchSubscribeReportRequestBody withEmailTemplateIdList(List<Integer> emailTemplateIdList) {
        this.emailTemplateIdList = emailTemplateIdList;
        return this;
    }

    public BatchSubscribeReportRequestBody addEmailTemplateIdListItem(Integer emailTemplateIdListItem) {
        if (this.emailTemplateIdList == null) {
            this.emailTemplateIdList = new ArrayList<>();
        }
        this.emailTemplateIdList.add(emailTemplateIdListItem);
        return this;
    }

    public BatchSubscribeReportRequestBody withEmailTemplateIdList(Consumer<List<Integer>> emailTemplateIdListSetter) {
        if (this.emailTemplateIdList == null) {
            this.emailTemplateIdList = new ArrayList<>();
        }
        emailTemplateIdListSetter.accept(this.emailTemplateIdList);
        return this;
    }

    /**
     * 邮件模板ID列表
     * @return emailTemplateIdList
     */
    public List<Integer> getEmailTemplateIdList() {
        return emailTemplateIdList;
    }

    public void setEmailTemplateIdList(List<Integer> emailTemplateIdList) {
        this.emailTemplateIdList = emailTemplateIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSubscribeReportRequestBody that = (BatchSubscribeReportRequestBody) obj;
        return Objects.equals(this.subscribe, that.subscribe)
            && Objects.equals(this.emailTemplateIdList, that.emailTemplateIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribe, emailTemplateIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSubscribeReportRequestBody {\n");
        sb.append("    subscribe: ").append(toIndentedString(subscribe)).append("\n");
        sb.append("    emailTemplateIdList: ").append(toIndentedString(emailTemplateIdList)).append("\n");
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
