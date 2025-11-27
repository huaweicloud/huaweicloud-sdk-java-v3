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
public class ListEmailRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_record_list")

    private List<EmailRecord> emailRecordList = null;

    public ListEmailRecordResponse withTotal(Integer total) {
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

    public ListEmailRecordResponse withEmailRecordList(List<EmailRecord> emailRecordList) {
        this.emailRecordList = emailRecordList;
        return this;
    }

    public ListEmailRecordResponse addEmailRecordListItem(EmailRecord emailRecordListItem) {
        if (this.emailRecordList == null) {
            this.emailRecordList = new ArrayList<>();
        }
        this.emailRecordList.add(emailRecordListItem);
        return this;
    }

    public ListEmailRecordResponse withEmailRecordList(Consumer<List<EmailRecord>> emailRecordListSetter) {
        if (this.emailRecordList == null) {
            this.emailRecordList = new ArrayList<>();
        }
        emailRecordListSetter.accept(this.emailRecordList);
        return this;
    }

    /**
     * 邮件推送记录列表
     * @return emailRecordList
     */
    public List<EmailRecord> getEmailRecordList() {
        return emailRecordList;
    }

    public void setEmailRecordList(List<EmailRecord> emailRecordList) {
        this.emailRecordList = emailRecordList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEmailRecordResponse that = (ListEmailRecordResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.emailRecordList, that.emailRecordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, emailRecordList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEmailRecordResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    emailRecordList: ").append(toIndentedString(emailRecordList)).append("\n");
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
