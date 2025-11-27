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
public class ListEmailTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_template_list")

    private List<EmailTemplate> emailTemplateList = null;

    public ListEmailTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListEmailTemplateResponse withEmailTemplateList(List<EmailTemplate> emailTemplateList) {
        this.emailTemplateList = emailTemplateList;
        return this;
    }

    public ListEmailTemplateResponse addEmailTemplateListItem(EmailTemplate emailTemplateListItem) {
        if (this.emailTemplateList == null) {
            this.emailTemplateList = new ArrayList<>();
        }
        this.emailTemplateList.add(emailTemplateListItem);
        return this;
    }

    public ListEmailTemplateResponse withEmailTemplateList(Consumer<List<EmailTemplate>> emailTemplateListSetter) {
        if (this.emailTemplateList == null) {
            this.emailTemplateList = new ArrayList<>();
        }
        emailTemplateListSetter.accept(this.emailTemplateList);
        return this;
    }

    /**
     * 邮件模板列表
     * @return emailTemplateList
     */
    public List<EmailTemplate> getEmailTemplateList() {
        return emailTemplateList;
    }

    public void setEmailTemplateList(List<EmailTemplate> emailTemplateList) {
        this.emailTemplateList = emailTemplateList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEmailTemplateResponse that = (ListEmailTemplateResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.emailTemplateList, that.emailTemplateList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, emailTemplateList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEmailTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    emailTemplateList: ").append(toIndentedString(emailTemplateList)).append("\n");
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
